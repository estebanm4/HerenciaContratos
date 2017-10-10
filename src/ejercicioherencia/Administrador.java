package ejercicioherencia;

public class Administrador extends Empleado{

    public Administrador(String nombre, double salario, int id) {
        super(nombre, 100, id);
    }
    
    @Override
    public double calcularSalario(){
        return this.salario;
    }
    
    
    
}
