import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n; //Tamanho da escada
        int i;
        List<String> escada = new ArrayList<>();
        String number;

        //Entrada do valor númerico para definir o tamanho da escada
        System.out.print("Digite o tamanho da escada: ");
        number = ler.next();

        //Verifica se esse valor digitado é um número ou letra, caso seja letra, pede para informar um valor númerico válido
        while(number.matches("[A-Z]*") || number.matches("[a-z]*")){
            System.out.print("Tamanho inválido, digite novamente o tamanho da escada: ");
            number = ler.next();
        }

        //Verifica se esse valor digitado é um número ou um caractere, caso seja caractere, pede para informar um valor númerico válido
        while(!number.matches("[1-9]*")){
            System.out.print("Tamanho inválido, digite novamente o tamanho da escada: ");
            number = ler.next();
        }

        n = Integer.parseInt(number);
        for (i = 0; i < n; i++) {
            escada.add(" ".repeat(n - i) + "*".repeat(i + 1));
        }
        for (String d : escada) {
            System.out.println(d);
        }
    }
}
