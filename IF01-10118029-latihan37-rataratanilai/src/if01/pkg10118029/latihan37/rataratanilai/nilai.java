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
public class nilai {
    Scanner scanner = new Scanner(System.in);
    public int nilai;
    public double totalNilai;
    

    
    public double hitungNilai(int parNilai, int parJmlMhs){
        for(int i=1;i<=parJmlMhs;i++){
            System.out.print("Nilai mahasiswa ke-"+i+" : ");
            parNilai = scanner.nextInt();
            totalNilai += parNilai;
        }
        return totalNilai;
    }
    
    public double hitungRataRata(double totalNilai,int jumlahMhs){
        return totalNilai/jumlahMhs;
    }
    
}
