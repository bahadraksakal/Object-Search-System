package object_search_system_konutlar_aaa;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;


public class Object_Search_System_Konutlar_AAA {
    public static int N = 100;
    public static ArrayList<Daire> Daireler_List = new ArrayList();
    public static ArrayList<Villa> Villa_List = new ArrayList();

    public static void main(String[] args) {
        String[] adres = new String[]{"ANKARA", "ISTANBUL", "BURSA"};
        Random rand = new Random();
        int daire_oda_sayisi = 0;
        int daire_salon_sayisi = 0;
        int villa_kac_katli = 0;
        double konut_metrekaresi = 0.0;
        int dairenin_bulundugu_kat = 0;
        int konut_durumu = 0;
        int konut_fiyat = 0;
        int konut_adresi = 0;
        for (int i = 0; i < N; ++i) {
            boolean kiralik;
            boolean satilik;
            konut_metrekaresi = 80.0 + 370.0 * rand.nextDouble();
            konut_durumu = rand.nextInt(2);
            if (konut_durumu == 0) {
                konut_fiyat = rand.nextInt(4200001) + 300000;
                satilik = true;
                kiralik = false;
            } else {
                konut_fiyat = rand.nextInt(27001) + 3000;
                satilik = false;
                kiralik = true;
            }
            boolean otopark = rand.nextInt(2) == 0;
            boolean havuz = rand.nextInt(2) == 0;
            boolean bahceli = rand.nextInt(2) == 0;
            konut_adresi = rand.nextInt(3);
            daire_oda_sayisi = rand.nextInt(7) + 2;
            if (daire_oda_sayisi <= 5) {
                daire_salon_sayisi = rand.nextInt(2) + 1;
                dairenin_bulundugu_kat = rand.nextInt(8) + 1;
                Daire dai_temp = new Daire(konut_metrekaresi, konut_fiyat, satilik, kiralik, adres[konut_adresi]);
                dai_temp.set_oda_sayisi(daire_oda_sayisi);
                dai_temp.set_salon_sayisi(daire_salon_sayisi);
                dai_temp.set_bulundugu_kat(dairenin_bulundugu_kat);
                Daireler_List.add(dai_temp);
                continue;
            }
            villa_kac_katli = rand.nextInt(3) + 1;
            Villa vil_temp = new Villa(konut_metrekaresi, konut_fiyat, satilik, kiralik, adres[konut_adresi]);
            vil_temp.set_kat_Sayisi(villa_kac_katli);
            vil_temp.set_bahceli(bahceli);
            vil_temp.set_havuzlu(havuz);
            vil_temp.set_otoparkli(otopark);
            Villa_List.add(vil_temp);
        }
        Object_Search_System_Konutlar_AAA.konut_bul(1);
        Object_Search_System_Konutlar_AAA.konut_bul(2);
        Object_Search_System_Konutlar_AAA.konut_bul(3);
    }

    public static void konut_bul(int numara_1_to_3) {
        // sorgu 1  otoparkı ve havuzu olan daireler.
        if (numara_1_to_3 == 1) {
            System.out.println("\n\nSorgu 1 Başlatılıyor\n\n");
            ListIterator<Villa> villa_iterator = Villa_List.listIterator();
            while (villa_iterator.hasNext()) {
                Villa vil_temp = villa_iterator.next();
                if (!vil_temp.get_otoparkli() || !vil_temp.get_havuzlu()) continue;
                System.out.print("Konut tipi: Villa\nMetrekare: " + vil_temp.metrekare + "\nFiyat: " + vil_temp.fiyat + "\nDurum: " + (vil_temp.kiralik ? "Kiralık" : "Satılık") + "\nAdres: " + vil_temp.adres + "\nKaç katlı: " + vil_temp.get_kat_sayisi() + "\n**Otoparkı: " + (vil_temp.get_otoparkli() ? "var" : "yok") + "\nBahçe: " + (vil_temp.get_bahceli() ? "var" : "yok") + "\n**Havuz: " + (vil_temp.get_havuzlu() ? "var" : "yok") + "\n\n");
            }
        }// sourgu 2 - bursada bulunan 3 odalı ve 1 salonlu daireler. 
        else if (numara_1_to_3 == 2) {
            System.out.println("\n\nSorgu 2 Başlatılıyor\n\n");
            ListIterator<Daire> Daire_iterator = Daireler_List.listIterator();
            while (Daire_iterator.hasNext()) {
                Daire Dai_temp = Daire_iterator.next();
                if (Dai_temp.get_oda_sayisi() != 3 || Dai_temp.adres.compareTo("BURSA") != 0 || Dai_temp.get_salon_sayisi() != 1) continue;
                System.out.print("Konut tipi: Daire\nMetrekare: " + Dai_temp.metrekare + "\nFiyat: " + Dai_temp.fiyat + "\nDurum: " + (Dai_temp.kiralik ? "Kiralık" : "Satılık") + "\n**Adres: " + Dai_temp.adres + "\n**Kaç Odalı: " + Dai_temp.get_oda_sayisi() + "\n**Salon Sayisi: " + Dai_temp.get_salon_sayisi() + "\nBulundu\u011fu kat: " + Dai_temp.get_bulundugu_kat() + "\n\n");
            }
        }//130 metrekareden büyük olan ve 1. katta bulunan  yada 130 metrekareden büyük  ve 2. katta bulunan daireler.
        else if (numara_1_to_3 == 3) {
            System.out.println("\n\nSorgu 3 Başlatılıyor\n\n");
            ListIterator<Daire> Daire_iterator = Daireler_List.listIterator();
            while (Daire_iterator.hasNext()) {
                Daire Dai_temp = Daire_iterator.next();
                if (!(Dai_temp.metrekare >= 130.0) || Dai_temp.get_bulundugu_kat() != 1 && Dai_temp.get_bulundugu_kat() != 2) continue;
                System.out.print("Konut tipi: Daire\n**Metrekare: " + Dai_temp.metrekare + "\nFiyat: " + Dai_temp.fiyat + "\nDurum: " + (Dai_temp.kiralik ? "Kiralık" : "Satılık") + "\nAdres: " + Dai_temp.adres + "\nKaç Odalı: " + Dai_temp.get_oda_sayisi() + "\nSalon Sayisi: " + Dai_temp.get_salon_sayisi() + "\n**Bulundu\u011fu kat: " + Dai_temp.get_bulundugu_kat() + "\n\n");
            }
        } else {
            System.out.println("Bu numaraya tanımlı bir sorgu yok");
        }
    }
}
