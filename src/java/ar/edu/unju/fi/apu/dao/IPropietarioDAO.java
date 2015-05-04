/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unju.fi.apu.dao;

import ar.edu.unju.fi.apu.dao.imp.ram.TablaPropietarios;
import ar.edu.unju.fi.apu.modelo.dominio.Propietario;
import java.util.List;


public class IPropietarioDAO {
    private Propietario propietario;

    public void crear(Propietario propietario){
        propietario.setEstado(true);
        TablaPropietarios.tablaPropietarios.add(propietario);
    }
    

    public void modificar(Propietario propietario){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public List<Propietario> obtenerTodos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
