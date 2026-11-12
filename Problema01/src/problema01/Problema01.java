/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Potencia");
        System.out.print("Opción: ");
        int opcion = entrada.nextInt();

        // Validar que la opción sea una de las contempladas
        if (opcion < 1 || opcion > 6) {
            System.out.println();
            System.out.println("La opción seleccionada no es válida.");
        } else {
            System.out.print("Ingrese el primer número: ");
            double a = entrada.nextDouble();
            System.out.print("Ingrese el segundo número: ");
            double b = entrada.nextDouble();

            // Restricción general: el primer número debe ser mayor que el segundo
            if (a <= b) {
                System.out.println();
                System.out.println("No es posible realizar la operación solicitada: "
                        + "el primer número debe ser mayor que el segundo.");
            } else {
                String nombre;
                double resultado = 0;
                boolean valido = true;

                if (opcion == 1) {
                    nombre = "Suma";
                    resultado = a + b;
                } else if (opcion == 2) {
                    nombre = "Resta";
                    resultado = a - b;
                } else if (opcion == 3) {
                    nombre = "Multiplicación";
                    resultado = a * b;
                } else if (opcion == 4) {
                    nombre = "División";
                    if (b == 0) {
                        valido = false;
                    } else {
                        resultado = a / b;
                    }
                } else if (opcion == 5) {
                    nombre = "Módulo";
                    if (b == 0) {
                        valido = false;
                    } else {
                        resultado = a % b;
                    }
                } else {
                    nombre = "Potencia";
                    resultado = Math.pow(a, b);
                }

                System.out.println();
                if (!valido) {
                    System.out.println("No es posible realizar la operación solicitada: "
                            + "el segundo número no puede ser cero.");
                } else {
                    System.out.println("OPERACIONES ARITMÉTICAS");
                    System.out.println();
                    System.out.println("Primer número: " + (a));
                    System.out.println("Segundo número: " + (b));
                    System.out.println("Operación seleccionada: " + nombre);
                    System.out.println();
                    System.out.println("Resultado: " + (resultado));
                }
            }
        }

    }
}