package com.example.cartabaraja

import java.lang.Exception

class Baraja {

    //Atributos
    private var listaCartas: MutableCollection<Carta>

    //Constructor
    constructor (){
       this.listaCartas = mutableSetOf()
    }

    constructor(tipoBaraja: Int){
        this.listaCartas = mutableSetOf()

        if(tipoBaraja == 1){
            for (i in 1..40){
                var carta:Carta = Carta(i)
                this.listaCartas.add(carta)
            }
        }
        else{
            if(tipoBaraja == 2){
                for (i in 1..40){
                    var carta:Carta = Carta(i)
                    this.listaCartas.add(carta)
                }
                for (i in 1..40){
                    var carta:Carta = Carta(i)
                    this.listaCartas.add(carta)
                }
            }
            else{
                throw Exception("Error en el tipo de baraja")
            }
        }
    }


}
