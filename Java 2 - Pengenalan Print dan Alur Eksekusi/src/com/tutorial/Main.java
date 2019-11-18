package com.tutorial;

public class Main {
    public static void main(String[] args){
        // 3 Tipe Print
        /*
        Println = print yang sifatnya Blok Line (Enter)
        Print   = print yang sifatnya Inline (Meneruskan line sebelumnya/tanpa enter)
        printf  = print yang sifatnya menggabungkan 2 tipe data
        */

        System.out.println("Baris 1 : Ini adalah baris pertama (Blok Line)");
        System.out.println("Baris 2 : Ini adalah baris kedua (Blok Line)");

        System.out.print("Baris ke 3 : Ini adalah baris ketiga (Inline)");
        System.out.print("Baris ke 4 : Ini adalah baris keempat (Inline)");

        System.out.printf("Baris ke %d", 5);
    }
}
