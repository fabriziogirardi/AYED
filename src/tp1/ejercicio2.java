package tp1;

public class ejercicio2 {

    public static int[] CrearArrayLlenoConMultiplos(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = (i+1) * n;
        }

        return arr;
    }
}
