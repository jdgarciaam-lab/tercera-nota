package OOP.GestionHorarios.services;

import java.util.ArrayList;
import java.util.List;

import OOP.GestionHorarios.domain.Estudiante;
import OOP.GestionHorarios.domain.Materia;

public class GestionHorarios {
    private List<Materia> materias;
    private List<Estudiante> estudiantes;

    public GestionHorarios() {
        materias = new ArrayList<>();
        estudiantes = new ArrayList<>();
    }

    public void registrarMateria(Materia materia) {
        materias.add(materia);
    }

    public void inscribirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public List<Materia> getMaterias() {
        return materias;
    }
}