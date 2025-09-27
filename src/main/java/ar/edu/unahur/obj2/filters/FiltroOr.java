package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroOr extends FiltroCompuesto {

    @Override
    public Boolean apply(Pais pais) {
       return filtros.stream().anyMatch(filtro->filtro.apply(pais));
    }
    @Override 
    public Filtrable and(Filtrable filtro){
        return new FiltroAnd( this, filtro);
     }
    
    public  FiltroOr(Filtrable filtro){
        filtros.add(filtro);
    }
    public FiltroOr(List<Filtro> filtrosNuevos){
        filtros.addAll(filtrosNuevos);
    }
    public FiltroOr(Filtrable filtro,Filtrable nuevo){
        filtros.add(filtro);
        filtros.add(nuevo);
    }

}
