package com.aluracursos.forohub.domain.curso;

import com.aluracursos.forohub.domain.topico.DatosTopico;
import org.springframework.data.domain.Page;

public record DatosCursoTopicos(DatosCurso curso, Page<DatosTopico> topicos) {

}
