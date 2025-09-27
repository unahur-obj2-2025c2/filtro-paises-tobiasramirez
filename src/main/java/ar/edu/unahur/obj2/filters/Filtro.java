package ar.edu.unahur.obj2.filters;

public abstract class Filtro implements Filtrable {

    @Override
    public  Filtrable and(Filtrable filtro){
        return new FiltroAnd( this, filtro);
    }

    @Override
    public  Filtrable or(Filtrable filtro){
        return new FiltroOr(this, filtro);
    }

}
