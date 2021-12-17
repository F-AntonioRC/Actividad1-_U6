package EstructurasLineales.ListasEnlazadas

//data class Nodo <T: Any>(var valor,var siguiente: Nodo<T>? = null ){ METODO PARA QUE SEA TIPO DE DATO GENERICO
data class Nodo <String>(var valor: String ,var siguiente: Nodo<String>? = null ) {


    override fun toString(): kotlin.String {
        return if (siguiente != null) {
            "$valor -> ${siguiente.toString()}"
        } else {
        "$valor"
        }
    }

    fun imprimirReversa(){
    siguiente?.imprimirReversa()

        if(siguiente != null){
            print(" -> ")
        }
        print(valor.toString())
    }
}