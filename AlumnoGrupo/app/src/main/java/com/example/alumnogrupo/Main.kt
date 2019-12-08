package com.example.alumnogrupo

fun main(args: Array<String>){
    val alumno = Alumno("Miguel",
        23,6.5)

    val grupo = Grupo()
    grupo.insertaAlumnoLista(alumno)
    grupo.insertaAlumnoLista("Luna",22,6.0)
    grupo.escribeFicheroTxt("hello2")
    grupo.leeFicheroTXT("hello2")
}