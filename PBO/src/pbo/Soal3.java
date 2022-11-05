/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author ASUS-E402Y
 */
import java.util.Scanner;

public class Soal3 {
    public static void main(String[]args){
        String Nama;
        String NIM;
        String Semester;
        String Kelas;
                
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.print("Masukan Nama = ");
        Nama = input.nextLine();
        System.out.print("Masukan NIM = ");
        NIM = input.nextLine();
        System.out.print("Masukan Semester = ");
        Semester = input.nextLine();
        System.out.print("Masukan Kelas = ");
        Kelas = input.nextLine();
        
        System.out.println("Nama = "+Nama);
        System.out.println("NIM = "+NIM);
        System.out.println("Semester = "+Semester);
        System.out.println("Kelas = "+Kelas);
        
    }
}
