/*Escreva um programa Java console que leia um número de 3 dígitos e o inverta, escrevendo o número lido e o invertido. 
Por exemplo, se o usuário informar o valor 753, seu programa deverá invertê-lo, resultando em 357. 
Seu programa deverá exibir a seguinte saída: 
Informe um valor inteiro de três dígitos: 753 
O valor original é: 753
O valor invertido é: 357 
*/


import java.util.Scanner;

class q09{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número de 3 digitos: ");
        int n = ler.nextInt();

        int centena = n / 100;
        int dezena = (n % 100)/10;
        int unidade = n % 10;

        int nInv = (unidade * 100) + (dezena * 10) + centena;

        System.out.println("O valor original é: "+n);
        System.out.println("O valor invertido é: "+nInv);
    }
} 

