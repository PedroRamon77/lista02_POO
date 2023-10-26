/*Escreva um programa Java console que receberá a duração de um evento expresso em segundos e exiba-o expresso em horas, minutos e segundos. 
Seu programa deverá exibir uma saída parecida com:
Informe a duração do evento em segundos: 3712 
Duração do evento: 01:01:52 
*/

import java.util.Scanner;

class q06{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a duração em segundos: ");
        int seg = ler.nextInt();

        int horas = seg / 3600;
        seg = seg % 3600;
        int minutos = seg / 60;
        int segundos = seg % 60;

        System.out.println("\n\nDuração do evento: "+horas+":"+minutos+":"+segundos);

    }
} 