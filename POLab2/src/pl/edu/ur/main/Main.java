package pl.edu.ur.main;

import java.util.Scanner;

/**
 *
 * @author marcin
 */
public class Main {

      
    public static void main(String[] args) {
        System.out.println("Podaj numer zadania (5 lub 6)");
            Scanner numer = new Scanner(System.in); 
            int j = numer.nextInt();
            switch (j){
                case 6: 
            for(;;){
            System.out.println("Podaj liczbe calkowita");
            Scanner scanner = new Scanner(System.in); 
            int i = scanner.nextInt();
            if (i<0){
           break;
        }
           
           
    }
    break;
            case 5:
            
            for(int k=20 ; k>=0; k--){
               if (k == 2 || k== 6 || k == 9 || k == 15 || k == 19){
                  continue;
                
            }
               
            System.out.println(k);
            }
           break;
            
}
}
}

