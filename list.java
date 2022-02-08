class Main { public static void main(String args[]) { String x="Merhaba"; String y="Dünya"; System.out.println(x.concat(y)); System.out.println(x+" "+y); } } 

public class Main {
static String myMethod(int x) { 
return "Dünya"+" "+x; 
} 
public static void main(String[] args) { 
int x=5; 
String y=myMethod(x); 
System.out.println(y); } } 

public class Main { static int plusMethod(int x, double y) { int z=(int)(x + y); return (z); } static double plusMethod(double x, double y) { return x + y; } public static void main(String[] args) { int myNum1 = plusMethod(8, 5); System.out.println("int: " + myNum1); double myNum2 = plusMethod(4.3, 6.26); System.out.println("double: " + myNum2); } } 

public class Main { public static void main(String[] args) { int result = topla(10); System.out.println("10 toplama değeri = "+result); } public static int topla(int k) { if (k > 1) { return k + topla(k - 1); } else { return 0; } } } 

public class Main { public static void main(String[] args) { int result = faktoryel(5); System.out.println("10 faktoryel değeri = "+result); } public static int faktoryel(int k) { if (k > 1) { return k * faktoryel(k - 1); } else { return 1; } } }

import java.util.Scanner; class Main { public static void main(String args[]) { Scanner giris= new Scanner (System.in); System.out.print("Lütfen Gün Değerini Giriniz= "); String day = giris.nextLine(); System.out.println(day.toUpperCase()); switch (day.toLowerCase()) { case "monday": System.out.println(1); break; case "tuesday": System.out.println(2); break; case "wednesday": System.out.println(3); break; case "thursday": System.out.println(4); break; case "friday": System.out.println(5); break; case "saturday": System.out.println(6); break; case "sunday": System.out.println(7); break; default: System.out.println("Haftanın 7 günü var, lütfen gün olarak girdiğiniz değeri kontrol ediniz"); } System.out.println("Kontrol Bitti"); } }
