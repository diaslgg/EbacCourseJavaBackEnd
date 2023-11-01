package br.com.diaslgg.modulo13;

public class PessoaFisica extends Pessoa implements PagamentoComCartao{

    private Long cpf;

    public PessoaFisica (String nome, String endereco, Long telefone, Long cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    @Override
    public void PagamentoDebito() {
        System.out.println("Pagando com cartão de débito pessoal");
    }
}
