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
        String classificacao = "";

        System.out.println(imc);

        //CÁLCULO DO IMC ABAIXO/DETERMINANDO A CLASSIFICAÇÃO DO PESO DO USUÁRIO;:
        if (imc < 18.5){
            classificacao = "Abaixo do peso.";
        }else if (imc > 18.6 && imc < 25.0){
            classificacao = "Peso ideal! PARABÉNS!";
        } else if (imc > 25.0 && imc < 30.0){
            classificacao = "Levemente acima do peso";
        } else if (imc > 30.0 && imc < 35.0){
            classificacao = "Obesidade Grau 1";
        } else if (imc > 35.0 && imc < 40.0){
            classificacao = "Obesidade Grau 2 (SEVERA)";
        } else{
            classificacao = "Acima do peso! OBESIDADE MÓRBIDA";
        }
        //MENSAGEM PARA O USUÁRIO;
        String mensagem = String.format("O resultado do imc foi: %.2f. A sua classificação é: %s.", imc, classificacao);
        System.out.println(mensagem);
    }

}
