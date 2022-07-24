/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio12;

/**
 *
 * @author leona
 */
public class Pilha {
    
    No pilha[];
    int tam;
    int topo = -1;
    
    
    public Pilha(int tam){
        
        pilha = new No[tam];
        this.tam = tam;
        
    }
    
    
    //push
    public void empilha(No n){
        if(topo == -1 || topo < (this.tam-1)){
            
            topo++;
            pilha[topo] = n;
            System.out.println("Inserido com sucesso!");
            
        }else{
            
            System.out.println("Pilha esta cheia!");
            
        }      
        
    }
    
    //pop
    public void desempilha(){
        if(topo != -1){
            pilha[topo] = null;
            topo--;
            System.out.println("Removido com sucesso!");
            
        }else{
            
            System.out.println("Pilha esta vazia!");
            
        }      
        
    }
    
    public void imprime(){
        for(int i = this.topo; i > 0; i--) {
            System.out.println(i+" - " +pilha[i].tostring());
        }
    }
    
}
