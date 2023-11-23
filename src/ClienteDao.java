import com.mysql.cj.protocol.Resultset;
import com.sun.source.tree.TryTree;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClienteDao {
    public static void agregarEmpleado(Empleado empleado) {
        Coneccion db_connect = new Coneccion();
        try (Connection conecion = db_connect.get_conConection()){
            PreparedStatement ps = null;
            try {
                String query = "INSERT INTO 'empresa'-'empleado'('nombre','edad','salario')VALUES()";
                ps = conecion.prepareStatement(query);
                ps.setString(1, empleado.getNombre());
                ps.setInt(2, empleado.getEdad());
                ps.setDouble(3, empleado.getSalario());
                ps.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static  void verListaDeEmpleado(){
        Coneccion db_connect=new Coneccion();
        PreparedStatement ps=null;
        ResultSet rs=null;
        try (Connection connection=db_connect.get_conConection()){
            String query="SELECT * FROM cliente ";
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()){
                System.out.println("id: "+rs.getInt("id"));
                System.out.println("nombre: "+rs.getString("nombre"));
                System.out.println("edad: "+rs.getInt("edad"));
                System.out.println("salario: "+rs.getDouble("salario"));
            }

        }catch (SQLException e){
            System.out.println(e);
        }

    }
    public static void buscarEmpleado(){

    }
    public static void actualizarlistaDeEmpleado(Empleado empleado){

    }
    public static void eliminarEmpleado(int id){

    }

}
