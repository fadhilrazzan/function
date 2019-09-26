/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan01;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Latihan04 {
    public static void hitung(double a, double b)
    {
        System.out.println("Kecepatan :"+ (a / b)+"km / jam");
     }
    public static void main(String[] args){
        Scanner Bekas = new Scanner (System.in);
        
        System.out.print("Masukkan Jarak : ");
        int jarak = Bekas.nextInt();
        
        System.out.print("Masukkan waktu tempuh : ");
        int waktu = Bekas.nextInt();
    
        hitung(jarak, waktu);
    }
}