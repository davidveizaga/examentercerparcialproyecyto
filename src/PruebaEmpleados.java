import java.util.Scanner;
import java.sql.Connection;

public class PruebaEmpleados  {
    public static void main(String[] args) {     // TODO code application logic here

        Coneccion conexion=new Coneccion();
        try {
            conexion.get_conConection();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
