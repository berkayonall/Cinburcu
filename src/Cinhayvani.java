import java.util.Scanner;

    public class Cinhayvani {
    public static void main(String[] args) {

        int dyili;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yiliniz :");
        dyili = input.nextInt();
        sonuc = dyili%12 ;

        if (sonuc == 0){
            System.out.println("Çin Zodyağı Burcun : Maymun");
        }

        if (sonuc == 1){
            System.out.println("Çin Zodyağı Burcun : Horoz");
        }

        if (sonuc == 2){
            System.out.println("Çin Zodyağı Burcun : Köpek");
        }

        if (sonuc == 3){
            System.out.println("Çin Zodyağı Burcun : Domuz");
        }

        if (sonuc == 4){
            System.out.println("Çin Zodyağı Burcun : Fare");
        }

        if (sonuc == 5){
            System.out.println("Çin Zodyağı Burcun : Öküz");
        }

        if (sonuc == 6){
            System.out.println("Çin Zodyağı Burcun : Kaplan");
        }

        if (sonuc == 7){
            System.out.println("Çin Zodyağı Burcun : Tavşan");
        }

        if (sonuc == 8){
            System.out.println("Çin Zodyağı Burcun : Ejderha");
        }

        if (sonuc == 9){
            System.out.println("Çin Zodyağı Burcun : Yılan");
        }

        if (sonuc == 10){
            System.out.println("Çin Zodyağı Burcun : At");
        }

        if (sonuc == 11){
            System.out.println("Çin Zodyağı Burcun : Koyun");
        }


    }
}