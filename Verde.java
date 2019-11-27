package Te;

import cafeteria.Bebidas;


public class Verde extends Bebidas{

    public Verde(int azucar, int leche) {
        super(azucar, leche);
    }

    @Override
    public String tipo() {
        return "Te";
    }

    @Override
    public String descripcion() {
        return "Te Verda";
    }

    @Override
    public double precio() {
        return (float) 75;
    }
    
}
