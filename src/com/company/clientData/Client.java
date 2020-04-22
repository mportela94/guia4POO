package com.company.clientData;

import com.company.VideoClub;
import com.company.alquiler.Alquiler;
import com.company.pelicula.Movie;


import java.util.ArrayList;
import java.util.List;

public class Client extends VideoClub {

    protected String nombre;
    protected int telefono;
    protected String direccion;
    protected List <Alquiler> peliculasRetiradas;

    public Client (){
        this.nombre=null;
        this.telefono=0;
        this.direccion=null;
        peliculasRetiradas=new ArrayList<>();
    }

    public Client (String nombre, int telefono, String direccion){
        this.nombre=nombre;
        this.telefono=telefono;
        this.direccion=direccion;
        peliculasRetiradas=new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getNombre(){
        return nombre;
    }

    public void setTelefono (int telefono){
        this.telefono=telefono;
    }

    public int getTelefono(){
        return telefono;
    }

    public void setDireccion(String direccion){
        this.direccion=direccion;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setPeliculasRetiradas (Alquiler peliculaAlquilada){
        peliculasRetiradas.add(peliculaAlquilada);
    }

    public List getClientMovieList(){
        return peliculasRetiradas;
    }

    @Override
    public String toString(){
        return ("\nNombre: " + nombre +
                "\nDireccion: " + direccion +
                "\nTelefono: " + telefono);
    }

}
