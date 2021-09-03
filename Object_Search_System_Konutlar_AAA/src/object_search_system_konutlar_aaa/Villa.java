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
public class Villa extends Konut {
    private int kat_sayisi;
    private boolean havuzlu;
    private boolean bahceli;
    private boolean otoparkli;

    public void set_kat_Sayisi(int kat_sayisi) {
        this.kat_sayisi = kat_sayisi;
    }

    public void set_havuzlu(boolean havuzlu) {
        this.havuzlu = havuzlu;
    }

    public void set_bahceli(boolean bahceli) {
        this.bahceli = bahceli;
    }

    public void set_otoparkli(boolean otoparkli) {
        this.otoparkli = otoparkli;
    }

    public int get_kat_sayisi() {
        return this.kat_sayisi;
    }

    public boolean get_havuzlu() {
        return this.havuzlu;
    }

    public boolean get_bahceli() {
        return this.bahceli;
    }

    public boolean get_otoparkli() {
        return this.otoparkli;
    }

    public Villa(double metrekare, int fiyat, boolean satilik, boolean kiralik, String adres) {
        super(metrekare, fiyat, satilik, kiralik, adres);
    }
}
