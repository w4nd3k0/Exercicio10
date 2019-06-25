/*1. Crie uma classe Pessoa. Atributos: nome e idade. Crie um construtor.
Crie os gets e sets. */

package Questão1;

import Questão2.IdadeInvalidaException;

/**
 *
 * @author ifnmg
 */
public class Pessoa {
    
    private String Nome;
    private int Idade;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) throws IdadeInvalidaException{
        
        if(Idade < 0){
            throw new IdadeInvalidaException("Idade não pode ser menor que 0");
        }
        this.Idade = Idade;
    }

    public Pessoa(String n, int i) throws IdadeInvalidaException{
        this.setNome(n);
        this.setIdade(i);
    } 
}
    