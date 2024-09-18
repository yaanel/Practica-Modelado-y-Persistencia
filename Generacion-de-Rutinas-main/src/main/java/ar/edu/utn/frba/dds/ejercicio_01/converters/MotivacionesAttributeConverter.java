package ar.edu.utn.frba.dds.ejercicio_01.converters;

import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.BajarDePeso;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Mantener;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Motivacion;
import ar.edu.utn.frba.dds.ejercicio_01.motivaciones.Tonificar;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class MotivacionesAttributeConverter implements AttributeConverter<Motivacion, String> {
    @Override
    public String convertToDatabaseColumn(Motivacion motivacion) {

        if(motivacion instanceof BajarDePeso) {
            return "BAJAR_PESO";
        }
        else if (motivacion instanceof Mantener) {
            return "MANTENER";
        }
        else if (motivacion instanceof Tonificar) {
            return "TONIFICAR";
        }

        return null;
    }

    @Override
    public Motivacion convertToEntityAttribute(String dbData) {
        if ("BAJAR_PESO".equals(dbData)) {
            return new BajarDePeso();
        } else if ("MANTENER".equals(dbData)) {
            return new Mantener();
        }
        else if ("TONIFICAR".equals(dbData)) {
            return new Tonificar();
        }
        return null;
    }

}
