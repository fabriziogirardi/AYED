package tp1.ejercicio9;

import java.util.Stack;

public class TestBalanceo
{
    public static void main(String[] args)
    {
        System.out.println(estaBalanceado("()[]()((()))(([]))"));
    }
    public static boolean estaBalanceado(String cadena)
    {
        Stack<Character> pila = new Stack<>();

        for (char c : cadena.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                pila.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (pila.isEmpty()) {
                    return false;
                }

                char tope = pila.pop();

                if (c == ')' && tope != '(') {
                    return false;
                }

                if (c == ']' && tope != '[') {
                    return false;
                }

                if (c == '}' && tope != '{') {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}
