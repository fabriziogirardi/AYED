package tp1;

import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class EjercicioSucesion
{
    public List<Integer> calcularSucesion(int n)
    {
        List<Integer> sucesion = new ArrayList<>();

        while (n != 1) {

            sucesion.add(n);

            if (n % 2 == 0){
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }

        sucesion.add(1);

        return sucesion;
    }

    public void invertirArrayList(List<Integer> lista)
    {
        int n = lista.size();

        for (int i = 0; i < n / 2; i++) {
            int tmp = lista.get(i);
            lista.set(i, lista.get(n - i - 1));
            lista.set(n - i - 1, tmp);
        }
    }

    public int sumarLinkedList(LinkedList<Integer> lista)
    {
        if (lista.isEmpty()) {
            return 0;
        }

        return lista.removeLast() + sumarLinkedList(lista);
    }

    public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2)
    {
        ArrayList<Integer> lista = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                lista.add(lista1.get(i));
                i++;
            } else {
                lista.add(lista2.get(j));
                j++;
            }
        }

        while (i < lista1.size()) {
            lista.add(lista1.get(i));
            i++;
        }

        while (j < lista2.size()) {
            lista.add(lista2.get(j));
            j++;
        }

        return lista;
    }
}
