/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio14;

import java.util.Scanner;

/**
 *
 * @author leona
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ListaCompras lista = new ListaCompras();
        String nomeProduto;
        double valor;
        int quant;
    
        for(int i = 0; i < 2; i++){

            System.out.println("Digite o nome do produto: ");
            nomeProduto = input.next();
            
            System.out.println("Digite o preço do produto: ");
            valor = input.nextDouble();
            
            System.out.println("Digite a quantidade comprada: ");
            quant = input.nextInt();
            
            Produto p = new Produto(nomeProduto, valor, quant);
            lista.insere(p);

        }
        
        System.out.println(lista.busca("mouse"));
        
        lista.imprimeLista();
        
        lista.remove("teclado");
        
        lista.calculoTotal();
        
        lista.limpaLista();
        
        lista.imprimeLista();
        
        
    }

    
    
}
