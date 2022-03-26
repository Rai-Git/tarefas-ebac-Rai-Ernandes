import jdk.swing.interop.SwingInterOpUtils;
import java.net.SocketTimeoutException;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;

public class Ser
{
    public static void main(String[] args)
    {
        Scanner leitura = new Scanner(System.in);
        Metodo metodo = new Metodo();
        Queue<String> lista = new PriorityQueue<String>();

        System.out.println("Deseja cadastrar um nome?");
        System.out.println("SIM / NÃO");
        String comando = leitura.next();
        while(comando.equalsIgnoreCase("sim"))
        {
            System.out.print("Por favor, digite o nome: ");
            metodo.setNome(leitura.next());
            lista.add(metodo.getNome());
            System.out.print("Digite o sexo: ");
            metodo.setSexo(leitura.next());
            lista.add(metodo.getSexo());
            System.out.println("************************");
            System.out.println("Deseja cadastrar mais algum nome?");
            comando = leitura.next();
        }
        System.out.println("Deseja ver a lista?");
        comando = leitura.next();
        if (comando == "sim")
        {
            for(String recebe:lista)
            {
                System.out.println(recebe);
            }

        }

    }
}
