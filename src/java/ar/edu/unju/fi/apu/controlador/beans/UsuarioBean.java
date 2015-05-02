package ar.edu.unju.fi.apu.controlador.beans;

import ar.edu.unju.fi.apu.dao.IUsuarioDAO;
import ar.edu.unju.fi.apu.dao.imp.ram.UsuarioDAOImp;
import ar.edu.unju.fi.apu.modelo.dominio.Persona;
import ar.edu.unju.fi.apu.modelo.dominio.Usuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class UsuarioBean {
    private Usuario usuario;
    
    public UsuarioBean() {
        Usuario usuarioSesion = (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuarioValidado");
        if(usuarioSesion != null){
            String nombreUsuario = usuarioSesion.getNombreUsuario();
            IUsuarioDAO usuarioDAO = new UsuarioDAOImp();
            usuario = usuarioDAO.obtenerUsuario(nombreUsuario);
            if(usuario.getPersona() == null){
                usuario.setPersona(new Persona());
            }
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
