package exercicioCasa;

public class conta {

    private int numeroDeConta;
    private float saldo;
    private String titularConta;

    public conta() {
    }


    public int getNumeroDeConta() {
        return numeroDeConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setNumeroDeConta(int numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public void deposito(float valor) {
        this.saldo += valor;
        // dados da conta
        System.out.println("Numero da Conta " + getNumeroDeConta());
        System.out.println("Titular da conta " + getTitularConta());

            System.out.println("Valor depositado R$" + valor);
            System.out.println("Seu saldo atual é R$" + saldo);
        }

        public void sacar ( float valor){
            if (valor > this.saldo) {
                System.out.println("você tentou sacar R$" + valor + " Saldo insuficiente, você tem na conta R$" + saldo );
            } else {
                this.saldo -= valor;
                System.out.println("Valor retirado da conta R$" + valor);
                System.out.println("Seu saldo atual é R$" + this.saldo);

            }

        }
    }
