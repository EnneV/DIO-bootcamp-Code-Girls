package Exerc_metodo;

public class Main {

    public static void main( String[] args ) {

        //Calculadora
        System.out.println("Exercicios calculadora");

        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.divisao(7, 5);
        Calculadora.multiplicacao(5, 2.5);

        //Mensagem
        System.out.println("Exercícios Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        //Empréstimo
        System.out.println("Execícios Empréstimo");

        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);

    }
    
}
