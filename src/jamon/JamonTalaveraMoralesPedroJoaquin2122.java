package jamon;

/**
 * Clase que realiza el registro, compra y venta de jamones en almacen
 * 
 * @author portatil_profesorado
 * @since 12/06/2021
 * @version 1.0 , 12/06/2021
 */

  

public class JamonTalaveraMoralesPedroJoaquin2122 {
    
    private String categoria;
    private double precio;
    private int mesesCuracion;
    private int stock;

    /* Constructor sin argumentos */
    public JamonTalaveraMoralesPedroJoaquin2122 ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase
    // jamon
    
    /**
     * 
     * @param cat categoria del jamon
     * @param precio
     * @param stock 
     */
    
    public JamonTalaveraMoralesPedroJoaquin2122 (String cat, double precio, int stock)
    {
        this.categoria =cat;
        this.precio=precio;
        this.stock=stock;
    }
   

    /* Método para comprar coches. Modifica el stock.
     * Este método va a ser probado con Junit
     */
    public void comprar(int cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede comprar un nº negativo de jamones");
        setStock(getStock() + cantidad);
    }

    public void vender (int cantidad, String paisTalaveraMoralesPedroJoaquin2122) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede vender una cantidad negativa de jamones");
        if (obtenerStock()< cantidad)
            throw new Exception ("No  hay suficientes jamones para vender");
        setStock(getStock() - cantidad);
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the mesesCuracion
     */
    public int getMesesCuracion() {
        return mesesCuracion;
    }

    /**
     * @param mesesCuracion the mesesCuracion to set
     */
    public void setMesesCuracion(int mesesCuracion) {
        this.mesesCuracion = mesesCuracion;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}
