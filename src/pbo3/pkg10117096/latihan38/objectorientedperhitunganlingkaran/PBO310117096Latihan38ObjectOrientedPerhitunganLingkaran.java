/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117096.latihan38.objectorientedperhitunganlingkaran;

/**
 *
 * @author 
 * NAMA         : Miftah Muhammad Sidqi
 * NIM          : 10117096
 * KELAS        : PBO3
 * DESKRIPSI    : Program ini berisi program perhitungan lingkaran
 */
public class PBO310117096Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran ling = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        ling.validasiInput();
        ling.hasilPerhitungan(ling.diameter);
    }
    
}
