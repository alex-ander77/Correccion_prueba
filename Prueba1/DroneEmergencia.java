package Prueba1;

public class DroneEmergencia extends Drones{
    private double recargoUrgencia;
    private int nivelPrioridad;
    public DroneEmergencia(String codigo, String modelo, double distanciaKm, double pesoPaquete, double horasVuelo, double costoBase, double recargoUrgencia, int nivelPrioridad) {
        super(codigo, modelo, distanciaKm, pesoPaquete, horasVuelo, costoBase);
        this.recargoUrgencia = recargoUrgencia;
        this.nivelPrioridad = nivelPrioridad;
    }

    public double getRecargoUrgencia() {
        return recargoUrgencia;
    }

    public void setRecargoUrgencia(double recargoUrgencia) {
        this.recargoUrgencia = recargoUrgencia;
    }

    public int getNivelPrioridad() {
        return nivelPrioridad;
    }

    public void setNivelPrioridad(int nivelPrioridad) {
        this.nivelPrioridad = nivelPrioridad;
    }

    @Override
    public double calcularCostoEntrega() {
        return costoBase + (getDistanciaKm() * 1.0) + recargoUrgencia;
    }

    @Override
    public boolean validarDatos() {
        return getPesoPaquete() <= 10 && getHorasVuelo() <= 3 && nivelPrioridad >= 1 && nivelPrioridad <= 3;
    }
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Recargo urgencia: " + recargoUrgencia);
        System.out.println("Nivel prioridad: " + nivelPrioridad);
        System.out.println("Costo entrega: " + calcularCostoEntrega());
    }

}
