package Ejercicio1;

import java.util.Arrays;

public class principal {
    //Definimos los 2 arrays
    private static int[] array1 = new int[50];
    private static int[] array2 = new int[50];

    public static void menu() {


        boolean salir = false;
        char opcion = 'z';
        //-----Elementos del menú------\\
        do {
            System.out.println("*MENU PRINCIPAL*");
            System.out.println("");
            System.out.println("1.- Rellenar aleatorios");
            System.out.println("2.- Rellenar con un número el array escogido");
            System.out.println("3.- Ordenar el  array escogido");
            System.out.println("4.- Mostrar el contenido del array escogido");
            System.out.println("5.- Copiar el contenido de un array a otro");
            System.out.println("6.- Realizar busqueda binaria en array escogido");
            System.out.println("7.- Comparar si los dos vectores son iguales");
            System.out.println("8.- Salir del menú");
            System.out.println("");

            opcion = teclado.leer_caracter("Introduce opción: ");
            System.out.println("");
            System.out.println("Opción elegida: " + opcion);
            System.out.println();
            switch (opcion) {
                case '1': // Rellenar aleatorios
                    elegir_parametro_aleatorios();
                    break;
                case '2': //Rellenar con un número el array escogido
                    elegirarrayrellenarconnumero();
                    break;
                case '3': // Ordenar el array escogido
                    elegirarrayparaordenar();
                    break;
                case '4': //Mostrar el contenido del array escogido
                    elegirarrayamostrar();
                    break;
                case '5': // Copiar el contenido de un array a otro
                    elegirpasararray();
                    break;
                case '6': // Realizar busqueda binaria en array escogido
                    selec_arrayparabusqueda();
                    break;
                case '7':// Comparar si los dos vectores son iguales
                    comparararray(array1, array2);
                    break;
                case '8': //Salir del menú
                    System.out.println("\nSaliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Introduce una opción correcta");

            }
        } while (salir == false);

    }

    //Método que va a rellenar el array de forma aleatoria,
    // con números comprendidos
    //entre 0 y 100
    public static void rellenaraleatorios(int v[]) {

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100) + 1;
            System.out.println("Número " + (i + 1) + " : " + v[i]);

        }
    }

    //Este método nos dará a elegir el parametro de nuestro metodo de números aleatorios
    public static void elegir_parametro_aleatorios() {
        int vector = teclado.leer_entero("Elige un vector (1-2): ");
        System.out.println("");
        do {
            if (vector == 1) {
                rellenaraleatorios(array1);
            } else if (vector == 2) {
                rellenaraleatorios(array2);
            } else
                System.out.println("Introduce una opción correcta");
            System.out.println("");
        } while (vector == 1 && vector == 2);
    }

    //Método que rellena con un número el array escogido
    public static void rellenarconnumero(int v[]) {
        int num = teclado.leer_entero("Introduce un número para rellenar el vector: ");
        Arrays.fill(v, num);
        System.out.print("\nVector: ");
        for (int valorInt : v)
            System.out.printf("%d ", valorInt);
        System.out.println("\n");
    }

    //Método para elegir el array que vamos a pasar por parámetro al método rellenarconunnumero
    public static void elegirarrayrellenarconnumero() {
        int vector = teclado.leer_entero("Elige un vector (1-2): ");
        do {
            if (vector == 1) {
                rellenarconnumero(array1);
            } else if (vector == 2) {

                rellenarconnumero(array2);
            } else
                System.out.println("Introduce una opción correcta");
        } while (vector == 1 && vector == 2);
    }

    //Método que ordena el array de forma ascendente
    public static void ordenararray(int v[]) {

        Arrays.sort(v);
        System.out.print("Vector ordenado de forma ascendente: ");
        System.out.println("\n");
        for (int valorInt : v)
            System.out.print(valorInt + "\t");
        System.out.println("\n");
    }

    //Método que elige el array que vamos a ordenar en el método ordenararray
    public static void elegirarrayparaordenar() {
        int vector = teclado.leer_entero("Elige un vector (1-2): ");
        do {
            if (vector == 1) {
                ordenararray(array1);
            } else if (vector == 2) {
                ordenararray(array2);
            } else
                System.out.println("Introduce una opción correcta");
        } while (vector == 1 && vector == 2);
    }

    //Método que muestra el contenido del array que pasamos por parámetro
    public static void mostrarcontenidoarray(int v[]) {

        System.out.print("Contenido array: ");
        System.out.println("\n");
        for (int valorV : v)
            System.out.print(valorV + "\t");
        System.out.println("\n");
    }

    //Método que nos da la opción de elegir el array que queremos pasar por parámetro en el método mostrarcontenidoarray
    public static void elegirarrayamostrar() {
        int vector = teclado.leer_entero("Introduce un vector (1-2): ");
        do {
            if (vector == 1) {
                mostrarcontenidoarray(array1);
            } else if (vector == 2) {
                mostrarcontenidoarray(array2);
            } else
                System.out.println("Introduce una opción correcta");
        } while (vector == 1 && vector == 2);
    }

    //Método que copia el contenido de un método a otro
    public static void pasarcontenidoarray(int v[], int v1[]) {
        System.arraycopy(v, 0, v1, 0, v.length);
    }
    //Método que nos da a elegir que array vamos a copiar y lo pasamos por parámetro al metodo pasarcontenidoarray
    public static void elegirpasararray() {
        int vector = teclado.leer_entero("Elige el array que quieres copiar: ");
        do {
            if (vector == 1) {
                pasarcontenidoarray(array1, array2);
                System.out.println("Has pasado el contenido del vector 1 al vector 2!!!!");
            } else if (vector == 2) {
                pasarcontenidoarray(array2, array1);
                System.out.println("Has pasado el contenido del vector 2 al vector 1!!!!");
            } else
                System.out.println("Introduce una opción correcta");
        } while (vector == 1 && vector == 2);
    }

    //Método que realiza la busqueda de un número introducido por teclado en el vector que pasámos por parámetro
    public static void busqueda_binaria(int v[]) {
        int num = teclado.leer_entero("Que número quieres buscar?: ");
        int numbuscar = num;
        Arrays.sort(v);
        if (Arrays.binarySearch(v, numbuscar) > 0)
            System.out.println("El número " + numbuscar + " está en el array");
        else
            System.out.println("El número " + numbuscar + " no está en el array");
    }
    //Método que nos pide por teclado uno de los dos arrays declarados y este lo introducirá como parámetro en el método busqueda_binaria
    public static void selec_arrayparabusqueda(){
        int vector = teclado.leer_entero("Introduce un vector (1-2): ");
        do {
            if (vector == 1) {
                busqueda_binaria(array1);
            } else if (vector == 2) {
                busqueda_binaria(array2);
            } else
                System.out.println("Introduce una opción correcta");
        } while (vector == 1 && vector == 2);
    }

    //Método que compara los dos arrays e indica si el contenido coincide o no
    public static void comparararray(int v[], int v1[]) {
        boolean b = Arrays.equals(v, v1);
        if (b == true)
            System.out.println("Los arrays son iguales");
        else
            System.out.println("Los arrays son distintos");
    }


    public static void main(String args[]) {

        //Invocamos el método que tiene el menú
        menu();


    }
}
