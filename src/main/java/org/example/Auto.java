package org.example;

public class Auto {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;
    private double kilometraje;
    private  String estado;

    public Auto(String placa, String marca, String modelo, int anio, Double kilometraje, String estado) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
        this.estado = estado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(Double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarDetalles(){
        System.out.println("Marca del auto: "+ marca);
        System.out.println("Modelo del auto: " + modelo);
        System.out.println("Año del auto: " + anio);
        System.out.println("Kilometraje del auto: " + kilometraje);
        System.out.println("Estado del auto: " + estado);
    }
    public void actualizarKilometraje(double nuevoKilometraje){
        if (nuevoKilometraje > kilometraje){
            kilometraje = nuevoKilometraje;
        } else {
            System.out.println("No se puede restar el kilometraje");
        }
    }
    public boolean esAntiguo(){
        int anioActual = java.time.Year.now().getValue();
        return (anioActual - anio) > 15;
    }
    public boolean necesitaMantenimiento(){
        if (kilometraje > 100000){
            System.out.println("El auto ya necesita mantenimiento!");
            return true;
        } else {
            System.out.println("El auto aun no necesita mantenimiento");
            return false;
        }
    }
    public double calcularConsumoCombustible(double distanciaRecorrida, double rendimientoVehiculo){
        if (distanciaRecorrida <= 0) {
            System.out.println("La distancia recorrida debe ser mayor que 0");
            return 0;
        } else {
            return distanciaRecorrida / rendimientoVehiculo;
        }
    }
    public double combustibleRestante(double combustibleInicial, double distanciaRecorrida, double consumoporKm){
        if (distanciaRecorrida <= 0){
            System.out.println("La distancia debe ser mayor que 0");
            return 0;
        } else{
            double combustibleConsumido = distanciaRecorrida * consumoporKm;
            double restante = combustibleInicial - combustibleConsumido;
            if(restante < 0){
                System.out.println("No queda combustible en el tanque. Debe llenarlo antes de viajar de nuevo");
                return 0;
            } else {
                System.out.println("El combustible que queda en el tanque del vehiculo es: " + restante);
                return restante;
            }

        }
    }
}
