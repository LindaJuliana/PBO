/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg3;
import java.util.Scanner;
/**
 *
 * @author ASUS-E402Y
 */
public class Kelulusan {
    public static void main(String[] args) {
        //Buat Scanner
        Scanner inp = new Scanner (System.in);
        
        //Ambil Nama
        System.out.print("Masukan nama anda = ");
        String Nama = inp.next();
        
         //Ambil NIM
        System.out.print("Masukan NIM = ");
        int nim = inp.nextInt();
        
        //Ambil Nilai
        System.out.print("Masukan Nilai = ");
        int nilai = inp.nextInt();
        
        if(nilai > 60){
            System.out.println("Selamat anda lulus");
        } else {
            System.out.println("Maaf anda tidak lulus");
                    }
        }
        
    }
    

