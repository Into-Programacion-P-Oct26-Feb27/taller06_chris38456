/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 * @author chris38456
 */
import java.util.Locale;
import java.util.Scanner;

public class Problema03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            scanner.useLocale(Locale.US);

            System.out.println("=== SISTEMA DE CÁLCULO SALARIAL ===");

            // 1. Solicitar datos de entrada
            System.out.print("Ingrese el nombre del empleado: ");
            String empleado = scanner.nextLine();

            System.out.println("\nTipos de empleado:");
            System.out.println("1. Tipo 1 (5%)");
            System.out.println("2. Tipo 2 (7%)");
            System.out.println("3. Tipo 3 (9%)");
            System.out.println("4. Tipo 4 (12%)");
            System.out.println("5 o más. Cualquier otro tipo (15%)");
            System.out.print("Seleccione el tipo de empleado: ");
            int tipoEmpleado = scanner.nextInt();

            System.out.print("Ingrese los años de servicio: ");
            int aniosServicio = scanner.nextInt();

            System.out.print("Ingrese el sueldo inicial ($): ");
            double sueldoInicial = scanner.nextDouble();

            // Variables para los cálculos
            double porcentajeIncrementoDecimal = 0.0;
            int porcentajeEntero = 0; // Para mostrar el reporte como porcentaje (ej. 9%)
            double bonificacion = 0.0;

            // 2. Determinar el porcentaje de incremento según el tipo de empleado (usando switch)
            switch (tipoEmpleado) {
                case 1 -> {
                    porcentajeIncrementoDecimal = 0.05;
                    porcentajeEntero = 5;
                }
                case 2 -> {
                    porcentajeIncrementoDecimal = 0.07;
                    porcentajeEntero = 7;
                }
                case 3 -> {
                    porcentajeIncrementoDecimal = 0.09;
                    porcentajeEntero = 9;
                }
                case 4 -> {
                    porcentajeIncrementoDecimal = 0.12;
                    porcentajeEntero = 12;
                }
                default -> {
                    porcentajeIncrementoDecimal = 0.15;
                    porcentajeEntero = 15;
                }
            }

            // 3. Determinar la bonificación por antigüedad usando estructuras if / else anidadas
            if (aniosServicio < 2) {
                bonificacion = 0.00;
            } else if (aniosServicio >= 2 && aniosServicio < 5) {
                bonificacion = 30.00;
            } else if (aniosServicio >= 5 && aniosServicio < 10) {
                bonificacion = 60.00;
            } else {
                bonificacion = 100.00;
            }

            // 4. Realizar cálculos correspondientes
            double incrementoSalarial = sueldoInicial * porcentajeIncrementoDecimal;
            double nuevoSueldo = sueldoInicial + incrementoSalarial + bonificacion;

            // 5. Presentar el reporte con formato monetario y dos decimales
            System.out.println("\nREPORTE DE INCREMENTO SALARIAL");
            System.out.println("Empleado: " + empleado);
            System.out.println("Tipo de empleado: " + tipoEmpleado);
            System.out.println("Años de servicio: " + aniosServicio);
            System.out.println();
            System.out.printf("Sueldo inicial: $%.2f%n", sueldoInicial);
            System.out.println("Porcentaje de incremento: " + porcentajeEntero + "%");
            System.out.printf("Incremento salarial: $%.2f%n", incrementoSalarial);
            System.out.printf("Bonificación por antigüedad: $%.2f%n", bonificacion);
            System.out.println();
            System.out.printf("Nuevo sueldo: $%.2f%n", nuevoSueldo);
        }
    }
}