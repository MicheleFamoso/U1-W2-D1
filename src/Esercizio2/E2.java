package Esercizio2;

import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Quanti km hai percorso?");
//        int km = scanner.nextInt();
//        System.out.println("Quanto carburante hai consumato?");
//        int lt = scanner.nextInt();
//
//        try {
//            int prova=  calcolo(km,lt);
//            System.out.println("Hai percorso " +prova + "Km al litro");
//
//        }catch (ArithmeticException e){
//            System.out.println("Non puoi aver consumato 0 litri");;
//        }
        System.out.println("Quanti km hai percorso?");
        double km = scanner.nextDouble();
        System.out.println("Quanto carburante hai consumato?");
        double lt = scanner.nextDouble();


           double risultato =  calcolo2(km,lt);
           if (Double.isInfinite(risultato)){
               System.out.println("Non puoi aver consumato 0 carburante");
           }else {
               System.out.println("Hai percorso" + risultato + "Km/lt");
           }







    }
    public static int calcolo( int km, int lt){

        return km/lt;
    }

    public static double calcolo2 (double km, double lt){
        return km/lt;
    }

}
