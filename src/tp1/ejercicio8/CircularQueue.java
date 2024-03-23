package tp1.ejercicio8;

public class CircularQueue<T> extends Queue<T>
{
    public CircularQueue(){}

    public T shift()
    {
        if (isEmpty()) {
            throw new RuntimeException("La cola está vacía.");
        }

        T dato = dequeue();
        enqueue(dato);

        return dato;
    }
}