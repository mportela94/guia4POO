package com.company.clientData;

import com.company.pelicula.Movie;

import java.lang.annotation.Inherited;
import java.util.*;

public class Order{

    private Client cliente;
    private List <Movie> peliculasRetiradas;
    private Date fechaDeRetiro;
    private Date fechaDeDevolucion;

    public Order(){
        this.cliente=null;
        this.peliculasRetiradas=new ArrayList<>();
        this.fechaDeRetiro=null;
        this.fechaDeDevolucion=null;
    }

    public Order (Client informacionCliente, List peliculaRetirada){
        this.cliente=informacionCliente;
        this.peliculasRetiradas=peliculaRetirada;
        this.fechaDeRetiro= new Date();
        this.fechaDeDevolucion= sumarRestarDiasFecha(fechaDeRetiro, 7);
    }

    public void setFechaDeRetiro (Date fechaDeRetiro){
        this.fechaDeRetiro=new Date();
    }

    public Date getFechaDeRetiro (){
        return fechaDeRetiro;
    }

    public void setFechaDeDevolucion (Date fechaDeDevolucion){
        this.fechaDeDevolucion=sumarRestarDiasFecha(fechaDeRetiro, 7);
    }

    public Date getFechaDeDevolucion (){
        return fechaDeDevolucion;
    }

    public Date sumarRestarDiasFecha(Date fecha, int dias){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaDeRetiro); // Configuramos la fecha que se recibe
        calendar.add(Calendar.DAY_OF_YEAR, dias);  // numero de días a añadir, o restar en caso de días<0
        return calendar.getTime(); // Devuelve el objeto Date con los nuevos días añadidos
    }

    @Override
    public String toString(){
        return (super.toString() +
                "\nFecha de Retiro: " + fechaDeRetiro +
                "\nFecha de Devolucion: " + fechaDeDevolucion);
    }


}
