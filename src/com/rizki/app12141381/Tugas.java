package com.rizki.app12141381;

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
        System.out.println("Jika ingin memulai harap masukan nama Anda jika tidak tekan x");
        this.nama = name.nextLine();
        
        Scanner random = new Scanner(System.in);
        System.out.println("Harap masukkan angka Anda : ");
        this.asalAngka = random.nextInt();
    }
    
    
        
    
}
