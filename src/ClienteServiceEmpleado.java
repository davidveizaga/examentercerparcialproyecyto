import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClienteServiceEmpleado {

    public static void agregarEmpleado(){
        Scanner sc=new Scanner(System.in);
        System.out.println("escribe tu nombre");
        String nombre =sc.nextLine();
        System.out.println("escribre tu edad");
        int edad=sc.nextInt();
        System.out.println("escribe tu salario");
        double salario= sc.nextDouble();

        Empleado empleado= new Empleado();
        empleado.setNombre(nombre);
        empleado.setEdad(edad);
        empleado.setSalario(salario);
    }
    public List<Empleado> clientes;


    public ClienteServiceEmpleado() {
        clientes = new ArrayList<>();
    }

    public void agregarCliente(Empleado cliente) {
        ClienteDao.verListaDeEmpleado();
        clientes.add(cliente);
    }

    public void eliminarCliente(Empleado cliente) {
        clientes.remove(cliente);
    }

    public Empleado buscarClientePorId(String NOMBRE) {
        for (Empleado cliente : clientes) {
            if (cliente.getNombre() == NOMBRE) {
                return cliente;
            }
        }
        return null;
    }

    public List<Empleado> obtenerTodosLosClientes() {
        return clientes;
    }
}