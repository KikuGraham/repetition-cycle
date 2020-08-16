package com.company.repetitioncycle;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

//Realice y represente mediante un diagrama de flujo el algoritmo para obtener la matriz
//transpuesta de cualquier matriz de orden M x N
public class ExerciseOne {
    public static void main(String[] args) {

        int cantRows;
        int cantColumns;

        int[][] matrizA;
        int[][] matrizB;

        Scanner keyboard = new Scanner(System.in);

        //Se pide q ue ingrese la cantidad de filas y columnas de la matriz
        System.out.print("Ingrese la cantidad de filas %d de la matriz: ");
        cantRows = keyboard.nextInt();
        System.out.print("Ingrese la cantidad de columnas %d de la matriz: ");
        cantColumns = keyboard.nextInt();

        //Se define el temaño de la matriz
        matrizA = new int[cantRows][cantColumns];
        matrizB = new int[cantColumns][cantRows];

        //Se recorre el arreglo
        for (int i = 0; i < cantRows; i++) {
            for (int j = 0; j < cantColumns; j++) {
                System.out.printf("Ingrese el valor para la posición %d en el arreglo %d: ", i, j);
                matrizA[i][j] = keyboard.nextInt();
            }
        }
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizB[j][i] = matrizA[i][j];
            }
        }

        for (int i = 0; i < matrizA.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrizB.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < matrizB[i].length; j++) {
                System.out.print(matrizB[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }

    }

}


        

