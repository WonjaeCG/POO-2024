public class Juego {
    private int vidasActuales;
    private int vidasOrigen=5;

    public Juego() {
        this.vidasActuales = vidasOrigen;
    }

    public void MuestraVidasRestantes(){
        System.out.println("Vidas: " + this.vidasActuales);
    }

    public boolean QuitaVida(){
        this.vidasActuales--;
        return vidasActuales>0;
    }

    public void ReiniciaPartida(){
        this.vidasActuales=this.vidasOrigen;
    }
}
