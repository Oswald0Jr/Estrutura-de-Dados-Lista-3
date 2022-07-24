/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio13;

/**
 *
 * @author leona
 */
public class Main {
    
    /*
    
        Tomando como base uma estrutura de dados do tipo FILA, responda as
        seguintes questões:
        a. Quais são os ponteiros para a manipulação de uma fila e descreva a
        utilidade de cada um deles;
        Na fila a inserção é feita no fim e ea remoção é feita do início, no caso possui dois ponteiros, um que indica o final
        e outro que indica o início
    
        b. Como funciona o procedimento de retirada de um elemento de uma fila? E a
        inserção? Esboce o método de inserção e remoção;
    
        Assim como uma fila de banco, o primeiro a chegar será atendido primeiro, logo sairá antes, e o ultimo a chegar
    foi inserido por ultimo, logo sairá depois:
            -----------
           |  1  |  2  |
            -----------
            Ponteiro inicial está no 1
            Ponteiro final está no 2
            -------------
           |  ~1~  |  2  |
            -------------
            -------------
           |  2  |  null  |
            -------------
            Ao retirar o 1, move-se todos os itens para a esquerda
    
    */
    //c. Dado uma estrutura de pilha pré-definida, faça um procedimento para imprimir uma
    //fila;
    
    public static void main(String[] args) {
        
        Fila fi = new Fila(4);
        
        for (int i = 0; i < 5; i++) {
            No n = new No("i: "+i,i);
            fi.inserir(n);
        }
        fi.remover();
        fi.imprime();
                
               
    }
    
}
