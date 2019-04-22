package com.eiv;

public class SumaException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;
    
    public static int dato1_mayor_dato2 = 1;
    public static int dato1_mas_dato2_mayor10 = 2;
    
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public SumaException(int codigo, String message) {
        super(message);
        this.codigo = codigo;
    }
    
    
    
}

