package Encapsulamento.ValidacaoLogin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
Imagine que você está desenvolvendo um sistema de acesso para um laboratório de informática da
escola. Os estudantes precisam autenticar-se com suas credenciais pessoais, mas o sistema deve
proteger contra tentativas de adivinhação de senhas.
Crie uma classe que:

Armazene o login e a senha de forma encapsulada.
Um metodo validarSenha() que receba as credenciais digitadas e retorne se o login foi bemsucedido.
Uma lógica no arquivo principal que utilize a classe Scanner para ler o login e senha digitados,
controlando as tentativas com um loop.
Bloqueie o acesso após 3 falhas consecutivas.
Exiba mensagens informando o resultado da tentativa e quantas restam.
*/
        int count = 3;
        Scanner scanner = new Scanner(System.in);
        Aluno joao = new Aluno("aluno2025", "escola@123");

        do {
            count--;
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            joao.validarSenha(login, senha, count);
        }while(count != 0);

    }
}

