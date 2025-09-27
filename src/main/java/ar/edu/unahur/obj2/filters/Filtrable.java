package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public interface Filtrable {
    Boolean apply(Pais pais);
    Filtrable and(Filtrable filtro);
    Filtrable or(Filtrable filtro);
}
