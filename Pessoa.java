public class Pessoa {

    public class Alune{
        private String nome;

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setSobrenome(String sobrenome) {
            this.sobrenome = sobrenome;
        }

        public String getNome() {
            return nome;
        }

        public String getSobrenome() {
            return sobrenome;
        }

        private String sobrenome;
    }

    public void andar(){
        System.out.println("[PESSOA]: ANDANDO");
    }

    public void falar(){
        System.out.println("[PESSOA]: ANDANDO");
    }

    public void sorrir(){
        System.out.println("[PESSOA]: SORRINDO");
    }
    public void correr(){
        System.out.println("[PESSOA]: CORRENDO");
    }
}
