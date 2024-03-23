package clases;

import java.util.ArrayList;

public class Estudiante
{

    private String nombre;
    private String apellido;
    private int    comision;
    private String email;
    private String direccion;

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public String getApellido()
    {
        return apellido;
    }

    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }

    public int getComision()
    {
        return comision;
    }

    public void setComision(int comision)
    {
        this.comision = comision;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getDireccion()
    {
        return direccion;
    }

    public void setDireccion(String direccion)
    {
        this.direccion = direccion;
    }

    public String tusDatos()
    {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nComision: " + comision + "\nEmail: " + email +
               "\nDireccion: " + direccion;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (!(obj instanceof Estudiante estudiante)) {
            return false;
        }

        return this.nombre.equals(estudiante.getNombre())
               && this.apellido.equals(estudiante.getApellido())
               && this.comision == estudiante.getComision()
               && this.email.equals(estudiante.getEmail())
               && this.direccion.equals(estudiante.getDireccion());
    }

    public boolean esCapicua(ArrayList<Integer> lista)
    {
        int size = lista.size();

        for (int i = 0; i < size / 2; i++) {
            if (!lista.get(i).equals(lista.get(size - i - 1))) {
                return false;
            }
        }

        return true;
    }
}
