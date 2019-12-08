package com.example.alumnogrupo

import java.io.FileReader
import java.io.FileWriter
import java.util.*
import kotlin.collections.ArrayList

class Grupo {
    private var listaAlumno: ArrayList<Alumno> = ArrayList()

    fun imprime(){
        println("Soy la lista")
        for (value in this.listaAlumno){
            value.imprimir()
        }
    }

    fun insertaAlumnoLista(alumno: Alumno) {
        this.listaAlumno.add(alumno)
    }

    fun insertaAlumnoLista(nombre:String,edad:Int,calificacion:Double){
        val alumno = Alumno(nombre,edad,calificacion)
        this.listaAlumno.add(alumno)
    }

    fun escribeFicheroTxt(nombreFichero:String){

        /** FORMA DE ESCRITURA **/
        val fichero: FileWriter?

        try {
            fichero = FileWriter("./$nombreFichero.txt")
            // Escribimos linea a linea en el fichero
            for (linea in this.listaAlumno) {
                fichero.write("${linea.imprimir()}\n")
            }
            fichero.close()
        } catch (ex: Exception) {
            println("Mensaje de la excepción: " + ex.message)
        }

    }

    fun leeFicheroTXT(nombreFichero: String){

        /**FORMA DE LECTURA**/
        val fichero: FileReader?
        var sc: Scanner?
        try {
            fichero = FileReader("./$nombreFichero.txt")
            sc = Scanner(fichero)
            //Leemos la linea a linea en el fichero

            while (sc.hasNextLine()){
                var linea:String = sc.nextLine()
                println(linea)
            }

            sc.close()
            fichero.close()
        }
        catch (ex: Exception){
            println("Mensaje de la excepción: " + ex.message)
        }
    }
}