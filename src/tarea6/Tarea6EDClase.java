
package tarea6;


public class Tarea6EDClase {
    
    private static final double DESCUENTO_MAYOR = 0.95;
    private static final double DESCUENTO_MENOR = 0.8;
    
    public void aplicarDescuento(double precioProducto, int numProductos){
    
    if(numProductos>3)
        precioProducto-=5;
            if (numProductos!=0){
                double descuento = DESCUENTO_MENOR;
                calcularDescuento(precioProducto, descuento);
            }else {
                double descuento = DESCUENTO_MAYOR;
                calcularDescuento(precioProducto, descuento);
            }   
    }

    private void calcularDescuento(double precioProducto, double descuento) {
        double total;
        total = precioProducto*descuento;
        System.out.println("El total a pagar es:"+total);
        System.out.println("Enviado");
    }
    
}
