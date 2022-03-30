import jdk.swing.interop.SwingInterOpUtils;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

public class Ser
{
    public static void main(String[] args)

    {


            //Metodo metodo = new Metodo() (Metodo cancelado);

            Scanner ler = new Scanner(System.in);
            Queue<String> nomemasculino = new PriorityQueue<String>();
            List<String> nomefeminino = new LinkedList<String>();
            String comando;
            String recebenome;
            int escolha;

           do {
               //Recebendo os valores.
               System.out.println("Por favor digite o nome.");
               System.out.print("Nome: ");
               recebenome = ler.next();
               System.out.print("[1] Feminino [2] Masculino : ");
               escolha = ler.nextInt();
               //Decidindo em qual lista colocar.
               if (escolha == 1)
               {
                   nomefeminino.add(recebenome);
               }
               else if (escolha == 2)
               {
                   nomemasculino.add(recebenome);
               } else
               {
                   System.out.println("Não exite esta opção.");
               }

               System.out.println("Continuar?");
               System.out.println("(Sim) ou (Não)");
               comando = ler.next();


           }while(comando.equalsIgnoreCase("sim"));

        comando = "sim";
        //Decidindo qual lista vai aparecer na tela.
        while(comando.equalsIgnoreCase("sim"))
        {
            System.out.println("Qual lista você gostaria de ver?");
            System.out.println("[1] Lista masculina.");
            System.out.println("[2] Lista feminina.");
            escolha = ler.nextInt();
            if (escolha == 1) {
                System.out.println("Lista Masculina " + "\n" + "-----------------");
                while (nomemasculino.size() != 0) {
                    System.out.println(nomemasculino.remove());
                }
                System.out.println("-----------------");
            } else if (escolha == 2) {
                System.out.println("Lista feminina" + "\n" + "-----------------");
                for (String listanome : nomefeminino) {
                    System.out.println(listanome);
                }
                System.out.println("-----------------");

            } else {
                System.out.println("Não existe esta opção.");
            }
            System.out.println("Deseja ver mais alguma lista?");
            System.out.println("(Sim) ou  (Não) : ");
            comando = ler.next();
        }
        System.out.println("Obrigado.");


    }


}
