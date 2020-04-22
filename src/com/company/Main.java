package com.company;

import com.company.alquiler.Alquiler;
import com.company.clientData.Client;
import com.company.clientData.Order;
import com.company.pelicula.Movie;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here


        VideoClub biblioteca = new VideoClub();

        //Inicializacion de Peliculas
        Movie pelicula1 = new Movie("Interestelar", "14/04/2014", 124, "Aventura","PG-13", "EEUU", "Viajes intergalacticos y demas", 5);
        Movie pelicula2 = new Movie("Big Lebowski", "07/06/1982", 110, "Comedia","PG", "EEUU", "Algo pasa y se vuelven todos locos", 3);
        Movie pelicula3 = new Movie("El Conjuro", "27/02/2012", 94, "Terror","R", "EEUU", "Espiritus y esas cosas de miedo", 2);
        Movie pelicula4 = new Movie("Avengers 1", "17/09/2012", 107, "Accion","G", "EEUU", "Se juntan todos de la nada y matan a todos los malos", 7);
        Movie pelicula5 = new Movie("Deadpool", "08/08/2015", 98, "Accion","NC-17", "EEUU", "Reconstruccion estereotipo de heroe", 4);
        Movie pelicula6 = new Movie("Harry Potter 1", "07/04/2001", 90, "Aventura","PG", "EEUU", "Si te gusta la magia..", 3);
        Movie pelicula7 = new Movie("Weekend at Bernies", "11/07/1984", 101, "Comedia","PG", "EEUU", "Dos pasantes matan a su jefe y hacen parecer que sigue vivo", 2);
        Movie pelicula8 = new Movie("El Conjuro 2", "28/02/2016", 97, "Terror","R", "EEUU", "Si pensabas que con la primera era suficiente, sacaron otra", 6);
        Movie pelicula9 = new Movie("Sinister", "04/01/2015", 89, "Terror","R", "EEUU", "Exclente para una noche de tormenta", 4);
        Movie pelicula10 = new Movie("The Last Dance", "20/04/2020", 157, "Documental","G", "EEUU", "Michael Jordan.", 3);

        //Agrego Peliculas al ArrayList que contiene todas las Peliculas del VC
        biblioteca.catalogoDePeliculas.add(pelicula1);
        biblioteca.catalogoDePeliculas.add(pelicula2);
        biblioteca.catalogoDePeliculas.add(pelicula3);
        biblioteca.catalogoDePeliculas.add(pelicula4);
        biblioteca.catalogoDePeliculas.add(pelicula5);
        biblioteca.catalogoDePeliculas.add(pelicula6);
        biblioteca.catalogoDePeliculas.add(pelicula7);
        biblioteca.catalogoDePeliculas.add(pelicula8);
        biblioteca.catalogoDePeliculas.add(pelicula9);
        biblioteca.catalogoDePeliculas.add(pelicula10);

        //Inicializo Clientes
        Client cliente1=new Client("Matias Portela", 4957648, "25 de Mayo 2575");
        Client cliente2=new Client("Spiderman", 11584765, "Colon y la Costa");
        Client cliente3=new Client("John Bon Jovi", 15887849, "P. Ramos 541 5");
        Client cliente4=new Client("Mauricio Fernandez", 48547854, "Casa Bordo");
        Client cliente5=new Client("Ronald McDonalds", 56878855, "Jujuy 6949");

        //Agrego Clientes al Listado de Clientes del VC
        biblioteca.listadoDeClientes.add(cliente1);
        biblioteca.listadoDeClientes.add(cliente2);
        biblioteca.listadoDeClientes.add(cliente3);
        biblioteca.listadoDeClientes.add(cliente4);
        biblioteca.listadoDeClientes.add(cliente5);

        //Inicializo Alquileres hecho
        Alquiler alquiler1= new Alquiler(cliente1, pelicula8, "14/04/2020", "21/04/2020");
        Alquiler alquiler2= new Alquiler(cliente3, pelicula8, "15/04/2020", "22/04/2020");
        Alquiler alquiler3= new Alquiler(cliente1, pelicula9, "16/04/2020", "23/04/2020");
        Alquiler alquiler4= new Alquiler(cliente2, pelicula8, "20/04/2020", "27/04/2020");
        Alquiler alquiler5= new Alquiler(cliente4, pelicula10, "21/04/2020", "28/04/2020");
        Alquiler alquiler6= new Alquiler(cliente1, pelicula1, "22/04/2020", "29/04/2020");

        //Agrego los alquileres al array de Alquileres de cada Cliente
        cliente1.setPeliculasRetiradas(alquiler1);
        cliente1.setPeliculasRetiradas(alquiler3);
        cliente3.setPeliculasRetiradas(alquiler2);
        cliente2.setPeliculasRetiradas(alquiler4);
        cliente4.setPeliculasRetiradas(alquiler5);
        cliente1.setPeliculasRetiradas(alquiler6);

        //Agrego los Alquileres al Historial de Alquileres del VC
        biblioteca.historialDePedidos.add(alquiler1);
        biblioteca.historialDePedidos.add(alquiler2);
        biblioteca.historialDePedidos.add(alquiler3);
        biblioteca.historialDePedidos.add(alquiler4);
        biblioteca.historialDePedidos.add(alquiler5);
        biblioteca.historialDePedidos.add(alquiler6);

        //Incremento la cantidad de alquileres que tuvo cada pelicula
        biblioteca.catalogoDePeliculas.get(7).setCantidadDeRetiros(3);
        biblioteca.catalogoDePeliculas.get(0).setCantidadDeRetiros(1);
        biblioteca.catalogoDePeliculas.get(8).setCantidadDeRetiros(1);
        biblioteca.catalogoDePeliculas.get(9).setCantidadDeRetiros(1);
        //Decremento el stock actual de Peliculas (estan alquiladas)
        biblioteca.catalogoDePeliculas.get(7).setStock(biblioteca.catalogoDePeliculas.get(7).getStock()-3);
        biblioteca.catalogoDePeliculas.get(0).setStock(biblioteca.catalogoDePeliculas.get(7).getStock()-1);
        biblioteca.catalogoDePeliculas.get(8).setStock(biblioteca.catalogoDePeliculas.get(7).getStock()-1);
        biblioteca.catalogoDePeliculas.get(9).setStock(biblioteca.catalogoDePeliculas.get(7).getStock()-1);
        //Me devolvieron las peliculas e incremento el stock actual
        biblioteca.historialDePedidos.get(0).setPeliculaDevuelta(true);
        biblioteca.historialDePedidos.get(1).setPeliculaDevuelta(true);
        biblioteca.catalogoDePeliculas.get(7).setStock(biblioteca.catalogoDePeliculas.get(7).getStock()+1);
        biblioteca.catalogoDePeliculas.get(0).setStock(biblioteca.catalogoDePeliculas.get(7).getStock()+1);

        Scanner scanner = new Scanner(System.in);
        int opcionSwitch;
        System.out.println("Ingrese una opcion: " + "\n1.Alquileres Vigentes" + "\n2.Devoluciones del dia" +
                            "\n3.Alquileres de Clientes" + "\n4.Titulos Populares" +
                            "\n5.Buscar por genero" + "\n6.Informacion de un Titulo");
        opcionSwitch=scanner.nextInt();

        String wordToSearch= null;
        Scanner scannerSwitch = new Scanner(System.in);

        switch (opcionSwitch){
            case 1:
                List <Alquiler> alquileresVigentes = new ArrayList<>();

                alquileresVigentes=biblioteca.getAlquileresVigentes();

                alquileresVigentes.stream()
                        .forEach(System.out::println);

                if (alquileresVigentes.isEmpty()){
                    System.out.println("\nNo hay alquileres vigentes");
                }

                break;

            case 2:

                List <Alquiler> devolucionesDelDia = new ArrayList<>();
                System.out.println("Ingrese la Fecha de la devolucion: ");
                wordToSearch=scannerSwitch.nextLine();


                devolucionesDelDia= biblioteca.getDevolucionesDelDia(wordToSearch);
                devolucionesDelDia.stream()
                        .forEach(System.out::println);

                if (devolucionesDelDia.isEmpty()){
                    System.out.println("No hay devoluciones para el dia: " + wordToSearch);
                }

                break;

            case 3:
                Client clientToSearch = new Client();
                System.out.println("Ingrese el Nombre del Cliente: ");
                wordToSearch=scannerSwitch.nextLine();

                clientToSearch=biblioteca.buscarCliente(wordToSearch);

                if (clientToSearch ==  null){
                    System.out.println("No se encontro al cliente");
                }else {
                    List alquileresCliente = new ArrayList();
                    alquileresCliente = clientToSearch.getClientMovieList();

                    alquileresCliente.stream()
                            .forEach(System.out::println);
                }
                break;

            case 4:
                biblioteca.catalogoDePeliculas.stream()
                        .sorted(Comparator.comparingInt(Movie::getCantidadDeRetiros).reversed())
                        .forEach(System.out::println);
                break;

            case 5:

                List <Movie> peliculasGeneroXPopularidad= new ArrayList<>();

                System.out.println("\nIngrese el genero que desea ver: ");
                wordToSearch=scannerSwitch.nextLine();
                peliculasGeneroXPopularidad=biblioteca.peliculasPopularesPorGenero(wordToSearch);


                if (peliculasGeneroXPopularidad.isEmpty()){
                    System.out.println("No hay peliculas de " + wordToSearch);
                }else {
                    peliculasGeneroXPopularidad.stream()
                            .sorted(Comparator.comparingInt(Movie::getCantidadDeRetiros).reversed())
                            .forEach(System.out::println);
                }

                break;

            case 6:
                Movie pelicula= new Movie();
                System.out.println("\nIngrese el Titulo: ");
                wordToSearch=scannerSwitch.nextLine();

                pelicula=biblioteca.getPelicula(wordToSearch);

                System.out.println("\nDescripcion de " + wordToSearch + ":");
                System.out.println(pelicula.getDescripcion());


                break;

            default:
                System.out.println("Ingrese una opcion valida.");
        }
    }
}

