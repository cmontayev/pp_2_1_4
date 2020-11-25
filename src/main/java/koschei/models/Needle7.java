package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;

public class Needle7 {
    @Autowired
    private Deth8 deth8;

     @Override
    public String toString() {
        return "," +deth8.toString()+ " на игле :( " + "";
    }
}
