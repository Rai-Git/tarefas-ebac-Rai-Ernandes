public class Media
{
    public static void main (String args[])
    {
        float resultado;
        Notas notas = new Notas();

        //Enviando as notas.
        notas.setNota1(4.5);
        notas.setNota2(8);
        notas.setNota3(6.5);
        notas.setNota4(10);
        //Metodo calcula e imprime.
        notas.imprimirNota();
    }


}
