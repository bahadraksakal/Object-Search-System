/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_search_system_konutlar_aaa;

/**
 *
 * @author bahad
 */
public class Daire extends Konut {
    private int salon_sayisi;
    private int oda_sayisi;
    private int bulundugu_kat;

    public void set_salon_sayisi(int salon_sayisi) {
        this.salon_sayisi = salon_sayisi;
    }

    public void set_oda_sayisi(int oda_sayisi) {
        this.oda_sayisi = oda_sayisi;
    }

    public void set_bulundugu_kat(int bulundugu_kat) {
        this.bulundugu_kat = bulundugu_kat;
    }

    public int get_salon_sayisi() {
        return this.salon_sayisi;
    }

    public int get_oda_sayisi() {
        return this.oda_sayisi;
    }

    public int get_bulundugu_kat() {
        return this.bulundugu_kat;
    }

    public Daire(double metrekare, int fiyat, boolean satilik, boolean kiralik, String adres) {
        super(metrekare, fiyat, satilik, kiralik, adres);
    }
}
