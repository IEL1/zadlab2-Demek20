package pl.edu.ur.main;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

      
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        System.out.println("Podaj numer zadania ");
            Scanner numer = new Scanner(System.in); 
            int j = numer.nextInt();
            switch (j){
                 
                case 3:
             int [] tablica = new int [10]; 
             int i;
             for (i = 0; i < 10; i++){
                System.out.println("Podaj wyraz tablicy");
                
                Scanner wyraz_tab = new Scanner(System.in);
                int c = wyraz_tab.nextInt();
                tablica[i] = c;
                 
             
             }
        
          
            for (int y = 10; y <=0;y--){
            
            
            }
        System.out.println("wszystkie wyrazy tablicy "+Arrays.toString(tablica));
                
                
                
                break;
                
                case 4:
             
           int [] tab = new int [10]; 
           int suma = 0;
           int iloczyn = 1;
           double srednia = 1;
           int najwiekszy = tab[0];
           int najmniejszy = tab[0];
              for (int k = 0; k < 10; k++){
                System.out.println("Podaj liczbe calkowita");
                
                Scanner liczba = new Scanner(System.in);
                int b = liczba.nextInt();
                tab[k] = b;
                suma = suma + tab[k];
                iloczyn = iloczyn * tab[k];
              srednia = suma / 10;
                if (tab[k] > najwiekszy)
                    najwiekszy = tab[k];
              
                if (tab[k] < najmniejszy )
                    najmniejszy = tab[k];
              }
               
              System.out.println("suma="+suma);
              System.out.println("iloczyn="+iloczyn);
              System.out.println("srednia="+srednia);
              System.out.println("najmniejszy="+najmniejszy);
              System.out.println("najwiekszy="+najwiekszy);
                break;
                
                case 5:
           
          for(int e=20 ; e>=0; e--){
               if (e == 2 || e== 6 || e == 9 || e == 15 || e == 19){                  
                       continue;
                
            }
               
            System.out.println(e);
            }
                 
                case 6: 
            for(;;){
            System.out.println("Podaj liczbe calkowita");
            Scanner scanner = new Scanner(System.in); 
            int p = scanner.nextInt();
            if (p<0){
          break;
        }
           
           
    }
   
                break;       
                
                  
                
              
                          
               
               
               
                
                
           
    
           
                       
        }
}
}

    









