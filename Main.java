package Conex;

public class Main {

    public static void main(String[] args) {

        Persona p = new Persona();
        p.setId("4");
        p.setNombre("Yordi");
        p.setApellido("Donoso");

        Conexion conexion = new Conexion();
        conexion.getConnection();
    }

}
