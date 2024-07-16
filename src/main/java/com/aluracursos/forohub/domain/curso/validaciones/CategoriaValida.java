package com.aluracursos.forohub.domain.curso.validaciones;

import com.aluracursos.forohub.infra.errores.ValidacionDeIntegridad;
import com.aluracursos.forohub.domain.curso.DatosCrearCurso;
import org.springframework.stereotype.Component;

@Component
public class CategoriaValida implements ValidadorCurso{

    @Override
    public void validar(DatosCrearCurso datos) {
        if (datos.categoria() == null) {
            throw new ValidacionDeIntegridad("Debe asignarle una categoria al curso");
        }
        //Validar Enum

    }
}
