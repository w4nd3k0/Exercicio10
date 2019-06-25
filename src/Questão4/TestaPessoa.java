/* 4. Crie uma classe que se chama TestaPessoa que contenha o main. Nela
crie uma pessoa e faça tratamento da exceção. Dentro do catch exiba a
mensagem de erro.  */
package Questão4;

import Questão1.Pessoa;
import Questão2.IdadeInvalidaException;

/**
 *
 * @author ifnmg
 */
public class TestaPessoa {
    
    public static void main(String[] args){
        
        try{
            Pessoa p1 = new Pessoa("Anselmo", -5);
        }
        catch (IdadeInvalidaException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
