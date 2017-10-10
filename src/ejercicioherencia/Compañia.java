package ejercicioherencia;

import java.util.ArrayList;

public class Compañia {
    private String nombre;
    private ArrayList <Contrato> contratos;
    
    public Compañia (String nombre){
        this.nombre = nombre;
        this.contratos = new ArrayList<>();
    }
    
    public boolean addContrato(Contrato contrato){
        return this.contratos.add(contrato);          
    }
}
