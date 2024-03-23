package tp1;

import clases.Estudiante;
import clases.Profesor;

public class ejercicio3
{
    public static void main(String[] args)
    {
        Estudiante[] estudiantes = new Estudiante[2];
        Profesor[] profesores = new Profesor[3];

        estudiantes[0] = new Estudiante();
        estudiantes[0].setNombre("Juan");
        estudiantes[0].setApellido("Perez");
        estudiantes[0].setComision(1);
        estudiantes[0].setEmail("hola@test.com");
        estudiantes[0].setDireccion("Calle 123");

        estudiantes[1] = new Estudiante();
        estudiantes[1].setNombre("Maria");
        estudiantes[1].setApellido("Gomez");
        estudiantes[1].setComision(2);
        estudiantes[1].setEmail("hola2@hello.com");
        estudiantes[1].setDireccion("Calle 456");

        profesores[0] = new Profesor();
        profesores[0].setNombre("Carlos");
        profesores[0].setApellido("Gonzalez");
        profesores[0].setEmail("prueba@uno.com");
        profesores[0].setCatedra("Matematica");
        profesores[0].setFacultad("Ingenieria");

        profesores[1] = new Profesor();
        profesores[1].setNombre("Ana");
        profesores[1].setApellido("Lopez");
        profesores[1].setEmail("hello@world.com");
        profesores[1].setCatedra("Fisica");
        profesores[1].setFacultad("Ingenieria");

        profesores[2] = new Profesor();
        profesores[2].setNombre("Pedro");
        profesores[2].setApellido("Martinez");
        profesores[2].setEmail("new@class.com");
        profesores[2].setCatedra("Quimica");
        profesores[2].setFacultad("Ingenieria");

        System.out.println("Estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("---------------------");
            System.out.println(estudiante.tusDatos());
        }

        System.out.println("\nProfesores:");
        for (Profesor profesor : profesores) {
            System.out.println("---------------------");
            System.out.println(profesor.tusDatos());
        }
    }
}
