package Ejercicio2;

import Ejercicio1.teclado;

import java.util.*;

public class principal2 {
    //Creamos dos arraylist de enteros y uno normal
    private static ArrayList<Integer> list1 = new ArrayList<Integer>(50);
    private static ArrayList<Integer> list2 = new ArrayList<Integer>(50);
    private static int[] vector1 = new int[50];


    public static void menu() {

        boolean salir = false;
        int opcion;
        //-----Elementos del menú------\\
        //---UTILIZANDO ARRAYLIST-------\\
        do {
            System.out.println("");
            System.out.println("*MENU PRINCIPAL*");
            System.out.println("");
            System.out.println("1.- Rellenar aleatorios");
            System.out.println("2.- Rellenar con un número el array escogido");
            System.out.println("3.- Ordenar el  array de forma ascendente o descendente");
            System.out.println("4.- Mostrar el contenido del array escogido");
            System.out.println("5.- Borrar el número del ArrayList escogido");
            System.out.println("6.- Realizar busqueda binaria en array escogido");
            System.out.println("7.- Ordenar al azar el ArrayList escogido (método shufle)");
            System.out.println("8.- Invierte el orden de los elementos del ArrayList escogido");
            System.out.println("9.- Copiar el contenido de un ArrayList en otro");
            System.out.println("10.-Calcula el máximo y mínimo del ArrayList escogido");
            System.out.println("11.- Añade al final de un ArrayList el contenido del array normal");
            System.out.println("12.- Calcula el número de veces que se repite un entero en un ArrayList");
            System.out.println("13.-Comprueba si los dos ArrayList tienen número enteros en común");
            System.out.println("14.- Salir del menú");
            System.out.println("");

            opcion = teclado.leer_entero("Introduce opción: ");
            System.out.println("");
            System.out.println("Opción elegida: " + opcion);
            switch (opcion) {
                case 1: // Rellenar aleatorios
                    elegir_array_rellenar_aelatorios();
                    break;
                case 2: //Rellenar con un número el array escogido
                    elegir_array_para_rellenar_connumero();
                    break;
                case 3: // Ordenar el array escogido
                    elegir_array_para_ordenar();
                    break;
                case 4: //Mostrar el contenido del array escogido
                    elegir_array_para_mostrar();
                    break;
                case 5: // Borrar el contenido de un array
                    elegir_array_para_borrar();
                    break;
                case 6: // Realizar busqueda binaria en array escogido
                    elegir_array_busqueda();
                    break;
                case 7:// Comparar si los dos vectores son iguales
                    elegir_array_shufle();
                    break;
                case 8: //Invierte el orden de los elementos del ArrayList escogido");
                    elegir_lista_reverse();
                    break;
                case 9: //Copiar el contenido de un ArrayList en otro
                    copiar_contenido(list2, list1);
                    break;
                case 10: //Calcula el máximo y mínimo del ArrayList escogido
                    elegir_array_minmax();
                    break;
                case 11: //Añade al final de un ArrayList el contenido del array normal
                    arraylist_normal(list1, vector1);
                    break;
                case 12: //Calcula el número de veces que se repite un entero en un ArrayList
                    elegir_array_num_repetir();
                    break;
                case 13: //Comprueba si los dos ArrayList tienen número enteros en común
                    comprobar_si_repiten_elementos(list1, list2);
                    break;
                case 14: //Salir del menú
                    System.out.println("\nSaliendo del programa...");
                    salir = true;
                    break;
                //Salir del menú
                default:
                    System.out.println("Introduce una opción correcta");
            }
        } while (salir == false);
    }

    public static void rellenar_con_aleatorios_arraylist(ArrayList<Integer> lista) {

        for (int i = 0; i < 50; i++) {
            lista.add((int) (Math.random() * 50) + 1);
            System.out.println("Número " + (i + 1) + " : " + lista.get(i));
        }
    }

