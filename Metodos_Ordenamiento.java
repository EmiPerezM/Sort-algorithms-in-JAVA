package algoritmos;

import java.util.Scanner;

public class Metodos_Ordenamiento {

    public double[] numeros;
    static Scanner scanner = new Scanner(System.in);

    public Metodos_Ordenamiento() {

    }

    public void generarElementos() {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (double)(Math.random() * 1000);
        }
    }

    public void burbuja() {
        int contadorComparaciones = 0;
        boolean bandera = false;
        System.out.println("Metodo Burbuja");
        for (int i = 0; i < numeros.length - 1 && !bandera; i++) {
            bandera = false;
            for (int j = 0; j < numeros.length - (i + 1); j++) {
                contadorComparaciones++;
                if (numeros[j] > numeros[j + 1]) {
                    double aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                    bandera = true;
                }
            }
        }
        System.out.println("Contador comparaciones: " + contadorComparaciones);
    }

    public void insercion() {
        System.out.println("Metodo insercion");
        for (int i = 0; i < numeros.length; i++) {
            int posicion = i;
            double aux = numeros[i];
            while ((posicion > 0) && (numeros[posicion - 1] > aux)) {
                numeros[posicion] = numeros[posicion - 1];
                posicion--;
            }
            numeros[posicion] = aux;
        }
    }

    public void seleccion() {
        System.out.println("Metodo Seleccion");
        for (int i = 0; i < numeros.length - 1; i++) {
            int minimo = 1;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minimo]) {
                    minimo = j;
                }
            }
            double aux = numeros[i];
            numeros[i] = numeros[minimo];
            numeros[minimo] = aux;
        }
    }

    public void shakeSort() {
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = i; j < numeros.length - (1 + i); j++) {
                if (numeros[j] > numeros[j + 1]) {
                    double aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
            for (int j = numeros.length - (i + 1); j > i; j--) {
                if (numeros[j] < numeros[j - 1]) {
                    double aux = numeros[j];
                    numeros[j] = numeros[j - 1];
                    numeros[j - 1] = aux;
                }
            }
        }
    }

    public void quickSort() {

    }

    public void print() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
    }
    public void pedirDatos() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
    }
}
