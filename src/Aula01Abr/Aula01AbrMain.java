package Aula01Abr;


import Aula01Abr.Entity.ContaCorrente;
import Aula01Abr.Entity.ContaPoupanca;

import java.math.BigDecimal;
import java.util.Locale;

public class Aula01AbrMain {


    public static void main(String[] args) {

        Locale.setDefault(new Locale("pt", "BR"));


        ContaCorrente conta1 = new ContaCorrente();

        conta1.setNumeroBanco(001);
        conta1.setNumeroAgencia(1234);
        conta1.setNomeTitular("Maria");
        conta1.setCPF("123.456.789-00");
        conta1.setEmail("teste@gmail.com");
        conta1.setSaldo(BigDecimal.valueOf(1000.00));

        System.out.println("Número do Banco: " + conta1.getNumeroBanco());
        System.out.println("Número da Agência: " + conta1.getNumeroAgencia());
        System.out.println("Nome do Titular: " + conta1.getNomeTitular());
        System.out.println("CPF: " + conta1.getCPF());
        System.out.println("Email: " + conta1.getEmail());
        System.out.println("Saldo: " + conta1.getSaldo());

        BigDecimal valorSaque = BigDecimal.valueOf(100.00);

        ContaPoupanca conta2 = new ContaPoupanca(2, 5678, 8289, "Joao", "456...", "teste2@...", BigDecimal.valueOf(2000));

        ContaCorrente conta3 = new ContaCorrente(3, 563378, 828339, "Pedro", "789...", "teste3@...", BigDecimal.valueOf(2000));

        conta2.sacar(valorSaque);
        System.out.println("contas" + conta1);
        System.out.println("contas" + conta2);
        System.out.println("contas" + conta3);


    }

}
