package ar.edu.utn.frba.dds.ejercicio_01;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter

@Entity
@Table(name = "rutina")
public class Rutina extends Persistente{

    @OneToOne
    @JoinColumn(name = "deportista_id", referencedColumnName = "id")
    private Deportista deportista;

    @OneToMany
    @JoinColumn(name = "rutina_id", referencedColumnName = "id")
    private List<DiaDeEntrenamiento> diasDeEntrenamiento;

    @OneToOne
    @JoinColumn(name = "rutina_anterior_id", referencedColumnName = "id")
    private Rutina rutinaAnterior;

    public Rutina() {
        this.diasDeEntrenamiento = new ArrayList<>();
    }

    public void agregarDiaDeEntrenamiento(DiaDeEntrenamiento diaDeEntrenamiento) {
        this.diasDeEntrenamiento.add(diaDeEntrenamiento);
    }
}
