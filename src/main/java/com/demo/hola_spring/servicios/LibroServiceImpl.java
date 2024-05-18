package com.demo.hola_spring.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.demo.hola_spring.modelos.Libro;
import com.demo.hola_spring.repositories.LibroRepositoryImpl;

@Service
public class LibroServiceImpl {
    private final LibroRepositoryImpl libroRepositoryImpl;

    public LibroServiceImpl(LibroRepositoryImpl libroRepositoryImpl) {
        this.libroRepositoryImpl = libroRepositoryImpl;
    }

    public List<Libro> getAllLibros() {
        return libroRepositoryImpl.findAll();
    }

    public Optional<Libro> getLibroById(Long id) {
        return libroRepositoryImpl.findById(id);
    }

    public void addLibro(Libro libro) {
        libroRepositoryImpl.save(libro);
    }

}
