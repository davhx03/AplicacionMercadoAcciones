package org.example;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Accion {
    @JacksonXmlProperty(localName = "nombre")
    private String nombre;

    @JacksonXmlProperty(localName = "precio")
    private double precio;

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio =precio;
}
}
