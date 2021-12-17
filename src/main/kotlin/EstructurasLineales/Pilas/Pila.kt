package EstructurasLineales.Pilas

interface Pila {
    fun llenar(elemento: String)
    fun sacar(): String
    fun tope():String
    fun estavacia(): Boolean
    fun tamano(): Int

}