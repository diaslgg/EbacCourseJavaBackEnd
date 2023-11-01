package br.com.diaslgg.modulo13;

public class Usage {
    public static void main(String[] args) {

        Pessoa pessoaFisica = new PessoaFisica("Luis", "Rua x, nº 1", 123456L, 987654L);
        Pessoa pessoaJuridica = new PessoaJuridica("Luis Ltda", "Rua y, nº 1, cj 1",
                456789L, 1000184L, 1);

        System.out.println(pessoaFisica.getNome());
        System.out.println(pessoaJuridica.getNome());

        pessoaFisica.PagamentoDebito();
        pessoaJuridica.PagamentoDebito();
    }
}
