package com.company;

import com.company.alquiler.Alquiler;
import com.company.clientData.Client;
import com.company.pelicula.Movie;

import java.lang.ref.Cleaner;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class VideoClub {

    protected List <Movie> catalogoDePeliculas;
    protected List <Client> listadoDeClientes;
    protected List <Alquiler> historialDePedidos;

    public VideoClub (){
        this.catalogoDePeliculas=new ArrayList<>();
        this.listadoDeClientes=new ArrayList<>();
        this.historialDePedidos=new ArrayList<>();
    }

    //Metodos manejo de Peliculas
    public void mostrarPeliculas(){
        for (int i=0; i<catalogoDePeliculas.size(); i++){
            System.out.println(catalogoDePeliculas.get(i).toString());
        }
    }

    public int verificarPelicula(String peliculaBuscada){
        int posicionPelicula=-1;
        for(int i=0; i<catalogoDePeliculas.size(); i++) {
            if(catalogoDePeliculas.get(i).getTitulo().equals(peliculaBuscada))
                posicionPelicula=i;
        }
        return posicionPelicula;
    }

    public int verificaStock(String peliculaBuscada){
        int cintasEnStock = -1;
        int verificaPelicula;

        verificaPelicula = verificarPelicula(peliculaBuscada);

        if (verificaPelicula>=0){
            cintasEnStock=catalogoDePeliculas.get(verificaPelicula).getStock(); // conseguir posicion de la pelicula y guardar el stock para devolverlo
        }

        return cintasEnStock;
    }

    //Metodos manejo de Clientes

    public void verAlquileresDeClientes (){

    }


    //Metodos manejo de Alquileres

    public Alquiler alquilarPelicula(Client cliente, String pelicula){
        int i=0;    //recorre la List catalogo de Peliculas
        Alquiler unAlquiler= new Alquiler();   //sera el alquiler a guardar

        int verificaPelicula=verificarPelicula(pelicula);
        //System.out.println("Verifica Pelicula: " + verificaPelicula);
        int verificaStock=verificaStock(pelicula);
        //System.out.println("Verifica Stock: " + verificaStock);

        if (verificaPelicula >= 0 && verificaStock>0){
            unAlquiler.setCliente(cliente);
            unAlquiler.setPeliculaRetirada(catalogoDePeliculas.get(verificaPelicula));
        }

        return unAlquiler;
    }

    public List getAlquileresVigentes(){
        List <Alquiler> alquileresVigentes=new ArrayList<>();

        for (int i=0; i< historialDePedidos.size(); i++){
            if (historialDePedidos.get(i).getPeliculaDevuelta()==false)
                alquileresVigentes.add(historialDePedidos.get(i));
        }
        return alquileresVigentes;
    }
    
    public List getDevolucionesDelDia(String fecha){
        List <Alquiler> devolucionesDelDia =  new ArrayList<>();

        for (int i=0; i< historialDePedidos.size(); i++){
            if (historialDePedidos.get(i).getFechaDeDevolucion().equals(fecha))
                devolucionesDelDia.add(historialDePedidos.get(i));
        }

        return devolucionesDelDia;
    }

    public List peliculasPopularesPorGenero(String generoBuscado){
        List <Movie> peliculasDelGenero = new ArrayList<>();

        for (int i=0; i<catalogoDePeliculas.size();i++){
            if(catalogoDePeliculas.get(i).getGenero().equals(generoBuscado))
                peliculasDelGenero.add(catalogoDePeliculas.get(i));
        }

        return peliculasDelGenero;
    }

}
