package entities;

public class PessoaJuridica extends Contribuinte{
    protected int quantidadeFuncionarios;

    public PessoaJuridica() {

    }

    public PessoaJuridica(String nome, Double rendaAnual, int quantidadeFuncionarios) {
        super(nome, rendaAnual);
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    @Override
    public double calculaImposto() {
        Double impostoFinal = 0.0;
        if(quantidadeFuncionarios <= 10) {
            impostoFinal = getRendaAnual() * 0.16;
        } else {
            impostoFinal = getRendaAnual() * 0.14;
        }
        return impostoFinal;
    }
}
