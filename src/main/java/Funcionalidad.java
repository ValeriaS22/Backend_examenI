import java.util.Scanner;
import java.time.LocalDateTime;

public class Funcionalidad {

    static Scanner sc = new Scanner(System.in);

    // ATRIBUTOS
    static int cantidadpasos=0;
    static int cantidadias =5;
    static String userName;
    static String email;
    static String password;
    static float profit;

    // COMPORTAMIENTOS
    static public void createUser(){
        String [] user = new String[3];

        System.out.print("Ingrese su nombre: ");
        userName = sc.nextLine();
        user[0] = userName;

        System.out.print("Ingrese su correo: ");
        email = sc.nextLine();
        user[1] = email;

        System.out.print("Ingrese la contraseña: ");
        password = sc.nextLine();
        user[2] = password;

        sc.nextLine();

        for (int i = 1; i <= cantidadias; i++) {
            System.out.print("Ingresa los pasos del día " + i + ": ");
            int pasos = sc.nextInt();
            cantidadpasos += pasos;
        }

        profit = cantidadpasos / cantidadias;
        System.out.println("El promedio de los días es: " + profit);

        // FOREACH
        for(String item: user){
            System.out.println(item);
        }

    }

    public static void main(String[] args) {
        menu();
    }

    public static void menu (){
        System.out.println("Seleccione" + "\n" + "1.Iniciar sesión");

        int opc = sc.nextInt();
        sc.nextLine();

        switch (opc){
            case 1:
                System.out.println("Inciar sesion");
                Login();
                break;
            default:
                System.out.println("La opcion no es correcta");
        }
    }

    static public void Login(){
        System.out.print("Ingresa tu correo para inciar: ");
        String username = sc.nextLine();

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Usuario" + username + "ha iniciado seción" + now);

        createUser();

    }

}
