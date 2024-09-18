package ar.edu.utn.frba.dds.ejercicio_01.repositorios;

import io.github.flbulgarelli.jpa.extras.simple.WithSimplePersistenceUnit;

public class Repositorio implements WithSimplePersistenceUnit {

    public void guardar(Object p) {
        try{
            beginTransaction();
            entityManager().persist(p);
            commitTransaction();
        } catch (Exception e) {
            rollbackTransaction();
            throw e;
        }
    }
}
