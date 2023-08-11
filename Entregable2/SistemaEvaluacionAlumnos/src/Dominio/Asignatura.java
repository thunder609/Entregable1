package Dominio;

public class Asignatura {
     private String id;
     private String Name;
     private  float Calificacion;

     public Asignatura(String id, String name, float calificacion) {
          this.id = id;
          Name = name;
          Calificacion = calificacion;
     }

     public String getId() {
          return id;
     }

     public String getName() {
          return Name;
     }

     public float getCalificacion() {
          return Calificacion;
     }

     public void setId(String id) {
          this.id = id;
     }

     public void setName(String name) {
          Name = name;
     }

     public void setCalificacion(float calificacion) {
          Calificacion = calificacion;
     }

     @Override
     public String toString() {
          return "Asignatura{" +
                  "id='" + id + '\'' +
                  ", Name='" + Name + '\'' +
                  ", Calificacion=" + Calificacion +
                  '}';
     }
}
