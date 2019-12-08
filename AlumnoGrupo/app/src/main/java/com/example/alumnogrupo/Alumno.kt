package com.example.alumnogrupo

import java.lang.Exception

class Alumno (
    private var a_nombre: String,
    private var a_edad: Int,
    private var a_calificacion: Double
    )
{
    private var nombre:String
    private var edad:Int = 0
    private var calificacion:Double = 0.0

    init {
        if(a_nombre.isNotEmpty()){
            this.nombre = a_nombre
        }
        else{
            throw Exception("Error en el nombre del Alumno")
        }

        if(a_edad in 18..99){
            this.edad = a_edad
        }
        else{
            throw Exception("Error en la edad del Alumno")
        }

        if(a_calificacion in 0.0..10.0){
            this.calificacion = a_calificacion
        }
        else{
            throw Exception("Error en la calificación del Alumno")
        }

    }

    fun imprimir(){
       print("Nombre: "+ this.nombre + "\nEdad: " + this.edad + "\nCalificación: " + this.calificacion)
    }
}

