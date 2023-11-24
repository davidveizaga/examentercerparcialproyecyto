import java.util.*;
public class MenuEmpleado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- Menú de Empleados -----");
            System.out.println("1. Agregar empleado");
            System.out.println("2. Ver lista de empleados");
            System.out.println("3. Buscar empleado");
            System.out.println("4. Actualizar información de empleado");
            System.out.println("5. Eliminar empleado");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    verListaEmpleados();
                    break;
                case 3:
                    buscarEmpleado();
                    break;
                case 4:
                    actualizarEmpleado();
                    break;
                case 5:
                    eliminarEmpleado();
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (opcion != 6);
    }

    public static void agregarEmpleado() {
        // Lógica para agregar un empleado
        ClienteDao.verListaDeEmpleado();
        System.out.println("Funcionalidad de agregar empleado");
    }

    public static void verListaEmpleados() {
        // Lógica para mostrar la lista de empleados
        System.out.println("Funcionalidad de ver lista de empleados");
    }

    public static void buscarEmpleado() {
        // Lógica para buscar un empleado
        System.out.println("Funcionalidad de buscar empleado");
    }

    public static void actualizarEmpleado() {
        // Lógica para actualizar la información de un empleado
        System.out.println("Funcionalidad de actualizar información de empleado");
    }

    public static void eliminarEmpleado() {
        // Lógica para eliminar un empleado
        System.out.println("Funcionalidad de eliminar empleado");
    }
}
