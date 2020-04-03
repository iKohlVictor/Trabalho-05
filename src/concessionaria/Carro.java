package concessionaria;
public class Carro extends Automovel
{
    //Atributos..
    private boolean completoOuBasico;
    //Construtor Padrão
    public Carro(boolean completoOuBasico, String nome, 
            String fabricante, double potencia, String cod) 
    {
        super(nome, fabricante, potencia);
        this.completoOuBasico = completoOuBasico;
    }
    //Construtor De inicialização
    public Carro() 
    {
        super();
        this.completoOuBasico = false;
    }
    //GETTER & SETTER

    public boolean isCompletoOuBasico() 
    {
        return completoOuBasico;
    }

    public void setCompletoOuBasico(boolean completoOuBasico) 
    {
        this.completoOuBasico = completoOuBasico;
    }
    //toString

    @Override
    public String toString() 
    {
        return (super.toString() + "completoOuBasico=" + completoOuBasico);
    }
    
    
}
