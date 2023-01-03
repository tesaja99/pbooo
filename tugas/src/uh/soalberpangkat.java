package uh;
import java.util.Scanner;
public class soalberpangkat {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int nilai,pangkat ;
        double hasil;
        
        
        System.out.print("Nilai bilangan: ");
        nilai=input.nextInt();

        System.out.print("Nilai Pangkat : ");
        pangkat=input.nextInt();
        
        hasil = Math.pow(nilai, pangkat);

        System.out.println("hasil= "+hasil);
        
}
}
