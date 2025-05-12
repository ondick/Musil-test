import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kolik chceš zadat stomů?");
        int cislo = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cislo; i++) {
            System.out.println("Jakej druh stomu chces udelat?(Jehlicnan/Listnac)");
            String typ = sc.nextLine();
            ArrayList<Strom> stroms = new ArrayList<Strom>(cislo);
            if (typ.equals("Jehlicnan")) {


                System.out.println("Jakej je to druh stromu?(Srmk,Javor..)");
                String druh = sc.nextLine();

                System.out.println("Jakej je rok zasazeni tohoto stromu?");
                int rok = sc.nextInt();
                sc.nextLine();

                System.out.println("Jakej má strom výšku?(v metrech)");
                int vyska = sc.nextInt();
                sc.nextLine();

                stroms.add(new Jehlicnan(druh, rok, vyska));
            }

            if (typ.equals("Listnac")) {


                System.out.println("Jakej je to druh stromu?(Dub,Javor)");
                String druh = sc.nextLine();

                System.out.println("Jakej je rok zasazeni tohoto stromu?");
                int rok = sc.nextInt();
                sc.nextLine();

                System.out.println("Jakej má strom barvu květu?");
                String barva = sc.nextLine();
                stroms.add(new Listnac(druh, rok, barva));
            }
        }


    }
}