package com.exercicio;

public class Horario {

    public static void Mensagem(int hora){
        switch (hora) {
            case 5, 6, 7, 8, 9, 10, 11, 12 -> System.out.println("Bom dia");
            case 13, 14, 15, 16, 17, 18 -> System.out.println("Bom tarde");
            case 19, 20, 21, 22, 23 -> System.out.println("Bom noite");
            default -> System.out.println("Horario não existe");
        }

    }
}