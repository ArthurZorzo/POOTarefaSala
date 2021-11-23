/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author IFSC
 */
public class Principal {
    public static void main(String[] args) {
        Geladeira geladeira = new Geladeira("Brastemp","11/11/2011","Cinza",11);
        Armario armario = new Armario(11,11,"Branco","11/11/2011");
        
        geladeira.imprimeDadosGeladeira();
        armario.imprimeDadosArmario();
    } 
}
