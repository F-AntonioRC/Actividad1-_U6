package EstructurasLineales.Cola

class ArrayListCola: Cola {
    private var cola = ArrayList<String>()//SE ESPECIFICA EL TIPO DE DATO DEL ARRAYLIST

    override val cuenta: Int
        get() = cola.size//.SIZE PARA CUANTIFICAR LAS DIMENSIONES

    override val estaVacia: Boolean
        get() = (cuenta == 0)//CONDICION PARA RETORNO DE VALORES

    override fun tope(): String? {
        return cola.getOrNull(0)}//RETORNO DE DATOS EN CASO DE CUMPLIRSE UNA CONDICION, SE ACEPTAN VALORES NULOS


    override fun formarse(elemento: String): Boolean {
        return cola.add(elemento)}//SE AÑADEN LOS ELEMENTOS DE TIPO STRING


    override fun salirFila(): String? {
        return if (estaVacia) null else cola.removeAt(0)}//REMUEVE UN ELEMENTO DENTRO DEL ARRAYLIST
    //EN CASO DE NO CUMPLIRSE UNA CONDICION
}