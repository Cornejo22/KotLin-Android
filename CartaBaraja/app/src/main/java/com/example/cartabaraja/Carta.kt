package com.example.cartabaraja

import java.lang.Exception

class Carta{

    //Atributos
     var numero:Int  = 0
     var palo:Int = 0

    //Constructor
    constructor(numero:Int, palo:Int){
        if (numero in 1..10){
            this.numero = numero
        }
        else{
            throw Exception("Error en el numero de la carta")
        }

        if(palo in 0..3){
            this.palo = palo
        }
        else{
            throw Exception("Error en el palo de la carta")
        }
    }

    constructor(id:Int){

        if(id in 1..40){
            if(id <= 10){
                this.numero = id
                this.palo = 0
            }
            else{
                if(id <= 20){
                    this.numero = id - 10
                    this.palo = 1
                }
                else{
                    if(id <= 30){
                        this.numero = id - 20
                        this.palo = 2
                    }
                    else{
                        this.numero = id - 30
                        this.palo = 3
                    }
                }
            }
        }
        else{
            throw Exception("No existe la carta")
        }
    }

    //Funciones
    private fun nombreNumero(numero:Int):String {

        var res = ""

        when(numero){
            1 -> res= "as"
            2 -> res= "dos"
            3 -> res = "tres"
            4 -> res = "cuatro"
            5 -> res = "cinco"
            6 -> res = "seis"
            7 -> res = "siete"
            8 -> res = "sota"
            9 -> res = "caballo"
            10 -> res = "rey"
        }

        return res
    }

    private fun nombrePalo(palo: Int):String{

        var res = ""

        when(palo){
            0 -> res = "oros"
            1 -> res = "copas"
            2 -> res = "espadas"
            3 -> res = "bastos"
        }

        return res
    }

    fun nombreCarta():String {

        return nombreNumero(this.numero) + " de " + nombrePalo(this.palo)
    }

    fun valorTute():Int {
        var res:Int = 0

        res = when(this.numero){
            1-> 11
            3-> 10
            8-> 2
            9-> 3
            10-> 4
            2,4,5,6 -> 0
            else -> 0
        }

        return res
    }

    fun valorMus():Int {
        var res:Int = 0

        res = when(this.numero){
            1,2 -> 1
            3,8,9,10 -> 10
            else -> this.numero
        }

        return res
    }

    fun valor7yMedia():Double{

        var res:Double = 0.0

        res = when(this.numero){
            8,9,10 -> 0.5
            else -> this.numero.toDouble()
        }

        return res
    }
}