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
public class Jobsheet12 {
    public static void hitung(int a, int b){
        
       System.out.println("Hasil : "+ (a + b));
       {
     
       }
       Scanner Mahal = new Scanner(System.in);
       
       System.out.println("Masukkan Bilangan I : ");
       int bil1 = Mahal.nextInt();
       
       System.out.println("Masukkan Bilangan II : ");
       int bil2 = Mahal.nextInt();
       
       hitung(bil1, bil2);
    }
}
