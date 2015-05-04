package ar.edu.unju.fi.apu.controlador.formbeans;

import ar.edu.unju.fi.apu.controlador.beans.PropietarioBean;
import ar.edu.unju.fi.apu.dao.imp.ram.PropietarioDAOImp;
import ar.edu.unju.fi.apu.modelo.dominio.Propietario;
import ar.edu.unju.fi.apu.dao.IPropietarioDAO;
import ar.edu.unju.fi.apu.dao.imp.ram.TablaPropietarios;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

@ManagedBean
@SessionScoped
public class PropietarioFormBean implements Serializable{
    @ManagedProperty(value = "#{propietarioBean}")
    private PropietarioBean propietarioBean;
    private List<Propietario> propietariosFiltrados;
    
    public Date getFechaActual(){
        return new Date(System.currentTimeMillis());
    }
    
    /*public void actualizarPropietario(){
        IPropietarioDAO propietarioDAO = new PropietarioDAOImp();
        propietarioDAO.crear(propietarioBean.getPropietario());
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Operacion Concretada", "Operacion Concretada"));
        //RequestContext.getCurrentInstance().execute("PF('confirmaAltaPropietario').hide();PF('modifica");
    }   */
    
    public void grabarNuevoPropietario(){
        IPropietarioDAO propietarioDAO = new PropietarioDAOImp();
        propietarioDAO.crear(propietarioBean.getPropietario());
    }
    public List<Propietario> obtenerPropietarios(){
        IPropietarioDAO propietarioDAO = new PropietarioDAOImp();
        if(TablaPropietarios.tablaPropietarios == null){
            TablaPropietarios.llenarTabla();
        }
        
        return propietarioDAO.obtenerTodos();
    }
    
    public void visualizarVentanaConfirmaAlta(){
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('confirmaAltaPropietario').show();");
    }
    
    public void visualizarVentanaConfirmaModificacion(){
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("PF('confirmaAltaPropietario').show();");
    }
    
    public PropietarioFormBean() {
        
    }
}