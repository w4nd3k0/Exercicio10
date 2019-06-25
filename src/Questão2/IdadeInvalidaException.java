/* 2. Crie uma exceção chamada IdadeInvalidaException */

package Questão2;

/**
 *
 * @author ifnmg
 */
public class IdadeInvalidaException extends Exception{
    
    public IdadeInvalidaException(String i){
        super(i);
    }
}