    public static void rellenara_aleatorios_vector_normal(int v[]) {

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 100) + 1;
            System.out.println("Número " + (i + 1) + " : " + v[i]);

        }
    }

    public static void elegir_array_rellenar_aelatorios() {
        int vector = teclado.leer_entero("Elige un array (1-3): ");
        if (vector == 1) {
            rellenar_con_aleatorios_arraylist(list1);
        }
        if (vector == 2) {
            rellenar_con_aleatorios_arraylist(list2);
        }
        if (vector == 3) {
            rellenara_aleatorios_vector_normal(vector1);
        }
    }

    public static void rellenar_arraylist_con_numero(ArrayList<Integer> lista) {
        int num = teclado.leer_entero("Introduce un número para rellenar el vector: ");
        for (int i = 0; i < lista.size(); i++) {
            lista.set(i, num);
            lista.get(i);
        }

    }

    public static void elegir_array_para_rellenar_connumero() {
        int vector = teclado.leer_entero("Elige un vector (1-2): ");
        if (vector == 1) {
            rellenar_arraylist_con_numero(list1);
        }
        if (vector == 2) {
            rellenar_arraylist_con_numero(list2);
        }
    }

    public static void ordenar_array_escogido(ArrayList<Integer> lista) {
        System.out.println("Introduce una opción para ordenar el ArrayList:");
        System.out.println("1.- Ascendentemente / 2.- Descendentemente");
        int opcion = teclado.leer_entero("Introduce un número: ");

        //Ordenamos de menor a mayor
        if (opcion == 1) {
            Collections.sort(lista);
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
        //Ordenar de mayor a menor
        if (opcion == 2) {
            //Creamos un objeto de la clase comparador.
            //De esta manera va a comparar los elementos del arraylist y los pondrá en orden inverso
            Comparator<Integer> comparador = Collections.reverseOrder();
            Collections.sort(lista, comparador);
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
    }

    public static void elegir_array_para_ordenar() {
        int vector = teclado.leer_entero("Introduce un vector (1-2): ");
        if (vector == 1) {
            ordenar_array_escogido(list1);
        }
        if (vector == 2) {
            ordenar_array_escogido(list2);
        }
    }

    public static void Mostrar_contenido_array_list(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + "\t");

        }
    }

    public static void mostrar_contenido_array_normal(int v[]) {
        System.out.print("Contenido array normal: ");
        System.out.println("\n");
        for (int valorV : v)
            System.out.print(valorV + "\t");
        System.out.println("\n");
    }


    public static void elegir_array_para_mostrar() {
        int vector = teclado.leer_entero("Introduce un array (1-3): ");
        if (vector == 1) {
            Mostrar_contenido_array_list(list1);
        }
        if (vector == 2) {
            Mostrar_contenido_array_list(list2);
        }

        if (vector == 3) {
            mostrar_contenido_array_normal(vector1);
        }
    }

    public static void borrar_contenido(ArrayList<Integer> lista) {
        int num;
        boolean existe;
        do {
            System.out.println("");
            num = teclado.leer_entero("Introduce el número que quieres borrar: ");
            existe = lista.contains(num);

            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i).equals(num)) {
                    lista.remove(i);
                    i--;
                    System.out.println("Has borrado el elemento : " + num);
                }
            }


            if (existe == false) {
                System.out.println("El elemento " + num + " no está en el ArrayList");
            }

        } while (existe == false);
    }


    public static void elegir_array_para_borrar() {
        int num = teclado.leer_entero("Introduce el array (1-2): ");
        if (num == 1) {
            borrar_contenido(list1);
        }
        if (num == 2) {
            borrar_contenido(list2);
        }
    }

    public static void busqueda_binaria(ArrayList<Integer> lista) {

        int num_buscar = teclado.leer_entero("Introduce el número que quieras buscar en el ArrayList: ");
        //Ordenamos el ArrayList
        Collections.sort(lista);
        if (Collections.binarySearch(lista, num_buscar) > 0)
            System.out.println("El número " + num_buscar + " está en el ArrayList");
        else
            System.out.println("El número " + num_buscar + " no está en el ArrayList");


    }

    public static void ordenar_al_azar(ArrayList<Integer> lista) {
        Collections.shuffle(lista);
    }

    public static void elegir_array_shufle() {

        int num = teclado.leer_entero("Introduce el vector (1-2): ");
        if (num == 1) {
            ordenar_al_azar(list1);
        }
        if (num == 2) {
            ordenar_al_azar(list2);
        }

    }


    public static void elegir_array_busqueda() {
        int num = teclado.leer_entero("Introduce el array (1-2): ");
        if (num == 1) {
            busqueda_binaria(list1);
        }
        if (num == 2) {
            busqueda_binaria(list2);
        }
    }

    public static void invertir_orden(ArrayList<Integer> lista) {
        Collections.reverse(lista);
        System.out.print(lista);
    }

    public static void elegir_lista_reverse() {
        int num = teclado.leer_entero("Introduce un array (1-2): ");
        if (num == 1) {
            invertir_orden(list1);
        }
        if (num == 2) {
            invertir_orden(list2);
        }
    }

    public static void copiar_contenido(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        Collections.copy(list1, list2);
        System.out.println("Has copiado el contenido de list1 a list2");
    }

    public static void max_min_arraylist(ArrayList<Integer> lista) {
        System.out.println("Máximo : " + Collections.max(lista));
        System.out.println("Mínimo : " + Collections.min(lista));
    }

    public static void elegir_array_minmax() {
        int num = teclado.leer_entero("Introduce un array (1-2): ");
        if (num == 1) {
            max_min_arraylist(list1);
        }
        if (num == 2) {
            max_min_arraylist(list2);
        }
    }

    public static void numero_veces_que_repite_num(ArrayList<Integer> lista) {
        int num = teclado.leer_entero("Introduce un número para ver si se repite: ");
        System.out.println("El número " + num + " se repite " + Collections.frequency(lista, num) + "vez/9veces.");

    }

    public static void elegir_array_num_repetir() {
        int vector = teclado.leer_entero("Introduce un vector (1-2): ");
        if (vector == 1) {
            numero_veces_que_repite_num(list1);
        }
        if (vector == 2) {
            numero_veces_que_repite_num(list2);
        }
    }

    public static void arraylist_normal(ArrayList list1, int v[]) {

        Integer[] c1 = new Integer[v.length];
        for (int i = 0; i < v.length; i++) {
            c1[i] = v[i];
        }
        list1.addAll(Arrays.asList(c1));
        System.out.print("Lista : " + list1);

    }

    public static void comprobar_si_repiten_elementos(ArrayList lista1, ArrayList lista2) {

        boolean se_repite = Collections.disjoint(lista1, lista2);
        if (se_repite == true) {
            System.out.println("No se repiten");
        }
        if (se_repite == false) {
            System.out.println("Se repiten");
        }


    }


    public static void main(String args[]) {
        menu();
    }

}
