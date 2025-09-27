package ar.edu.unahur.obj2.filters;

import ar.edu.unahur.obj2.model.Pais;

public class FiltroPoblacionMenorA extends Filtro {
    private Integer poblacionLimite;

    @Override
    public Boolean apply(Pais pais) {
        return pais.getPoblacion() <= poblacionLimite;
    }

    public FiltroPoblacionMenorA(Integer poblacionLimite) {
        this.poblacionLimite = poblacionLimite;
    }
    

}
