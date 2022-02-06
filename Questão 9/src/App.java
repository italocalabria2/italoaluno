import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int n;
        Scanner input = new Scanner(System.in);
        
       
        n = input.nextInt();
        input.nextLine();
        
        String[] nomes = new String[n];
        double[] salario = new double[n];

        for(int i=0; i<n; i++){
            System.out.println("Coloque os dados do funcionario " + (i+1));
            
            System.out.print("Nome: ");
            nomes[i] = input.nextLine();

            System.out.print("Salario: ");
            salario[i] = input.nextDouble();
            input.nextLine(); 
        }

        System.out.println("");
        System.out.println("------ REGISTRO DE SALARIOS ------"); 

        for(int i=0; i<n; i++){

            double ajuste;

            System.out.println("Funcionario: " + nomes[i] ); 
            System.out.println("Salario: " + salario[i]);

            if(salario[i] >= 2000.0) {
                ajuste = (-1.0)*0.1*salario[i];
                System.out.println("Desconto: " + (-1.0)*ajuste);
            } else if( salario[i] > 1000 ){
                ajuste = 0.1*salario[i];
                System.out.println("Bonus: " + ajuste);
            }else {
                ajuste = 0.2*salario[i];
                System.out.println("Bonus " + ajuste);
            }

            System.out.println( "Salario Liquido: " + (salario[i] + ajuste) );
            System.out.println("");
        }


        input.close();
    }
}
