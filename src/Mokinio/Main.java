package Mokinio;

import java.util.Scanner;

public class Main {
    public static final int CHOISE_0 = 0;
    public static final int CHOISE_1 = 1;
    public static final int CHOISE_2 = 2;
    public static final int CHOISE_3 = 3;
    public static final int CHOISE_4 = 4;
    public static final int CHOISE_5 = 5;

    public static void main(String[] args) {
        // Parodyti vartotojui kiek yra uzduociu
        //Paklausti kokia uzduoti jis nori pamatyt
        //nuskaityti ir isvesti jo norima uzduoti
        //programa kartoja seka kol neiveda 0
        Scanner skaitytuvas = new Scanner(System.in);
        while (true) {
            System.out.println("turime isviso 1 uzduociu");
            System.out.println("iveskite uzduoti kad ja vykdytu");
            System.out.println("ivedus 0 programa bus baigta");

            int pasirinkimas = skaitytuvas.nextInt();

            switch (pasirinkimas) {
                case CHOISE_0:
                    return;
                case CHOISE_1:
                    Uzduotis01 pirmoji = new Uzduotis01();


                    break;

            }


        }
    }
}
