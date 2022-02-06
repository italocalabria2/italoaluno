import java.time.LocalTime;
import java.util.Scanner;

public class questao8 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final String usuarioCorreto = "usuario";
		final String senhaCorreta = "12345";
		
		String usuario = "";
		String senha = "";
		int hora = 0;
		
		do {
			System.out.print("informe o usuario: ");
			usuario = input.nextLine();
            if (!usuario.equals(usuarioCorreto))
            	System.out.println("erro: usuario nao localizado");
            }while (!usuario.equals(usuarioCorreto));
		
		do {
			System.out.print("Informe a senha: ");
			senha = input.nextLine();
			
			if (!senha.equals(senhaCorreta))
				System.out.println("erro: senha não localizada");
			} while (!senha.equals(senhaCorreta));
		
		LocalTime horatime = LocalTime.now();

        if (horatime.getHour() < 12) {
        	System.out.println("Bom dia, acesso permitido.");
        } else if (horatime.getHour() < 18) {
        	System.out.println("Boa tarde, acesso permitido");
        } else { 
        	System.out.println("Boa noite, acesso permitido");
        }
		
		
	}
}
