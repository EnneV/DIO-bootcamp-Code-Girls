package Exerc_metodo;

public class Emprestimo {
    

    public static double getTaxasDuasParcelas() {

        return 0.3;
    }

    public static double getTaxasTresParcelas() {

        return 0.45;
    } 

    public static void calcular( double valor, int parcelas) {

        if(parcelas == 2){

            double valorFinal = valor = (valor * getTaxasDuasParcelas());

            System.out.println("Valor final do empréstimo com 2 parcelas: R$ " + valorFinal);
    
        } else if(parcelas == 3){

            double valorFinal = valor = (valor * getTaxasTresParcelas());

            System.out.println("Valor final do empréstimo com 3 parcelas: R$ " + valorFinal);

        } else {

            System.out.println("Quantidade de parcelas não aceitas");
        }
        
        
    }

}
