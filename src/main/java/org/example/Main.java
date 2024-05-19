package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            AdaptadorJson adapter = new AdaptadorJson();
            String xmlFilePath = "C:\\Users\\Lenovo\\Documents\\2. Bootcamp Makaia\\Talleres\\untitled\\src\\main\\java\\org\\example\\acciones.xml";

            Acciones acciones = adapter.fromXml(xmlFilePath, Acciones.class);
            String accionesJSon = adapter.toJson(acciones);

            System.out.println(accionesJSon);
        } catch (IOException e) {
            e.printStackTrace();
}
    }
}