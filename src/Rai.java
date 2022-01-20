public class Rai
{
    public static void main (String args[])
    {
        //Instanciando a classe Cadastro.
        Cadastro cadastro = new Cadastro();
        //Usando o set para enviar informações.
        cadastro.setNome("Raí");
        cadastro.setIdade(30);
        cadastro.setCurso("Desenvolvedor Back-End Java");
        //Usando o get para imprimir as informações.
        System.out.println(cadastro.getNome());
        System.out.println(cadastro.getIdade());
        System.out.println(cadastro.getCurso());
        //Usando os métodos criados para imprimir.
        System.out.println("*****************");
        cadastro.imprimirNome();
        cadastro.imprimirIdade();
        cadastro.imprimirCurso();



    }
}
