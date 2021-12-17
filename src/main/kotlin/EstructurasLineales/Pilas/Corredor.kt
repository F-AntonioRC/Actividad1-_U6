package EstructurasLineales.Pilas

fun main (){
    var pilaStrings : Pila = ArrayListPila()

    pilaStrings.llenar("PERSONA 1")
    pilaStrings.llenar("PERSONA 2")
    pilaStrings.llenar("PERSONA 3")

    pilaStrings.sacar()
    pilaStrings.sacar()

println(pilaStrings.tope())
}