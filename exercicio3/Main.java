/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio3;

/**
 *
 * @author leona
 */
public class Main {
   
    /*
   
    Pergunta: Faça um algoritmo que copie o conteúdo de um vetor em um segundo vetor.
   
    */
    
    
    public static void main(String[] args) {
        
        Integer num[] = new Integer[5];
        Integer num2[] = new Integer[5];
        //Insere dados no primeiro vetor
        for(int i = 0; i < 5; i++){
            
            num[i] = i;
            
        }
        
        //Copia os dados do primeiro vetor no segundo
        for(int j = 0; j < 5; j++){
            
            num2[j] = num[j];
            
            
        }
        
        
        for(int cont = 0; cont < 5; cont++){
            
            System.out.println(num2[cont]);
            
            
        }
        
        
        
        
    }
    
}
