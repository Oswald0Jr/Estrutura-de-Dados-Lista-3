/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio12;

/**
 *
 * @author leona
 */
public class Main {
    
    /*
    
    Tomando como base uma estrutura de dados do tipo PILHA, responda as
    seguintes questões:
    a. Quais são os ponteiros para a manipulação de uma pilha e descreva a
    utilidade de cada um deles;
    
    Utiliza-se somente o ponteiro final para manipular a posição do ultimo elemento da pilha, qunado adicioa
    soma 1, e quando retira um elmento ele diminui em 1
    
    b. Como funciona o procedimento de retirada de um elemento de uma pilha? E
    a inserção? Esboce o método de inserção (empilha) e remoção (desempilha);
    
    Na pilha, funciona da seguinte forma: os ultimos serão os primeiros, ou seja os ultimos que foram
    inseridos serão os primeiros a serem retirados. Logo, quando se adiciona um elemento(push), o ponteiro soma +1 e se torna o topo,
    e se diminui(pop) em 1 ele desempilha
    
   
            3
            2
            1
    
            Empilha 4
            4
            3
            2
            1
    
            Desempilha
            3
            2
            1
    */
    
    //c. Dado uma estrutura de pilha pré definida, faça um procedimento para
    //imprimir uma pilha;
    
    public static void main(String[] args) {
        
        Pilha p = new Pilha(5);
        
        for (int i=0; i<5; i++){
            No n = new No("pil:"+i, i);
            p.empilha(n);
        }
        
        p.desempilha();
        
        p.imprime();

        
        
    }
    
    
}
