package ar.edu.unju.fi.apu.dao;

import ar.edu.unju.fi.apu.modelo.dominio.Usuario;

public interface IUsuarioDAO {
    
    Usuario validarUsuario(String nombreUsuario, String password);
    void modificar(Usuario unUsuario);
    Usuario obtenerUsuario(String nombreUsuario);
}