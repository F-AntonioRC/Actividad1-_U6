package EstructurasLineales.ListasEnlazadas;

public class Alumno {

    String Nombre;
    String Edad;
    String Correo;

    public Alumno(String nombre, String edad, String correo) {
        Nombre = nombre;
        Edad = edad;
        Correo = correo;
    }

    public Alumno(){
    }

    public String getNombre() {return Nombre;}

    public void setNombre(String nombre) {Nombre = nombre;}

    public String getEdad() {return Edad;}

    public void setEdad(String edad) {Edad = edad;}

    public String getCorreo() {return Correo;}

    public void setCorreo(String correo) {Correo = correo;}
}
