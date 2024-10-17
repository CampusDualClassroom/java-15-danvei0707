package com.campusdual.classroom;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FreshMerchandise extends Merchandise {

    // Inicializar la nueva variable (no existe en Merchandise)
    private final Date expirationDate;

    // Constructor de la clase extendida
    public FreshMerchandise(String name, String uniqueId, String responsibleId, int zone, String area, String shelf, int quantity, Date expirationDate) {
        super(name, uniqueId, responsibleId, zone, area, shelf, quantity);
        this.expirationDate = expirationDate;
    }

    // "MAIN": Función que imprime el resultado deseado
    public void printSpecificData(){
        System.out.println(this.getSpecificData());
    }

    @Override
    // Construir el mensaje que quiero imprimir (con las propiedades "location" y "expirationDate")
    public Object getSpecificData() {
        StringBuilder msg = new StringBuilder();
        msg.append(propertyBuilder("Location", getLocation()));
        msg.append(propertyBuilder("Time", getFormattedDate(getExpirationDate())));

        return msg.toString();
    }

    // Util: Formatear la fecha
    public String getFormattedDate(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return  sdf.format(date);
    }

    //Util: Constructor de los console logs (formateado)
    private StringBuilder propertyBuilder(String name, String value){
        StringBuilder property = new StringBuilder();
        property.append("\t").append(name).append(": ").append(value).append("\n");
        return property;
    }

    // Getter: Conseguir la variable privada
    public Date getExpirationDate() {
        return expirationDate;
    }
}
