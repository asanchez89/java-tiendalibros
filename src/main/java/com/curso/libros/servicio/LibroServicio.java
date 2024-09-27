package com.curso.libros.servicio;

import com.curso.libros.modelo.Libro;
import com.curso.libros.repositorio.LibroRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LibroServicio implements ILibroServicio{
    @Autowired
    private LibroRepositorio libroRepositorio;
    @Override
    public List<Libro> listarLibros() {
        return libroRepositorio.findAll();
    }

    @Override
    public Libro buscarLibroPorId(Integer idLibro) {
        Libro libro = libroRepositorio.findById(idLibro).orElse(null);
    }

    @Override
    public void guardarLibro(Libro libro) {
        libroRepositorio.save(libro);
    }

    @Override
    public void eliminarLibro(Libro libro) {
        libroRepositorio.delete(libro);
    }
}
