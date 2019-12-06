package com.example.condicionales

import java.lang.Exception

//Leídos dos números por teclado, A y B,
// calcular la resta del mayor menos el menor. Por
//ejemplo, si A = 8 y B = 3, el resultado
// debe ser A – B, es decir, 5. Pero si A = 4 y B = 7, el
//resultado debe ser B – A, es decir, 3.
fun calculaResta(n1:Int, n2:Int):Int{

    //Declaramos una variable
    var res:Int = 0

    if(n1 < n2){
        res = n2 - n1
    }
    else{
        if(n2 < n1){
            res = n1 - n2
        }
        else{
            throw Exception("Error: No se puede realizar la resta porque los números son iguales")
        }
    }

    return  res
}

fun bisiesto(anio:Int): Boolean{

    var result:Boolean = false

    if(anio %4 == 0 && (anio % 100 != 0 || anio % 400 == 0)){
        result = true
    }

    return result
}

fun conversorEuroPesetas(cantidad:Double, tipo:String): Double{

    var result: Double = 0.0

    tipo.toLowerCase()

    if(tipo == "pesetas"){
        result = cantidad * 166.386
    }
    else{
        if(tipo == "euros"){
            result = cantidad / 166.386
        }
        else{
            throw Exception("Tipo de moneda inexistente")
        }
    }

    return result
}

fun numero1Al20(){
    var i:Int

    for (i in 1..20){
        println(i)
    }
}

fun numeroImpares1Al20(){
    var i:Int

    for (i in 1..20){
        if(i % 2 != 0){
            println(i)
        }
    }
}

fun primero10Pares(){
    var i = 1
    var j = 2

    while (i <= 10){

        if(j % 2 == 0){
            println(j)
            i++
        }

        j++

    }
}

//Hay que ejecutar el ejercicio desde el play que sale a la izquierda de la función principal
fun main(args: Array<String>){

    //Ejercicio 1
    //Pedimos datos por consola
    /*print("Escribe el número por consola: ")

    //Aquí ejecutaremos el código que nos pedirá
    //un número por terminal
    var n1:Int = readLine()?.toInt() as Int

    print("Escribimos otro número: ")

    var n2:Int = readLine()?.toInt() as Int

    var res:Int = calculaResta(n1,n2)
    println(res)*/

    /*Ejercicio 2

    print("Escribe el año que consideres bisiestos: ")
    var anno = readLine()?.toInt() as Int

    var bisiesto = bisiesto(anno)

    println("Es $bisiesto")*/

    /*Ejercicio 3
    //Tipo de moneda
    print("Escribe el tipo al que se va a convertir: ")
    var tipo:String = readLine() as String

    print("Escribe la cantidad : ")
    var cantidad:Double = readLine()?.toDouble() as Double

    var result:Double = conversorEuroPesetas(cantidad,tipo);

    println("El resultado de $cantidad en el tipo $tipo es $result")*/

    /*Ejercicio 4
    numero1Al20()*/

    /*Ejercicio 5
    numeroImpares1Al20()*/

    /*Ejercicio 6
    primero10Pares()*/
}