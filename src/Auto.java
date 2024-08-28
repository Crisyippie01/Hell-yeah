/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Crisyippie
 * @version 28-08-2024
 */
public class Auto {
    
    private String marca,modelo,color,tipoCombustible,tipoTransmision;
    private int año,cantidadPuertas;
    private double cilindrada;

    public Auto() {
        marca = "Toyota";
        modelo = "JSAJDA";
    }

    public Auto(String marca, String modelo, String color, String tipoCombustible, String tipoTransmision, int año, int cantidadPuertas, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
        this.tipoTransmision = tipoTransmision;
        this.año = año;
        this.cantidadPuertas = cantidadPuertas;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipoCombustible=" + tipoCombustible + ", tipoTransmision=" + tipoTransmision + ", a\u00f1o=" + año + ", cantidadPuertas=" + cantidadPuertas + ", cilindrada=" + cilindrada + '}';
    }

    public static void main(String[] args) {
        
        Auto objAuto1 = new Auto();
        System.out.println("Marca: " + objAuto1.getMarca());
        System.out.println("Modelo: " + objAuto1.getModelo());
        
        System.out.println(objAuto1.toString());
        
        Auto objAuto2 = new Auto("VM","Escarabajo","Amarillo","Mecanica","Bencinero",1981,2,1500);
        System.out.println("");
        System.out.println("Marca: " + objAuto2.getMarca());
        System.out.println("Modelo: " + objAuto2.getModelo());
        
        System.out.println(objAuto2.toString());
        
    }
    
}
