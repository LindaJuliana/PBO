/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo4;

import java.util.Scanner;

/**
 *
 * @author ASUS-E402Y
 */
public class Soal3 {
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in).useDelimiter("\n");
          
          int panjang, lebar, hasil, sisi;
          int pilihan;
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling Persegi");
//        System.out.println("Masukan panjang sisi persegi");
       
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Pilihan = ");
        pilihan = input.nextInt();
        switch(pilihan) {
    case 1 :
        //Input Sisi
        Scanner panjangi = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan panjang sisi persegi = ");
        panjang = panjangi.nextInt();
        
        
        hasil = panjang*panjang;
        System.out.println("Luas Persegi adalah : " + hasil + " cm");
        
        break;
    case 2 :
        //Input Sisi
        Scanner sisip = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Masukkan panjang sisi persegi = ");
        sisi = sisip.nextInt();
        
        hasil = 4*sisi;
        System.out.println("Luas Persegi adalah : " + hasil + " cm");
        
        break;
         case 3 :
        System.out.println("Sistem Error"); break;
        }
    }
    
}
