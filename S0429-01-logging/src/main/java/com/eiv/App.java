package com.eiv;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger LOG = Logger.getLogger("App de prueba");
    
    public static void main(String[] args) {
        //LOG.info("Hola Logging!");
        LOG.log(Level.INFO, "Estamos al horno!");
        LOG.log(Level.WARNING, "Estamos al horno!");
        LOG.log(Level.SEVERE, "Estamos al horno y fritos!");
        LOG.log(Level.FINE, "Estamos al horno y hay esperanza!");
        
        //Log4J2 <-- Más común. (Usa spring)
        //LogBAck <-- 
    }

}
