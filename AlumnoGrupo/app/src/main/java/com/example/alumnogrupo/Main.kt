package com.example.alumnogrupo

fun main(args: Array<String>){
    val alumno = Alumno("Miguel",
        23,6.5)

    val grupo = Grupo()
    grupo.insertaAlumnoLista(alumno)
    grupo.escribeFicheroBin("ficheroBin")
    grupo.leeFicheroBin("ficheroBin")
    println(grupo.toString())
    grupo.escribeFicheroTxt("ficheroTxt")
    grupo.leeFicheroTxt("ficheroTxt")
    println(grupo.toString())
    grupo.escribeFicheroCsv("ficheroCsv")
    grupo.leeFicheroCsv("ficheroCsv")
    println(grupo.toString())
}