package dominio;

public class Ejercicios {
    //Ejercicio 34
    /**
     * Un algoritmo informático es un conjunto de instrucciones definidas, ordenadas y acotadas
     * para resolver un problema, realizar un cálculo o desarrollar una tarea.
     */
    //Ejercicio 35
    public static int factorialIterativo(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static int factorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursivo(n - 1);
        }
    }
    /**
     * EN C
     * #include <stdio.h>
     *
     * int factorialIterativo(int n) {
     *     int resultado = 1;
     *     for (int i = 1; i <= n; i++) {
     *         resultado *= i;
     *     }
     *     return resultado;
     * }
     *
     * #include <stdio.h>
     *
     * int factorialRecursivo(int n) {
     *     if (n == 0) {
     *         return 1;
     *     } else {
     *         return n * factorialRecursivo(n - 1);
     *     }
     * }
     */
    //Ejercicio 36
    /**
     * En términos de límites y cocientes de funciones, podemos definir O(n) de la siguiente manera:
     * Dadas dos funciones f(n) y g(n), decimos que f(n) es O(g(n)) si existen constantes positivas c y
     * n0 tales que 0 <= f(n) <= c*g(n) para todo n >= n0.
     */
    //Ejercicio 37
    /**
     * La complejidad temporal de este cálculo es O(1), lo que significa que se realiza en tiempo constante.
     * Esto se debe a que no importa cuál sea el valor de t (el tiempo que está cayendo el móvil),
     * el cálculo siempre implica una multiplicación y una división, y estas operaciones toman un tiempo constante.
     * No hay bucles ni recursión en este cálculo, por lo que el tiempo de ejecución no depende del tamaño de la
     * entrada.
     */
    //Ejercicio 38

}