package br.com.diaslgg.modulo13;

public class PessoaJuridica extends Pessoa implements PagamentoComCartao{

    private Long cnpj;

    private Integer numeroDeSocios;

    public PessoaJuridica (String nome, String endereco, Long telefone, Long cnpj, Integer numeroDeSocios) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.numeroDeSocios = numeroDeSocios;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getNumeroDeSocios() {
        return numeroDeSocios;
    }

    public void setNumeroDeSocios(Integer numeroDeSocios) {
        this.numeroDeSocios = numeroDeSocios;
    }

    @Override
    public void PagamentoDebito() {
        System.out.println("Pagando com cartão de débito empresarial");
    }
}
