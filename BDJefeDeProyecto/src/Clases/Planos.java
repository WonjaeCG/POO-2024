package Clases;

public class Planos {
    private int id;
    private fecha fecEntrega;
    private string arquitectos;
    private int cantFiguras;

    private class fecha {
        int dia;
        int mes;
        int anio;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFecEntrega(int dia, int mes, int anio) {
        this.fecEntrega.dia = dia;
        this.fecEntrega.mes = mes;
        this.fecEntrega.anio = anio;
    }

    public void setArquitectos(string arquitecto) {
        this.arquitectos = arquitecto;
    }
}
