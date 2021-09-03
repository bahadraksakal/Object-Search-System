package object_search_system_konutlar_aaa;


public class Konut {
    double metrekare;
    int fiyat;
    boolean satilik;
    boolean kiralik;
    String adres;

    public Konut(double metrekare, int fiyat, boolean satilik, boolean kiralik, String adres) {
        this.metrekare = metrekare;
        this.fiyat = fiyat;
        this.satilik = satilik;
        this.kiralik = kiralik;
        this.adres = adres;
    }
}
