package tp1;

public class ejercicio1 {

    public static void MetodoFor(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }

    public static void MetodoWhile(int a, int b) {
        int i = a;
        while (i <= b) {
            System.out.println(i);
            i++;
        }
    }

    public static void MetodoSinIterar(int a, int b) {
        if (a <= b) {
            System.out.println(a);
            MetodoSinIterar(a + 1, b);
        }
    }
}
