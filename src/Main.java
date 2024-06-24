import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        boolean continuar = true;
        String nombre ;
        int edad = 0;
        String sexo ;
        while (continuar) {
            System.out.println("Calculadora de IMC");
            System.out.println("1. Registre sus datos");
            System.out.println("2. Calcular IMC");
            System.out.println("3. Interpretar IMC");
            System.out.println("4. Mostrar tabla de clasificación");
            System.out.println("5. Mostrar recomendaciones");
            System.out.println("6. Mostrar mensaje según IMC");
            System.out.println("7. Salir");
            System.out.print("Ingrese una opción: ");

            int opcion = capture.nextInt();

            if (opcion == 1) {

                System.out.print("Ingrese su Nombre: ");
                nombre = capture.next();
                System.out.print("Ingrese edad: ");
                edad = capture.nextInt();
                System.out.print("Ingrese su sexo (M/F): ");
                sexo= capture.next();
                System.out.print("Gracias por confiar sus datos en la  ");
            } else if (opcion == 2) {

                System.out.print("Ingrese su peso en kg: ");
                double peso = capture.nextDouble();
                System.out.print("Ingrese su altura en cm: ");
                double altura = capture.nextDouble();
                double imc = peso / (altura * altura);
                System.out.printf("Su IMC es %.2f%n", imc);

            } else if (opcion == 3) {
                System.out.print("Ingrese su IMC: ");
                double imcIngresado = capture.nextDouble();


                if (imcIngresado < 18.5) {
                    System.out.println("Bajo peso");
                } else if (imcIngresado < 25) {
                    System.out.println("Peso normal");
                } else if (imcIngresado < 30) {
                    System.out.println("Sobrepeso");
                } else {
                    System.out.println("Obesidad");
                }

            } else if (opcion == 4) {
                System.out.println("\nTabla de clasificación de IMC");
                System.out.println("Menos de 18.5\t Bajo peso");
                System.out.println("18.5 - 24.9\t Peso normal");
                System.out.println("25 - 29.9\t Sobrepeso");
                System.out.println("30 o más\t Obesidad");

            } else if (opcion == 5) {
                System.out.println("\nRecomendaciones");
                System.out.println("---------------");
                System.out.println("1. Mantenga una dieta equilibrada.");
                System.out.println("2. Realice ejercicio regularmente.");
                System.out.println("3. Consulte a un médico regularmente.");

            } else if (opcion == 6) {
                System.out.println("\nMensajes según IMC");
                System.out.println("18.5 - 24.9\t Usted tiene un peso saludable.");
                System.out.println("25 - 29.9\t Usted tiene sobrepeso. Considere una dieta equilibrada y ejercicio.");
                System.out.println("30 o más\t Usted tiene obesidad. Consulte a un médico para un plan de pérdida de peso.");

            } else if (opcion == 7) {
                continuar = false;

            } else {
                System.out.println("Opción no válida. Por favor, ingrese una opción válida del menú.");
            }
        }

        System.out.println("Fin del programa.");
        capture.close();
    }
}