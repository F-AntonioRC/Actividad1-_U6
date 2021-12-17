package EstructurasLineales.Cola

interface Cola   {//SE CREA LA INTERFASE COLA
    val cuenta : Int//SE PONE NOMBRE Y TIPO DE DATO ENLA VARIABLE A UTILIZAR

    val estaVacia : Boolean

    fun tope(): String?//SE MODIFICA PARA QUE ACEPTE VALORES NULOS

    fun formarse(elemento: String):Boolean//SE RECIBE DATO DE TIPO STRING PARA ENVIAR UN BOLEANO

    fun salirFila(): String?//SE MODIFICA PARA QUE SE ACEPTEN VALORES NULOS
}