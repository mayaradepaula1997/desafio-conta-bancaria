import java.util.Scanner;

public class ContaBancaria {


    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int opcoes = 0;
        int contador = 0;
        double saldo = 2500;
        double receber = 0;
        double transferir = 0;


        System.out.println("*********************");
        System.out.println("Dados Iniciais do Cliente");
        System.out.println("Nome: Mayara Silva");
        System.out.println("Tipo de conta: Corrente");
        System.out.println("Saldo inicial 2.500");
        System.out.println("*********************");


        while (opcoes != 4) {

            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");

            System.out.println("Digite a opção desejada:");
            opcoes = leitura.nextInt();
            contador++;

            if (opcoes == 1) {
                System.out.println("Seu saldo atual é de: " + saldo);

            }

            if (opcoes == 2) {
                System.out.println("Qual o valor do depositado:");
                receber = leitura.nextInt();
                saldo = saldo + receber;
                System.out.println("Seu Valor Atual: " + saldo);
            }

            if (opcoes == 3) {
                System.out.println("Qual valor voce quer transferir:");
                transferir = leitura.nextInt();

                if (transferir > saldo) {
                    System.out.println("Transação Invalida");
                } else {
                    saldo = saldo - transferir;
                    System.out.println("Seu Valor Atual " + saldo);
                }

            }

            if (opcoes == 4) {
                System.out.println("Fechando o aplicativo, ate a proxima");
            }

            if (opcoes != 1 && opcoes != 2 && opcoes != 3 && opcoes != 4) {
                System.out.println("Opção Invalida, tente novamente");
            }
        }

    }

}




