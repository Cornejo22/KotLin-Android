package com.example.cartabaraja

import androidx.annotation.ArrayRes
import java.lang.Exception
import kotlin.random.Random

class Baraja {

    //Atributos
    private var listaCartas: ArrayList<Carta>

    //Constructor
//    constructor(){
//       this.listaCartas = ArrayList()
//    }

    constructor(tipoBaraja: Int){
        this.listaCartas = ArrayList()
        this.listaCartas = crearBaraja(tipoBaraja)

    }

    constructor(tipoBaraja: Int,barajar:Boolean){
        this.listaCartas = crearBaraja(tipoBaraja)

        if(barajar === true){
            barajamos()
        }

    }

    fun recorrer(){
        var i:Int = 0
        for (i in this.listaCartas){
            println(i.nombreCarta())
        }
    }

    fun crearBaraja(tipoBaraja: Int):ArrayList<Carta>{
      var listaDeCartas:ArrayList<Carta> = ArrayList()

        if(tipoBaraja == 1){
            for (i in 1..40){
                var carta = Carta(i)
                println(carta.nombreCarta())
                this.listaCartas.add(carta)
            }
        }
        else{
            if(tipoBaraja == 2){
                for (i in 1..40){
                    var carta = Carta(i)
                    this.listaCartas.add(carta)
                }
                for (i in 1..40){
                    var carta = Carta(i)
                    this.listaCartas.add(carta)
                }
            }
            else{
                throw Exception("Error en el tipo de baraja")
            }
        }

      return listaDeCartas
    }

    fun barajamos(){
        var listTemporal:ArrayList<Carta> = ArrayList()
        var random:Random = Random
        var pos:Int

        while (this.listaCartas.size > 0){
            pos = random.nextInt(this.listaCartas.size)
            listTemporal.add(this.listaCartas.get(pos))
        }
    }
}
