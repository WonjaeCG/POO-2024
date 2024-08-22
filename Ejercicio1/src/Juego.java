public class Juego {
    public int vidas;

    public Juego(int vidas) {
        this.vidas = vidas;
    }

    public void MuestraVidasRestantes(){
        System.out.println("Vidas: " + this.vidas);
    }
}
