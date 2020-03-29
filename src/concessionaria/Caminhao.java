package concessionaria;
public class Caminhao extends Automovel
{
    private float pesoSuportado;
    //Construtor Padrão

    public Caminhao(float pesoSuportado, String nome, 
            String fabricante, double potencia) 
    {
        super(nome, fabricante, potencia);
        this.pesoSuportado = pesoSuportado;
    }
    //Contrutor de Inicialização
    public Caminhao() 
    {
        super();
        this.pesoSuportado = 0;
    }    
    //GETTER & SETTER
    public float getPesoSuportado() 
    {
        return pesoSuportado;
    }
    public void setPesoSuportado(float pesoSuportado) 
    {
        this.pesoSuportado = pesoSuportado;
    }
    //toString
    @Override
    public String toString() 
    {
        return (super.toString() + "pesoSuportado=" + pesoSuportado );
    }
}
