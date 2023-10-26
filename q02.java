//Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. 
//fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus Fahrenheit
//e a variável C representa a temperatura em graus Celsius.


import java.util.Scanner;

class q02{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma temperatura em celsius: ");
        float C = ler.nextFloat();

        float F = (9*C+160)/5;

        System.out.println("Temperatura convertida em Fahrenheit: "+F);

    }
} 