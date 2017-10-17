package ejercicioherencia;

public abstract class Empleado extends Contrato {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario, int id) {
        super(id);
        if (nombre.length() < 5){
            throw new IllegalArgumentException("Nombre debe tener más de 10 caracteres");
        }
        if (this.salario < 700) {
            throw new ArithmeticException("Salario menor al MLV");
        }
        this.nombre = nombre;
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + '}' + super.toString();
    }
    
    
}
