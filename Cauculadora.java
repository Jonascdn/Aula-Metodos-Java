package com.exercicio;

public class Cauculadora {

    public static void soma (double num1, double num2) {

        double result = num1 + num2;

        System.out.println("O resultado da soma do " + num1 + " mais o " + num2 + " é: " + result);
    }
    public static void divi (double num1, double num2) {

        double result = num1 / num2;

        System.out.println("O resultado da divisão do " + num1 + " mais o " + num2 + " é: " + result);
    }
    public static void mult (double num1, double num2) {

        double result = num1 * num2;

        System.out.println("O resultado da multiplicação do " + num1 + " mais o " + num2 + " é: " + result);
    }
    public static void sub (double num1, double num2) {

        double result = num1 - num2;

        System.out.println("O resultado da subtração do " + num1 + " mais o " + num2 + " é: " + result);
    }
}


// OUTRA FORMA DE SE FAZER A CAUCULADORA
    /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.println("Escolha o 1º numero: ");
        num1 = scan.nextInt();
        System.out.println("Escolha o o 2 numero: ");
        num2 = scan.nextInt();

        System.out.println("o Valor da soma é: " + somar( num1, num2));
        System.out.println("o Valor da divisão é: " + dividir( num1, num2));
        System.out.println("o Valor da subtrção é: " + subtrair( num1, num2));
        System.out.println("o Valor da multiplicação é: " + mult( num1, num2));
    }
    public static int somar(int num1, int num2) {
        return num1 + num2;
    }
    public static int dividir(int num1, int num2) {
         return num1 / num2;
    }
    public static int subtrair(int num1, int num2) {
         return num1 - num2;
    }
    public static int mult(int num1, int num2) {
         return num1 * num2;
    }

*/


