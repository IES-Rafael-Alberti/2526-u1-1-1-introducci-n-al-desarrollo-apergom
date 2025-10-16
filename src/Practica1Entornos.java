import java.util.Scanner;

public class Practica1Entornos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Programa mensaje en Java");

        System.out.print("¿Cómo se llama? ");
        String nombre = input.nextLine();

        System.out.print("¿En qué año nació? ");
        int nacimiento = input.nextInt();

        int edad = 2025 - nacimiento;
        String lenguaje = "Java";

        System.out.println("Hola " + nombre + ", tienes " + edad + " años. Este programa está hecho en el lenguaje de programación: " + lenguaje);

        input.close();
    }
}
