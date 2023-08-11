package Controlfactory;

import Dominio.Alumno;
import Dominio.Asignatura;

import java.util.ArrayList;

public class ControldeCalificciones {
    Alumno alumno;
    ArrayList<Asignatura> materia;

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Asignatura> getMateria() {
        return materia;
    }

    public void setMateria(ArrayList<Asignatura> materia) {
        this.materia = materia;
    }

    public ControldeCalificciones(Alumno alumno, ArrayList<Asignatura> materia) {
        this.alumno = alumno;
        this.materia = materia;
    }
    public ControldeCalificciones() {
        this.alumno = alumno;
        this.materia = materia;
    }
}
