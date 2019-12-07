package com.example.cartabaraja

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
        for (value in this.listaCartas){
            println(value.nombreCarta())
        }
    }

    private fun crearBaraja(tipoBaraja: Int):ArrayList<Carta>{
      var listaDeCartas:ArrayList<Carta> = ArrayList()

        if(tipoBaraja == 1){
            for (i in 1..40){
                var carta = Carta(i)
                listaDeCartas.add(carta)
            }
        }
        else{
            if(tipoBaraja == 2){
                for (i in 1..40){
                    var carta = Carta(i)
                    listaDeCartas.add(carta)
                }
                for (i in 1..40){
                    var carta = Carta(i)
                    listaDeCartas.add(carta)
                }
            }
            else{
                throw Exception("Error en el tipo de baraja")
            }
        }

      return listaDeCartas
    }

    private fun barajamos(){
        var listTemporal:ArrayList<Carta> = ArrayList()
        var random:Random = Random
        var pos:Int

        while (this.listaCartas.size > 0){
            pos = random.nextInt(this.listaCartas.size)
            listTemporal.add(this.listaCartas[pos])
            this.listaCartas.removeAt(pos)
        }

        this.listaCartas.addAll(listTemporal)
    }

    fun cortar(pos:Int ){
        var listaTemporal: ArrayList<Carta> = ArrayList()

        if(pos > this.listaCartas.size || pos < 0){
            throw Exception("La posición para dividir la baraja es incorrecta")
        }
        else{
            var i:Int = pos

            while (i <= this.listaCartas.size-1){
                listaTemporal.add(this.listaCartas[i])
                i++
            }
            this.listaCartas.subList(pos, this.listaCartas.size).clear()

            this.listaCartas.addAll(0,listaTemporal)
        }


    }

    fun robar():Carta{
        val carta:Carta = Carta(this.listaCartas[0].numero,this.listaCartas[0].palo)
        this.listaCartas.removeAt(0)
        return carta
    }

    fun insertaCartaFinal(idCarta:Int){

        var carta: Carta = Carta(idCarta)
        this.listaCartas.add(carta)
    }

    fun insertaCartaPrincipio(idCarta:Int){
        var carta: Carta = Carta(idCarta)
        this.listaCartas.add(0,carta)
    }

    fun insertaCartaFinal(carta:Carta){
        this.listaCartas.add(carta)
    }

    fun insertaCartaPrincipio(carta: Carta){
        this.listaCartas.add(0,carta)
    }

    fun numeroCartas():Int{
        return listaCartas.size
    }

    fun vacia():Boolean{
        var result = false
        if(this.listaCartas.size == 0) result = true
        return result
    }

}
