/*
Um hotel com 42 apartamentos resolveu fazer promoções para os fins de semana fora da alta temporada, isto é, nos meses de abril, maio, junho, 
agosto, setembro, outubro e novembro. A taxa da promoção é de 22% da diária normal. A ocupação média do hotel sem promoção é de 40%. 
A expectativa é aumentar a taxa de ocupação para 70%. Supondo que as expectativas se confirmem, escrever um algoritmo que lê a diária normal, 
que calcule e escreva as seguintes informações: 
(a) O valor da diária no período da promoção. 
(b) O valor médio arrecadado sem a promoção, durante um mês. 
(c) O valor médio arrecadado com a promoção, durante um mês. 
(d) O lucro ou prejuízo mensal com a promoção. 

*/

import java.util.Scanner;

class q08{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a diaria normal: ");
        double diariaNormal = ler.nextDouble();

        double diariaNormalPro = diariaNormal - (diariaNormal * 0.22);
        double valorMedio = (((42 * 40) / 100) * diariaNormal) / 30;
        double valorMedioPro = (((42 * 70) / 100) * diariaNormalPro) / 30;
        
        System.out.println("Valor da diaria da promocao: "+diariaNormalPro);
        System.out.println("Valor medio arrecadado sem a promocao: "+valorMedio);
        System.out.println("Valor medio arrecadado com a promocao: "+valorMedioPro);

        double valor = valorMedioPro - valorMedio; 
        
        if (valorMedioPro > valorMedio){
            System.out.println("Deu lucro com promocao!");
            System.out.println("Lucro: "+valor);
        }else{
            System.out.println("Deu Prejuizo com promocao!");
            System.out.println("Prejuizo: "+valor);
        }
    }
} 