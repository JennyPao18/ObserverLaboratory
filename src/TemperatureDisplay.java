/*
    PRIMER OBSERVADOR
    Este observador se encargará de mostrar la temperatura actual
*/

public class TemperatureDisplay implements Observer{
    //Implementación del método "update"
    @Override
    public void update(int temperature) {
        //Imprimir la temperatura
        System.out.println("Temperature: " + temperature + "°C");
    }
}
