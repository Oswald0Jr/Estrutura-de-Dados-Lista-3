/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio13;

/**
 *
 * @author leona
 */
public class Fila {
    
    No fila[];
    int tam = 10;
    int comeco = -1;
    int fim =-1;
    
    
    public Fila(int tam){
        
        this.fila = new No[tam];
        this.tam = tam;
        
    }
    
    public void inserir(No n){
        
        if(comeco == -1){
            
            comeco = 0;
            fim = 0;
            fila[fim] = n;
            System.out.println("Elemento inserido com sucesso!");
            
        }
        else if(fim < (tam-1)){
            
            fim++;
            fila[fim] = n;
            System.out.println("Elemento inserido com sucesso!");
            
        }
        else{
            
            System.out.println("Houve um erro, tente novamente");
            
        }
        
    }
    
    public void remover(){
        
        if(comeco != -1){
            
            for(int i = comeco; i < fim; i++){
                
                fila[i] = fila[i+1];
                
            }
            fila[fim] = null;
            fim--;
            System.out.println("Elemento removido com sucesso!");
            
        }
        else{
            
            System.out.println("Lista vazia");
            
        }
        
    }
    
    public void imprime(){
        for (int i = this.comeco; i <= this.fim; i++) {
            System.out.println(i+" - " +fila[i].tostring());
        }
    }
     
}


