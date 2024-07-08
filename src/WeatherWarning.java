/*
    SEGUNDO OBSERVADOR
    Este observador se encargará de mostrar una alerta si es que la temperatura actual
    sobrepasó el umbral
*/

public class WeatherWarning implements Observer{
    //Variable que contiene la temperatura máxima
    private int maximo = 25;

    @Override
    public void update(int temperature) {
        if(temperature > maximo){
            System.out.println("WEATHER WARNING! Temperature exceeded the threshold");
        }
    }
}
