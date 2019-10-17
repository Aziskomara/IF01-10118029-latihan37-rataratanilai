/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan rata-rata nilai
 * 
 */
public class IF0110118029Latihan37Rataratanilai {

    /**
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        nilai nilairata = new nilai();
        
        int jmlMhs;
        System.out.print("Masukkan Banyaknya Mahasiwa : ");
        jmlMhs = scanner.nextInt();
        
        nilairata.hitungNilai(nilairata.nilai, jmlMhs);
        nilairata.hitungRataRata(nilairata.totalNilai, jmlMhs);
        
        System.out.printf("%nMaka, Rata-rata nilainya adalah : %.1f",nilairata.hitungRataRata(nilairata.totalNilai, jmlMhs));
        System.out.println();
        System.out.println("Developed by : Azis komara");
    }
    
}
