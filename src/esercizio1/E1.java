package esercizio1;

import java.util.Arrays;
import java.util.Scanner;

public class E1 {
    public static void main(String[] args) {
            //Creazione Array
        int[] numeri = new int[5];
        //Ciclo array per popolarlo di numeri casuali
        for (int i = 0; i < numeri.length; i++) {
            numeri[i]= (int)(Math.random() * 10) + 1;
        }
        System.out.println(Arrays.toString(numeri));

        // Ciclo do while e for per chiedere all'utente
        Scanner scanner = new Scanner(System.in);
        int posizione;
        int numero;

        try {

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Hai inserito una posizione non valida");
        }


    }



}
