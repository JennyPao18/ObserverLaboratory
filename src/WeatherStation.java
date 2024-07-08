/*
    CLASE WEATHER STATION
    Esta clase contiene las funciones que pueden se pueden realizar con los observadores.
    Además, se añadió un método que permite actualizar la temperatura
*/

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
    //Lista de observadores
    private List<Observer> observadores = new ArrayList<>();
    //Variable para temperatura
    private int temperature;

    //Implementación del método "addObserver"
    @Override
    public void addObserver(Observer observer) {
        //Añadir observador
        observadores.add(observer);
    }

    //Implementación del método "removeObserver"
    @Override
    public void removeObserver(Observer observer) {
        //Eliminar observador
        observadores.remove(observer);
    }

    //Implementación del método "notifyObservers"
    @Override
    public void notifyObservers() {
        //Recorrido para avisar a todos los observadores disponibles
        for(Observer observer : observadores){
            //Notificar la temperatura actual
            observer.update(temperature);
        }
    }

    //SETTER de la variable de temperatura
    //Método que se utiliza para actualizar la temperatura actual
    public void setTemperature(int temperature) {
        this.temperature = temperature;
        //Notificar sobre la nueva temperatura
        notifyObservers();
    }
}
