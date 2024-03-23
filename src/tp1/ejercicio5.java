package tp1;

import clases.MaxMinProm;

public class ejercicio5
{
    private static int max;
    private static int min;
    private static int prom;

    public static int getMax()
    {
        return max;
    }

    public static int getMin()
    {
        return min;
    }

    public static int getProm()
    {
        return prom;
    }

    public static int[] DevolverPorReturn(int[] arr)
    {
        int[] ret = new int[3];
        ret[0] = 0;
        ret[1] = 999999;
        ret[2] = 0;

        int suma = 0;
        int cantidad = 0;

        for (int j : arr) {
            if (j > ret[0]) {
                ret[0] = j;
            }

            if (j < ret[1]) {
                ret[1] = j;
            }

            suma += j;
            cantidad++;
        }

        ret[2] = suma / cantidad;

        return ret;
    }

    public static void DevolverPorParametro(int[] arr, MaxMinProm mmp)
    {
        int max = 0;
        int min = 999999;

        int suma = 0;
        int cantidad = 0;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }

            if (j < min) {
                min = j;
            }

            suma += j;
            cantidad++;
        }

        int prom = suma / cantidad;

        mmp.setMax(max);
        mmp.setMin(min);
        mmp.setProm(prom);

    }

    public static void SinParametrosNiReturn(int[] arr)
    {
        max = 0;
        min = 999999;
        prom = 0;

        int suma = 0;
        int cantidad = 0;

        for (int j : arr) {
            if (j > max) {
                max = j;
            }

            if (j < min) {
                min = j;
            }

            suma += j;
            cantidad++;
        }

        prom = suma / cantidad;
    }
}
