package Cafe;

import cafeteria.Bebidas;

public abstract class cafeExpreso extends Bebidas {

    public cafeExpreso(int azucar, int leche) {
        super(azucar, leche);
    }

    @Override
    public String tipo() {
        return "Cafe";
    }

    @Override
    public String descripcion() {
        return "Cafe Expreso";
    }
    
    @Override
    public double precio(){
        return (float) 100;
    }
}
