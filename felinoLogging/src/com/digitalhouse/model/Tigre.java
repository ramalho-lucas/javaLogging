package com.digitalhouse.model;

import com.digitalhouse.IFelino;
import org.apache.log4j.Logger;

public class Tigre implements IFelino {

    private static final Logger logger = Logger.getLogger(Tigre.class);
    private String nome;
    private int idade;

    private boolean ehAlfa;

    public Tigre(String nome, int idade, boolean ehAlfa) {
        this.nome = nome;
        this.idade = idade;
        this.ehAlfa = ehAlfa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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


    @Override
    public void correr() {
        logger.info("O tigre " +nome+ " esta correndo ");
    }

    @Override
    public void ehMaiorQue10() throws Exception {
        if(idade > 10){
            logger.info("O tigre " +nome+ " é maior que 10 anos!");
        }
        if(idade < 0){
            logger.error("A idade não pode ser negativa!");
            throw new Exception();
        }
    }
}
