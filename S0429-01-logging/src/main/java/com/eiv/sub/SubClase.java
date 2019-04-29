package com.eiv.sub;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class SubClase {

    private static final Logger LOG = LogManager.getLogger(SubClase.class);

    
    public static void run() {
        LOG.info("Este es de subclase!");
        LOG.debug("Error de debaug");
    }
    
    public static int dividir(int a, int b) {
        if (b == 0) {
            //LOG.error("No se puede dividir por cero!!!");
            throw new RuntimeException("Dividir por cero");
        }
        return a / b;
    }
    
}
