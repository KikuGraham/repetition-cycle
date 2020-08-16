package com.company.repetitioncycle;

import java.util.Scanner;

public class ExerciseOneA {
    public static void main(String[] args) {
        int resultSum = 0;
        int[] arrayNumbers = new int [10];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++) {
            System.out.printf("Ingrese el valor para la posición %d en el arreglo", i);
            arrayNumbers[i] = keyboard.nextInt();

        }
        for (int i = 0; i < arrayNumbers.length; i++) {
            resultSum += arrayNumbers[i]; //es lo mismo poner  resultSum + arrayNumbers[i];
        }
        System.out.printf("La suma de los elementos del arreglo es de %d", resultSum);
    }
}
