/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan58.tambahkurang;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menghitung 
 * dengan operator penjumlahan dan pengurangan.
 */
public class SelisihBilangan extends Bilangan {
    
    
    public void tampilSelisih(){
        System.out.println("Hasil Selisih " + getX() + " - " + getY() 
                + " = " + (getX() - getY()));
    }
}
