/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01_switch;

/**
 *
 * @author Usuario
 */
import java.util.Locale;
import java.util.Scanner;

public class Problema01_Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("=== MENÚ DE OPERACIONES (Switch) ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Módulo");
        System.out.println("6. Potencia");
        System.out.print("Seleccione una opción (1-6): ");
        
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();

                // Validación de la restricción principal
                if (num1 > num2) {
                    String nombreOperacion = "";
                    double resultado = 0;
                    boolean operacionValida = true;

                    switch (opcion) {
                        case 1:
                            nombreOperacion = "Suma";
                            resultado = num1 + num2;
                            break;
                        case 2:
                            nombreOperacion = "Resta";
                            resultado = num1 - num2;
                            break;
                        case 3:
                            nombreOperacion = "Multiplicación";
                            resultado = num1 * num2;
                            break;
                        case 4:
                            if (num2 != 0) {
                                nombreOperacion = "División";
                                resultado = num1 / num2;
                            } else {
                                System.out.println("\nError: No es posible realizar la división entre cero.");
                                operacionValida = false;
                            }
                            break;
                        case 5:
                            if (num2 != 0) {
                                nombreOperacion = "Módulo";
                                resultado = num1 % num2;
                            } else {
                                System.out.println("\nError: No es posible calcular el módulo con divisor cero.");
                                operacionValida = false;
                            }
                            break;
                        case 6:
                            nombreOperacion = "Potencia";
                            resultado = Math.pow(num1, num2);
                            break;
                    }

                    // Presentación del reporte
                    if (operacionValida) {
                        System.out.println("\nOPERACIONES ARITMÉTICAS");
                        System.out.println("Primer número: " + num1);
                        System.out.println("Segundo número: " + num2);
                        System.out.println("Operación seleccionada: " + nombreOperacion);
                        System.out.println("\nResultado: " + resultado);
                    }

                } else {
                    System.out.println("\nError: El primer número debe ser mayor que el segundo para realizar la operación.");
                }
                break;

            default:
                System.out.println("\nError: La opción seleccionada no es válida.");
                break;
        }

        scanner.close();
    }
}
