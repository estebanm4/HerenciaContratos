package ejercicioherencia;

import java.util.ArrayList;

public class LiderProyecto extends Programador{
    //Asociación
    private ArrayList <Programador> programadores;

    public LiderProyecto(ArrayList<Programador> programadores, String lenguaje, String nombre, double salario, int id) {
        super(lenguaje, nombre, salario, id);
        this.programadores = programadores;
    }

    @Override
    public double calcularSalario(){
        return this.salario + (this.salario*0.1*this.programadores.size());
    }
    
    
    
    
}
