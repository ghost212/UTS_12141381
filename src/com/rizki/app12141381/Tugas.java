package com.rizki.app12141381;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Tugas {
    public String nama;
    public int asalAngka;
    public byte level;
    public char jawab;
    public int angkaAcak;
    public int kesempatan;

    public void Games() {
        Scanner name = new Scanner(System.in);
        System.out.println("Jika ingin memulai harap masukan nama Anda jika tidak tekan x : ");
        this.nama = name.nextLine();
        
        Scanner random = new Scanner(System.in);
        System.out.println("Harap masukkan angka Anda : ");
        this.asalAngka = random.nextInt();
        
        Random angka = new Random();
        this.angkaAcak = angka.nextInt(101);
        
//        System.out.println(angkaAcak);
//        for (level=1; level<=5; level++){
//            while(kesempatan <= 5)
//            {
                if (asalAngka < angkaAcak){
                    System.out.println("Tebakan kekecilan");
                }
                else if (asalAngka > angkaAcak){
                    System.out.println("Tebakan kebesaran");
                }
                else if (asalAngka == angkaAcak){
                    System.out.println("Tebakan Bener");
                }
                
//            }
//        }
    }
    
    
    
    
        
    
}
