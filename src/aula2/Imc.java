package aula2;

import java.util.Scanner;

public class Imc {

    public static void main(String[] args) {
        //PRIMEIRA PARTE DO PROGRAMA ABAIXO:
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        int peso = leitor.nextInt();
        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();

        double imc;

        imc= peso / (altura * altura);

        System.out.println(imc);

        //CÁLCULO DO IMC ABAIXO:
        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }else if (imc > 18.6 && imc < 24.9){
            System.out.println("Peso ideal! PARABÉNS!");
        } else if (imc > 25.0 && imc < 29.9){
            System.out.println("Levemente acima do peso");
        } else if (imc > 30.0 && imc < 34.0 ){
            System.out.println("Obesidade Grau 1");
        } else if (imc > 35.0 && imc < 39.9){
            System.out.println("Obesidade Grau 2 (SEVERA)");
        } else{
            System.out.println("Acima do peso! OBESIDADE MÓRBIDA");
        }

    }

}
