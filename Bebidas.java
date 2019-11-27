package cafeteria;

public abstract class Bebidas {
    public int azucar;
    public int leche;
    
    public Bebidas (int azucar, int leche){
        this.azucar = azucar;
        this.leche = leche;
    }
    
    
    public abstract String tipo();
    public abstract String descripcion();
    public abstract double precio();
}
