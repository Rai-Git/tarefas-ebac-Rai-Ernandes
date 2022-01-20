public class Cadastro {
    private String nome;
    private int idade;
    private String curso;

    //Criando métodos get e set para variáveis nome, idade, curso.

    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public int getIdade()
    {
        return idade;
    }
    public void setIdade(int idade)
    {
        this.idade = idade;
    }
    public String getCurso()
    {
        return curso;
    }
    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    //Ciando metodos para imprimir as informações.
    public void imprimirNome()
    {
        System.out.println(this.nome);
    }
    public void imprimirIdade()
    {
        System.out.println(this.idade);
    }
    public void imprimirCurso()
    {
        System.out.println(this.curso);
    }
}
