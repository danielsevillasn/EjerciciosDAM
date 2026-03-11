public class PruebaAlarmaDeTemperatura {
    public static void main(String[] args) {
        // Inicializamos los componentes
        Timbre elTimbre = new Timbre();
        AlarmaDeTemperatura alarma = new AlarmaDeTemperatura(40.0, elTimbre);

        System.out.println("--- Iniciando Simulación de Sensor ---");

        // Simulación 1: Temperatura subiendo
        alarma.comprobarTemperatura(35.5);
        alarma.comprobarTemperatura(39.0);
        alarma.comprobarTemperatura(41.2); // Debería sonar

        // Simulación 2: Baja la temperatura
        alarma.comprobarTemperatura(38.0); // Debería apagarse

        // Simulación 3: Cambiamos el límite (por ejemplo, ahora es más sensible)
        System.out.println("\n--- Ajustando sensibilidad de la alarma ---");
        alarma.setLimite(37.0);
        alarma.comprobarTemperatura(38.0); // Ahora vuelve a sonar con 38 porque bajamos el límite
    }
}
