package ar.edu.unju.fi.apu.dao.imp.ram;

import ar.edu.unju.fi.apu.dao.IPropietarioDAO;
import ar.edu.unju.fi.apu.modelo.dominio.Propietario;
import java.util.ArrayList;
import java.util.List;


public class PropietarioDAOImp extends IPropietarioDAO{
    
    @Override
    public void crear(Propietario propietario){
        propietario.setEstado(true);
        TablaPropietarios.tablaPropietarios.add(propietario);
    }
    
    @Override
    public void modificar(Propietario propietario){
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Override
    public List<Propietario> obtenerTodos(){
        List<Propietario> propietarios = new ArrayList<>();
        for(Propietario p:TablaPropietarios.tablaPropietarios){
            if(p.isEstado()==true){
                propietarios.add(p);
            }
        }
        return propietarios;
    }
    
}
