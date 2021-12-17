package EstructurasLineales.Cola//NOMBRE DEL PAQUETE EN EL QUE ESTA CONTENIDO LOS ARCHIVOS DE COLA

fun main(){//FUNCION PRINCIPAL
    var colaStrings : Cola = ArrayListCola()//SE CREA UNA VARIABLE CON CON CON EL NOMBRE COLA DE TIPO ARRAY

    colaStrings.formarse("Yonas")//SE MANDA A LLAMAR AL METODO FORMASE DE CLASE KOTLIN ARRAYLISTCOLA
    colaStrings.formarse("Tunas")//PARA LA INSERCION DE DATOS
    colaStrings.formarse("Elles")
    colaStrings.formarse("Antonio")

    colaStrings.salirFila()//SE LLAMA AL METODO SALIRFILA PARA SACAR EL CONTENIDO DE LA ESTRUCTURA LINEAL COLA
    colaStrings.salirFila()
    colaStrings.salirFila()

    println(colaStrings.tope())//SE IMPRIMEN LOS VALORES QUE SIGUEN ESTANDO EN LA COLA, EN ESTE CASO SERIA EL ULTIMO
    //DATO EN AGREGARSE
}