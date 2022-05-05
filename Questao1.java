package refaccaoprova_lp;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
    	Scanner ler = new Scanner(System.in);
        String[] cor = new String[10];
        String chave;
        int Azul=0,Vermelha=0,Verde=0;
        
        for (int i=0;i<cor.length;i++){
            System.out.println("Insira a cor da chave: ");
            chave= ler.nextLine();
            chave=chave.toUpperCase();
            cor[i]=chave;
            if(chave.equals("AZUL")){
                Azul+=1;
                System.out.println("ir para a porta Azul");
                System.out.println("----------------------");
                System.out.println(" ");

            } 
            else if (chave.equals("VERMELHA")||chave.equals("VERMELHO")) {
                Vermelha+=1;
                System.out.println("ir para a porta Vermelha");
                System.out.println("----------------------");
                System.out.println(" ");

            } else if (chave.equals("VERDE")) {
                Verde+=1;
                System.out.println("ir para a porta Verde");
                System.out.println("----------------------");
                System.out.println(" ");

            }else{
                System.out.println("Procurar novamente");
                System.out.println("----------------------");
                System.out.println(" ");
            }
        }
        System.out.println("Quantidade de pessoas com a chave azul: "+Azul);
        System.out.println("Quantidade de pessoas com a chave vermelha: "+Vermelha);
        System.out.println("Quantidade de pessoas com a chave verde: "+Verde);
    }
}