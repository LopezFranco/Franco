package Cafe;

import cafeteria.Bebidas;


public abstract class cafeNormal extends Bebidas{

    public cafeNormal(int azucar, int leche) {
        super(azucar, leche);
    }
    
    @Override
    public String tipo(){
        return "Cafe";
    }
    
    @Override
    public String descripcion(){
        return "Cafe Normal";
    }
    
    @Override
    public double precio(){
        return (float) 90;
    }
}
