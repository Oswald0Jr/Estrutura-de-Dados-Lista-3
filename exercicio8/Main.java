/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio8;

/**
 *
 * @author leona
 */
public class Main {
    
    public static void main(String[] args) {
        
        ListaContasBancarias lista = new ListaContasBancarias();
        
        lista.inserir(new ContaBancaria(1, "Leonardo", 555, 67, 39.00));
        
        lista.depositar(67, 555, 100);
        
        lista.sacar(67, 555, 39);
        
        System.out.println(lista.buscar("Leonardo"));
        
    }
    
}
