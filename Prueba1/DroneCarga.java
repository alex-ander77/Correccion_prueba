package Prueba1;

public class DroneCarga extends Drones{
    private double costoPorKg;
    public DroneCarga(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase, double costoPorKg) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, costoBase);
        this.costoPorKg = costoPorKg;
    }

    public double getCostoPorKg() {
        return costoPorKg;
    }

    public void setCostoPorKg(double costoPorKg) {
        this.costoPorKg = costoPorKg;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 0.7) + (getPesoPaquete() * getCostoPorKg());
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 30 && getHorasVuelo() <= 5;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Costo por KG: " + costoPorKg);
        System.out.println("Costo entrega: " + calcularCostoEntrega());
    }
}
