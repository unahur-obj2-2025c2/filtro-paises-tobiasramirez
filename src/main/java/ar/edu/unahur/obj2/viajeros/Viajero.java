package ar.edu.unahur.obj2.viajeros;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.model.Pais;



public abstract class Viajero {
    protected List<String> idiomas = new ArrayList<>(); //hay q escribirlos en ingles.
    protected Pais nacionalidad;
    protected List<Pais> paisesAVisitar;

    public Viajero(List<String> idiomas, Pais nacionalidad) {
        this.idiomas = idiomas;
        this.nacionalidad = nacionalidad;
    }
    public List<String> getIdiomas() {
        return idiomas;
    }
    public Pais getNacionalidad() {
        return nacionalidad;
    }
    public List<Pais> getPaisesAVisitar() {
        return paisesAVisitar;
    }
    public abstract List<Pais> evaluarCondiciones(List<Pais> paises);
        
}
