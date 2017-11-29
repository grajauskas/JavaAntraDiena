package Mokinio;

import java.util.Scanner;

public class Uzduotis06 {
    public Uzduotis06() {
        //Paprasyti vartotojo ivesti savo Ugi(m) ir Svori(kg)
        //paskaiciuoti ir atvaizduoti jo KMI=(mase(kg)/(ugis(m)^2))

        System.out.print("Iveskite savo ugi(m): ");
        Scanner scanner = new Scanner(System.in);
        float ugis = scanner.nextFloat();
        System.out.print("Iveskite savo mase(kg): ");
        float mase = scanner.nextFloat();
        float kmi = mase / (ugis * ugis);
        System.out.println("Jusu ivestu duomenu KMI: " + kmi);


    }
}
