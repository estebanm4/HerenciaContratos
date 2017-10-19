package ejercicioherencia;

import java.util.ArrayList;

public class EjercicioHerencia {

    public static void main(String[] args) {
        Consultor pedroElConsultor = new Consultor("POO", 1);
        Administrador jorgeElAdministrador = null;
        try{jorgeElAdministrador = new Administrador ("Jorge", 220, 2);}
        catch(ArithmeticException g){
            System.out.println(jorgeElAdministrador.getNombre() + g.getMessage());
        }
        Programador fabianElProgramador = null;
        try{fabianElProgramador = new Programador ("java", "Fabian", 500, 3);}
        catch(ArithmeticException m) {
            System.out.println(fabianElProgramador.getNombre() + m.getMessage());
        }
        Programador bobElProgramador = null;
        try{bobElProgramador = new Programador ("C", "Bob", 600, 4);}
        catch(ArithmeticException f){
            System.out.println(bobElProgramador.getNombre() + f.getMessage());
        }
        LiderProyecto carlosElLider = null;
        try{carlosElLider = new LiderProyecto ("Java", "Carlos", 600, 4);}  
        catch(ArithmeticException k ){
            System.out.println(carlosElLider.getNombre() + k.getMessage());
        }        
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
