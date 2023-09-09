package com.udc.apptutoria3.servicio;

/**
 * clase para convertir dolares a pesos
 */
public class ConvertirDolar implements IConvertir{
    private int ndolar;
    private final int DOLAR_PESO = 4100;
    /**
     * constructor entrada tipo string del frontend layout
     * @param ndolar
     */
    public ConvertirDolar(String ndolar){
        this.ndolar = Integer.valueOf(ndolar);
    }

    /**
     * metodo que convierte numero de dolares a pesos
     * @return double
     */
    private double convertirPeso(){
        return this.ndolar * DOLAR_PESO;
    }

    /**
     * metodo que convierte en string el metodo convertirPeso de tipo
     * double
     * @return String
     */
    @Override
    public String convertirPesoString(){
        return String.valueOf(convertirPeso());
    }

}
