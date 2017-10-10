package ejercicioherencia;

import java.util.ArrayList;

public class LiderProyecto extends Programador{
    //Asociación
    private ArrayList <Programador> programadores;

    public LiderProyecto(String lenguaje, String nombre, double salario, int id) {
        super(lenguaje, nombre, salario, id);
        this.programadores = new ArrayList<>();
    }

    @Override
    public double calcularSalario(){
        return this.salario + (this.salario*0.1*this.programadores.size());
    }
    
    public boolean addProgramador (Programador programador){
        if(this.programadores.add(programador)){
            return true;
        } else  {
            return false;
        }
    }

    @Override
    public String toString() {
        String aux = "";
        aux += super.toString() + "a Cargo de ";
        for (Programador programador : programadores){
            aux += programador.toString();
        }
        return aux;
    }
    
    
}
