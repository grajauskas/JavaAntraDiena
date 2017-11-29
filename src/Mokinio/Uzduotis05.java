package Mokinio;

import java.util.Scanner;

public class Uzduotis05 {
    public Uzduotis05() {
        //Paprasyti ivesti du skaicius
        //atspausdinti ju suma ir skirtuma jie turi buti skirtinguose metoduose

        System.out.print("iveskite skaiciu: ");
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextFloat();
        System.out.print("Iveskite antra skaiciu: ");
        float b = scanner.nextFloat();
        System.out.print("Jusu skaiciu ivestu suma(float): ");
        System.out.println(suma((float) a, (float) b));
        System.out.print("Jusu skaiciu ivestu suma(int): ");
        System.out.println(suma((int) a, (int) b));
        System.out.print("Jusu skaiciu ivestu skirtumas(float): ");
        System.out.println(skirtumas((float) a, (float) b));
        System.out.print("Jusu skaiciu ivestu skirtumas(int): ");
        System.out.println(skirtumas((int) a, (int) b));

    }

    public static float skirtumas(float x, float y) {
        return x - y;
    }

    public static int skirtumas(int x, int y) {
        return x - y;

    }

    public static float suma(float x, float y) {
        return x + y;
    }

    public static int suma(int x, int y) {
        return x + y;
    }
}
