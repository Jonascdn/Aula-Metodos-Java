package com.exercicio;

public class Main {

    public static void main(String[] args) {
        // Cauculadora
        System.out.println("Exercicio cauculadora");
        Cauculadora.soma(7, 12);
        Cauculadora.divi(12, 3);
        Cauculadora.sub(20, 3);
        Cauculadora.mult(18, 5);

        // Mensagem // Horario
        System.out.println("Exercicio de mensagem");
        Horario.Mensagem(16);
        Horario.Mensagem(20);
        Horario.Mensagem(12);
        Horario.Mensagem(1);

        //Emprestimo
        System.out.println("Exercicio de emprestimo");
        Emprestimo.caucualar(1000, Emprestimo.getDuasParcelas());
        Emprestimo.caucualar(1000, Emprestimo.getTresParcelas());
        Emprestimo.caucualar(1000, 5);


    }
}
