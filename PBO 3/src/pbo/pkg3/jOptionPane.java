/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.pkg3;

/**
 *
 * @author ASUS-E402Y
 */
import javax.swing.JOptionPane;

public class jOptionPane {
    public static void main(String[] args) {
        //input Nama
        String nama = JOptionPane.showInputDialog("Masukan nama anda!");
        int umur = Integer.parseInt(JOptionPane.showInputDialog("Masukkan umur anda!"));
        //Print
        System.out.println("Hai " + nama+ ", apa kabar? Tidak terasa sekarang anda sudah " + umur + " tahun.");
    }
}
