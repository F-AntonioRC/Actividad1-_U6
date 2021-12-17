import EstructurasLineales.MetodosOrdenamientoKt; //SE IMPORTAN LOS METODOS DE LA CLASE DE KOTLIN METODOS DE ORDENAMIENTO

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class OrdenamientoInterfaz {//NOMBRE DE LA CLASE

    private JPanel panelPrincipal;//USO DEL PANEL PRINCIPAL
    private JTable tabla;//USO DE LA JTABLE "TABLA"
    private JButton bubujaButton;//BOTON PARA METODO DE ORDENAMIENTO BURBUJA
    private JButton quickSortButton;//BOTON PARA METODO DE ORDENAMIENTO QUICKSORT
    private JButton mergeSortButton;//BOTON PARA METODO DE ORDENAMIENTO MERGESORT
    private JLabel resultado;//CUADRO PARA MOSTRAR EL RESULTADO

    //CREACION DE UN ARRAY DE TIPO OBJECT PARA MANEJAR DIFERENTES TIPOS DE DATOS SON NOMBRES DE LAS COLUMNAS
    public static Object[] columnas = {"NOMBRE DEL CLIENTE", "NUMERO DE COMPRAS", "CATEGORIA", "SALDO A DEBER"};

    public static Object[][] datos = {//SE CREA UNA MATRIZ PARA INTRODUCIR LOS DATOS DENTRO DE LA TABLA
            {"PATRICIA EUGENIO ", 20, 'A', 2000.50},//DATOS INGRESADOS EN LAS PRIMERAS FILAS SEGUN EL ORDEN DE LAS COLUMNAS
            {"KEVIN MOLINA", 20, 'A', 2000.50},
            {"ARAGON ELIANETH", 20, 'A', 2000.50},
            {"KEVIN JAVIER", 10, 'B', 10000.20},
            {"IRIS SAMAHI", 30, 'S', 200.00},
            {"ANDRES JAHIR ", 20, 'A', 2000.50},
    };

    public OrdenamientoInterfaz() {//SE CREA UN METODO CON EL NOMBRE DEL ARCHIVO DE KOTLIN
        quickSortButton.addActionListener(new ActionListener() {//ACCIONES A REALIZAR PARA EL PRIMER BOTON
            @Override
            public void actionPerformed(ActionEvent e) {//
                ordenarQuickSort();} //SE LLAMA AL METODO QUICKSORT
        });

        mergeSortButton.addActionListener(new ActionListener() {//ACCIONES A REALIZAR EN EL BOTON MERGESORT
            @Override
            public void actionPerformed(ActionEvent e) {
                ordenarMergeSort();}//SE LLAMA AL METODO MERGESORT
        });


        bubujaButton.addActionListener(new ActionListener() {//ACCIONES A REALIZAR EN EL BOTON BURBUJA
            @Override
            public void actionPerformed(ActionEvent e) {}
        });
    }

    public void ordenarQuickSort() {
        List<String> nombres = new ArrayList<String>();//SE CREA UNA LITA DE TIPO STRING
        for (int i = 0; i < tabla.getRowCount(); i++) {//SE CREAN LAS CONDICIONES PARA EVALUAR LOS DATOS
            nombres.add(tabla.getValueAt(i, 0).toString());//SE AÑADEN Y CONVIERTEN LOS DATOS A STRING
        }
        MetodosOrdenamientoKt.tiempoQuicksort(nombres);//SE LLAMA AL METODO PARA MEDIR EL TIEMPO
    }


    public void ordenarMergeSort() {
        List<String> nombres = new ArrayList<String>();//SE CREA UNA LITA DE TIPO STRING
        for (int i = 0; i < tabla.getRowCount(); i++) {//SE CREAN LAS CONDICIONES PARA LOS DATOS
            nombres.add(tabla.getValueAt(i, 0).toString());//SE AÑADEN Y CONVIERTEN LOS DATOS A STRIN
        }
        MetodosOrdenamientoKt.tiempoMergeSort(nombres);//SE IMPRIMEN LOS NOMBRES ENVIANDOLOS AL ARCHIVO DE KOTLIN
    }

    public static void main(String[] args) {//METODO PARA CREAR LAS INTERFAZ
        JFrame frame = new JFrame("VENTANA");//SE CREA UN JFRAME CON EL NOMBRE DE VENTANA
        EventQueue.invokeLater(new Runnable() {//LIBRERIA PARA CORRER EL JRAME
            public void run() {//METODO PARA CORRER EL JFRAME EN UNA MANERA VISUAL
                frame.setContentPane(new OrdenamientoInterfaz().panelPrincipal);//SE CREA EL PANEL EN FORMA CONTENIDA
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//SE DEFINE UNA OPERACION DE CERRADO
                frame.pack();//SE ENCAPSULA
                frame.setVisible(true);//SE PONE DE FORMA VISIBLE MEDIANTE UN VALOR BOLEANO
                frame.setSize(512, 512);//SE ESTABLECEN LOS TAMAÑOS DE LA VENTANA
                frame.setLocationRelativeTo(null);//SE DEFINE LA LOCALIZACION DE LA VENTANA "COORDENADAS"
            }
        });
    }


    private void createUIComponents() {//METODOS PARA CREAR LOS COMPONENTES DEL GUI
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);//SE INTRODUCEN LOS DATOS DENTRO DE LA TABLA
        tabla = new JTable(modelo); //SE DEFINE LA TABLA CON LOS DATOS INTRODUCIDOS
    }
}
