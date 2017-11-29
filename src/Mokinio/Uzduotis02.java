package Mokinio;

import java.util.Scanner;

public class Uzduotis02 {
    public Uzduotis02() {
        //Paprasyti vartotojo ivesti zodi
        //Atspasdinti kiek simboliuyra zodija

        System.out.println("Iveskite savo zodi");
        Scanner zodis = new Scanner(System.in);
        String zodzioIlgis = zodis.nextLine();
        System.out.println(zodzioIlgis.length());
    }
}
