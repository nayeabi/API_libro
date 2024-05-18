package com.demo.hola_spring.modelos;

public class Libro {
    private Long id;
    private String titulo;
    private String autor;
    private String editorial;
    private Integer aniopublicacion;
    public Libro() {
    }

    public Libro(Long id, String titulo, String autor, String editorial, Integer aniopublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.aniopublicacion = aniopublicacion;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
    public Integer getAniopublicacion() {
        return aniopublicacion;
    }
    public void setAniopublicación(Integer aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

}    