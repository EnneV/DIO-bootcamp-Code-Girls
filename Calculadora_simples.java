
import java.util.Scanner;

public class Calculadora_simples {

  public static void main(String[] args) {

    Scanner scan = new Scanner (System.in);
    
    int a, b;

    System.out.println("Digite o primeiro valor:");
    a = scan.nextInt();
    System.out.println("Digite o segundo valor:");
    b = scan.nextInt();

    int soma = soma(a,b);
    int subtracao = subtracao(a,b);
    int multiplicacao = multiplicacao(a,b);
    int divisao = divisao(a,b);

    System.out.println("Soma: " + soma);
    System.out.println("Sub: " + subtracao);
    System.out.println("Multi: " + multiplicacao);
    System.out.println("Div: " + divisao);



    
}

public static int soma (int a, int b){

    return a + b;
}
public static int subtracao (int a, int b){

    return a - b;
}

public static int divisao (int a, int b){

    return a / b;
}
    
public static int multiplicacao (int a, int b){

    return a * b;
}

}