package ar.edu.unju.fi.apu.dao.imp.ram;

import ar.edu.unju.fi.apu.modelo.dominio.Persona;
import ar.edu.unju.fi.apu.modelo.dominio.Usuario;

public class ListadoUsuarios extends Usuario{
    public static Usuario[] listadoUsuarios = {new Usuario("test", "test", null, null, true), null, null, null, null};

    public ListadoUsuarios(String nombreUsuario, String password, String correoElectronico, Persona persona, boolean estado) {
        super(nombreUsuario, password, correoElectronico, persona, estado);
    }
}
