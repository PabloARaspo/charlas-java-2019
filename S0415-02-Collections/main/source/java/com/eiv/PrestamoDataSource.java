package com.eiv;

import java.util.List;

public interface PrestamoDataSource {
    public List<PrestamoCuota> buscarPrestamo(Long prestamoId);
}
