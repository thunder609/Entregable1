package Modelo;

public class Main {
    public static void main(String[] args) {
    /*    Hotel hotel1 = new Hotel("Hotel 1");

        // Create rooms in the hotel
        Habitacion habitacion1 = new Habitacion(1, 2);
        Habitacion habitacion2 = new Habitacion(2, 3);
        Habitacion habitacion3 = new Habitacion(3, 4);

        // Add the rooms to the hotel
        hotel1.agregarHabitacion(habitacion1);
        hotel1.agregarHabitacion(habitacion2);
        hotel1.agregarHabitacion(habitacion3);

        // List the available rooms in the hotel
        System.out.println("Las habitaciones disponibles en el hotel 1 son:");
        for (Habitacion habitacion : hotel1.getHabitacionesDisponibles()) {
            System.out.println(habitacion.getNumero());
        }

        // Make a reservation for a room in the hotel
        Cliente cliente1 = new Cliente("Juan Pérez", "123456789");
        hotel1.realizarReserva(cliente1, 1, 2);

        // List the reservations for the hotel

        // Cancel a reservation for a room in the hotel
      //  hotel1.cancelarReserva(1);

        // List the available rooms in the hotel after the reservation was canceled
        System.out.println("Las habitaciones disponibles en el hotel 1 después de cancelar la reserva son:");
        for (Habitacion habitacion : hotel1.getHabitacionesDisponibles()) {
            System.out.println(habitacion.getNumero());
        }*/


        // Create hotels
        Hotel hotel1 = new Hotel("Hotel 1");
        Hotel hotel2 = new Hotel("Hotel 2");
        Hotel hotel3 = new Hotel("Hotel 3");

        // Create rooms in the hotels
        Habitacion habitacion11 = new Habitacion(1, 2);
        Habitacion habitacion12 = new Habitacion(2, 3);
        Habitacion habitacion13 = new Habitacion(3, 4);

        Habitacion habitacion21 = new Habitacion(1, 2);
        Habitacion habitacion22 = new Habitacion(2, 3);
        Habitacion habitacion23 = new Habitacion(3, 4);

        Habitacion habitacion31 = new Habitacion(1, 2);
        Habitacion habitacion32 = new Habitacion(2, 3);
        Habitacion habitacion33 = new Habitacion(3, 4);

        // Add the rooms to the hotels
        hotel1.agregarHabitacion(habitacion11);
        hotel1.agregarHabitacion(habitacion12);
        hotel1.agregarHabitacion(habitacion13);

        hotel2.agregarHabitacion(habitacion21);
        hotel2.agregarHabitacion(habitacion22);
        hotel2.agregarHabitacion(habitacion23);

        hotel3.agregarHabitacion(habitacion31);
        hotel3.agregarHabitacion(habitacion32);
        hotel3.agregarHabitacion(habitacion33);

        // List the available rooms in the hotels
        System.out.println("Las habitaciones disponibles en el hotel 1 son:");
        for (Habitacion habitacion : hotel1.getHabitacionesDisponibles()) {
            System.out.println("Disponible lahabitacion #" + habitacion.getNumero());
        }

        System.out.println("Las habitaciones disponibles en el hotel 2 son:");
        for (Habitacion habitacion : hotel2.getHabitacionesDisponibles()) {
            System.out.println("Disponible lahabitacion #" + habitacion.getNumero());
        }

        System.out.println("Las habitaciones disponibles en el hotel 3 son:");
        for (Habitacion habitacion : hotel3.getHabitacionesDisponibles()) {
            System.out.println("Disponible lahabitacion #" + habitacion.getNumero());
        }

        // Make a reservation for a room in each hotel
        Cliente cliente1 = new Cliente("Juan Pérez", "123456789");
        hotel1.realizarReserva(cliente1, 1, 2);

        Cliente cliente2 = new Cliente("Pedro López", "987654321");
        hotel2.realizarReserva(cliente2, 2, 3);

        Cliente cliente3 = new Cliente("María García", "321654789");
        hotel3.realizarReserva(cliente3, 3, 4);
        System.out.println("Las habitaciones disponibles en el hotel 1 después  reserva son:");
        for (Habitacion habitacion : hotel1.getHabitacionesDisponibles()) {
            System.out.println(habitacion.getNumero());
        }

        System.out.println("Las habitaciones disponibles en el hotel 2 después  reserva son:");
        for (Habitacion habitacion : hotel2.getHabitacionesDisponibles()) {
            System.out.println(habitacion.getNumero());
        }

        System.out.println("Las habitaciones disponibles en el hotel 3 después  reserva son:");
        for (Habitacion habitacion : hotel3.getHabitacionesDisponibles()) {
            System.out.println(habitacion.getNumero());
        }

        //cancele a habitacion 1 de hotel 1
        hotel1.cancelarReserva(1);
        System.out.println("Las habitaciones disponibles en el hotel 1 después  de una cancelacion:");
        for (Habitacion habitacion : hotel1.getHabitacionesDisponibles()) {
            System.out.println(habitacion.getNumero());
        }
    }
}

//ahora voy a cacelar una reserva

       /*         // List the reservations for each hotel
                System.out.println("Las reservas para el hotel 1 son:");
                for (Reserva reserva : hotel1.getReservas()) {
                    System.out.println(reserva);
                }

                System.out.println("Las reservas para el hotel 2 son:");
                for (Reserva reserva : hotel2.getReservas()) {
                    System.out.println(reserva);
                }

                System.out.println("Las reservas para el hotel 3 son:");
                for (Reserva reserva : hotel3.getReservas()) {
                    System.out.println(reserva);
                }
            }
        }
*/

