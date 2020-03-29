package concessionaria;
public class Onibus extends Automovel
{
    private int quantidadeDeLugares;
    private boolean banheiro;
    //Construtor Padrão
    public Onibus(int quantidadeDeLugares, boolean banheiro, String nome, 
            String fabricante, double potencia) 
    {
        super(nome, fabricante, potencia);
        this.quantidadeDeLugares = quantidadeDeLugares;
        this.banheiro = banheiro;
    }
    //Construtor Inicialização
    public Onibus() 
    {
        super();
        this.quantidadeDeLugares = 0;
        this.banheiro = false;
    }
    //GETTER & SETTER
    public int getQuantidadeDeLugares() 
    {
        return quantidadeDeLugares;
    }

    public void setQuantidadeDeLugares(int quantidadeDeLugares) 
    {
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    public boolean isBanheiro() 
    {
        return banheiro;
    }

    public void setBanheiro(boolean banheiro) 
    {
        this.banheiro = banheiro;
    }
    //toString

    @Override
    public String toString() 
    {
        return (super.toString() + ", quantidadeDeLugares = " + quantidadeDeLugares 
                + ", banheiro = " + banheiro);
    }
}
