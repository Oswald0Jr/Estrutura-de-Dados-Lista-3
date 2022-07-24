/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio14;

/**
 *
 * @author leona
 */
public class Produto {
    
    String nomeProduto;
    double valor;
    int quantidade;
    
    public Produto(String n, double v, int q){
        
        this.nomeProduto = n;
        this.valor = v;
        this.quantidade = q;
        
    }
    
    @Override
    public String toString(){
        
        return "Nome do produto: "+this.nomeProduto+" Preço: "+this.valor+" Quantidade: "+this.quantidade;
    
    }
        
    
}
