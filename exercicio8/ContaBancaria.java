/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lista1.exercicio8;

/**
 *
 * @author leona
 */
public class ContaBancaria {
    
    int id;
    String nomeTitular;
    int numeroConta;
    int numeroAgencia;
    double saldoConta;
    
    public ContaBancaria(int i, String n, int nC, int nA, double s){
    
        this.id = i;
        this.nomeTitular = n;
        this.numeroConta = nC;
        this.numeroAgencia = nA;
        this.saldoConta = s;
    
    }
    
    public String toString(){
        return "Nome: "+this.nomeTitular+" Numero da Agência: "+this.numeroAgencia+" Numero da Conta: "+this.numeroConta+" Saldo total: "+this.saldoConta;
    }
    
}
