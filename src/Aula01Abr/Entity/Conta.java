package Aula01Abr.Entity;

import java.math.BigDecimal;

public abstract class Conta {
    private int numeroBanco;
    private int numeroAgencia;
    private int numeroConta;
    private String nomeTitular;
    private String CPF;
    private String email;
    private BigDecimal saldo;



    //construtores
    public Conta() {
    }

    public Conta(int numeroBanco, int numeroAgencia, int numeroConta, String nomeTitular, String CPF, String email, BigDecimal saldo) {
        this.numeroBanco = numeroBanco;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.CPF = CPF;
        this.email = email;
        this.saldo = saldo;
    }

    public int getNumeroBanco() {
        return numeroBanco;
    }

    public void setNumeroBanco(int numeroBanco) {
        this.numeroBanco = numeroBanco;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public BigDecimal depositar( BigDecimal valor) {
        this.saldo = this.saldo.add(valor);
        return this.saldo;
    }

    public  BigDecimal sacar( ) {
        return this.saldo;
    }

    public void verificarSaldo() {
        System.out.println("Saldo atual: " + getSaldo());
    }

    @Override
    public String toString() {
        return "Conta{" +
                "numeroBanco=" + numeroBanco +
                ", numeroAgencia=" + numeroAgencia +
                ", numeroConta=" + numeroConta +
                ", nomeTitular='" + nomeTitular + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}


