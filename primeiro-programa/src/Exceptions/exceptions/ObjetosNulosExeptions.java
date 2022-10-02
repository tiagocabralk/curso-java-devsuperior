package Exceptions.exceptions;

import java.io.Serial;

public class ObjetosNulosExeptions extends Exception{
    @Serial
    private static final long serialVersionUID = 1L;

    public ObjetosNulosExeptions(String msg) {
        super(msg);
    }

}
