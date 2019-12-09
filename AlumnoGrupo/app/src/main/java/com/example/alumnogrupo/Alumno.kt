package com.example.alumnogrupo

import java.lang.Exception

class Alumno(
    var a_nombre: String,
    var a_edad: Int,
    var a_calificacion: Double
    )
{
//    private var nombre:String = ""
//    private var edad:Int = 0
//    private var calificacion:Double = 0.0

    init {
        if(a_nombre.isNotEmpty()){
            this.a_nombre = a_nombre
        }
        else{
            throw Exception("Error en el nombre del Alumno")
        }

        if(a_edad in 18..99){
            this.a_edad = a_edad
        }
        else{
            throw Exception("Error en la edad del Alumno")
        }

        if(a_calificacion in 0.0..10.0){
            this.a_calificacion = a_calificacion
        }
        else{
            throw Exception("Error en la calificación del Alumno")
        }

    }

    fun imprimir():String {
        return "Nombre: "+ a_nombre + "\nEdad: " + a_edad + "\nCalificación: " +
                a_calificacion
    }
}

