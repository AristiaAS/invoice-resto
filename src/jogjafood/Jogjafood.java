/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogjafood;
import menu.Menu;
import Karyawan.Karyawan;
import menu.Bonus;



/**
 *
 * @author Aristia
 */
public class Jogjafood {
    private String namaresto = "\t\t  *** ARISTIA RESTO JOGJAKARTA ***";
    private String macamProduk="\t\t   Traditional Food Of Yogyakarta";
    private String noTelp = "\t\t\t   081542000011";
    private String alamat = "\t\t   Jl.Letjend Suprapto No 31 Slawi";
    

    public static void main(String[] args) {
       Jogjafood j = new Jogjafood();
        System.out.println(j.namaresto);
        System.out.println(j.macamProduk);
        System.out.println("-------------------------------------------------------------------");
        System.out.println(j.alamat);
        System.out.println(j.noTelp);
        System.out.println("===================================================================");
        
        Karyawan k = new Karyawan();
        System.out.println("Kasir1 : " + k.jadwalShift("shift-3") + "\t    No.Meja:5   Tanggal 16/10/2017 06:12:97");
        System.out.println("Pembelian");
        System.out.println("Kode\t  Nama Menu\t\tJumlah\t\t\t Total");
        int totalJumlah = 0;
        int totalHargaPembelian = 0;
        String[] kodeMenu = {"GDG01", "KRC03", "MCN10","CLK05","CNL07","BKM04"};
        int[] jumlah = {2, 3, 1, 4, 5, 2};
        for(int i = 0; i < kodeMenu.length; i++) {
            Menu m = new Menu();
            m.setKodeMenu(kodeMenu[i]);
            m.setNamaMenu(kodeMenu[i]);
            m.setJumlah(jumlah[i]);
            m.setHarga(kodeMenu[i]);
            int totalHargaPerMenu = m.setHargaTotal(m.getJumlah(), m.getHarga());
            totalJumlah += jumlah[i];
            totalHargaPembelian += totalHargaPerMenu;
    
  
            
        System.out.println("(" + m.getKodeMenu() + ")\t  " + m.getNamaMenu() + "\t\t" + m.getJumlah() + " x " + m.getHarga() + "\t\t= Rp." + totalHargaPerMenu);
        }
        System.out.println("\t\t\t\t\t    Total Harga = Rp." + totalHargaPembelian);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t  Bayar = Rp.200000");
        int kembalian = 200000-totalHargaPembelian;
        System.out.println("\t\t\t\t\t\tKembali = Rp."+ kembalian);
        System.out.println("\n");
        
        Menu bonus = new Bonus(totalJumlah);
        
        System.out.println("\t   ============================================");
        System.out.println("\t   ------TERIMA KASIH ATAS KUNJUNGAN ANDA------");
        System.out.println("\t   ============================================");
   }
}
