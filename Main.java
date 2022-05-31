import java.util.Scanner;
public class Main {

public static void main(String[] args) {

double kilo ,boy;
//Vücut Kitle İndeksi = vK
Scanner input= new Scanner(System.in);
System.out.println("Boyunuzu Giriniz");
boy = input.nextDouble();

Scanner inputt= new Scanner(System.in);
System.out.println("Kilonuzu Giriniz");
kilo = inputt.nextDouble();

double indeks;
indeks = ((kilo)  /(boy * boy)) ;
System.out.println("Vücut Kitle İndeksiniz : "  + indeks);



    
}

    
}
