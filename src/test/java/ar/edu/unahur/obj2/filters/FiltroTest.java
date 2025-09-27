package ar.edu.unahur.obj2.filters;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.model.Pais;
import ar.edu.unahur.obj2.service.IPaisService;
import ar.edu.unahur.obj2.service.PaisService;

public class FiltroTest {
    private List<Pais> paises;

    @BeforeEach
    void setUp(){
        IPaisService paisService = new PaisService();
        paises = paisService.getPaises();
    }
   
    @Test
    void filtroAreaMayorA(){
        Filtrable areaMayorAUnMillon = new FiltroAreaMayorA(1000000);
        List<Pais> paisesGrandes = paises.stream().filter(p-> areaMayorAUnMillon.apply(p)).collect(Collectors.toList());
        paisesGrandes.stream().forEach(p-> System.out.println(p.toString()));
    }

    @Test
    void FiltroPorIdioma(){
        Filtrable hablanEspañol= new FiltroPorIdioma("Spanish");
        List<Pais> hablanEnEspañol = paises.stream().filter(p->hablanEspañol.apply(p)).collect(Collectors.toList());
        
    }
    @Test
    void FiltroPorIdiomaYAreaMayorA(){
        Filtrable enEspañolYAmplio = new FiltroPorIdioma("Spanish").and(new FiltroAreaMayorA(1000000));
         List<Pais> hablanEnEspañol = paises.stream().filter(p->enEspañolYAmplio.apply(p)).collect(Collectors.toList());
         hablanEnEspañol.stream().forEach(p->System.out.println(p.toString()));

    }
    @Test
    void FiltroExtenso(){
        Filtrable filtros = new FiltroPorIdioma("English").and(new FiltroAreaMayorA(1000000)).or(new FiltroPorIsla());
         List<Pais> paisesFiltrados = paises.stream().filter(p->filtros.apply(p)).collect(Collectors.toList());
         paisesFiltrados.stream().forEach(p->System.out.println(p.toString()));
 }
    
    
}
