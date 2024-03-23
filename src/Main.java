import clases.MaxMinProm;
import tp1.ejercicio5;

import java.util.Scanner;
import static tp1.ejercicio1.*;
import static tp1.ejercicio2.CrearArrayLlenoConMultiplos;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Ejercicio 1 a)");
//        MetodoFor(1, 10);
//
//        System.out.println("\nEjercicio 1 b)");
//        MetodoWhile(1, 10);
//
//        System.out.println("\nEjercicio 1 c)");
//        MetodoSinIterar(1, 10);
//
//        System.out.println("\nEjercicio 2 a)");
//        int[] arr = CrearArrayLlenoConMultiplos(10);
//        for (int j : arr) {
//            System.out.println(j);
//        }
//
//        System.out.println("\nEjercicio 2 b)");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Ingrese un número entero: ");
//        int n = scanner.nextInt();
//        int[] arr2 = CrearArrayLlenoConMultiplos(n);
//        for (int j : arr2) {
//            System.out.println(j);
//        }
//
//        scanner.close();

        System.out.println("\nEjercicio 5");
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] ret = ejercicio5.DevolverPorReturn(arr3);

        System.out.println("Por return:");
        System.out.println("Max: " + ret[0]);
        System.out.println("Min: " + ret[1]);
        System.out.println("Prom: " + ret[2]);

        MaxMinProm mmp = new MaxMinProm();

        ejercicio5.DevolverPorParametro(arr3, mmp);

        System.out.println("Por objeto:");
        System.out.println("Max: " + mmp.getMax());
        System.out.println("Min: " + mmp.getMin());
        System.out.println("Prom: " + mmp.getProm());

        ejercicio5.SinParametrosNiReturn(arr3);

        System.out.println("Por atributos:");
        System.out.println("Max: " + ejercicio5.getMax());
        System.out.println("Min: " + ejercicio5.getMin());
        System.out.println("Prom: " + ejercicio5.getProm());

    }
}