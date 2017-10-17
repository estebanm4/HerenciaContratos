package ejercicioherencia;

public class Administrador extends Empleado{

    public Administrador(String nombre, double salario, int id) {
        super(nombre, 100, id);
        //if (this.salario < 700){
          //  throw new ArithmeticException();
    //}
}
    @Override
    public double calcularSalario(){
        return this.salario;
    }
    
    
    
}
