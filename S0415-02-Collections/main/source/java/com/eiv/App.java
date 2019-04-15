package com.eiv;

import java.util.List;

public class App {
    
    private PrestamoDataSource datasource;
    
    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    public App() {
        datasource = new PrestamoDataSourceImpl();
    }

    public void run() {
        Long prestamoId = 1L;
        List<PrestamoCuota> prestamo = datasource.buscarPrestamo(prestamoId);
        for(PrestamoCuota cuota : prestamo) {
            System.out.println("Cuota For: " + cuota);
        }
        
        prestamo.forEach(cuota ->System.out.println("Cuota Each encontrada:" + cuota));

        //Optional<PrestamoCuota> optional =
        prestamo.stream()
                .filter(cuota ->
                    cuota.getPeriodo().getMes().equals(PrestamoCuota.Periodo.Mes.ABRIL) &&
                    cuota.getPeriodo().getAnio().equals(2019)
                )
                .findFirst()
                .ifPresent(cuota ->System.out.println("Cuota encontrada:" + cuota));
    }
}
