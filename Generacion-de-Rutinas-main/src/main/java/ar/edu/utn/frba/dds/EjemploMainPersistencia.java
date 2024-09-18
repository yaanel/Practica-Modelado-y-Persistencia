package ar.edu.utn.frba.dds;

import ar.edu.utn.frba.dds.ejercicio_01.repositorios.Repositorio;

public class EjemploMainPersistencia {
    
    public static void main(String[] args) {

        PruebaPersistencia prueba = new PruebaPersistencia();
        prueba.setNombre("ejemplo");

        Repositorio repositorio = new Repositorio();

        repositorio.guardar(prueba);
    }
}
