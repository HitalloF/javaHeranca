public class Futball  extends Pessoa{

    private int  tamanhoChuteira = 40;

    public int getTamanhoChuteira() {
        return tamanhoChuteira;
    }

    public void setTamanhoChuteira(int tamanhoChuteira) {
        this.tamanhoChuteira = tamanhoChuteira;
    }

    public void chutar(){
        System.out.println("[Jogador]: Chutou");
    }

    @Override
    public void correr(){
        System.out.println("[jogador]: Correu");
    }
}

