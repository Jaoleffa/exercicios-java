package entities;

public class PessoaFisica extends Contribuinte{
    protected double healthSpent;

    public PessoaFisica() {

    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
        super(nome, rendaAnual);
        this.healthSpent = gastoSaude;
    }

    public double getHealthSpent() {
        return healthSpent;
    }

    public void setHealthSpent(double healthSpent) {
        this.healthSpent = healthSpent;
    }

    @Override
    public double calculaImposto() {
        double impostoFinal = 0;
        if(this.rendaAnual < 20000.00) {
            impostoFinal = getRendaAnual() * 0.15;
        } else if (this.rendaAnual > 20000.00) {
            impostoFinal = getRendaAnual() * 0.25;
        }
        if(healthSpent > 0) {
            this.healthSpent = getHealthSpent() * 0.5;
            impostoFinal -= getHealthSpent();
        }
        return impostoFinal;
    }
}
