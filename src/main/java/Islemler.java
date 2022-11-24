import java.util.Scanner;

public class Islemler {
    static Scanner input = new Scanner(System.in);

    public static void girisEkrani() {
        System.out.println("Depo Anasayfası\nLütfen yapmak istediğiniz işlemin numarasını seçiniz...\n1_urunTanimlama\n" +
                "2_urunuListele\n" +
                "3_urunGirisi\n" +
                "4_urunRafaKoy\n" +
                "5_urunCikisi\n" +
                "6_sistemdenCikis");
        int islemNo = input.nextInt();
        switch (islemNo) {
            case 1:
                urunTanimlama();
                break;
            case 2:
                urunListele();
                break;
            case 3:
                urunGirisi();
                break;
            case 4:
                urunRafaKoy();
                break;
            case 5:
                urunCikisi();
                break;
            case 6:
                System.out.println("Sistemden çıkış yaptınız...");
        }

    }

    private static void urunCikisi() {
    }

    private static void urunRafaKoy() {
    }

    private static void urunGirisi() {
    }

    private static void urunListele() {
    }


    public static void urunTanimlama() {
        UrunBilgisi urunBilgisi = new UrunBilgisi();
        System.out.print("Lütfen tanımlayacağınız ürünün ismini giriniz: ");
        String urun = input.nextLine();
        urunBilgisi.setUrunIsmi(urun);
        System.out.print("Lütfen tanımlayacağınız ürünün üreticisini giriniz: ");
        String urunUreticisi = input.nextLine();
        urunBilgisi.setUrunUreticisi(urunUreticisi);
        System.out.print("Lütfen tanımlayacağınız ürünün birimini giriniz: ");
    }

}
