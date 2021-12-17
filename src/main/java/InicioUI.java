import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InicioUI extends JFrame {//SE CREA EN LA CLASE LA EXTENCION DE UN JFRAME QUE ES UNA INTERFAZ GRAFICA

//CLIENTE - NOMBRE DEL CLIENTE -NUMERO DE COMPRAS - CATEGORIA - SALDO A DEBER = NOMBRE DE LAS COLUMNAS

public static Object[] columnas = {"Nombre del Cliente", "Numero de Compras", "Categoria", "Saldo a Deber"};
//TIPO DE DATO GENERICO OBJECT PARA INTRODUCIR DIFERENTES TIPOS DE DATOS EN LA TABLA

public static Object[][] datos ={//CREACION DE FILAS TIPO OBJECT PARA INSERCION DE DATOS
        {"Francisco Antonio", 20, 'A', 2000.50},//VALORES DE LA FILA 1
        {"Cesar Ubaldo", 10, 'B', 10000.20},//VALORES DE LA FILA 2
        {"Iris Samahi", 30, 'S', 200.00}//VALORES DE LA FILA 3
};

public JTable tablaClientes; //SE MANDA A LLAMAR EL COMPONENTE VISUAL DE JAVA PARA REALIZAR UNA TABLA

public InicioUI(){//CREACION DE UN METODO CONSTRUCTOR

    crearTabla();//SE INICIALIZA EL METODO CREAR TABLA

}

public void crearTabla() {//METODO PARA CREAR LA TABLA TIPO PUBLICO

    DefaultTableModel modelo = new DefaultTableModel(datos, columnas);//SE INTRODUCEN LOS DATOS PARA LA TABLA EN LAS FILAS Y COLUMNAS
    tablaClientes = new JTable(modelo); //SE CREA LA TABLA CLIENTES RECIBIENDO LOS DATOS DE LA VARIABLE MODELO

    tablaClientes.setPreferredScrollableViewportSize(tablaClientes.getPreferredSize());//SE INTRODUCE EL TAMAÑO PREFERENTE DE LA TABLA
    JScrollPane scrollPane = new JScrollPane(tablaClientes);//JSCROLL ES UN CONTENEDOR PARA COMPONENTES QUE NECESITEN REDIMENSIONARSE

    JButton boton = new JButton("Llenar Tabla");//SE CREA UN BOTON MEDIANTE LA LIBRERIA JAVA
    boton.setMinimumSize(new Dimension(100, 32));//SE INTRODUCE EL TAMAÑO MINIMO DEL BOTON
    boton.setPreferredSize(new Dimension(100, 32));//SE INTRODUCE EL TAMAÑO PREFENTE DEL BOTON
    boton.setMaximumSize(new Dimension(100, 32));//SE INTRODUCE EL TAMAÑO MAXIMO DEL BOTON

    JButton EstructuraLineal = new JButton("Estructura Lineal");
    boton.setMinimumSize(new Dimension(100, 32));//SE INTRODUCE EL TAMAÑO MINIMO DEL BOTON
    boton.setPreferredSize(new Dimension(100, 32));//SE INTRODUCE EL TAMAÑO PREFENTE DEL BOTON
    boton.setMaximumSize(new Dimension(100, 32));//SE INTRODUCE EL TAMAÑO MAXIMO DEL BOTON

    getContentPane().setLayout(new GridLayout(2, 1));//SE COLOCAN LOS BOTONES EN EL PANEL MEDIANTE
    //LOS LAYOUT PARA TENER UNA DISTRIBUCION EN FORMA DE MATRIZ CON GRIDLAYOUT
    getContentPane().add(scrollPane);// SE AGREGA EN EL PANEL LA TABLA CLIENTES CONTENIDA EN EL JSCROLLPANE
    getContentPane().add(boton);//SE AGREGA EN EL PANEL EL BOTON "LLENAR TABLA"
    getContentPane().add(EstructuraLineal);//SE AGREGA EN EL PANEL EL BOTON "ESTRUTURA LINEAL"
    }



    public static void main(String[] args){//METODO PRINCIPAL PARA EJECUTAR EL CODIGO
    InicioUI ventana = new InicioUI();//SE CREA LA VARIABLE VENTANA
    ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);//LIBRERIA PARA CERRAR LA VENTANA CON EL BOTON SELECCIONADO
    ventana.pack();//.PACK EN UN CONTENEDOR DE CLASES
    ventana.setLocation(0,0); // SE INTRODUCE LA LOCACION DE LA VENTANA AL MOMENTO DE ABRIRSE
    ventana.setMinimumSize(new Dimension(1000, 800));//SE INTRODUCE EL TAMAÑO MINIMO DE LA VENTANA
    ventana.setPreferredSize(new Dimension(1000, 800));//SE INTRODUCE EL TAMAÑO PREFERENTE DE LA VENTANA
    ventana.setMaximumSize(new Dimension(1000, 800));//SE INTORDUCE EL TAMAÑO MAXIMO DE LA VENTANA
    ventana.setVisible(true);//METODO QUE PERMITE VISUALIZAR LA VENTANA MEDIANTE UN VALOR BOLEANO

}




}
