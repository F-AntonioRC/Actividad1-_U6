package EstructurasLineales

import kotlin.system.measureTimeMillis

fun main(){
val Lista= intArrayOf (5, 3, 8, 7, 4, 6, 20, 10, 1)//LISTAS DE NUMEROS A ORDENAR DE TIPO ENTERO

Burbuja(Lista)//SE LLAMA A LA FUNCION BURBUJA Y SE LE ENVIA LA LISTA
}

fun Burbuja(ListaNumeros: IntArray) { //FUNCION METODO DE ORDENAMIENTO BURBUJA, SE RECIBE UN ARRAY DE TIPO ENTERO
    var cantidad = ListaNumeros.size //TAMAÑO DEL ARRAY
    var temporal = -1//CONTENEDOR

    ImprimirIntArrayAscendente(ListaNumeros, cantidad)//SE IMPRIME EL RESULTADO DE MANERA ASCENDENTE
    for (i in (0 until cantidad - 1)){ //PRIMER CICLO PARA TENER EL TAMAÑO DEL ARRAY
        //println(i) IMPRIME EL TAMAÑO DEL ARRAY

        for (j in (0 until cantidad - 1)){//SEGUNDO CICLO PARA COMPARAR VALORES DEL ARRAY

            if (ListaNumeros[j] > ListaNumeros[j + 1]){//SENTECIA IF DONDE SE COMPARA LOS DATOS
                temporal = ListaNumeros[j]//EL VALOR SE GUARDA EN EL CONTENEDOR SI SE CUMPLE LA CONDICION
                ListaNumeros[j] = ListaNumeros[j +1] // SE CAMBIA EL VALOR DE LA POSCION J A LA J+1
                ListaNumeros[j + 1]= temporal // EL VALOR DE LA J+1 SE GUARDA EN EL CONTENEDOR PARA COMPARARLO EN EL SIGUINETE CICLO
            }
        }
    }//PRIMER CICLO FOR TAMAÑO DEL ARREGLO A ORDENAR

    ImprimirIntArrayAscendente(ListaNumeros, cantidad)
}

fun ImprimirIntArrayAscendente(ListaNumeros: IntArray, cantidad: Int){//SE RECIBE EL AREAY Y EL TAMAÑO DE ESTE
    for (i in (0 until cantidad)){
        print(" ${ListaNumeros[i]} ")
    }
}

fun ImprmirArrayDescendente(ListaNumeros: IntArray, cantidad: Int){
    for (i in(cantidad -1 downTo 0)){
        print(" ${ListaNumeros[i]} ")
    }
}

fun imprimirListas(lista: List<String>) {

    lista.forEach {
        println(it)
    }
}

fun ordenamientoKotlin(lista: List<String>): List<String> {//SE RECIBE LA LISTA DE TIPO STRING
    return lista.sorted() //SE RETORNA LA LISTA CON LA FUNCION SORTED LA CUAL RETORNA UNA LISTA ORDENADA EN FORMA ASCENDENTE
}

fun tiempoQuicksort(items: List<String>) {//SE CALCULA EL METODO DE ORDENAMIENTO QUICKSORT
    var lista: List<String>//SE CREA UNA LISTA DE TIPO STRING
    var tiempo = measureTimeMillis {//SE CREA UNA VARIABLE CON LA FUNCION PARA MEDIR EL TIEMPO
        lista = quicksort(items)//LA VARIABLE LISTA ES LA FUNCION QUICKSORT
    }
    println("DEMORO $tiempo MILI SEGUNDOS")//SE IMPRIME EL TIEMPO QUE SE TARDO EN ORDENAR
    lista.forEach {//SE RECORRE LA LISTA POR MEDIO DE UN FOREACH
        println(it)//SE IMPRIME
    }
}

