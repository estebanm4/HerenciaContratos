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
    
    public double calcularNomina(){
        double totalNomina = 0;
        for (Contrato contrato : contratos){
            totalNomina += contrato.calcularSalario();
        }
        return totalNomina;
    }
    
    public String listarInformacion(){
        String aux = "";
        for(Contrato contrato : contratos){
            aux += contrato.toString();
        }
        return aux;      
    }
    
    public ArrayList <Contrato> reportarNomina(){
        return this.contratos;
    }
}
