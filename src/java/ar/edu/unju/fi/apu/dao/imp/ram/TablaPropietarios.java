package ar.edu.unju.fi.apu.dao.imp.ram;

import ar.edu.unju.fi.apu.modelo.dominio.Propietario;
import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;

public class TablaPropietarios {
    public static List<Propietario> tablaPropietarios;
    
    public static void llenarTabla(){
        tablaPropietarios = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1979, 0, 21);
        tablaPropietarios.add(new Propietario("Direccion 01", "(54) 388 123456", "31590111", "apelii", "name", null));
    }
}
