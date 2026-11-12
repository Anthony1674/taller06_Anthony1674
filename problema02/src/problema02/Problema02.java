/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author SALASC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); 

        System.out.print("Nombre del propietario: ");
        String propietario = entrada.nextLine();

        System.out.println("1. Vehículo liviano particular");
        System.out.println("2. Vehículo grande particular");
        System.out.println("3. Taxi");
        System.out.println("4. Autobús urbano");
        System.out.print("Tipo: ");
        int tipo = entrada.nextInt();

        if (tipo < 1 || tipo > 4) {
            System.out.println("El tipo de vehículo no es válido.");
        } else {
            System.out.print("Avalúo: $");
            double avaluo = entrada.nextDouble();

            String descripcion;
            double porcentaje;
            double fijo;

            switch (tipo) {
                case 1:
                    descripcion = "Vehículo liviano particular";
                    porcentaje = 0.01;
                    fijo = 2.00;
                    break;
                case 2:
                    descripcion = "Vehículo grande particular";
                    porcentaje = 0.02;
                    fijo = 2.50;
                    break;
                case 3:
                    descripcion = "Taxi";
                    porcentaje = 0.04;
                    fijo = 1.50;
                    break;
                default:
                    descripcion = "Autobús urbano";
                    porcentaje = 0.05;
                    fijo = 2.20;
                    break;
            }

            double valorBase = avaluo * porcentaje / 100 + fijo;

            double recargo = 0;
            if ((tipo == 1 || tipo == 2) && avaluo > 30000) {
                recargo = 1.50;
            }

            double total = valorBase + recargo;

            System.out.println();
            System.out.println("Peaje \"Buena Vía\"");
            System.out.println("Propietario: " + propietario);
            System.out.println("Tipo: " + descripcion);
            System.out.printf(Locale.US, "    Avalúo: $%.2f%n", avaluo);
            System.out.printf(Locale.US, "    Valor base del peaje: $%.2f%n", valorBase);
            System.out.printf(Locale.US, "    Recargo: $%.2f%n", recargo);
            System.out.println();
            System.out.printf(Locale.US, "    Total a cancelar: $%.2f%n", total);
        }

    }
}