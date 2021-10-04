package Conex;

import java.util.ArrayList;
import java.sql.*;
import java.util.Scanner;

public class Conexion {

    ArrayList<Persona> listaPersonas;
    Persona persona;
    public String URL = "jdbc:mysql://localhost:3306/bd?characterEncoding=latin1";
    public String password = "root";
    public String user = "root";
    Scanner entrada = new Scanner(System.in);

    public Connection getConnection() {

        Connection conexion = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexion = DriverManager.getConnection(URL, user, password);
            System.out.println("Conexion establecida");
            Statement sentencia = (Statement) conexion.createStatement();
            System.out.println("Ingrese los datos del Cliente\nNombre:");
            String nombre = entrada.next();
            System.out.println("Apellido:");
            String apellio = entrada.next();
            System.out.println("Cédula:");
            String cedula = entrada.next();
            System.out.println("Dirección:");
            String direccion = entrada.next();
            System.out.println("telefono:");

            String sentenciaSql = "insert into clientes values ('" + cedula + "','" + nombre + "','" + apellio + "','" + direccion + "')";
            int insert = sentencia.executeUpdate(sentenciaSql);
            sentencia.close();
            conexion.close();
        } catch (Exception ex) {

        }
        return conexion;

    }
}
