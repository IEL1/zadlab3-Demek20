/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
    
        // 1.4
        int a = 5;
        int wynik, wynik2, wynik3;
        wynik = a>>1;
        wynik2 = a<<1;
        wynik3 = a>>>2;
        System.out.println(wynik);
        System.out.println(wynik2);
        System.out.println(wynik3);
        
        // 1.7
        if (a!=3){
            System.out.println("Bramka NOT (zaprzeczenie)");
        }
        int b = 3;
        if (!(a == 4 && b == 6)){
            System.out.println("Bramka XOR (zaprzeczenie koniunkcji)");
    }
        // 3.3 iteracyjnie
        System.out.println("Podaj liczbe potegowana ");
            Scanner liczba = new Scanner(System.in); 
            int x = liczba.nextInt();
            System.out.println("Podaj wykladnik ");
            Scanner wykladnik = new Scanner(System.in); 
            int n = wykladnik.nextInt();
            int wynik_potegowania = 1;
            for (int i = 1; i<=n; i++){
                
                wynik_potegowania = wynik_potegowania * x;
            }
            System.out.println(wynik_potegowania);
            
            // 3.3 rekurencyjnie
          System.out.println("Podaj liczbe potegowana ");
            Scanner liczba1 = new Scanner(System.in); 
            int cyfra = liczba1.nextInt();
            
            System.out.println("Podaj wykladnik ");
            Scanner wyk = new Scanner(System.in); 
            int d = wyk.nextInt();
            long wynik4;
            if (d == 0){
                System.out.println("X do N ="+1);
            }
            if (d % 2 == 1){
                wynik4 = (long) (x * Math.pow(cyfra, d-1));
                System.out.println(wynik4+"\n");
                            }
        //  char[] toCharArray()  konwertuje tekst na tablice 
    String s="Ala ma kota";
char chr[]=s.toCharArray();
for(int i=0;i<chr.length;i++){
    System.out.println(+chr[i]);
    }

// byte[] getBytes() koduje string na ciąg bitów
byte[] byt=s.getBytes();  
for(int j=0;j<byt.length;j++){  
System.out.println(byt[j]);  
} 

// boolean equals(String str) zwraca prawdę <=> argument nie jest null
      // i dane argumenty reprezentują ten sam stan logiczny
    String Str1 = "This is really not immutable!!";
      String Str2 = Str1;
      String Str3 = "This is really not immutable!!";
       String Str4 = "This IS REALLY NOT IMMUTABLE!!";
      boolean retVal;
      retVal = Str1.equals( Str2 );
      System.out.println("Returned Value = " + retVal );
      retVal = Str1.equals( Str3 );
      System.out.println("Returned Value = " + retVal );
      
      // boolean equalsIgnoreCase(String str) porównuje 2 stringi bez względu
      // na przerwy
      retVal = Str1.equalsIgnoreCase( Str4 );
      System.out.println("Returned Value = " + retVal );
      
      // int campareTo(String str) porównuje string do innego obiektu
      String str1 = "Strings are immutable";
      String str2 = "Strings are immutable";
      String str3 = "Integers are not immutable";
      int result = Str1.compareTo( Str2 );
      System.out.println(result);
      
      result = Str2.compareTo( Str3 );
      System.out.println(result+"\n");
    
      
      // int campareToIgnoreCase(String str) porównuje 2 stringi pod względem
      // leksykalnym ignorując różnice między nimi
      String str5 = "Strings are immutable";
      String str6 = "Strings are immutable";
      String str7 = "Integers are not immutable";
      
      result = str5.compareToIgnoreCase( str6 );
      System.out.println(result);

      result = str6.compareToIgnoreCase( str7 );
      System.out.println(result);

      result = str7.compareToIgnoreCase( str5 );
      System.out.println(result+"\n");
      
      // int indexOf(int i) zwraca indeks gdzie wystąpił dany znak
      String Str = "Welcome to Tutorialspoint.com";
      System.out.print("Found Index :" );
      System.out.println(Str.indexOf( 'o', 5 )+"\n");
      
      //String substring(int startString)zwraca string nr 2 będący częścią
      // stringu nr 1 ale od pewnego miejsca do końca - jeden indeks
      StringBuilder str = new StringBuilder("admin");
      System.out.println("string = " + str);
      System.out.println("substring is = " + str.substring(3));
      System.out.println("substring is = " + str.substring(1, 4)+"\n");
      
      //String substring(int startString, int stopString) - | | -
      System.out.println("string = " + str);
      System.out.println("substring is = " + str.substring(2));
      System.out.println("substring is = " + str.substring(1, 4));
      
      //String replace(char orginal, char zamiennik) zamienia znaki
      System.out.print("Return Value :" );
      System.out.println(Str.replace('o', 'T'));
      System.out.print("Return Value :" );
      System.out.println(Str.replace('l', 'D'));
      
      //String trim() (zwraca tekst bez początkowych i końcowych białych znaków)
      System.out.print("Return Value :" );
      System.out.println(Str.trim() );
      
      //String toLowerCase() zamienia litery na małe w stringu
      System.out.print("Return Value :");
      System.out.println(Str.toLowerCase());
      
      //String toUpperCase() zamienia litery na duże w stringu
      System.out.print("Return Value :");
      System.out.println(Str.toUpperCase());
      
      
//String[] split(String regex, int limit) zwraca znaki ktore sie powtarzaja
// w dwóch stringach
      for (String retval: Str.split("-", 2)) {
         System.out.println(retval);
      }
      System.out.println("");
      System.out.println("Return Value :" );
      
      for (String retval: Str.split("-", 3)) {
         System.out.println(retval);
      }
      System.out.println("");
      System.out.println("Return Value :" );
      
      for (String retval: Str.split("-", 0)) {
         System.out.println(retval);
      }
      System.out.println("");
      
      // String[] split(String regex) zwraca tablice znaków które się
      // powtarzają w dwóch stringach
      String str8 = "a d, m, i.n";
      String delimiters = "\\s+|,\\s*|\\.\\s*";
      String[] tokensVal = str8.split(delimiters);

     System.out.println("Count of tokens = " + tokensVal.length);
    
      for(String token : tokensVal) {
         System.out.print(token);
      } 
   }
   }
      
    
    
    
    
    
        
    



