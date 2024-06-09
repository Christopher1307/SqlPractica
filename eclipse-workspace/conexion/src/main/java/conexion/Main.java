package conexion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        OperacionesCRUD operaciones = new OperacionesCRUD();
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("\nMenú de Operaciones CRUD");
        System.out.println("1. Insertar Contacto");
        System.out.println("2. Leer Contactos");
        System.out.println("3. Actualizar Contacto");
        System.out.println("4. Borrar Contacto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        switch (opcion) {
            case 1:
                insertarContacto(operaciones, scanner);
                break;
            case 2:
                operaciones.leerContactos();
                break;
            case 3:
                actualizarContacto(operaciones, scanner);
                break;
            case 4:
                borrarContacto(operaciones, scanner);
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }

        DatabaseConnection.cerrarConexion();
        scanner.close();
    }

    private static void insertarContacto(OperacionesCRUD operaciones, Scanner scanner) {
        System.out.print("Ingrese Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese Apellidos: ");
        String apellidos = scanner.nextLine();

        System.out.print("Ingrese DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Ingrese Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese Correo: ");
        String ecorreo = scanner.nextLine();

        System.out.print("Ingrese Fecha de Cumpleaños (YYYY-MM-DD): ");
        String fechacumple = scanner.nextLine();

        System.out.print("Ingrese Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ingrese Población: ");
        String poblacion = scanner.nextLine();

        System.out.print("Ingrese Provincia (ID): ");
        int provinciaId = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        System.out.print("Ingrese Código Postal: ");
        String codigoPostal = scanner.nextLine();

        System.out.print("Ingrese Categoría (ID): ");
        String categoriaId = scanner.nextLine();

        System.out.print("Ingrese Deuda: ");
        int deuda = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        Contacto contacto = new Contacto(0, nombre, apellidos, dni, telefono, ecorreo, fechacumple, direccion, poblacion, provinciaId, codigoPostal, categoriaId, deuda);
        operaciones.insertarContacto(contacto);
    }

    private static void actualizarContacto(OperacionesCRUD operaciones, Scanner scanner) {
        System.out.print("Ingrese Id_contacto del contacto a actualizar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese nuevo Teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese nuevo Correo: ");
        String ecorreo = scanner.nextLine();

        Contacto contacto = new Contacto(id, null, null, null, telefono, ecorreo, null, null, null, 0, null, null, 0);
        operaciones.actualizarContacto(contacto);
    }

    private static void borrarContacto(OperacionesCRUD operaciones, Scanner scanner) {
        System.out.print("Ingrese Id_contacto del contacto a borrar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir nueva línea

        operaciones.borrarContacto(id);
    }
}
