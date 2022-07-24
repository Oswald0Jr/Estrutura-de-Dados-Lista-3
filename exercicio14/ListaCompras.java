/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio14;

/**
 *
 * @author leona
 */
public class ListaCompras extends ListaEstatica {
    
    Produto lista[] = new Produto[3];
    int ultimo = -1;
    
    @Override
    public void insere(Produto p){
        
        if(ultimo < 12){
            
            ultimo++;
            lista[ultimo] = p;
            System.out.println("Elemento inserido com sucesso!");
            
        }else{
            
            System.out.println("Houve um erro, tente novamente");
            
        }
        
    }
    
    @Override
    public void limpaLista(){
        
        for(int i =0; i < ultimo; i++){
            
            lista[i] = null;
            
        }
        
    }
    
    @Override
    public String busca(String n){
        
        for(int i =0; i < ultimo; i++){
            
            if(lista[i].nomeProduto.contains(n)){
                
                return lista[i].toString();
                
            }
            
        }
        return null;
        
    }
    
    @Override
    public void remove(String n){
        
        for(int i =0; i < ultimo; i++){
            
            if(lista[i].nomeProduto.contains(n)){
                
               lista[i] = null;
                
            }
            lista[i] = lista[i+1];
            
        }
        
        
    }
    
    @Override
    public void imprimeLista(){
        
        for(int i = 0; i < 2; i++){
            
            if(lista[i] == null){
                
                System.out.println("Lista vazia ");
                break;
            }
            System.out.println("Elemento "+i+" : "+lista[i].toString());
            
        }
        
    }
    
    public void calculoTotal(){
        
        //double totalPProduto=0;
        double somaTotal=0;
        
        for(int i = 0; i < 2; i++){
            
            double totalPProduto=0;
            totalPProduto = totalPProduto + (lista[i].quantidade * lista[i].valor);
            System.out.println(" "+lista[i].valor +" "+" "+ lista[i].quantidade+" "+" "+totalPProduto);
            somaTotal = somaTotal + totalPProduto;
            
        }
        
        System.out.println("Valor total da compra: "+ somaTotal);
        
    }
    
}
