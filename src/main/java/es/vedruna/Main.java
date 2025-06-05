package es.vedruna;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("===== CALCULADORA SIMPLE =====");

        while (continuar) {
            System.out.println("\nElige una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int opcion = sc.nextInt();

            if (opcion == 5) {
                continuar = false;
                System.out.println("¡Hasta luego!");
                break;
            }

            System.out.print("Introduce el primer número: ");
            double a = sc.nextDouble();

            System.out.print("Introduce el segundo número: ");
            double b = sc.nextDouble();

            switch (opcion) {
                case 1 -> System.out.println("Resultado: " + (a + b));
                case 2 -> System.out.println("Resultado: " + (a - b));
                case 3 -> System.out.println("Resultado: " + (a * b));
                case 4 -> {
                    if (b == 0) {
                        System.out.println("Error: No se puede dividir por cero.");
                    } else {
                        System.out.println("Resultado: " + (a / b));
                    }
                }
                default -> System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}



