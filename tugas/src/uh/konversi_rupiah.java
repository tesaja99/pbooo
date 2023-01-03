package uh;

import java.util.Scanner;

public class konversi_rupiah {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int rupiah,dollar, ringgit;
        double hasil;
        
        System.out.print("Masukkan nilai rupiah: ");rupiah =input.nextInt();
        dollar = rupiah/15000;
        ringgit = rupiah/3000;
        
        System.out.println(rupiah+" rupiah ="+dollar+"dollar");
        System.out.println(rupiah+" rupiah ="+ringgit+"ringgit");
    }
    
}
