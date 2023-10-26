//Elabore um programa que leia um número (1 a 9) e imprima a tabuada desse número.

import java.util.Scanner;

class q01{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número de '1' a '9': ");
        int n = ler.nextInt();

        for(int i=1;i<11;i++){
            int tab = i*n;
            System.out.println(i+"*"+n+"="+tab);
        }
    }
} 