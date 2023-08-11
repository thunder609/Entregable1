package Dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {
    private String id;


    private String name;
    private ArrayList<Asignatura> materia;

    public Alumno(String id, String name, ArrayList<Asignatura> materia) {
        this.id = id;
        this.name = name;
        this.materia = materia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Asignatura> getMateria() {
        return materia;
    }

    public void setMateria(ArrayList<Asignatura> materia) {
        this.materia = materia;
    }
    public float calcularPromedio() {
        float acuAsignatura = 0, promedio = 0;
        for (Asignatura a : materia) {
            acuAsignatura = acuAsignatura + a.getCalificacion();

        }
        return promedio = acuAsignatura / materia.size();

    }
/*    public Alumno(String id, String name, Asignatura[] materia) {
        int c=0;
        this.id = id;
        this.name = name;
        this.materia = materia;
         }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Asignatura[] getMateria() {
        return materia;
    }

    public void setMateria(Asignatura[] materia) {
        this.materia = materia;
    }

   public float calcularPromedio() {
       float acuAsignatura = 0, promedio = 0;
       for (Asignatura a : materia) {
           acuAsignatura = acuAsignatura + a.getCalificacion();

       }
       return promedio = acuAsignatura / materia.length;

   }  */


}