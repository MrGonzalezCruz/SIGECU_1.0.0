package com.sigecu.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QCursos is a Querydsl query type for Cursos
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCursos extends EntityPathBase<Cursos> {

    private static final long serialVersionUID = -1276117145L;

    public static final QCursos cursos = new QCursos("cursos");

    public final StringPath cDescripcion = createString("cDescripcion");

    public final StringPath cNombre = createString("cNombre");

    public final NumberPath<Integer> idCurso = createNumber("idCurso", Integer.class);

    public QCursos(String variable) {
        super(Cursos.class, forVariable(variable));
    }

    public QCursos(Path<? extends Cursos> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCursos(PathMetadata metadata) {
        super(Cursos.class, metadata);
    }

}

