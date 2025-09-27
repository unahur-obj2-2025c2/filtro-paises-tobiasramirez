package ar.edu.unahur.obj2.filters;

import java.util.List;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroAnd extends FiltroCompuesto {

  
    @Override
    public Filtrable or(Filtrable filtro){
        return new FiltroOr(this,filtro);
    }
    public FiltroAnd(Filtrable filtro, Filtrable nuevo){
        filtros.add(filtro);
        filtros.add(nuevo);
    }
    public FiltroAnd(List<Filtro>filtrosNuevos){
        filtros.addAll(filtrosNuevos);
    }
    @Override
    public Boolean apply(Pais pais){
       return filtros.stream().allMatch(filtro -> filtro.apply(pais));
    }


}
