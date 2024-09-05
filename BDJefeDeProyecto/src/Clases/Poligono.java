package Clases;

public class Poligono extends Figuras {
    public class linea{
        private int pOrigen;
        private int pFin;
        private int longitud;
    }

    private int cantLineas;

    public void setCantLineas(int cantLineas) {
        this.cantLineas = cantLineas;
    }

    public void crearLinea(int pOrigen, int pFin, int longitud){
        linea Linea = new linea();
        Linea.pOrigen = pOrigen;
        Linea.pFin = pFin;
        Linea.longitud = longitud;
    }
}
