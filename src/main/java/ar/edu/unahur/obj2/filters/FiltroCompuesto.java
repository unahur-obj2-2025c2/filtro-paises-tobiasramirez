package ar.edu.unahur.obj2.filters;

import java.util.ArrayList;
import java.util.List;

public abstract class FiltroCompuesto implements Filtrable {
    protected List<Filtrable> filtros = new ArrayList<>();
    public void agregarFiltro(Filtro filtro){
        filtros.add(filtro);
    }
    @Override
    public Filtrable and(Filtrable filtro){
        filtros.add(filtro);
        return this;
    }
    @Override
    public Filtrable or(Filtrable filtro){
        filtros.add(filtro);
        return this;
    }
    
}
