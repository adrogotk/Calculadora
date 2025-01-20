package es.etg.psp.calculadora;

import java.net.ServerSocket;

import es.etg.psp.calculadora.Controller.Calculadora;

public class Servidor {
    public static void main(String[] args) throws Exception{
        ServerSocket server = new ServerSocket(Calculadora.PUERTO);  
    }
}
