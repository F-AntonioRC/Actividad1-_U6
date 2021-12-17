import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class BusquedaInterfaz {
    private JPanel panelPrincipal;//USO DE LA JTABLE "TABLA"
    private JTable tabla;//USO DE LA JTABLE "TABLA"
    private JTextField valorABuscarCampoTexto;//CAMPO PARA INTRIDUCIR EL VALOR A BUSCAR
    private JButton buscarKotlinButton;//BOTON PARA METODO DE BUSQUEDA EN KOLTIN
    private JButton busquedaLinealButton;//BOTON PARA METODO DE BUSQUEDA LINEAL
    private JButton busquedaBinariaButton;//BOTON PARA METODO DE BUSQUEDA BINARIA

    //NOMBRE DE LAS COLUMNAS A UTILIZAR DE TIPO GENERICO
    public static Object[] columnas = {"NOMBRE DEL CLIENTE", "NUMERO DE COMPRAS", "CATEGORIA", "SALDO A DEBER"};
    //CREACION DE UNA MATRIZ DE TIPO OBJETO PARA LA INTRODUCCION DE DATOS
    public static Object[][] datos = {
            {"CESAR UBALDO ", 20, 'A', 2000.50},
            {"KEVIN MOLINA", 20, 'A', 2000.50},
            {"ARAGON ELIANETH", 20, 'A', 2000.50},
            {"KEVIN JAVIER", 10, 'B', 10000.20},
            {"FRANCISCO ANTONIO", 30, 'S', 200.00},
            {"OLIVER ATOM", 20, 'A', 2000.50},
            {"IRIS SAMAHI", 32, 'C', 200.00},
    };

    public BusquedaInterfaz() {//METODO CONSTRUCTOR PARA INCIALIZAR LOS BOTONES CON LOS METODOS SOLICITADOS
        buscarKotlinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarKotlin();
            }//SE LLAMA A LA FUNCION BUSCARKOTLIN
        });//PARA EL BOTON CORRESPONDIENTE
        busquedaLinealButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarLinealKotlin();
            }//SE LLAMA A LA FUNCION BUSQUEDA LINEAL
        });//PARA SU BOTON CORRESPONDIENTE
        busquedaBinariaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                busquedaBinaria();
            }//SE LLAMA A LA FUNCION BUSQUEDABINARIA
        });//PARA SER UTILIZADA EN SU BOTON
    }

    public void buscarKotlin() {//METODO PARA LA BUSQUEDA DE KOTLIN
        List<String> nombres = new ArrayList<String>();//SE DECLARA UNA LISTA DE TIPO ARRAYLIST DE TIPO STRING
        for (int i = 0; i < tabla.getRowCount(); i++) {//SE RECORRE MEDIANTE UN CICLO FOR
            nombres.add(tabla.getValueAt(i, 0).toString());//SE AÑADEN LOS NOMBRES DE LA TABLA CONVIRTIENDOLOS EN STRING
        }
        String valorABuscar = valorABuscarCampoTexto.getText();//SE ENVIA EL VAOR A BUSCAR ATRAVEZ DE UN CAMPO
        MetodosBusquedaKt.busquedaPorKotlin(nombres, valorABuscar);//SE ENVIA LA LISTA JUNTO CON EL VALOR A BUSCAR AL METODO CORRESPONDIENTE
    }

    // N
    public int buscarLinealJava(List<String> list, String valorABuscar) {
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index).equals(valorABuscar)) {
                return index;
            }
        }
        return -1;
    }

    public void buscarLinealKotlin() {//METODO PARA BUSCAR DE FORMA LINEAL DE KOTLIN
        List<String> nombres = new ArrayList<String>();//SE DECLARA UNA LISTA DE TIPO ARRAYLIST DE TIPO STRING
        for (int i = 0; i < tabla.getRowCount(); i++) {//SE RECORRE MEDIANTE UN CICLO FOR EN LA TABLA
            nombres.add(tabla.getValueAt(i, 0).toString());//SE AÑADEN LOS NOMBRES DE LA TABLA CONVIRTIENDOLOS EN STRING
        }
        String valorABuscar = valorABuscarCampoTexto.getText();//SE ENVIA EL VAOR A BUSCAR ATRAVEZ DE UN CAMPO
        MetodosBusquedaKt.busquedaLineal(nombres, valorABuscar);//SE ENVIA LA LISTA JUNTO CON EL VALOR A BUSCAR AL METODO CORRESPONDIENTE
    }

    public void busquedaBinaria() {//METODO DE BUSQUEDA BINARIA
        List<String> nombres = new ArrayList<String>();////SE DECLARA UNA LISTA DE TIPO ARRAYLIST DE TIPO STRING
        for (int i = 0; i < tabla.getRowCount(); i++) {//SE RECORRE MEDIANTE UN CICLO FOR EN LA TABLA
            nombres.add(tabla.getValueAt(i, 0).toString());//SE AÑADEN LOS NOMBRES DE LA TABLA CONVIRTIENDOLOS EN STRING
        }
        String valorABuscar = valorABuscarCampoTexto.getText();//SE ENVIA EL VAOR A BUSCAR ATRAVEZ DE UN CAMPO
        MetodosBusquedaKt.busquedaBinaria(nombres, valorABuscar);//SE ENVIA LA LISTA JUNTO CON EL VALOR A BUSCAR AL METODO CORRESPONDIENTE
    }


    public static void main(String[] args) {//METODO PARA CREAR LAS INTERFAZ
        JFrame frame = new JFrame("VENTANA");//SE CREA UN JFRAME CON EL NOMBRE DE VENTANA
        EventQueue.invokeLater(new Runnable() {//LIBRERIA PARA CORRER EL JRAME
            public void run() {//METODO PARA CORRER EL JFRAME EN UNA MANERA VISUAL
                frame.setContentPane(new BusquedaInterfaz().panelPrincipal);//SE CREA EL PANEL
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//SE DEFINE UNA OPERACION DE CERRADO
                frame.pack();//SE ENCAPSULA
                frame.setVisible(true);//SE PONE DE FORMA VISIBLE MEDIANTE UN VALOR BOLEANO
                frame.setSize(800, 512);//SE ESTABLECEN LOS TAMAÑOS DE LA VENTANA
                frame.setLocationRelativeTo(null);//SE DEFINE LA LOCALIZACION DE LA VENTANA "COORDENADAS"
            }
        });
    }

    private void createUIComponents() {//METODOS PARA CREAR LOS COMPONENTES DEL GUI
        DefaultTableModel modelo = new DefaultTableModel(datos, columnas);//SE INTRODUCEN LOS DATOS DENTRO DE LA TABLA
        tabla = new JTable(modelo);//SE DEFINE LA TABLA CON LOS DATOS INTRODUCIDOS
    }
}
