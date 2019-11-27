package Cafe;

import cafeteria.Bebidas;

public abstract class cafeRistreto extends Bebidas{

    public cafeRistreto(int azucar, int leche) {
        super(azucar, leche);
    }
    
    @Override
    public String tipo(){
        return "Cafe";
    }
    
    @Override
    public String descripcion(){
        return "Cafe Ristreto";
    }
    
    @Override
    public double precio(){
        return (float) 110;
    }
    
}
