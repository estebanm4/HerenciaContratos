package ejercicioherencia;

public class Programador extends Empleado{
    private String lenguaje;

    public Programador(String lenguaje, String nombre, double salario, int id) {
        super(nombre, salario, id);
        this.lenguaje = lenguaje;
    }
    
    @Override
    public double calcularSalario(){
        if(this.lenguaje.equals("java")){
            return (this.salario + (this.salario*0.1));
        } else {
            return this.salario;
        }
    }

    @Override
    public String toString() {
        return "Programador{" + "lenguaje=" + lenguaje + '}' + super.toString();
    }
    
    
}
