package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }

    public List<Habitacion> getHabitacionesDisponibles() {
        List<Habitacion> habitacionesDisponibles = new ArrayList<>();
        for (Habitacion habitacion : this.habitaciones) {
            if (habitacion.isDisponible()) {
                habitacionesDisponibles.add(habitacion);
            }
        }
        return habitacionesDisponibles;
    }

    public void realizarReserva(Cliente cliente, int numeroHabitacion, int cantidadNoches) {
        Habitacion habitacion = this.getHabitacion(numeroHabitacion);
        habitacion.reservar(cliente, cantidadNoches);
    }

    public void cancelarReserva(int numeroHabitacion) {
        Habitacion habitacion = this.getHabitacion(numeroHabitacion);
        habitacion.cancelarReserva();
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<Habitacion> getHabitaciones() {
        return this.habitaciones;
    }

    private Habitacion getHabitacion(int numeroHabitacion) {
        for (Habitacion habitacion : this.habitaciones) {
            if (habitacion.getNumero() == numeroHabitacion) {
                return habitacion;
            }
        }
        return null;
    }

}