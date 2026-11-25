// VOLKOVA, YULIA

import java.util.Scanner;

public class UD2B2
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
    // ej15();
    // ej16();
    // ej17();
    // ej18();
    // ej19();
    ej20();
    sc.close();

    }

    public static void ej1()
    {
        int numero = 1;
        while (numero <= 100) {
        System.out.println(numero);
        numero++;
        }
    }

    public static void ej2()
    {
        int numero = 1;

        do {
        System.out.println(numero);
        numero++;
        }
        while (numero <= 100);   
    }

    public static void ej3()
    {
       for(int numero = 1; numero <=100; numero++) {
        System.out.println(numero);
        }
    }

    public static void ej4()
    {
        int numero = 100;

        while (numero >= 1) {
        System.out.println(numero);
        numero--;
        }
    }

    public static void ej5()
    {
        int numero = 100;

        do {
        System.out.println(numero);
        numero--;
        }
        while (numero >= 1);   
    }

    public static void ej6()
    {
        for(int numero = 100; numero >=1; numero--) {
            System.out.println(numero);
        }
    }

    public static void ej7()
    {
        for(int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    public static void ej8()
    {
        int i = 10;
        while (i >=1) {
        System.out.println(i);
        i--;
        }
    }

    public static void ej9()
    {
       int suma = 0; 
        for(; suma <=1000; )
        {
            int numero = (int)(Math.random()*100)+ 1;
            suma += numero;
        }
        System.out.println("La suma final es: " + suma);
        
    }

    public static void ej10()
    {
        int i = 1;
        do {
            System.out.println("Intento numero " + i);
            
            if (Math.random() < 0.5) {
            System.out.println("Exito ");
            break;
            }
            i++;
        } while (i <= 5);
    }

    public static void ej11()
    {
       Scanner scanner = new Scanner(System.in);
        String repuesta = "";
        do {
            System.out.println("Querenos salir? (si/no)");
            repuesta = scanner.nextLine();
        }
        while (!repuesta.equalsIgnoreCase("Si")); {
             System.out.println("Hasta luego!");
        }
            
    System.out.println("Hasta luego!");   
    scanner.close(); 
    }

    public static void ej12()
    {
        String contrasenaCorrecta = "123";
        String contrasena = "";

        while (!contrasena.equals(contrasenaCorrecta)) {
            System.out.print("Introduce la contraseña: ");
            contrasena = sc.nextLine();
        }
     
        System.out.println("Contraseña correcta");
    }

    public static void ej13()
    {
        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();
        int suma = 0;

        for (int i = 1; i <= numero; i++) {
            suma += i;
        }

        System.out.println("La suma de 1 a " + numero + " es: " + suma);
    }

    public static void ej14()
    {
        int numero;

        do {
            System.out.print("Introduce un número del 1 al 10: ");
            numero = sc.nextInt();
        } while (numero < 1 || numero > 10);

        System.out.println("Tabla del " + numero);
        System.out.println("************");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void ej15()
    {
        int numero;

        do {
            System.out.print("Introduce un número entero (negativo para terminar): ");
            numero = sc.nextInt();
        } while (numero >= 0);

        System.out.println("Programa terminado.");
    }

    public static void ej16()
    {
        int numero;

        do {
            System.out.print("Introduce un número entero positivo: ");
            numero = sc.nextInt();
        } while (numero <= 0);

        int par = 2;
        while (par <= numero) {
            System.out.println(par);
            par += 2;
        }
    }

    public static void ej17()
    {
        int numero;

        do {
            System.out.print("Introduce un número entero no negativo: ");
            numero = sc.nextInt();
        } while (numero < 0);

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println(numero + "! = " + factorial);
    }

    public static void ej18()
    {
        int opcion;

        do {
            System.out.println("\nMENÚ");
            System.out.println("1. Saludar");
            System.out.println("2. Mostrar fecha");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            if (opcion == 1) {
                System.out.println("Hola.");
            } else if (opcion == 2) {
                System.out.println("Opción 2 seleccionada");
            } else if (opcion != 0) {
                System.out.println("Opción no válida");
            }
        } while (opcion != 0);

        System.out.println("Hasta luego");
    }

    public static void ej19()
    {
        for (int fila = 1; fila <= 5; fila++) {
            for (int estrella = 1; estrella <= fila; estrella++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void ej20()
    {
        for (int estrellas = 1; estrellas <= 7; estrellas += 2) {
            for (int i = 1; i <= estrellas; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int estrellas = 5; estrellas >= 1; estrellas -= 2) {
            for (int i = 1; i <= estrellas; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
