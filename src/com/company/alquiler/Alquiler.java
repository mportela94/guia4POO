package com.company.alquiler;

import com.company.clientData.Client;
import com.company.pelicula.Movie;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Alquiler {

    private Client cliente;
    private Movie peliculaRetirada;
    private String fechaDeRetiro;
    private String fechaDeDevolucion;
    private boolean peliculaDevuelta;

    public Alquiler(){
        this.cliente=null;
        this.peliculaRetirada=null;
        this.fechaDeRetiro=null;
        this.fechaDeDevolucion=null;
        this.peliculaDevuelta=false;
    }

    public Alquiler(Client informacionCliente, Movie peliculaRetirada, String fechaDeRetiro, String fechaDeDevolucion){
        this.cliente=informacionCliente;
        this.peliculaRetirada=peliculaRetirada;
        this.fechaDeRetiro= fechaDeRetiro;
        this.fechaDeDevolucion= fechaDeDevolucion;
        this.peliculaDevuelta= false;
    }

    public Client getCliente() {
        return cliente;
    }

    public void setCliente(Client cliente) {
        this.cliente = cliente;
    }

    public Movie getPeliculaRetirada() {
        return peliculaRetirada;
    }

    public void setPeliculaRetirada(Movie peliculaRetirada) {
        this.peliculaRetirada = peliculaRetirada;
    }

    public void setFechaDeRetiro (String fechaDeRetiro){
        this.fechaDeRetiro=fechaDeRetiro;
    }

    public String  getFechaDeRetiro (){
        return fechaDeRetiro;
    }

    public void setFechaDeDevolucion (String fechaDeDevolucion){
        this.fechaDeDevolucion=fechaDeDevolucion;
    }

    public String  getFechaDeDevolucion (){
        return fechaDeDevolucion;
    }

    public void setPeliculaDevuelta(boolean b){
        this.peliculaDevuelta=b;
    }

    public boolean getPeliculaDevuelta(){
        return peliculaDevuelta;
    }


    @Override
    public String toString(){
        return (cliente.toString() + peliculaRetirada.toString() +
                "\nFecha de Retiro: " + fechaDeRetiro +
                "\nFecha de Devolucion: " + fechaDeDevolucion);
    }


}
