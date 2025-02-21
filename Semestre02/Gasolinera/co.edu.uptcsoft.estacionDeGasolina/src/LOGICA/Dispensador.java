package LOGICA;

public class Dispensador {
    private int capacidadBodega, valor, ventaG, ventaP;

    public Dispensador(int capacidadBodega, int valor, int ventaG, int ventaP) {
        this.capacidadBodega = capacidadBodega;
        this.valor = valor;
        this.ventaG = ventaG;
        this.ventaP = ventaP;
    }

    public Dispensador(int valor){

    }

    public int getCapacidadBodega() {
        return capacidadBodega;
    }

    public void setCapacidadBodega(int capacidadBodega) {
        this.capacidadBodega = capacidadBodega;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getVentaG() {
        return ventaG;
    }

    public void setVentaG(int ventaG) {
        this.ventaG = ventaG;
    }

    public int getVentaP() {
        return ventaP;
    }

    public void setVentaP(int ventaP) {
        this.ventaP = ventaP;
    }
}
