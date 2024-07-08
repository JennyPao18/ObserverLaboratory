/*
    INTERFAZ SUBJECT
    Esta interfaz contiene los métodos que se pueden realizar con los observadores
*/

public interface Subject {
    //Método para agregar un observador
    void addObserver(Observer observer);
    //Método para eliminar un observador
    void removeObserver(Observer observer);
    //Método para notificar la temperatura actual a los observadores
    void notifyObservers();
}
