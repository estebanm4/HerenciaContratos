package ejercicioherencia;

import java.util.ArrayList;

public class EjercicioHerencia {

    public static void main(String[] args) {
        Consultor pedroElConsultor = new Consultor("POO", 1);
        Administrador jorgeElAdministrador = new Administrador ("Jorge", 220, 2);
        Programador fabianElProgramador = new Programador ("java", "Fabian", 500, 3);
        Programador bobElProgramador = new Programador ("C", "Bob", 600, 4);
        LiderProyecto carlosElLider = new LiderProyecto ("Java", "Carlos", 600, 4);
        carlosElLider.addProgramador(bobElProgramador);
        carlosElLider.addProgramador(fabianElProgramador);
        Compañia compañia = new Compañia ("Unal");
        compañia.addContrato(pedroElConsultor);
        compañia.addContrato(jorgeElAdministrador);
        compañia.addContrato(fabianElProgramador);
        compañia.addContrato(bobElProgramador);
        compañia.addContrato(carlosElLider);
        
        String datosCompañia = compañia.listarInformacion();
        System.out.println(datosCompañia);
        double valorNomina = compañia.calcularNomina();
        System.out.println("Valor Nomina = $" + valorNomina);
        
        ArrayList <Contrato> contratos = compañia.reportarNomina();
        for (Contrato contrato : contratos) {
/*Consult*/ if(contrato instanceof Consultor){
                Consultor _consultor = (Consultor)contrato;
                System.out.println("Consultor " + _consultor.getLabor());
/*Admin*/   } else if(contrato instanceof Administrador){
                Administrador _administrador = (Administrador)contrato;
                System.out.println("Administrador " + _administrador.getNombre());
/*Progra*/  } else if(contrato instanceof Programador){
                Programador _programador = (Programador)contrato;
                System.out.println("Programador " + _programador.getNombre());
/*Lider*/   } else if(contrato instanceof LiderProyecto){
                LiderProyecto _lider = (LiderProyecto)contrato;
                System.out.println("Lider de Proyecto " + _lider.getNombre());
            } 
        }
                
    }
    
}
