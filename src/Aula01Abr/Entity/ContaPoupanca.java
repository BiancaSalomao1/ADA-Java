package Aula01Abr.Entity;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta {
public ContaPoupanca() {
    }

    public ContaPoupanca(int numeroBanco, int numeroAgencia, int numeroConta, String nomeTitular, String CPF, String email, BigDecimal saldo) {
        super(numeroBanco, numeroAgencia, numeroConta, nomeTitular, CPF, email, saldo);
    }



        public BigDecimal sacar(BigDecimal valor) {
            BigDecimal taxa = new BigDecimal("0.01");
            BigDecimal valorTotalComTaxa = valor.add(taxa);

            if (this.getSaldo().compareTo(valorTotalComTaxa) >= 0) {
                this.setSaldo(this.getSaldo().subtract(valorTotalComTaxa));
                return this.getSaldo();
            } else {
                System.out.println("Saldo insuficiente para saque (incluindo taxa de 0.01).");
                return this.getSaldo();
            }
        }
    }


