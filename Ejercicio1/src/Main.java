public class Main {
    public static void main(String[] args)
    {
        Juego partida = new Juego(5);
        partida.MuestraVidasRestantes();
        partida.vidas--;
        partida.MuestraVidasRestantes();
        Juego partida2 = new Juego(5);
        partida2.MuestraVidasRestantes();
        partida.MuestraVidasRestantes();
    }
}