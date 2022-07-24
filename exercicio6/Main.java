/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio6;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Main {
    
    public static void main(String[] args) {

        int somaLinha4=0, somaColuna2=0, somaDiagonalPrincipal=0, somaDiagonalSecundaria=0, somaTotal=0;
        Scanner input =  new Scanner(System.in);
        Integer mat[][] = new Integer[5][5];
        
        System.out.println("Preencha a matriz");
        for(int i = 0; i<5; i++){
            
            for(int j = 0; j<5; j++){
                
                mat[i][j] = input.nextInt();
                
            }
            
        }
        
        for(int i = 0; i<5; i++){
            
            for(int j = 0; j<5; j++){
                
                if(i == 4){
                    
                    somaLinha4 = somaLinha4 + mat[i][j];
                    
                }
                
                if(j == 2){
                    
                    somaColuna2 = somaColuna2 + mat[i][j];
                    
                }
                
                somaTotal = somaTotal + mat[i][j];
                
            }
            somaDiagonalPrincipal = somaDiagonalPrincipal + mat[i][i];
            
        }
        
        for(int i = 4; i>=0; i--){
  
            somaDiagonalSecundaria = somaDiagonalSecundaria + mat[i][i];
            
        }
        
        System.out.println("Matriz: ");
        for(int i = 0; i<5; i++){
            
            for(int j = 0; j<5; j++){
                
                System.out.print(mat[i][j]);
                
            }
            System.out.println();
            
        }
        
        System.out.println("Soma dos elementos da linha 4: "+ somaLinha4);
        System.out.println("Soma dos elementos da coluna 2: "+ somaColuna2);
        System.out.println("Soma dos elementos da diagonal principal: "+ somaDiagonalPrincipal);
        System.out.println("Soma dos elementos da diagonal secundaria: "+ somaDiagonalSecundaria);
        System.out.println("Soma total dos elementos da matriz: "+ somaTotal);
        
        
        
    }
    
}
