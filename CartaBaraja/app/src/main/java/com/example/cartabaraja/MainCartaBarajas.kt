package com.example.cartabaraja

fun main(args: Array<String>){

    val baraja = Baraja(1,true)
    //println(carta)
    //baraja.recorrer()
    baraja.cortar(15)
    println("=========================================================")
    baraja.recorrer()
}