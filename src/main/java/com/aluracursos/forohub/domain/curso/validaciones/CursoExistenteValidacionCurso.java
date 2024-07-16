package com.aluracursos.forohub.domain.curso.validaciones;

import com.aluracursos.forohub.infra.errores.ValidacionDeIntegridad;
import com.aluracursos.forohub.domain.curso.CursoRepository;
import com.aluracursos.forohub.domain.curso.DatosCrearCurso;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CursoExistenteValidacionCurso implements ValidadorCurso{

    @Autowired
    CursoRepository repository;

    @Override
    public void validar(DatosCrearCurso datos) {
        if (repository.existsByNombre(datos.nombre())) {
            throw new ValidationException("Ya existe un curso con ese nombre");
        }
        if (datos.nombre() == null) {
            throw new ValidacionDeIntegridad("El nombre del curso no puede quedar vacio");
        }
    }
}
