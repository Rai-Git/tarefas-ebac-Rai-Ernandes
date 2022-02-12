
    public class Wrappers
    {

        public static void main(String args[])
        {
            int a;
            long b;
            float c;
            double d;

            //Primeiro é (int)
            //Segundo é (char)
            //Terceiro é (short)
            //Quarto é (byte)
            //Quinto é (long)
            //Sexto é (float)
            //Sétimo é (double)

            Cast cast = new Cast();
            cast.setPrimeiro(1111111111);
            System.out.println("int  " + cast.getPrimeiro());
            //cast.setSegundo(1);
            //System.out.println("char  " + cast.getSegundo());
            //cast.setTerceiro(1);
            //System.out.println("short  " + cast.getTerceiro());
            //cast.setQuarto(1);
            //System.out.println("byte  " + cast.getQuarto());
            cast.setQuinto(1111111111111111111l);
            System.out.println("long  " + cast.getQuinto());
            cast.setSexto(2.2222222f);
            System.out.println("float  " + cast.getSexto());
            cast.setSetimo(2.222222222222222);
            System.out.println("double  " + cast.getSetimo());

            System.out.println("******************");
            System.out.println("Explícito");
            //Casting Explícito.
            a = (int) cast.getQuinto();
            System.out.println("De long para int   " + a);
            c = (float) cast.getSetimo();
            System.out.println("double para float   " + c);
            b = (long) cast.getSetimo();
            System.out.println("double para long   " + b);

            System.out.println("******************");
            System.out.println("Implícito");
            //Casting Implícito.
            c = cast.getPrimeiro();
            System.out.println("int para float   " + c);
            b = cast.getPrimeiro();
            System.out.println("int para long   " + b);
            d = cast.getSexto();
            System.out.println("float para double   " + d);

        }
    }
