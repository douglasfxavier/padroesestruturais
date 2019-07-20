package main;

import adpter.SomadorAdapter;

public class App {
    public static void main(String[] args) {

        Cliente cliente = new Cliente(new SomadorAdapter());
        cliente.executar();
    }
}
