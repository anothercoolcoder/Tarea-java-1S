package LOGICA;

public class Vehiculo {
    private byte capacidad, nivel, tipo, tanqueoParcial;

    public Vehiculo(byte capacidad, byte nivel, byte tipo) {
        setCapacidad(capacidad);
        setNivel(nivel);
        setTipo(tipo);
    }

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public void setCapacidad(byte capacidad) {
        this.capacidad = capacidad;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public byte getCapacidad() {
        return capacidad;
    }

    public byte getNivel() {
        return nivel;
    }
}
