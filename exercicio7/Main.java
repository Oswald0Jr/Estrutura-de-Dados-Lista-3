/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio7;

import java.util.Scanner;

/**
 *
 * @author leona
 */
        

public class Main {
    
    /*
    
    Pergunta: Sobre a estrutura de dados do tipo LISTA:
    a) quais são os ponteiros necessários para manipular uma lista?
    Há dois tipos de lista, as estáticas e as dinâmicas. Nas estáticas é necessário manipular os ponteiros de controle
    Já na lista dinâmica, é utilizado alocação dinâmica de memoria
    
    b) Quais são as operações básicas de uma lista?
    Inserção, listagem, busca, alteração, exclusão e limpar lista
    
    c) Como é realizada a operação de inserção em uma lista estática?
    Assim como em uma lista de compras comum, o primeiro elemento inserido, é o primeiro da lista, e conforme é inserido vai sendo colocado
    no final da lista
    */
  
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Integer lista[] = new Integer[5];
        
        System.out.println("Digite o proximo numero da lista");
        int item = input.nextInt();
        
        int ponteiroFinal = -1;
        if(ponteiroFinal < lista.length-1){
            
            ponteiroFinal++;
            lista[ponteiroFinal] = item;
            System.out.println("Item inserido com sucesso!");
            
            /*
            Exibe a lista
            for(int i = 0; i < lista.length; i++)
            System.out.println(lista[i]);
            */
            
        }else{
            
            System.out.println("Houve um erro, tente novamente");
            
        }
        
    }
    
    /*
    d)O que é um Nó?
    É um elemento de uma lista encadeada
    
    */
    
}
