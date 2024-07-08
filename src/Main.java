public class Main {
    public static void main(String[] args) {
        //Instancia de la clase WeatherStation
        WeatherStation station1 = new WeatherStation();

        //Instancia del primer observador
        TemperatureDisplay temp1 = new TemperatureDisplay();
        //Instancia del segundo observador
        WeatherWarning temp2 = new WeatherWarning();

        //Agregar ambos observadores al sujeto
        station1.addObserver(temp1);
        station1.addObserver(temp2);

        //Título
        System.out.println("----- First Temperature -----");
        //Insertar la primer temperatura
        station1.setTemperature(18);

        //Salto de línea
        System.out.println();
        //Título
        System.out.println("----- Second Temperature -----");
        /*
            IMPORTANTE
            En este punto debe aparecer una alerta porque se sobrepaso el umbral
        */
        //Cambiar la temperatura
        station1.setTemperature(49);


        //********************************************************************************************************


        //Eliminar ambos observadores del sujeto
        station1.removeObserver(temp1);
        station1.removeObserver(temp2);

        /*
            IMPORTANTE
            Al eliminar a los observadores del sujeto, los cambios de temperatura no serán notificados
        */
        //Salto de línea
        System.out.println();
        //Salto de línea
        System.out.println();
        //Título
        System.out.println("----- Third Temperature -----");
        //Cambiar la temperatura
        station1.setTemperature(49);
        System.out.println();
        //Título
        System.out.println("----- Fourth Temperature -----");
        //Cambiar la temperatura
        station1.setTemperature(17);


        //********************************************************************************************************


        //Agregar ambos observadores al sujeto
        station1.addObserver(temp1);
        station1.addObserver(temp2);

        /*
            IMPORTANTE
            Al agregar nuevamente a los observadores del sujeto, los cambios de temperatura volverán serán notificados
        */
        //Salto de línea
        System.out.println();
        //Salto de línea
        System.out.println();
        //Título
        System.out.println("----- Fifth Temperature -----");
        /*
            IMPORTANTE
            En este punto debe aparecer una alerta porque se sobrepaso el umbral
        */
        //Cambiar la temperatura
        station1.setTemperature(28);
        System.out.println();
        //Título
        System.out.println("----- Sixth Temperature -----");
        //Cambiar la temperatura
        station1.setTemperature(25);
    }
}