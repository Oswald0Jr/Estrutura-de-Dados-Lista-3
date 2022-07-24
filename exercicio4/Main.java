/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio4;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Main {
    
    /*
    
    Escrever um algoritmo que lê um vetor N (20) e que imprima os valores de N.
    Troque, a seguir, o 1o elemento com o último, o 2o com o penúltimo etc. até o
    10o com o 11o e escreva o vetor N assim modificado.
    
    
    */
    
    public static void main(String[] args) {
        
        
        Scanner input =  new Scanner(System.in);
        Integer vet[] = new Integer[20];
        System.out.println("Digite um vetor: ");
        
        for(int i = 0; i < 20; i++){
            
            vet[i] = input.nextInt();
            
        }
        
        /*for(int j = 0; j < 19; j++){
            
            System.out.println(vet[j]);
            
        }*/
        
        /*
        vet[0] = vet[19];
        vet[1] = vet[18];
        vet[2] = vet[17];
        vet[3] = vet[16];
        vet[4] = vet[15];
        vet[5] = vet[14];
        vet[6] = vet[13];
        vet[7] = vet[12];
        vet[8] = vet[11];
        vet[9] = vet[10];
        vet[10] = vet[9];
        vet[11] = vet[8];
        vet[12] = vet[7];
        vet[13] = vet[6];
        vet[14] = vet[5];
        vet[15] = vet[4];
        vet[16] = vet[3];
        vet[17] = vet[2];
        vet[18] = vet[1];
        vet[19] = vet[0];
        */
        
        for(int j = 0; j< 20; j++){
            
            vet[j] = vet[19-j];
            
        }
        
        for(int x = 0; x < 20; x++){
            
            System.out.println(vet[x]);
            
        }
        
      
        
    }
    
}
