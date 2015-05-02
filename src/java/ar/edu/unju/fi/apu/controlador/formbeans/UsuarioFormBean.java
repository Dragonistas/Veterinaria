package ar.edu.unju.fi.apu.controlador.formbeans;

import ar.edu.unju.fi.apu.controlador.beans.UsuarioBean;
import ar.edu.unju.fi.apu.dao.IUsuarioDAO;
import ar.edu.unju.fi.apu.dao.imp.ram.UsuarioDAOImp;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class UsuarioFormBean {
    
    @ManagedProperty(value = "#{usuarioBean}")
    private UsuarioBean usuarioBean;
    
    public UsuarioFormBean() {
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }
    
    public void actualizarDatos(){
        IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
        usuarioDAO.modificar(usuarioBean.getUsuario());
        FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_INFO, "Datos Actualizados", "Datos actualizados");
        FacesContext.getCurrentInstance().addMessage(null, facesMessage);
    }
}
