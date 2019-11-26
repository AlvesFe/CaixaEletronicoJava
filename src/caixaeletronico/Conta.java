/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

/**
 *
 * @author crist
 */
public class Conta {
    
    /*
    DECLARAÇÃO DO ATRIBUTOS DA CLASSE:
    */
    public String nro_conta;
    public String agencia;
    public double saldo;
    
    /*
    DECLARAÇÃO DO MÉTODO CONSTRUTOR:
    TEM QUE TER O MESMO NOME DA CLASSE;
    NÃO POSSUI NENHUM TIPO DE RETORNO, INCLUSIVE VOID
    */
    public Conta(double valor){
    
        this.saldo = valor;
    
    }
    
    
    /*
    DECLARAÇÃO DE MÉTODOS:
    */
    
    public double verificarSaldo(){
    
        //double saldo = 10000;
        return this.saldo;
        
    }
    
    public void realizarDeposito(double valor){
    
        //this.saldo = this.saldo + valor;
        this.saldo += valor;
    
    }
    
    public void realizarSaque(double valor){

    //this.saldo = this.saldo - valor;
    this.saldo -= valor;
    
    }
    
}
