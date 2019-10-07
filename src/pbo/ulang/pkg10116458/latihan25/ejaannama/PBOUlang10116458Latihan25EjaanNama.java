/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan25.ejaannama;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String namaDepan;
        int i = 0;
        int j = 1;

        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan nama depan anda untuk di eja : ");
        namaDepan = scan.next();
        //Syntax untuk memecah huruf (mengeja nama)
        String[] panjangNama = namaDepan.split("");

        //Syntax untuk menampilkan ejaan
        
        System.out.println("");
        System.out.println("Ejaan Untuk " + "'"+namaDepan+"'" + " adalah : ");
        while (i < panjangNama.length) {
            System.out.println("Huruf ke-" + j + " : " + panjangNama[i]);
            j = j + 1;
            i++;

        }
    }
    
}