fun <T : Comparable<T>> quicksort(items: List<T>): List<T> {//SE DECLARAN TOPOS DE DATOS Y VARIABLES
    if (items.count() < 1) return items//SE DIVIDE EN VALORES MENORES AL PIVOTE
    val pivot = items[items.count() / 2]//EL PIVOTE ES EL VALOR QUE SE QUEDA EN MEDIO
    val equal = items.filter { it == pivot }//EL OTRA VARIABLE SE QUEDA EL VALOR DEL PIVOTE
    val less = items.filter { it < pivot }//SE CREA OTRA VARIBLE CON VALORES MENORES AL PIVOTE
    val greater = items.filter { it > pivot }//VARIABLE CON VALORES MAYORES AL PIVOTE
    return quicksort(less) + equal + quicksort(greater)//SE RETORNAN LOS VALORES MENORES, IGUALES Y MAYORES DENTRO DEL
    //QUICKSORT
}


fun tiempoMergeSort(elementos: List<String>) {//SE RECIBE UNA LISTA DE TIPO STRING
    var lista: MutableList<String>//SE DECLARA LA VARIABLE EN ESTE CASO SERA UNA LISTA MUTEABLE
    var tiempo = measureTimeMillis {//SE CREA UNA VARIABLE CON LA FUNCION PARA MEDIR EL TIEMPO
        lista = mergesort(elementos.toMutableList())//EN LA VARIABLE SE GUARDA EL METODO DE ORDENAMIENTO
        //MERGESOR
    }
    println("DEMORO $tiempo MILI SEGUNDOS")//SE IMPRIME EL RESULTADO DEL TIEMPO
    lista.forEach {//SE RECORRE LA LISTA MEDIANTE UN FOREACH
        println(it)//SE IMPRIMEN LOS VALORES
    }
}


fun <T : Comparable<T>> mergesort(items: MutableList<T>): MutableList<T> {//SE DECLARAN TOPOS DE DATOS Y VARIABLES
    if (items.isEmpty()) {//SE COMPRUEBAN LOS VALORES A EVALUAR CON LA FUNCION ISEMPTY
        return items//SE RETORNAS LOS VALORES DE CUMPLIR CON LA CONDICION
    }
    fun merge(left: MutableList<T>, right: MutableList<T>): MutableList<T> {//SE DECLARAN LAS VARIABLES DE IZQUIERDA Y DERECHA
        var merged: MutableList<T> = arrayListOf<T>()//SE CREA UN ARRAY LIST DE LA LITA MUTEABLE
        while (!left.isEmpty() && !right.isEmpty()) {//MEDIANTE UN CICLO WHILE SE COMPARAN DATOS DE IZQUIERDA Y DERECHA
            val temp: T //SE CREA UNA VARIABLE TEMPORAL
            if (left.first() < right.first()) {//SE DIVIDEN LOS VALORES MEDIANTE UN IF ELSE
                temp = left.removeAt(0)//SE ALMACENAN  LOS DATOS EN LA VARIALBE TEMPORAL EN CASO DE
                //CUMPLIRSE LA CONDICION DEL LADO IZQUIERDO
            } else {
                temp = right.removeAt(0) }//SE ALMACENAN  LOS DATOS EN LA VARIALBE TEMPORAL EN CASO DE
            //NO CUMPLIRSE LA CONDICION  DEL LADO DERECHO
            merged.add(temp)//SE AGREGA LA VARIABLE TEMPORAL EN LA FUNCION MARGET
        }
        if (!left.isEmpty()) merged.addAll(left)//SE ACOMODAN LOS VALORES DE IZQUIERDA
        if (!right.isEmpty()) merged.addAll(right)//SE ACOMODAN LOS VALORES DE LA DERECHA
        return merged//SE RETORNAN LOS VALORES
    }
    val pivot = items.count() / 2//SE MIDEN LOS VALORES A EVALUAR
    var left = mergesort(items.subList(0, pivot))//SE CREA UNA SUBLISTA PARA EL LADO IZQUIERDO
    var right = mergesort(items.subList(pivot, items.count() - 1))//SE CREA OTRA SUBLISTA PARA EL LADO DERECHO
    return merge(left, right)//SE RETORNAN LOS VALORES ACOMODADOS DE IZQUIERDA A DERECHA
}