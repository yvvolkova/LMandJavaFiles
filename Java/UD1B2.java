// VOLKOVA, YULIA

import java.util.Scanner;

public class UD1B2
{
    private static Scanner sc = new Scanner(System.in); //Declarando el objeto Scanner aquí, ahora podremos usar sc en cualquier método de la clase

    public static void main(String[] args)
    {
    //ej1();
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
    ej12();

    }

    public static void ej1()
    {
        System.out.print("Introduce el número a: ");
        double a = sc.nextDouble();

        System.out.print("Introduce el número b: ");
        double b = sc.nextDouble();

        System.out.printf("a %.2f. y b %.2f.", a, b);

        double c = a;
        a = b;
        b = c;

        System.out.printf("Estos son los valores a y b que se combinaron a %.2f. y b %.2f.", a, b);

    }

    public static void ej2()
    {
        System.out.print("Introduce un número entero: (int): ");
        int a = sc.nextInt();

        int doble = a * 2;
        int triple = a * 3;

        System.out.printf("El doble de a = %d es %d y el triple de a = %d es %d.%n", a, doble, a, triple);
    }

    public static void ej3()
    {
        System.out.print("Introduce tu edad (entero): ");
        int edad = sc.nextInt();

        int añoActual = 2025;
        int añoTuNacimiento = añoActual - edad;

        System.out.printf("%nTienes %d años, si hoy es el año %d, tu año de nacimiento es %d.%n", edad, añoActual, añoTuNacimiento);
    }

    public static void ej4()
    {
        System.out.print("Introduce temperatura Centígrados: ");
        int gradosC = sc.nextInt();

        double gradosF = 32 + (9 * gradosC/5);

        System.out.printf("Temperatura %d Centígrados es equal %.2f Fahrenheit.%n", gradosC, gradosF);
    }

    public static void ej5()
    {
        System.out.print("Introduce tu edad (entero): ");
        int edad = Integer.parseInt(sc.nextLine());

        System.out.print("Introduce tu nombre completo: ");
        String nombreCompleto = sc.nextLine();

        System.out.printf("Tu edad %dy tu Nombre completo %s.%n", edad, nombreCompleto);
    }

    public static void ej6()
    {
        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();
    
        // Math.PI es una constante de Java que representa el número π (aproximadamente 3,14159)
        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;

        System.out.printf("La longitud de la circunferencia es %.2f y el área es %.2f.%n", longitud, area);
    }

    public static void ej7()
    {
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        System.out.printf("\"%s\"%n", frase);
    }

    public static void ej8()
    {
        System.out.print("    *\n"
                + "   /\\\n"
                + "  /  \\\n"
                + " /____\\\n"
                + "   ||\n");
    }

    public static void ej9()
    {
        System.out.print("\"TIENDA LA ESQUINA\"\n"
                + "Producto\tPrecio\n"
                + "Pan\t\t1,20 €\n"
                + "Leche\t\t1,50 €\n"
                + "Manzanas\t2,30 €\n"
                + "----------------------------\n"
                + "TOTAL\t\t5,00 €\n");
    }

    public static void ej10()
    {
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Introduce tu nivel de estudios: ");
        int nivelEstudios = sc.nextInt();

        System.out.print("Introduce tus ingresos anuales (€): ");
        int ingresos = sc.nextInt();

        boolean cumpleCondicion = edad <= 28 && nivelEstudios > 3 && ingresos > 28000;

        System.out.printf("¿Cumple la condición? %b%n", cumpleCondicion);
    }

    public static void ej11()
    {
        System.out.print("Introduce un número entero de 3 cifras: ");
        int numero = sc.nextInt();

        int centenas = numero / 100;
        int decenas = numero / 10 % 10;
        int unidades = numero % 10;

        System.out.printf("Centenas: %d%nDecenas: %d%nUnidades: %d%n", centenas, decenas, unidades);
    }

    public static void ej12()
    {
        System.out.print("Escribe un importe en euros: ");
        int importe = sc.nextInt();

        int billetes500 = importe / 500;
        importe = importe % 500;
        int billetes200 = importe / 200;
        importe = importe % 200;
        int billetes100 = importe / 100;
        importe = importe % 100;
        int billetes50 = importe / 50;
        importe = importe % 50;
        int billetes20 = importe / 20;
        importe = importe % 20;
        int billetes10 = importe / 10;
        importe = importe % 10;
        int billetes5 = importe / 5;
        importe = importe % 5;
        int monedas2 = importe / 2;
        int monedas1 = importe % 2;

        System.out.printf("Billetes de 500€: %d%n", billetes500);
        System.out.printf("Billetes de 200€: %d%n", billetes200);
        System.out.printf("Billetes de 100€: %d%n", billetes100);
        System.out.printf("Billetes de 50€: %d%n", billetes50);
        System.out.printf("Billetes de 20€: %d%n", billetes20);
        System.out.printf("Billetes de 10€: %d%n", billetes10);
        System.out.printf("Billetes de 5€: %d%n", billetes5);
        System.out.printf("Monedas de 2€: %d%n", monedas2);
        System.out.printf("Monedas de 1€: %d%n", monedas1);
    }

}
