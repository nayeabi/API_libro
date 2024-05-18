package com.demo.hola_spring.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.demo.hola_spring.modelos.Libro;

@Repository
public class LibroRepositoryImpl implements LibroRepository {
    private List<Libro> libros = new ArrayList<>();


    public LibroRepositoryImpl(){
        libros.add(new Libro(1L, "El Señor de los anillos", "J.R.R.Tolkien","George Allen & Unwin HarperCollins",1954));
        libros.add(new Libro(2L, "El nombre de la rosa", "Umberto Eco", "Bompiani", 1980));
        libros.add(new Libro(3L, "La hipotesis del amor", "Ali Hazelwood", "Contraluz",2022));
    }

    public List<Libro> findAll() {
        return libros;
    }

    public Libro getLibro(int id){
        for(Libro libro: libros){
            if(id == libro.getId())
                return libro;

        }

        return null;
    }

    public Optional<Libro> findById(Long id) {
        return libros.stream().filter(libro -> libro.getId().equals(id)).findFirst();
    }

    public void save(Libro libro) {
        libros.add(libro);
    }

    public List<Libro> getLibros(){
        System.out.println("Conectado a base de datos POSTGRESQL");
        return libros;
    }

}
