/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gajidanbonus;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class GajiDanBonus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ){
        int gajiasas=1100;
        double gaji , bonus;
         
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pelanggan yang diperolehi: ");
        
        int bilpelanggan=input.nextInt();
        
        if(bilpelanggan ==0){
            bonus=0;
        }else if (bilpelanggan >=1 && bilpelanggan<=9){
            bonus=2000;
        }else if (bilpelanggan >=10 && bilpelanggan<=19){
            bonus=4000;
        }else if (bilpelanggan >=20 && bilpelanggan<=29){
            bonus=6000;
        }else if (bilpelanggan >=30 && bilpelanggan<=39){
        bonus=8000;
        }else {
         bonus=10000;
        }
        gaji=gajiasas+bonus;
        System.out.println("Bilangan pelanggan anda " +bilpelanggan);
        System.out.println("Gaji anda bulan ini : RM" +gaji);
    }
    
}
