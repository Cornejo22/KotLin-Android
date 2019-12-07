package com.example.cartabaraja

fun main(args: Array<String>){

    val carta = Carta(1,0)
    val baraja = Baraja(1,true)
    //println(carta)
    //baraja.recorrer()
//    baraja.cortar(15)
//    println("=========================================================")
//    baraja.recorrer()
//    baraja.robar()
//    println("=========================================================")
//    baraja.insertaCartaFinal(1)
//    baraja.insertaCartaPrincipio(1)
//    baraja.insertaCartaPrincipio(carta)
//    baraja.insertaCartaFinal(carta)
    println(baraja.vacia())
    baraja.recorrer()
}