package com.example.demo.domain.respuestas;

import lombok.NonNull;

public record DatosActualizarRespuesta(
        @NonNull
        Long id,
        String mensaje,
        Boolean solucion
) {
}