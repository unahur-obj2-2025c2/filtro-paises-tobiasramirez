package ar.edu.unahur.obj2.viajeros;

import java.util.List;

import ar.edu.unahur.obj2.filters.*;
import ar.edu.unahur.obj2.model.Pais;

public class Cultural extends Viajero {

    public Cultural(List<String> idiomas, Pais nacionalidad) {
        super(idiomas, nacionalidad);
        
    }

    @Override
    public List<Pais> evaluarCondiciones(List<Pais> paises) {
        Filtrable filtros = new FiltroPoblacionMenorA(nacionalidad.getPoblacion());
        return null;
        
    }
    

}
