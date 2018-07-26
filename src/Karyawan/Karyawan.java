/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karyawan;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Aristia
 */
public class Karyawan {
    public String[] dataKaryawan() {
        String[] karyawan = {"Diana Pratiwi", "Eka Prasetya","Afrizal Arkaun"};
        return karyawan;
    }
    
    public String jadwalShift(String shift) {
        String[] daftarKayawan = dataKaryawan();
        Map<String, String> karyawan = new HashMap<>();
        karyawan.put("shift-1", daftarKayawan[0]);
        karyawan.put("shift-2", daftarKayawan[1]);
        karyawan.put("shift-3", daftarKayawan[2]);
        return karyawan.get(shift);
        
    }
}
