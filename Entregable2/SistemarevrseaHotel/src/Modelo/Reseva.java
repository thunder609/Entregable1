package Modelo;

public class Reseva {
    public class Reserva {
        private Hotel hotel;
        private Habitacion habitacion;
        private Cliente cliente;
        private int cantidadNoches;

        public Reserva(Hotel hotel, Habitacion habitacion, Cliente cliente, int cantidadNoches) {
            this.hotel = hotel;
            this.habitacion = habitacion;
            this.cliente = cliente;
            this.cantidadNoches = cantidadNoches;
        }

        public Hotel getHotel() {
            return this.hotel;
        }

        public Habitacion getHabitacion() {
            return this.habitacion;
        }

        public Cliente getCliente() {
            return this.cliente;
        }

        public int getCantidadNoches() {
            return this.cantidadNoches;
        }

        public void setHotel(Hotel hotel) {
            this.hotel = hotel;
        }

        public void setHabitacion(Habitacion habitacion) {
            this.habitacion = habitacion;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public void setCantidadNoches(int cantidadNoches) {
            this.cantidadNoches = cantidadNoches;
        }

        @Override
        public String toString() {
            return "Reserva{" +
                    "hotel=" + hotel +
                    ", habitacion=" + habitacion +
                    ", cliente=" + cliente +
                    ", cantidadNoches=" + cantidadNoches +
                    '}';
        }
    }
}
