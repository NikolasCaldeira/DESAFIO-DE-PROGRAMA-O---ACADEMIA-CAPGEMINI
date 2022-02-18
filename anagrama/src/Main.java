import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra;
        int qtd, cont;

        System.out.print("Digite uma palavra:");
        palavra = ler.next();
        cont = palavra.length();
        qtd = cont;

        while(cont > 1){
            qtd = qtd * (cont -1);
            cont--;
        }
        System.out.println("A palavra forma " + qtd + " anagramas.");
    }
}
