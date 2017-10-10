package ejercicioherencia;

public class Consultor extends Contrato{
    private String labor;

    public Consultor(String labor, int id) {
        super(id);
        this.labor = labor;
    }
    
    @Override
    public double calcularSalario(){
        return (220);
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }

    @Override
    public String toString() {
        return "Consultor{" + "labor=" + labor + '}' + super.toString();
    }
    
    
    
}
