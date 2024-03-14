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
    /**
     * primero(ArrayList<String> lista): O(1), ya que acceder al primer elemento de una lista es una operación de
     * tiempo constante.
     * nEsimo(ArrayList<String> lista, int n): O(1), acceder a un elemento n-ésimo de una lista (suponiendo acceso
     * directo como en ArrayList) es también una operación de tiempo constante.
     */
    //Ejercicio 39
    /**
     * La complejidad temporal de ambos algoritmos para la suma de los n primeros números naturales es:
     *
     * Iterativo: O(n), porque el algoritmo recorre cada número de 1 a n una vez.
     * Recursivo: O(n), cada llamada a la función decrementa n por 1 hasta que alcanza la base de la recursión.
     */
    //Ejercicio 40
    /**
     * Dado que el ejercicio 11 es la suma de 0 + 1 + 2 + ... + n, ya hemos proporcionado soluciones iterativa y
     * recursiva en el Ejercicio 35. La complejidad temporal para ambas versiones sería:
     *
     * Iterativa: O(n), ya que recorre desde 1 hasta n sumando cada valor, realizando n operaciones.
     * Recursiva: O(n), debido a que se realizan n llamadas recursivas hasta llegar al caso base.
     */
    //Ejercicio 41
    /**
     * Vamos a considerar un algoritmo recursivo simple que no sea Fibonacci, por ejemplo, la suma de los primeros
     * n números naturales (recursiva). La complejidad temporal es O(n) porque hace n llamadas recursivas antes de
     * alcanzar el caso base. La complejidad espacial también es O(n) debido al uso de la pila de llamadas que
     * almacena n registros de activación, uno por cada llamada recursiva.
     *
     * Comparando con el algoritmo iterativo, cuya complejidad espacial es O(1) (porque usa una cantidad fija de
     * memoria), vemos que, aunque ambos tienen la misma complejidad temporal, el algoritmo recursivo tiene mayor
     * complejidad espacial debido a su uso de la pila de llamadas.
     */
    //Ejercicio 42
    /**
     * Dado un conjunto A con cardinalidad n, y un algoritmo l que ejecuta una instrucción para cada elemento del
     * producto cartesiano de A × A, la complejidad temporal es O(n^2). Esto se debe a que el producto cartesiano
     * de A × A tiene n^2 pares de elementos, por lo que el algoritmo realiza n^2 operaciones.
     */
    //Ejercicio 43
    /**
     * El método sumaEltosMatriz tiene una complejidad temporal O(m*n), donde m es el número de filas y n el
     * número de columnas de la matriz. Esto se debe a que el método recorre todos los elementos de la matriz una vez,
     * realizando una operación de suma para cada elemento.
     */
    //Ejercicio 44
    public static boolean buscar(int e, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == e) {
                return true;
            }
        }
        return false;
    }
    /**
     * Caso peor: O(n), donde n es el número de elementos en el array. Este caso ocurre cuando el elemento no está en
     * el array o se encuentra al final del mismo.
     * Caso mejor: O(1), cuando el elemento a buscar se encuentra al inicio del array.
     * Caso promedio: O(n), asumiendo que los elementos están distribuidos aleatoriamente y no hay información sobre
     * su distribución.
     */
    //Ejercicio 45
    public static boolean buscar(int e, int[] array) {
        return buscarRecursivo(e, array, 0, array.length - 1);
    }

    private static boolean buscarRecursivo(int e, int[] array, int inicio, int fin) {
        if (inicio > fin) {
            return false;
        }
        int medio = inicio + (fin - inicio) / 2;
        if (array[medio] == e) {
            return true;
        } else if (e < array[medio]) {
            return buscarRecursivo(e, array, inicio, medio - 1);
        } else {
            return buscarRecursivo(e, array, medio + 1, fin);
        }
    }
    /**
     * Caso peor: O(log n), donde n es el número de elementos en el array. Este caso ocurre cuando el elemento no está
     * en el array o se encuentra al final del mismo.
     * Caso mejor: O(1), cuando el elemento a buscar se encuentra en la mitad del array.
     * Caso promedio: O(log n), asumiendo que los elementos están distribuidos aleatoriamente y no hay información
     * sobre su distribución.
     */
    //Ejercicio 46
    /**
     * El algoritmo recursivo para calcular el enésimo número de Fibonacci tiene una complejidad temporal y espacial
     * bastante alta debido a la gran cantidad de llamadas recursivas:
     *
     * Complejidad Temporal: O(2^n), ya que cada llamada genera dos llamadas más, excepto en los casos base.
     * Complejidad Espacial: O(n), debido a la profundidad de la pila de llamadas recursivas, donde n es la posición
     *
     * del número en la secuencia de Fibonacci.
     */
    //Ejercicio 47
    /**
     * Los tiempos de ejecución aumentan linealmente con el valor de n, lo que es esperado para un algoritmo de
     * complejidad O(n). Sin embargo, el incremento no es perfectamente lineal debido a la naturaleza de las
     * operaciones de suma y asignación, así como a las optimizaciones del compilador.
     */
    //Ejercicio 48
    /**
     * El método sumaNPrimeros tiene una complejidad temporal de O(n^2) debido al bucle anidado. Esto explica el
     * crecimiento cuadrático del tiempo de ejecución con respecto a n, como se observa en los tiempos medidos.
     */
    //Ejercicio 49
    /**
     * La definición dada describe formalmente la notación "Big O", que es una manera de expresar el límite superior
     * del crecimiento de una función. Se dice que una función T(n) es O(f(n)) si, a partir de cierto punto n0, el valor
     * de T(n) no excede k veces f(n) para alguna constante k. Esto ayuda a categorizar algoritmos según su
     * eficiencia en el peor de los casos.
     */
    //Ejercicio 50
    /**
     * Encuentro de k y n0 para T(n) = 3log2(n) + 2 es O(log2(n)): Para demostrar esto, podemos elegir k > 3 y n0 como
     * el punto a partir del cual la función logarítmica siempre será positiva (por ejemplo, n0 = 1). Esto muestra que
     * T(n) crece de manera logarítmica.
     * Si T(n) ∈ O(log2(n)), ¿entonces T(n) ∈ O(n)?: Sí, porque cualquier función que crezca logarítmicamente también
     * está acotada por una función que crece linealmente, lo que significa que la complejidad logarítmica siempre
     * es menor que o igual a la complejidad lineal para valores grandes de n.
     * Si T(n) ∈ O(log3(n)), ¿entonces T(n) ∈ O(log2(n))?: Sí, porque las bases de los logaritmos en la notación Big O
     * son intercambiables debido a la regla del cambio de base para logaritmos. La relación entre logaritmos de
     * diferentes bases es constante, por lo que ambos crecen a la misma tasa asintótica.
     */
    //Ejercicio 51
    /**
     * f0(x) = 1 crece a una tasa constante (la más baja).
     * f3(x) = log2(x) crece logarítmicamente, más rápido que una constante pero más lento que cualquier polinomio.
     * f1(x) = x crece linealmente, más rápido que log2(x).
     * f2(x) = x^2 crece cuadráticamente, más rápido que x.
     * f4(x) = 2^x crece exponencialmente, lo que es la tasa de crecimiento más rápida entre las funciones mencionadas.
     *
     */
    //Ejercicio 52
    /**
     * Este método tiene una complejidad más compleja debido a la llamada recursiva dividida. La complejidad temporal
     * es difícil de determinar sin una descripción más detallada del comportamiento de sumaNPrimeros(m) y cómo
     * afecta la complejidad general. Sin embargo, si asumimos que sumaNPrimeros(m) tiene una complejidad de O(m), entonces la complejidad total de f(n) dependerá de cómo las llamadas recursivas afecten este cálculo.
     */
    //Ejercicio 53
    /**
     * La afirmación es cierta. La inserción en un ArrayList no ordenado es generalmente O(1), asumiendo que no es
     * necesario redimensionar el array. Sin embargo, si el ArrayList está ordenado y se mantiene el
     * orden después de cada inserción, la complejidad puede ser O(n) porque, en el peor caso, puede ser necesario
     * desplazar todos los elementos una posición.
     */
    //Ejercicio 54
    /**
     * Para n = 100 y n = 100.000 (y ajustando el tiempo de instrucción a 1 ms en el segundo escenario), podemos
     * calcular los tiempos requeridos utilizando las fórmulas correspondientes a cada tipo de crecimiento. Esto
     * implica aplicar la fórmula de cada complejidad al tamaño de la entrada y al tiempo por instrucción dado.
     */
    //Ejercicio 55
    /**
     * El problema del ajedrez no está resuelto debido a la inmensa complejidad del juego, que resulta de la enorme
     * cantidad de posiciones legales posibles (estimadas en 10^43). Resolver el ajedrez completamente implicaría
     * calcular el resultado de cada posible partida desde la posición inicial, lo cual es computacionalmente
     * inviable con la tecnología actual. Aunque se han desarrollado computadoras y algoritmos muy avanzados
     * capaces de vencer a los mejores jugadores humanos, esto no equivale a haber "resuelto" el juego en un
     * sentido matemático o computacional completo.
     */
}