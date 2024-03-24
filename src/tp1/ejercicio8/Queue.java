package tp1.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> extends Sequence
{
    protected List<T> data = new ArrayList<>();

    public Queue(){}

    @Override
    public int size()
    {
        return data.size();
    }

    @Override
    public boolean isEmpty()
    {
        return data.isEmpty();
    }

    public void enqueue(T dato)
    {
        data.add(dato);
    }

    public T dequeue()
    {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía.");
        }

        return data.removeFirst();
    }

    public T head()
    {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía.");
        }

        return data.getFirst();
    }

    public String toString()
    {
        return data.toString();
    }
}
