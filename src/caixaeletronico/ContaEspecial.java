/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixaeletronico;

/**
 *
 * @author Padrão
 */
public class ContaEspecial extends Conta {
    
    
    private double Limite;
    
    public ContaEspecial(double saldo,double limite){
        
        super(saldo);
        this.Limite = limite;
    
    }
    
    public String verificarSaldoEspecial(){
        
        return "Saldo: " + super.verificarSaldo()+ " limite: " + this.Limite;
        
    }
    
}
