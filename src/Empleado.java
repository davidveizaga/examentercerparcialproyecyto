import java.util.Scanner;
public class Empleado  {
    private String nombre;
    private int edad;
    private double salario;

    Empleado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        edad = scanner.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        salario = scanner.nextDouble();


    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}