/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

/**
 *
 * @author Aristia
 */
public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private int jumlah;
    private int harga;
    
        public String setKodeMenu(String kodeMenu) {
        return this.kodeMenu = kodeMenu;
    }
    
    public String getKodeMenu() {
        return kodeMenu;
    }
    
    public String setNamaMenu(String kodeMenu) {
        String namaMenu = "";
        if(kodeMenu == "GDG01")
            namaMenu = "Gudeg Jogja";
        else if(kodeMenu == "KRC03")
            namaMenu = "Krecek Jogja";
        else if(kodeMenu == "MCN10")
            namaMenu = "Oseng Mercon";
        else if(kodeMenu == "CLK05")
            namaMenu = "Cilok Gajah";
        else if(kodeMenu == "CNL07")
            namaMenu = "Cenil Jogja";
        else if(kodeMenu == "BKM04")
            namaMenu = "Bakmi Jogja";
        else
            namaMenu = "Produk tidak tersedia";
        
        return this.namaMenu = namaMenu;
    }
    
    public String getNamaMenu() {
        return namaMenu;
    }
    
    public int setJumlah(int jumlah) {
        return this.jumlah = jumlah;
    }
    
    public int getJumlah() {
        return jumlah;
    }

    public int setHarga(String kodeMenu) {
        int harga = 0;
        if(kodeMenu == "GDG01")
            harga = 8500;
        else if(kodeMenu == "KRC03")
            harga = 7000;
        else if(kodeMenu == "MCN10")
            harga = 9000;
        else if(kodeMenu == "CLK05")
            harga = 5000;
        else if(kodeMenu == "CNL07")
            harga = 6000;
        else if(kodeMenu == "BKM04")
            harga = 10000;
        
        return this.harga = harga;
    }
    
    public int getHarga() {
        return harga;
    }
    
    public int setHargaTotal(int jumlah, int harga) {
        return jumlah * harga;
    }
    
}

