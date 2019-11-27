package Te;

import cafeteria.Bebidas;

public abstract class Negro extends Bebidas {

    public Negro(int azucar, int leche) {
        super(azucar, leche);
    }

    @Override
    public String tipo() {
        return "Te";
    }

    @Override
    public String descripcion() {
        return "Te Negro";
    }

    @Override
    public double precio() {
        return (float) 70;
    }

}
