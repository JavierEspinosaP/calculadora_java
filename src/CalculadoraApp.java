import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("**** Aplicacion Calculadora ****");

        while(true){
        try {
            //Mostrar menu
            mostrarMenu();
            var operacion = Integer.parseInt(consola.nextLine());

            //Revisar que este dentro de las opciones
            if (operacion >= 1 && operacion <= 4){
                ejecutarOperacion(operacion, consola);
            }
            else if (operacion == 5){
                System.out.println("Hasta pronto...");
                break;
            }
            else {
                System.out.println("Opcion erronea");
            }
            // Imprimimos salto antes de repetir ciclo
            System.out.println();
        } catch (Exception e) {
            System.out.println("Ocurrio un error: " + e.getMessage());
        }

        } //fin while
        } //fin main
        private static void mostrarMenu(){
            System.out.println("1.- Suma \n2.- Resta\n3.- Multiplicacion\n4.- Division\n5.- Salir");
            System.out.print("Operacion a realizar? ");
        }

        private static void ejecutarOperacion(int operacion, Scanner consola) {
            System.out.print("Proporciona valor operando1: ");
            var operando1 = Double.parseDouble(consola.nextLine());
            System.out.print("Proporciona valor operando2: ");
            var operando2 = Double.parseDouble(consola.nextLine());
            double resultado;

            switch (operacion) {
                case 1 -> {
                    resultado = operando1 + operando2;
                    System.out.println("Resultado Suma: " + resultado);
                }
                case 2 -> {
                    resultado = operando1 - operando2;
                    System.out.println("Resultado Resta: " + resultado);
                }
                case 3 -> {
                    resultado = operando1 * operando2;
                    System.out.println("Resultado Multiplicacion: " + resultado);
                }
                case 4 -> {
                    resultado = operando1 / operando2;
                    System.out.println("Resultado Division: " + resultado);
                }
                default -> System.out.println("Opcion erronea: " + operacion);
            }
        }
    }// fin clase
