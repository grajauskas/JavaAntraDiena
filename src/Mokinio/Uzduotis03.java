package Mokinio;

import java.util.Scanner;

public class Uzduotis03 {
    public Uzduotis03() {
        //Paprasyti ivesti du skaicius
        //atspausdinti ju suma ir skirtuma

        System.out.print("iveskite skaiciu: ");
        Scanner scanner = new Scanner(System.in);
        int skaicius1 = scanner.nextInt();
        System.out.print("Iveskite antra skaiciu: ");
        int skaicius2 = scanner.nextInt();
        System.out.print("Jusu skaiciu ivestu suma: ");
        System.out.println(skaicius1 + skaicius2);
        System.out.print("Jusu skaiciu ivestu skirtumas: ");
        System.out.println(skaicius1 - skaicius2);

    }
}
