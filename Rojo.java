package Te;

import cafeteria.Bebidas;

public abstract class Rojo extends Bebidas{

    public Rojo(int azucar, int leche) {
        super(azucar, leche);
    }
    
    @Override
    public String tipo(){
        return "Te";
    }
    
    @Override
    public String descripcion(){
        return "Te Rojo";
    }
    
    @Override
    public double precio(){
        return (float) 70;
    }
    
}
