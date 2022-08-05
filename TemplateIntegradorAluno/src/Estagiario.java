public class Estagiario extends Vendedor {

    public Estagiario(String nome) {
        super.nome = nome;
        super.PONTOS_POR_VENDA = 5;
    }

    @Override
    public int calcularPontos() {
        return this.vendas * PONTOS_POR_VENDA;
    }

    @Override
    public String mostrarCategoria(){
        if (calcularPontos() < 50){
            return this.nome + " é um(a) Estagiário(a) novato";
        }
        else{
        return this.nome + " é um(a) Estagiário(a) Experiente";}
        }

    @Override
    public String toString() {
        return "Estagiario{" +
                "nome='" + nome + '\'' +
                ", vendas=" + vendas +
                ", PONTOS_POR_VENDA=" + PONTOS_POR_VENDA +
                '}';
    }
}

