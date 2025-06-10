package ExerciciosE1;

import java.util.Scanner;

public class LoginSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite sua senha: ");
        String senha = sc.nextLine();

        System.out.print("Tentativa login: ");
        String tentativaLogin = sc.nextLine();

        if(tentativaLogin.equals(senha)){
            System.out.println("Login efetuado com sucesso!");
        } else{
            System.out.println("Login incorreto!");
        }

    }
}
