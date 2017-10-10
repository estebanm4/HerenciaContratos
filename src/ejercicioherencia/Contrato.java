package ejercicioherencia;

public  abstract class Contrato {
    protected int id;

    public Contrato(int id) {
        this.id = id;
    }
    
    public abstract double calcularSalario();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
