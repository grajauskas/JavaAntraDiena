package Mokinio;

import java.util.Scanner;

public class Uzduotis07 {
    public Uzduotis07() {
        //Paprasyti vartotojo ivesti savo Ugi(m) ir Svori(kg)
        //paskaiciuoti ir atvaizduoti naujam metode jo KMI=(mase(kg)/(ugis(m)^2))

        System.out.print("Iveskite savo ugi(m): ");
        Scanner scanner = new Scanner(System.in);
        float ugis = scanner.nextFloat();
        System.out.print("Iveskite savo mase(kg): ");
        float mase = scanner.nextFloat();
        System.out.println("Jusu KMI: ");
        System.out.println(kmi((float) mase, (float) ugis));

    }

    public static float kmi(float mase, float ugis) {
        return mase / (ugis * ugis);
    }

}