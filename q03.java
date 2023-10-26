//Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. 
//Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média. 
//Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE. Tendo o valor da distância,
//basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12.
//O programa deve apresentar os valores da velocidade média, tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem.
//Dica: trabalhe com valores reais.

import java.util.Scanner;

class q03{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o tempo gasto em minutos: ");
        int tempo = ler.nextInt();
        System.out.println("Digite a velocidade media: ");
        int vm = ler.nextInt();

        int dist = tempo * vm;
        float litros_usados = dist / 12;

        System.out.println("\n\nVelocidade Media: "+vm+"\nTempo Gasto: "+tempo+"\nDistancia percorrida: "+dist+"\nLitros Usados: "+litros_usados);

    }
} 