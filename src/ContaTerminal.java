// Por : Brendow Cavalcante
// Data : 08/10/2023

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in).useLocale(Locale.US);

        int numeroAgencia;
        String agencia, nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da agência : ");
        numeroAgencia = scn.nextInt();

        System.out.println("Por favor, digite a agência : ");
        agencia = scn.next();

        System.out.println("Por favor, digite o nome do cliente : ");
        nomeCliente = scn.next();

        System.out.println("Por favor, digite o saldo : ");
        saldo = scn.nextDouble();

        System.out.println("Olá " + nomeCliente);
        System.out.println("obrigado por criar uma conta em nosso banco, sua agência é " + agencia);
        System.out.println("conta " + numeroAgencia + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
