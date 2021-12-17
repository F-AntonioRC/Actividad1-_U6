import kotlin.system.measureNanoTime

fun busquedaPorKotlin(list: List<String>, valorABuscar: String) {//TIPO DE BUSQUEDA INTEGRADA EN KOTLIN
    var tiempo = measureNanoTime {//VARIABLE QUE NOS PERMITE MEDIR EL TIEMPO
        val valorEncontrado = list.find { nombre ->//SE CREA UN VALOR DE TIPO LISTA CON LIBRERIA ENCONTRAR
            nombre.contains(valorABuscar)//SE DECLARA LA BUSQUEDA MEDIANTE UNA SERIE DE CARACTERES CON LIBRERIA CONTAINS
            //Y SE RECIBE EL VALOR A ENCONTRAR
        }
        println(valorEncontrado)//SE MUESTRA EL VALOR ENCONTRADO
    }
    println("TIEMPO BUSQUEDA KOTLIN: $tiempo")//SE MUESTRA DEL TIEMPO DE EJECUCION DEL ALGORITMO
}

fun busquedaLineal(list: List<String>, valorABuscar: String): Int? {//SE DECLARAN LAS VARIABLES A RECIBIR Y LOS TIPOS DE DATOS
    //EN ESTE CASO SE PUEDE RETORNAR UN VALOR NULO
    var tiempo = measureNanoTime {//VARIABLE QUE NOS PERMITE MEDIR EL TIEMPO
        for ((index, valor) in list.withIndex()) {//MEDIANTE UN CICLO FOR SE CREAN VARIABLES LAS CUALES ESTARAN DENTRO DE LOS VALORES A BUSCAR
            if (valor == valorABuscar) {//CONDICION PARA ASIGANAR A UNA VARIABLE EL VALOR A BUSCAR
                println("POSICION ENCONTRADA: $index -> $valor")//EN CASO SE CUMPLIR CON LA CODICION SE VA MOSTRAR EL INDEX Y EL VALOR
                return index//SE RETORNA EL INDEX
            }
        }
    }
    println("TIEMPO BUSQUEDA LINEAL: $tiempo")//SE MUESTRA EL TIEMPO DE EJECUCION DEL PROGRARAMA
    return null//RETORNO DE VALOR NULO
}

fun busquedaBinaria(list: List<String>, key: String): Int? {//DECLARACION DE VARIABLES Y TIPOS DE DATOS, SE PUEDE RETORNAR UN VALOR NULO
    var tiempo = measureNanoTime {//VARIABLE QUE NOS PERMITE MEDIR EL TIEMPO
        var rangeStart = 0//SE CREA UNA VARIABLE, SE INICIALIZA EN 0
        var rangeEnd = list.count()//SE ESTABLECE EL NUMERO DE VALORES DENTRO DE LA LISTA DENTRO DE UNA VARIALBE
        while (rangeStart < rangeEnd) {//SE CREA UN CICLO WHILE JUNTO CON LA CONDICION DE ESTE
            val midIndex = rangeStart + (rangeEnd - rangeStart) / 2//SE CREA UNA VARIABLE PARA DIVIDIR LA LISTA
            if (list[midIndex] == key) {//CONDICION PARA ENCONTRAR EL VALOR A BUSCAR UTILIZANDO LA VARIABLE PARA RECORRER LA LISTA
                println("INDEX ENCONTRADO: $midIndex")//SE MUESTRA EL VALOR ENCONTRADO
                return midIndex//RETORNO DEL VALOR DE LA VARIABLE
            } else if (list[midIndex] < key) {//SEGUNDA CONDICION PARA EL CASO
                rangeStart = midIndex + 1//SE AÑADE UN NUMERO A LA VARIABLE Y SE GUARDA EN LA VARIABLES RANGESTART
            } else {//CONDICION FINAL
                rangeEnd = midIndex//SE GUARDA LA SEGUNDA MITAD DE LA LISTA LA BUSCAR EL VALOR
            }
        }
    }
    println("TIEMPO BUSQUEDA BINARIA : $tiempo")//SE MUESTRA EL TIEMPO DE EJECUCION DEL ALGORITMO
    return null//RETORNO DE VALOR NULO
}

fun main() {

}
