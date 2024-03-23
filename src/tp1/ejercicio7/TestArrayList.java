package tp1.ejercicio7;

import clases.Estudiante;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestArrayList
{
    public static void main(String[] args)
    {
        int value;
        List<Integer> list = new ArrayList<>();

        // Guardo en la lista los números enteros que se pasaron como argumentos
        for (String arg : args) {
            try {
                list.add(Integer.parseInt(arg));
            } catch (NumberFormatException e) {
                System.out.printf("'%s' no es un número entero válido\n", arg);
            }
        }

        // Muestro los números enteros guardados en la lista
        for (int element : list) {
            System.out.println(element);
        }

        PuntoC();
    }

    public static void PuntoC()
    {
        List<Estudiante> estudiantes = new ArrayList<>();

        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Juan");
        estudiante1.setApellido("Perez");
        estudiante1.setComision(1);
        estudiante1.setEmail("fds@fds.com");
        estudiante1.setDireccion("Calle 123");

        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Maria");
        estudiante2.setApellido("Gomez");
        estudiante2.setComision(2);
        estudiante2.setEmail("jmghkore@gjreio.com");
        estudiante2.setDireccion("Calle 456");

        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Pedro");
        estudiante3.setApellido("Martinez");
        estudiante3.setComision(3);
        estudiante3.setEmail("bjifre@vncdjk.com");
        estudiante3.setDireccion("Calle 789");

        estudiantes.add(estudiante1);
        estudiantes.add(estudiante2);
        estudiantes.add(estudiante3);

        List<Estudiante> estudiantesCopia1 = estudiantes;

        List<Estudiante> estudiantesCopia2 = new ArrayList<>(estudiantes);

        List<Estudiante> estudiantesCopia3 = new ArrayList<>();
        estudiantesCopia3.addAll(estudiantes);

//        ArrayList<Estudiante> estudiantesCopia4 = new ArrayList<>();
//        Collections.copy(estudiantesCopia4, estudiantes);

        List<Estudiante> estudiantesCopia5 = estudiantes.stream().collect(Collectors.toCollection(ArrayList::new));

        List<Estudiante> estudiantesCopia6 = new ArrayList<>(List.copyOf(estudiantes));

        System.out.println("Lista original:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 1:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia1) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 2:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia2) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 3:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia3) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

//        System.out.println();
//        System.out.println("Lista copia 4:");
//        System.out.println("---------------------");
//        for (Estudiante estudiante : estudiantesCopia4) {
//            System.out.println(estudiante.tusDatos());
//            System.out.println("---------------------");
//        }

        System.out.println();
        System.out.println("Lista copia 5:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia5) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 6:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia6) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        estudiante1.setNombre("Juanito");

        System.out.println();
        System.out.println("Reimpresión de las listas después de modificar el nombre de un estudiante:");
        System.out.println("Lista original:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 1:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia1) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 2:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia2) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 3:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia3) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

//        System.out.println();
//        System.out.println("Lista copia 4:");
//        System.out.println("---------------------");
//        for (Estudiante estudiante : estudiantesCopia4) {
//            System.out.println(estudiante.tusDatos());
//            System.out.println("---------------------");
//        }

        System.out.println();
        System.out.println("Lista copia 5:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia5) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 6:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia6) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        Estudiante estudiante4 = new Estudiante();
        estudiante4.setNombre("Carlos");
        estudiante4.setApellido("Gonzalez");
        estudiante4.setComision(4);
        estudiante4.setEmail("fdsge@gfdnkl.com");
        estudiante4.setDireccion("Calle 123");

        Estudiante estudiante5 = new Estudiante();
        estudiante5.setNombre("Pedro");
        estudiante5.setApellido("Martinez");
        estudiante5.setComision(3);
        estudiante5.setEmail("bjifre@vncdjk.com");
        estudiante5.setDireccion("Calle 789");

        if (estudiantes.contains(estudiante4)) {
            System.out.println("La lista contiene al estudiante Carlos Gonzalez");
        } else {
            estudiantes.add(estudiante4);
            System.out.println("Se agregó al estudiante Carlos Gonzalez a la lista");
        }

        if (estudiantes.contains(estudiante5)) {
            System.out.println("La lista contiene al estudiante Pedro Martinez");
        } else {
            estudiantes.add(estudiante5);
            System.out.println("Se agregó al estudiante Pedro Martinez a la lista");
        }

        System.out.println();
        System.out.println("Reimpresión de las listas después de agregar un estudiante:");
        System.out.println("Lista original:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 1:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia1) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 2:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia2) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 3:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia3) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

//        System.out.println();
//        System.out.println("Lista copia 4:");
//        System.out.println("---------------------");
//        for (Estudiante estudiante : estudiantesCopia4) {
//            System.out.println(estudiante.tusDatos());
//            System.out.println("---------------------");
//        }

        System.out.println();
        System.out.println("Lista copia 5:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia5) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }

        System.out.println();
        System.out.println("Lista copia 6:");
        System.out.println("---------------------");
        for (Estudiante estudiante : estudiantesCopia6) {
            System.out.println(estudiante.tusDatos());
            System.out.println("---------------------");
        }
    }
}
