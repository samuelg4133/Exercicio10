public abstract class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws IdadeInvalidaException {
        this.setNome(nome);
        this.setIdade(idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) throws IdadeInvalidaException {
        
        if(idade<0){
        throw new IdadeInvalidaException("Idade Inválida");
        }
        this.idade = idade;
    }
    
    
}
