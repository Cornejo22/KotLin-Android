package com.example.alumnogrupo

import java.io.*
import java.util.*
import kotlin.collections.ArrayList

class Grupo {
    private var listaAlumno: ArrayList<Alumno> = ArrayList()

    override fun toString():String{

        var linea = ""

        for (value in this.listaAlumno){
            linea += value.imprimir()
        }

        return linea
    }

    fun insertaAlumnoLista(alumno: Alumno) {
        this.listaAlumno.add(alumno)
    }

    fun insertaAlumnoLista(nombre:String,edad:Int,calificacion:Double){
        val alumno = Alumno(nombre,edad,calificacion)
        this.listaAlumno.add(alumno)
    }

    fun escribeFicheroBin(nombreFichero: String){

        val fichero: FileOutputStream?
        val salida: DataOutputStream?
        val nAlumno: Int

        try {
            fichero = FileOutputStream("./$nombreFichero.bin")
            salida = DataOutputStream(fichero)
            nAlumno = this.listaAlumno.size

            salida.writeInt(nAlumno)

            for (linea in this.listaAlumno){

                salida.writeUTF(linea.a_nombre)
                salida.writeInt(linea.a_edad)
                salida.writeDouble(linea.a_calificacion)
            }

            salida.close()
            fichero.close()

        }catch (ex: Exception){
            println("Mensaje de la excepción : " + ex.message)
        }
    }

    fun leeFicheroBin(nombreFichero: String){
        this.listaAlumno.clear()
        var nAlumno:Int

        try {
            var fichero: FileInputStream = FileInputStream("./$nombreFichero.bin")
            var data: DataInputStream = DataInputStream(fichero)
            nAlumno = data.readInt()
            var i:Int = 0
            while (i<nAlumno){

                var alumno: Alumno = Alumno(data.readUTF(),data.readInt(),data.readDouble())
                this.listaAlumno.add(alumno)
                i++
            }
            data.close()
            fichero.close()

        }
        catch (ex: Exception){
            throw Exception("El error es : ${ex.message}")
        }
    }

    fun escribeFicheroTxt(nombreFichero:String){

        /** FORMA DE ESCRITURA **/
        val fichero: FileWriter?
        val bw: BufferedWriter?

        try {
            fichero = FileWriter("./$nombreFichero.txt")
            bw = BufferedWriter(fichero)

            for (linea in this.listaAlumno){
                bw.write("${linea.a_nombre}\n")
                bw.write("${linea.a_edad}\n")
                bw.write("${linea.a_calificacion}\n")

            }
            bw.close()
            fichero.close()
        } catch (ex: Exception) {
            println("Mensaje de la excepción: " + ex.message)
        }

    }

    fun leeFicheroTxt(nombreFichero: String){

        /**FORMA DE LECTURA**/
        val fichero: FileReader?
        var sc: Scanner?
        try {
            fichero = FileReader("./$nombreFichero.txt")
            sc = Scanner(fichero)
            var nombre = ""
            var edad = 0
            var calificacion = 0.0

            //Leemos la linea a linea en el fichero
            while (sc.hasNextLine()){

                nombre = sc.nextLine()
                edad = sc.nextInt()
                calificacion = sc.nextDouble()

                var alumno: Alumno = Alumno(nombre,edad,calificacion)
                this.listaAlumno.add(alumno)
            }

            sc.close()
            fichero.close()
        }
        catch (ex: Exception){
            println("Mensaje de la excepción: " + ex.message)
        }
    }

    fun escribeFicheroCsv(nombreFichero: String){

        val fichero: FileWriter?

        try {
            fichero = FileWriter("./$nombreFichero.csv")

            for (linea in this.listaAlumno){

                fichero.write(linea.a_nombre + ";")
                fichero.write(linea.a_edad.toString() + ";")
                fichero.write(linea.a_calificacion.toString() + "\n")
            }

            fichero.close()
        }
        catch (ex: Exception){
            println("Mensaje de la excepción" + ex.message)
        }
    }

    fun leeFicheroCsv(nombreFichero: String){

        val fichero: FileReader?
        var sc: Scanner
        try {
            fichero = FileReader("./$nombreFichero.csv")
            sc = Scanner(fichero)

            while (!sc.hasNextLine()){
                var alumno: Alumno = Alumno("",0,0.0)
                var linea = sc.nextLine()
                var cad = linea.split(';')
                alumno.a_nombre = cad[0]
                alumno.a_edad = cad[1].toInt()
                alumno.a_calificacion = cad[2].toDouble()
                this.listaAlumno.add(alumno)
            }

            sc.close()
            fichero.close()
        }
        catch (ex: Exception){

        }
    }
}