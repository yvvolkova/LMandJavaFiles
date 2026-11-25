// VOLKOVA, YULIA

import java.util.Scanner;

public class UD2B1
{
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        // ej1();
        // ej2();
        // ej3();
        // ej4();
        // ej5();
        // ej6();
        // ej7();
        // ej8();
        // ej9();
        // ej10();
        // ej11();
        // ej12();
        // ej13();
        // ej14();
        ej15();
         sc.close();
    }

    public static void ej1()
    {
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }

    public static void ej2()
    {
        System.out.print("Introduce el primer número entero: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int numero2 = sc.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2 + ".");
        } else if (numero1 < numero2) {
            System.out.println(numero1 + " es menor que " + numero2 + ".");
        } else {
            System.out.println("Los números son iguales.");
        }
    }

    public static void ej3()
    {
        System.out.print("Introduce un carácter: ");
        char caracter = sc.next().charAt(0);

        if (caracter >= 'A' && caracter <= 'Z') {
            System.out.println("Es una letra mayúscula");
        } else {
            System.out.println("No es una letra mayúscula");
        }
    }

    public static void ej4()
    {
        System.out.print("Introduce el primer carácter: ");
        char caracter1 = sc.next().charAt(0);
        System.out.print("Introduce el segundo carácter: ");
        char caracter2 = sc.next().charAt(0);

        boolean primerCaracterMinuscula = caracter1 >= 'a' && caracter1 <= 'z';
        boolean segundoCaracterMinuscula = caracter2 >= 'a' && caracter2 <= 'z';

        if (primerCaracterMinuscula && segundoCaracterMinuscula) {
            System.out.println("Los dos caracteres son letras minúsculas");
        } else {
            System.out.println("No son dos letras minúsculas.");
        }
    }

    public static void ej5()
    {
        System.out.print("Introduce un carácter: ");
        char caracter = sc.next().charAt(0);

        if (caracter >= '0' && caracter <= '9') {
            System.out.println("El carácter es un número");
        } else {
            System.out.println("El carácter no es un número");
        }
    }

    public static void ej6()
    {
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        if (numero % 10 == 0) {
            System.out.println("El número es múltiplo de 10");
        } else {
            System.out.println("El número no es múltiplo de 10");
        }
    }

    public static void ej7()
    {
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }

    public static void ej8()
    {
        System.out.print("Introduce el dividendo: ");
        double dividendo = sc.nextDouble();
        System.out.print("Introduce el divisor: ");
        double divisor = sc.nextDouble();

        if (divisor == 0) {
            System.out.println("Error: no se puede dividir entre cero.");
        } else {
            System.out.println("Resultado: " + (dividendo / divisor));
        }
    }

    public static void ej9()
    {
        System.out.print("Introduce la hora: ");
        int hora = sc.nextInt();
        System.out.print("Introduce los minutos: ");
        int minutos = sc.nextInt();
        System.out.print("Introduce los segundos: ");
        int segundos = sc.nextInt();

        if (hora >= 0 && hora < 24 && minutos >= 0 && minutos < 60
                && segundos >= 0 && segundos < 60) {
            System.out.println("La hora es válida");
        } else {
            System.out.println("La hora no es válida");
        }
    }

    public static void ej10()
    {
        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int numero3 = sc.nextInt();
        System.out.print("Introduce el cuarto número: ");
        int numero4 = sc.nextInt();

        int mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        if (numero4 > mayor) {
            mayor = numero4;
        }

        System.out.println("El mayor es: " + mayor);
    }

    public static void ej11()
    {
        System.out.print("Introduce una nota entre 0 y 10: ");
        double nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("La nota no es válida.");
        } else if (nota < 5) {
            System.out.println("Suspenso");
        } else if (nota < 7) {
            System.out.println("Aprobado");
        } else if (nota < 9) {
            System.out.println("Notable");
        } else {
            System.out.println("Sobresaliente");
        }
    }

    public static void ej12()
    {
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.print("¿Eres estudiante? (si/no): ");
        String respuesta = sc.next();

        boolean estudiante = respuesta.equalsIgnoreCase("si")
                || respuesta.equalsIgnoreCase("sí");

        if (estudiante || edad > 65) {
            System.out.println("Tienes descuento");
        } else {
            System.out.println("No tienes descuento");
        }
    }

    public static void ej13()
    {
        System.out.print("Introduce un número de mes (1-12): ");
        int mes = sc.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("El número de mes no es válido");
        } else {
            String nombreMes;
            int dias;

            if (mes == 1) {
                nombreMes = "Enero";
                dias = 31;
            } else if (mes == 2) {
                nombreMes = "Febrero";
                dias = 28;
            } else if (mes == 3) {
                nombreMes = "Marzo";
                dias = 31;
            } else if (mes == 4) {
                nombreMes = "Abril";
                dias = 30;
            } else if (mes == 5) {
                nombreMes = "Mayo";
                dias = 31;
            } else if (mes == 6) {
                nombreMes = "Junio";
                dias = 30;
            } else if (mes == 7) {
                nombreMes = "Julio";
                dias = 31;
            } else if (mes == 8) {
                nombreMes = "Agosto";
                dias = 31;
            } else if (mes == 9) {
                nombreMes = "Septiembre";
                dias = 30;
            } else if (mes == 10) {
                nombreMes = "Octubre";
                dias = 31;
            } else if (mes == 11) {
                nombreMes = "Noviembre";
                dias = 30;
            } else {
                nombreMes = "Diciembre";
                dias = 31;
            }

            System.out.println(nombreMes + " tiene " + dias + " días");
        }
    }

    public static void ej14()
    {
        System.out.print("Introduce un número de mes (1-12): ");
        int mes = sc.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Enero tiene 31 días");
                break;
            case 2:
                System.out.println("Febrero tiene 28 días");
                break;
            case 3:
                System.out.println("Marzo tiene 31 días");
                break;
            case 4:
                System.out.println("Abril tiene 30 días");
                break;
            case 5:
                System.out.println("Mayo tiene 31 días");
                break;
            case 6:
                System.out.println("Junio tiene 30 días");
                break;
            case 7:
                System.out.println("Julio tiene 31 días.");
                break;
            case 8:
                System.out.println("Agosto tiene 31 días");
                break;
            case 9:
                System.out.println("Septiembre tiene 30 días");
                break;
            case 10:
                System.out.println("Octubre tiene 31 días.");
                break;
            case 11:
                System.out.println("Noviembre tiene 30 días.");
                break;
            case 12:
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("El número de mes no es válido");
        }
    }

    public static void ej15()
    {
        System.out.print("Introduce el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double numero2 = sc.nextDouble();
        System.out.print("Introduce un operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        switch (operador) {
            case '+':
                System.out.println("Resultado: " + (numero1 + numero2));
                break;
            case '-':
                System.out.println("Resultado: " + (numero1 - numero2));
                break;
            case '*':
                System.out.println("Resultado: " + (numero1 * numero2));
                break;
            case '/':
                if (numero2 == 0) {
                    System.out.println("Error: no se puede dividir entre cero");
                } else {
                    System.out.println("Resultado: " + (numero1 / numero2));
                }
                break;
            default:
                System.out.println("Operador no válido");
        }
    }

}
