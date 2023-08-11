import Controlfactory.ControldeCalificciones;
import Dominio.Alumno;
import Dominio.Asignatura;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int resp;

        do {

            System.out.println("hay Alumnos si =1 no <> ");
            Scanner input = new Scanner(System.in);
            resp = input.nextInt();


            //   Asignatura[] mat = {new  Asignatura ("1","Matematica",20),
            //         new  Asignatura ("1","Matematica",20),
            //        new  Asignatura ("1","Matematica",20)};


            ArrayList<Asignatura> materia = new ArrayList<Asignatura>();
            int respu;
            ;

            do {

                   System.out.println("hay Materias si = 1");
                   Scanner i = new Scanner(System.in);
                   respu = i.nextInt();
                  // System.out.println("tu respuesta" +
                  //         respu);


                   if (respu == 2) {
                      break;
                   }





                System.out.println("Ingrese la materia id");
                Scanner a = new Scanner(System.in);
                System.out.println("Ingrese la Codigo");
                String id = a.nextLine();
                System.out.println("Ingrese la materia name");
                String name = a.nextLine();
                System.out.println("Ingrese la materia calificacion");
                int cal = a.nextInt();

                materia.add(new Asignatura(id, name, cal));

            } while (respu == 1);


            materia.forEach((n) -> {
                System.out.println("las matrias" + n);
            });
            Alumno pedro = new Alumno("1", "pedro", materia);
            Alumno juan = new Alumno("2", "Oswaldo", materia);

            pedro.setMateria(materia);

            System.out.println(pedro.calcularPromedio());
/// cargo los Objectos Alumnos
            ControldeCalificciones con = new ControldeCalificciones(pedro, materia);
            System.out.println("Nombre del Alumno" + con.getAlumno().getName());
            System.out.println("Nombre del Alumno con el Promedio" + con.getAlumno().calcularPromedio());


        } while (resp == 1);


    }
}

