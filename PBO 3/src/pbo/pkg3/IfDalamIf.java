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
public class IfDalamIf {
    public static void main(String [] args) {
        
        String jurusan;
        float nilai;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan jurusan (IPA/IPS) = ");
        jurusan = input.nextLine ();
        
        System.out.print("Masukan Nilai = ");
        nilai = input.nextFloat();
        
      if("IPA".equals(jurusan)) {
          if (nilai >= 8.5) {
              System.out.println("Anda lulus ");
          } else {
              System.out.println("Anda tidak lulus ");
              
          }
      } else if ("IPS".equals(jurusan)) {
          if(nilai >= 7.5) {
              System.out.println("Anda lulus ");
          } else {
              System.out.println("Anda tidak lulus ");
          }
        }
    }
}