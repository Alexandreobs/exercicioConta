package exercicioCasa;

public class exercicio1 {

    public exercicio1() {
    }

    public static void main (String[] args) {

        cliente cliente1 = new cliente("Alexandre", "Silva");
        cliente cliente2 = new cliente("Camila", "Oliveira");

        // dados conta1
        conta conta1 = new conta();
        conta1.setNumeroDeConta(2323 - 2);
        conta1.setSaldo(1000);
        conta1.setTitularConta(cliente1.getNome() + " " + cliente1.getSobreNome());
        conta1.deposito(500);
        conta1.sacar(1000);
        // dados conta2
        conta conta2 = new conta();
        conta2.setNumeroDeConta(5555 - 1);
        conta2.setSaldo(1500);
        conta2.setTitularConta(cliente2.getNome() + " " + cliente2.getSobreNome());
        conta2.deposito(55);
        conta2.sacar(2000);
    }
    }















