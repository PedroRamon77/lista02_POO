/*Escreva um programa Java console que lê um valor inteiro e simule o comportamento de um caixa eletrônico, ou seja,
calcule qual o menor número possível de notas de 100, 50, 10, 5 e 1 em que o valor a ser sacado pode ser decomposto. 
Seu programa deverá exibir uma saída parecida com: 
Informe o valor do saque (valor inteiro): 139 
O valor do saque pode ser expresso em: 
1 notas de 100 
0 notas de 50 
3 notas de 10 
1 notas de 5 
4 notas de 1 
*/

import java.util.Scanner;

class q07{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o valor do saque (valor inteiro): ");
        int valor = ler.nextInt();

        int notas100 = valor / 100;
        valor = valor % 100;
        int notas50 = valor / 50;
        valor = valor % 50;
        int notas10 = valor / 10;
        valor = valor % 10;
        int notas5 = valor / 5;
        valor = valor % 5;
        int notas1 = valor / 1;
        
        System.out.println("\n\nO valor do saque pode ser expresso em: ");
        System.out.println(notas100+" notas de 100");
        System.out.println(notas50+" notas de 50");
        System.out.println(notas10+" notas de 10");
        System.out.println(notas5+" notas de 5");
        System.out.println(notas1+" notas de 1");


    }
} 