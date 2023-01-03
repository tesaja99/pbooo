package uh;

import java.util.Scanner;

public class Ifelse {
public static void main(String[] args)

{
String nama,grade = null;
int n1,n2 ;
double mm;

Scanner input = new Scanner(System.in);
System.out.println("PROGRAM HITUNG NILAI AKHIR");

System.out.print("Nama Siswa : " );
nama =input.nextLine();

System.out.print("Nilai Tugas: ");
n1=input.nextInt();

System.out.print("Nilai Ujian : ");
n2=input.nextInt();


mm= (n1+n2)*0.5;

if(mm >=90)
{
grade= "A" ;
}
else if (mm >=80)
{
grade= "B" ;
}

else if (mm >=75)
{
grade= "C" ;
}
else if (mm <75)
{
grade= "D" ;
}


System.out.print("Jadi Siswa yang bernama" + nama + " ");

System.out.println("memperoleh nilai akhir sebesar " + mm);
System.out.println("Grade nilai yang didapat adalah" + " " + grade);

}
}