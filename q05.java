/*
Escreva um programa Java console que solicite ao usuário que informe sua idade em anos, meses e dias, ou seja,
sua idade atual em anos e a quantidade de meses e dias decorridos desde seu aniversário. 
Seu programa deverá exibir uma saída parecida com:
Informe sua idade em anos, meses e dias 
Anos: 25 
Meses: 2
Dias: 12 
Idade expressa em dias: 9197 
Aqui o usuário tem 25 anos, 2 meses e 12 dias de idade. Assim, sua idade expressa em dias é 9.197
*/

import java.util.Scanner;

class q05{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a sua idade em anos: ");
        int anos = ler.nextInt();
        System.out.println("Digite a sua idade em meses: ");
        int meses = ler.nextInt();
        System.out.println("Digite a sua idade em dias: ");
        int dias = ler.nextInt();
        
        int diasTotal= (anos*365) + (meses*30) + dias;

        System.out.println("\n\nAqui o usuário tem "+anos+" anos, "+meses+" meses e "+dias+" dias de idade. Assim, sua idade expressa em dias é "+diasTotal);

    }
} 