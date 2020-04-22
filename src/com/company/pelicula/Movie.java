package com.company.pelicula;

import com.company.VideoClub;

import java.util.List;

public class Movie extends VideoClub {

    private String titulo;
    private String fechaDeLanzamiento;
    private int duracion;
    private String genero;
    private String clasificacion;
    private String paisDeOrigen;
    private String descripcion;
    private int stock;
    private int cantidadDeRetiros;

    public Movie(){
        this.titulo=null;
        this.fechaDeLanzamiento=null;
        this.duracion=0;
        this.genero=null;
        this.clasificacion=null;
        this.paisDeOrigen=null;
        this.descripcion=null;
        this.stock=0;
        this.cantidadDeRetiros=0;
    }

    public Movie (String titulo, String fechaDeLanzamiento, int duracion, String genero,String clasificacion, String paisDeOrigen, String descripcion, int stock){
        this.titulo=titulo;
        this.fechaDeLanzamiento=fechaDeLanzamiento;
        this.duracion=duracion;
        this.genero=genero;
        this.clasificacion=clasificacion;
        this.paisDeOrigen=paisDeOrigen;
        this.descripcion=descripcion;
        this.stock=stock;
        this.cantidadDeRetiros=0;
    }

    public void setTitulo(String titulo){
        this.titulo=titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setFechaDeLanzamiento (String fechaDeLanzamiento){
        this.fechaDeLanzamiento=fechaDeLanzamiento;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setDuracion (int duracion){
        this.duracion=duracion;
    }

    public int getDuracion(){
        return duracion;
    }

    public void setGenero(String genero){
        this.genero=genero;
    }

    public String getGenero(){
        return genero;
    }

    public void setClasificacion(String clasificacion){
        this.clasificacion=clasificacion;
    }

    public String getClasificacion(){
        return clasificacion;
    }

    public void setPaisDeOrigen(String paisDeOrigen){
        this.paisDeOrigen=paisDeOrigen;
    }

    public String getPaisDeOrigen(){
        return paisDeOrigen;
    }

    public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setStock(int stock){
        this.stock=stock;
    }

    public int getStock(){
        return stock;
    }

    public void setCantidadDeRetiros(int cantidadDeRetiros){
        this.cantidadDeRetiros=cantidadDeRetiros;
    }

    public int getCantidadDeRetiros(){
        return cantidadDeRetiros;
    }


    @Override
    public String toString(){
        return ("\nTitulo: " + titulo +
                "\nFecha de Lanzamiento: " + fechaDeLanzamiento +
                "\nDuracion: " + duracion + " minutos" +
                "\nClasificacion: " + clasificacion +
                "\nPais de Origen: " + paisDeOrigen +
                "\nDescripcion: " + descripcion +
                "\nCantidad de Alquileres: " + cantidadDeRetiros);
    }

}
