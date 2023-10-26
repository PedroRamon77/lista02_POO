/*Faça um programa que:
  - Leia a cotação do dólar
  - Leia um valor em dólares
  - Converta esse valor para Real
  - Mostre o resultado
*/

import java.util.Scanner;

class q04{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a cotação do dolar: ");
        float dolar = ler.nextFloat();
        System.out.println("Digite o valor em dolar: ");
        float valorDolar = ler.nextFloat();

        float valorReal = dolar * valorDolar;

        System.out.println("\n\nCotação do dolar: "+dolar+"\nValor em dolar: "+valorDolar+"\nValor em real: "+valorReal);

    }
} 