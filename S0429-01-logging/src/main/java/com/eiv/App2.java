package com.eiv;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.eiv.sub.SubClase;

public class App2 {
    
    private static final Logger LOG = LogManager.getLogger(App2.class);

    public static void main(String[] args) {
        LOG.trace("Mayor detalle");
        LOG.debug("Muestro información util para depurar app.");
        
        LOG.info("Mensaje de información");
        LOG.warn("Iformación de advertencia");
        LOG.error("Mensaje de error.");
        LOG.fatal("Nivel de error fatal!");
        
        try {
            SubClase.dividir(10, 0);
        } catch (RuntimeException e) {
            if (LOG.isDebugEnabled()) {
                LOG.error("No se puede dividir por cero!", e);
            }
            else {
                LOG.error("No se puede dividir por cero!");
            }
        }
        
        

    }

}
