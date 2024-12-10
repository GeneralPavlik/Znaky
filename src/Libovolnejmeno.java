import java.util.Scanner;

public class Libovolnejmeno {
    static Scanner sc = new Scanner(System.in);

    public void vypisAhoj(){
     for (int i=1;i<=30;i++){
        System.out.println(i+". Ahoj světe.");
    }
    }

    public void vypisSlovo(){
        System.out.println("Napište slovo");
        String slovo = sc.nextLine();
        System.out.println(slovo);
    }

    public void vypisCislo() {
        System.out.println("Napište číslo");
        int cislo = sc.nextInt();
        if (cislo <= -1) {
            System.out.println("Bylo zadáno záporné číslo");
        } else if (cislo == 0) {
            System.out.println("0");
        } else if (cislo > 12) {
            System.out.println("Moc velké číslo.");
        } else if (cislo == 1) {
            System.out.println("Jedna.");
        } else if (cislo == 2) {
            System.out.println("Dva.");
        } else if (cislo == 3) {
            System.out.println("Tři.");
        } else if (cislo == 4) {
            System.out.println("Čtyři.");
        } else if (cislo == 5) {
            System.out.println("Pět.");
        } else if (cislo == 6) {
            System.out.println("Šest.");
        } else if (cislo == 7) {
            System.out.println("Sedm.");
        } else if (cislo == 8) {
            System.out.println("Osm.");
        } else if (cislo == 9) {
            System.out.println("Devět.");
        } else if (cislo == 10) {
            System.out.println("Deset.");
        } else if (cislo == 11) {
            System.out.println("Jedenáct.");
        } else if (cislo == 12) {
            System.out.println("Dvanáct.");
        }
    }

   public void nasobPeti(){
           for (int i=1;i <=20;i++){
               System.out.println(i*5);
           }
        }


        public void prvoCislo(){
        System.out.println("Napište číslo : ");
        int cislo =sc.nextInt();
        int pocetdelitelu =0;
        for (int i = 1 ; i <= cislo;i++){
            if (cislo%i==0){
                pocetdelitelu++;
            }
        }
        if (pocetdelitelu == 2){
            System.out.println("Je to prvočíslo.");
        }
        else {
            System.out.println("Není to prvočíslo.");
        }
        }


        public void vetsiMensi() {
            System.out.println("Napište 1. číslo :");
            int cislo = sc.nextInt();
            System.out.println("Napište 2. číslo :");
            int cislo2 = sc.nextInt();
            System.out.println("Napište 3. číslo :");
            int cislo3 = sc.nextInt();
            int max = 0;
            int min = 0;

              if (cislo > cislo2 && cislo > cislo3) {
                 max = cislo;
            } else if (cislo2 > cislo && cislo2 > cislo3) {
                 max = cislo2;
            } else if (cislo3 > cislo && cislo3 > cislo2) {
                max = cislo3;
            }

            if (cislo < cislo2 && cislo < cislo3) {
                 min = cislo;

            } else if (cislo2 < cislo && cislo2 < cislo3) {
                 min = cislo2;
            } else if (cislo3 < cislo && cislo3 < cislo2) {
                 min = cislo3;
            }

            System.out.println("Největší číslo je "+max);
            System.out.println("Nejmenší číslo je "+min);
            System.out.println(max%min);


        }
}
