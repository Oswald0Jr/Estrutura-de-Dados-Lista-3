/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio8;

/**
 *
 * @author leona
 */
public class ListaContasBancarias {
    
    ContaBancaria lista[] = new ContaBancaria[10];
    int ponteiroFinal = -1;
    
    public void inserir(ContaBancaria c){
        
        if(ponteiroFinal < lista.length-1){
            
            ponteiroFinal++;
            lista[ponteiroFinal] = c;
            System.out.println("Conta inserida com sucesso!");
            
             
            //Exibe a lista
            //for(int i = 0; i < lista.length; i++)
            //System.out.println(lista[i]);
            
            
        }
        else{
            
            System.out.println("Houve um erro, tente novamente");
            
        }
        
    }
    
    public String buscar(String nome){
        for(int i = 0; i<= ponteiroFinal; i++){
            
            if(lista[i].nomeTitular.contains(nome)){
                
                return lista[i].toString();
            }
            
        }
         ///System.out.println("Conta não encontrado");
        return "Não encontrado";
    }
    
    public void depositar(int nA, int nC, double s){
        for(int i = 0; i<= ponteiroFinal; i++){
            
            if(lista[i].numeroAgencia == nA && lista[i].numeroConta == nC ){
                
                lista[i].saldoConta = lista[i].saldoConta + s;
                System.out.println("Deposito feito com sucesso");
            }
            else{
                System.out.println("Conta não encontrada");
            }
            
        }
        
    }
    
        public void sacar(int nA, int nC, double s){
        for(int i = 0; i<= ponteiroFinal; i++){
            
            if(lista[i].numeroAgencia == nA && lista[i].numeroConta == nC ){
                
                lista[i].saldoConta = lista[i].saldoConta - s;
                System.out.println("Saque feito com sucesso");
            }
            else{
                System.out.println("Conta não encontrada");
            }
            
        }
        
    }
    
    
}
