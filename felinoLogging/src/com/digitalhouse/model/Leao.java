package com.digitalhouse.model;

import com.digitalhouse.IFelino;
import org.apache.log4j.Logger;

public class Leao implements IFelino {

    private static final Logger logger = Logger.getLogger(Leao.class);

    private String nome;
    private int idade;

    private boolean ehAlfa;

    public Leao(String nome, int idade, boolean ehAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.ehAlfa = ehAlfa;
    }



    public boolean isEhAlfa() {
        return ehAlfa;
    }

    public void setEhAlfa(boolean ehAlfa) {
        this.ehAlfa = ehAlfa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public void correr() {
        logger.info("O leao " +nome+ " esta correndo ");
    }
    @Override
    public void ehMaiorQue10() throws Exception {
        if(idade > 10 && isEhAlfa()){
            logger.info("O leão " +nome+ " é maior que 10 anos!");
        }
        if(idade < 0){
            logger.error("A idade não pode ser menor que 0!");
            throw new Exception();
        }
    }
}
