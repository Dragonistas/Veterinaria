package ar.edu.unju.fi.apu.dao.imp.ram;

import ar.edu.unju.fi.apu.dao.IUsuarioDAO;
import ar.edu.unju.fi.apu.modelo.dominio.Usuario;

public class UsuarioDAOImp implements IUsuarioDAO{

    @Override
    public Usuario validarUsuario(String nombreUsuario, String password) {
        Usuario u = null;
        boolean esHallado = false;
        for(int i=0;i<ListadoUsuarios.listadoUsuarios.length;i++){
            Usuario usuarioDelListado = ListadoUsuarios.listadoUsuarios[i];
            if(usuarioDelListado != null && usuarioDelListado.getNombreUsuario().equals(nombreUsuario) &&
                usuarioDelListado.getPassword().equals(password)){
                u = usuarioDelListado;
                esHallado = true;
            }
        }
        return u;
    }

    @Override
    public void modificar(Usuario unUsuario) {
        boolean esHallado = false;
        for(int i=0;i<ListadoUsuarios.listadoUsuarios.length && esHallado!=true;i++){
            Usuario usuarioDelListado = ListadoUsuarios.listadoUsuarios[i];
            if(usuarioDelListado.getNombreUsuario().equals(unUsuario.getNombreUsuario())) {
                ListadoUsuarios.listadoUsuarios[i] = unUsuario;
                esHallado = true;
            }
        }
    }

    @Override
    public Usuario obtenerUsuario(String nombreUsuario) {
        Usuario u = null;
        boolean esHallado = false;
        for(int i=0;i<ListadoUsuarios.listadoUsuarios.length;i++){
            Usuario usuarioDelListado = ListadoUsuarios.listadoUsuarios[i];
            if(usuarioDelListado != null && usuarioDelListado.getNombreUsuario().equals(nombreUsuario)){
                u = usuarioDelListado;
                esHallado = true;
            }
        }
        return u;
    }
}