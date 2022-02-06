import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        String user;
        Scanner input = new Scanner(System.in);
        int acertos = 0, erros =0;

        System.out.println("------ Quiz de Perguntas ------");
        System.out.print("> Digite seu user: ");
        user = input.next();

       
        String[] perguntas = new String[10];
        String[] respostas = new String[10];
        
        perguntas[0] = "2*3 + 5*6 = 36 ?"; // s
        respostas[0] = "s";

        perguntas[1] = "8*5 + 3 = 53 ?"; // n
        respostas[1] = "n";

        perguntas[2] = "2*5 + 3*2 = 26? "; //s
        respostas[2] = "s";

        perguntas[3] = "5*5 + 10 = 40?"; //n
        respostas[3] = "n";

        perguntas[4] = "7*11*13 = 1001 ?"; // s
        respostas[4] = "s";

        perguntas[5] = " 2 + 2*2 + 4*2 + 4*4 = 32 ?"; //n
        respostas[5] = "n";

        perguntas[6] = " 2.5 * 3.7 = 8.14"; // s
        respostas[6] = "s";

        perguntas[7] = "6*7 + 8*7 = 98 ?"; // s
        respostas[7] = "s";

        perguntas[8] = "pi = 3,5? "; // n
        respostas[8] = "n";

        perguntas[9] = "10*6 + 2*2 = 64?"; // s
        respostas[9] = "s";


        for(int i=0; i<10; i++){
            String option;

            System.out.println("Pergunta numero #" + (i+1) );
            System.out.println(perguntas[i]);
            System.out.print("responda com (s/n): ");
            option = input.next();

            if( option.equals(respostas[i]) ) acertos++;
            else erros++;
        }

        System.out.println("------------------");
        System.out.println("Usuario: " + user);
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);

        
        input.close();
    }
}
