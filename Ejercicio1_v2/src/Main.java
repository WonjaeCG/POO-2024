public class Main {
    public static void main(String[] args)
    {
        Juego partida = new Juego();
        partida.MuestraVidasRestantes();
        for(int i = 0; i < 5; i++)
        {
            if (!partida.QuitaVida())
            {
                System.out.println("Te quedaste sin vidas");
                partida.ReiniciaPartida();
            }
            partida.MuestraVidasRestantes();
        }


    }
}