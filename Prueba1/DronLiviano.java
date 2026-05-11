package Prueba1;

public class DronLiviano extends Drones{
    private double limiteHoras;
    public DronLiviano(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase, double limiteHoras) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, costoBase);
        this.limiteHoras = limiteHoras;
    }

    public double getLimiteHoras() {
        return limiteHoras;
    }

    public void setLimiteHoras(double limiteHoras) {
        this.limiteHoras = limiteHoras;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 0.5);
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 5 && getHorasVuelo() <= 2;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Limite horas: " + limiteHoras);
        System.out.println("Costo entrega: " + calcularCostoEntrega());
    }
}
