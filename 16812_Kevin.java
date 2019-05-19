import java.util.*;
public class Kevin{
    interface SifatBangunan{
        public double getLuas();
        public double getKeliling();
        public double getVolume();
    }
    abstract class Bangunan{
        protected double panjang;
        protected double tinggi;
    }
    //Bangun Datar
    class Persegi extends Bangunan implements SifatBangunan{
        Persegi(double sisi){
            this.panjang = sisi;
            this.tinggi = sisi;
        }
        public double getLuas(){
            return this.panjang * this.tinggi;
        }

        public double getKeliling(){
            return this.panjang * 4;
        }

        public double getVolume(){
            return 0;
        }
    }
    //Bangun Ruang
    class Kubus extends Bangunan implements SifatBangunan{
        protected double lebar;
        public Kubus(double sisi){
            this.panjang = sisi;
            this.tinggi = sisi;
            this.lebar = sisi;
        }

        public double getLuas(){
            return 6 * (this.panjang * this.tinggi);
        }

        public double getKeliling(){
            return 12 * this.panjang;
        }

        public double getVolume(){
            return this.panjang * this.panjang * this.panjang;
        }
    }
    Kevin(){
        Scanner sc = new Scanner(System.in);
        SifatBangunan b;
        System.out.print("Choose\n1. Kubus\n2. Kotak\nInput: ");
        int choice = sc.nextInt();sc.nextLine();
        System.out.print("Input sisi: ");
        double sisi = sc.nextDouble();sc.nextLine();
        if(choice == 1){
            b = new Kubus(sisi);
        }else{
            b = new Persegi(sisi);
        }
        System.out.println("Luas : "+b.getLuas());
        System.out.println("Keliling : "+b.getKeliling());
        if(choice==1){
            System.out.println("Volume : "+b.getVolume());
        }
    }
    public static void main(String[] argv){
        new Kevin();
    }

}