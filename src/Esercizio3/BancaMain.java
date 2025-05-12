package Esercizio3;

import java.util.Scanner;

public class BancaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContoCorrente c1 = new ContoCorrente("Achille",23500);
        ContoOnLine c2 = new ContoOnLine("Maria",12500,500);

        do {
            try{
                System.out.println("Quanto vuoi prelevare?");
                double prelievo = scanner.nextDouble();
                c1.preleva(prelievo);

                System.out.println("Movimento n : " + c1.nMovimenti);
                System.out.println( "Saldo Disponibili : " + c1.saldo);
            }catch (BancaException e){

                System.out.println("Movimento n : " + c1.nMovimenti);
                System.out.println(e.getMessage());
            }

        }while (c1.saldo >0);


        do {
            try{
                System.out.println("Quanto vuoi prelevare?");
                double prelievo = scanner.nextDouble();
                c2.preleva(prelievo);

                System.out.println("Movimento n : " + c2.nMovimenti);
                System.out.println( "Saldo Disponibili : " + c2.saldo);
            }catch (BancaException e){

                System.out.println("Movimento n : " + c2.nMovimenti);
                System.out.println(e.getMessage());
            }

        }while (c2.saldo >0);


    }
}
