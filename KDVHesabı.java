import java.util.Scanner;

public class KDVHesabı {

    public static void main(String[] args) {
        double tutar,kdvOranı, kdvliTutar,kdvTutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();
        kdvOranı = tutar <= 1000 ? 0.18 : 0.08;
        kdvTutar = tutar * kdvOranı;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar:" + tutar);
        System.out.println("KDV Oranı: "+ kdvOranı);
        System.out.println("KDV Tutarı: "+ kdvTutar);
        System.out.println("KDV'li Tutar: "+ kdvliTutar);
        
    }
}