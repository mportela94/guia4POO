package com.company.clientData;

import java.util.Scanner;

public class clientController extends Client{

    public Client addClient(){
        Client cliente = new Client();
        Scanner scannerCliente = new Scanner(System.in);

        System.out.println("\nIngrese Nombre y Apellido: ");
        cliente.setNombre(scannerCliente.nextLine());
        System.out.println("\nIngrese Telefono: ");
        cliente.setTelefono(scannerCliente.nextInt());
        System.out.println("\nIngrese Direccion: ");
        cliente.setDireccion(scannerCliente.nextLine());

        return cliente;
    }



}
