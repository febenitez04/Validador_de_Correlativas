package facultad;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
    private String nombre;

    public List<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }
}
