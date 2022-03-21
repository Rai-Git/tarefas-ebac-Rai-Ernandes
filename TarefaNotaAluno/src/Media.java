import java.util.Scanner;
public class Media
{
    public static void main(String args[]) {
        Nota valor = new Nota();
        Scanner digite = new Scanner(System.in);
        System.out.println("Por favor digite as quatro notas do aluno!");
        //Esse código recebe as notas e faz a divisão da média.
        Double a = 0.0;
        for (int i = 0; i < 4; i++)
        {
            a = a + digite.nextDouble();
        }
        valor.setProva(a/4);
        System.out.println("A media do aluno é: " + valor.getProva());
        //Aqui o código verifica a condição para aprovar, reprovar e recuperação.
        if(valor.getProva() >= 7)
        {
            System.out.println("O aluno está aprovado!");
        }
        else if(valor.getProva() >= 5)
        {
            System.out.println("O aluno está em recuperação!");
        }
        else
        {
            System.out.println("O aluno está reprovado");
        }
    }
}
