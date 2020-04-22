package com.company.pelicula;

import java.util.Scanner;

public class movieController extends Movie{

    public Movie addMovie(){
        Movie pelicula = new Movie();
        Scanner scanPelicula = new Scanner(System.in);

        System.out.println("\nIngrese el titulo de la Pelicula: ");
        pelicula.setTitulo(scanPelicula.nextLine());
        System.out.println("\nIngrese Fecha de Lanzamiento: ");
        pelicula.setFechaDeLanzamiento(scanPelicula.nextLine());
        System.out.println("\nIngrese la Duracion: ");
        pelicula.setDuracion(scanPelicula.nextInt());
        System.out.println("Ingrese Clasificacion: ");
        pelicula.setClasificacion(scanPelicula.nextLine());
        System.out.println();

        return pelicula;
    }
}
