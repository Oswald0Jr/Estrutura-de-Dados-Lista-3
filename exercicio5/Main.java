/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio5;

import java.util.Objects;
import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Main {
    
    /*
    
    Pergunta: Escrever um algoritmo que lê um vetor G (13) que é o gabarito de um teste de
    loteria esportiva, contendo os valores 1 (coluna 1) ou 2 (coluna 2) ou 3 (coluna
    do meio). Ler, a seguir, para cada apostador, o número de seu cartão e um
    vetor Resposta R (13). Verificar para cada apostador o número de acertos e
    escrever o número do apostador e seu número de acertos. Se tiver 13 acertos,
    acrescentar a mensagem: "GANHADOR, PARABENS".
    Exemplo vetor G:
    0 1 2 ... 12
    1 2 1 ... 3
    Exemplo vetor R:
    0 1 2 ... 12
    2 1 3 ... 2
    
    */
    public static void main(String[] args) {
        
        Scanner input =  new Scanner(System.in);
        Integer g[] = new Integer[13];
        Integer r[] = new Integer[13];
        int pontos=0;
        boolean error = false;
        System.out.println("Digite o resultado da loteria: ");
            for(int i = 0; i < 13; i++){

                int read = input.nextInt();
                if(read != 1 && read != 2 && read != 3){
                    error = true;
                    break;

                }

                g[i] = read;

            }

            if(error){

                System.out.println("Digite os valores corretamente! ");

            }
        

        System.out.println("Digite seu numero de loteria ");
        for(int i = 0; i < 13; i++){

            int read2 = input.nextInt();
            if(read2 != 1 && read2 != 2 && read2 != 3){
                error = true;
                break;

            }

            r[i] = read2;

        }
        if(error){

            System.out.println("Digite os valores corretamente! ");

        }


        for(int i = 0; i < 13; i++){

            if(Objects.equals(r[i], g[i])){
                pontos++;

            }

        }

        if(pontos == 13){

            System.out.println("GANHADOR, PARABENS");

        }else{

            System.out.println("Não foi dessa vez, tente na proxima");

        }
            
        
        
        
      
        
    }
    
    
}
