package Mokinio;

import java.util.Scanner;

public class Uzduotis04 {
    public Uzduotis04() {
        //Paprasyti ivesti du skaicius
        //atspausdinti ju suma ir skirtuma jie turi buti skirtinguose metoduose

        System.out.print("iveskite skaiciu: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Iveskite antra skaiciu: ");
        int b = scanner.nextInt();
        System.out.print("Jusu skaiciu ivestu suma: ");
        System.out.println(suma(a, b));
        System.out.print("Jusu skaiciu ivestu skirtumas: ");
        System.out.println(skirtumas(a, b));

    }

    public static int skirtumas(int x, int y) {
        return x - y;

    }

    public static int suma(int x, int y) {
        return x + y;
    }
}
