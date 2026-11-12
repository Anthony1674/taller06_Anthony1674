/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_2;
import java.util.Scanner;
/**
 *
 * @author SALASC
 */
public class Problema01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        System.out.println("OPERACIONES ARITMÉTICAS");
        System.out.println();
        System.out.println("Seleccione una operación:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Potencia");
        System.out.print("Opción: ");
        int opcion = entrada.nextInt();

        
        if (opcion < 1 || opcion > 6) {
            System.out.println();
            System.out.println("La opción seleccionada no es válida.");
          
        }

        System.out.print("Ingrese el primer número: ");
        double a = entrada.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double b = entrada.nextDouble();

        
        if (a <= b) {
            System.out.println();
            System.out.println("No es posible realizar la operación solicitada: "
                    + "el primer número debe ser mayor que el segundo.");
        }

        String nombre = "";
        double resultado = 0;
        boolean valido = true;

        switch (opcion) {
            case 1:
                nombre = "Suma";
                resultado = a + b;
                break;
            case 2:
                nombre = "Resta";
                resultado = a - b;
                break;
            case 3:
                nombre = "Multiplicación";
                resultado = a * b;
                break;
            case 4:
                nombre = "División";
                if (b == 0) {
                    valido = false;
                } else {
                    resultado = a / b;
                }
                break;
            case 5:
                nombre = "Módulo";
                if (b == 0) {
                    valido = false;
                } else {
                    resultado = a % b;
                }
                break;
            case 6:
                nombre = "Potencia";
                resultado = Math.pow(a, b);
                break;
            default:
               
                valido = false;
                break;
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
