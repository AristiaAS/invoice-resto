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

    public class Bonus extends Menu {
    public Bonus(int jumlah) {
        if(jumlah > 10) {
            System.out.println("\t   **Anda Mendapatkan 2 Gelas Es Semlo Jogja**");
        }
        else if(jumlah > 5) {
            System.out.println("\t  **Anda Mendapatkan 1 Gelas Es Semlo Jogja**");
        }
    }
}

