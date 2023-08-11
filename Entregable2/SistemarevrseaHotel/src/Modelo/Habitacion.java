package Modelo;

public class Habitacion {
    private int numero;
    private int capacidad;
    private boolean disponible;
    private Cliente cliente;
    private int cantidadNoches;

    public Habitacion(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.disponible = true;
        this.cliente = null;
        this.cantidadNoches = 0;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public boolean isDisponible() {
        return this.disponible;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public int getCantidadNoches() {
        return this.cantidadNoches;
    }

    public void reservar(Cliente cliente, int cantidadNoches) {
        this.cliente = cliente;
        this.cantidadNoches = cantidadNoches;
        this.disponible = false;
    }

    public void cancelarReserva() {
        this.cliente = null;
        this.cantidadNoches = 0;
        this.disponible = true;
    }
}
