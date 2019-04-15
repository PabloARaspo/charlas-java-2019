package com.eiv;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.eiv.PrestamoCuota.Periodo.Mes;

public class PrestamoDataSourceImpl implements PrestamoDataSource {

    private Map<Long, List<PrestamoCuota>> prestamos;
    
    public PrestamoDataSourceImpl() {
        prestamos = new HashMap<>();
        List<PrestamoCuota> cuotas = new ArrayList<PrestamoCuota>();
        cuotas.add(new
                PrestamoCuota(
                        1L,
                        PrestamoCuota.Periodo.of(2019,  Mes.ABRIL),
                        LocalDate.of(2019, 4, 20),
                        BigDecimal.valueOf(1000L),
                        BigDecimal.valueOf(10L)
                )
       );
       cuotas.add(new
                PrestamoCuota(
                        2L,
                        PrestamoCuota.Periodo.of(2019,  Mes.MAYO),
                        LocalDate.of(2019, 4, 20),
                        BigDecimal.valueOf(1000L),
                        BigDecimal.valueOf(10L)
                )
       );
       cuotas.add(new
               PrestamoCuota(
                       3L,
                       PrestamoCuota.Periodo.of(2019,  Mes.JUNIO),
                       LocalDate.of(2019, 4, 20),
                       BigDecimal.valueOf(1000L),
                       BigDecimal.valueOf(10L)
               )
      );
       
      prestamos.put(1L, cuotas);
    }

    @Override
    public List<PrestamoCuota> buscarPrestamo(Long prestamoId) {
        return prestamos.get(prestamoId);
    }
}
