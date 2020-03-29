package concessionaria;
public class Automovel 
{
    private String nome;
    private String fabricante;
    private double potencia;
    private static int quantidadeDeAutomoveis;
    //Construtor Padrão....
    public Automovel(String nome, String fabricante, double potencia)
    {
        this.nome = nome;
        this.fabricante = fabricante;
        this.potencia = potencia;
        Automovel.quantidadeDeAutomoveis = Automovel.quantidadeDeAutomoveis + 1;
    }
    //Metodo...
    public static int mostrarQuantidadeDeVeiculos()
    {
        return(quantidadeDeAutomoveis);
    }
    public String Turbinar()
    {
        potencia = potencia * 0.119;
        return("Turbinando = " + potencia);
    }
    //Construtor de Inicialização
    public Automovel()
    {
        this.nome = "sem nome";
        this.fabricante = "sem fabricante";
        this.potencia = 0;
        Automovel.quantidadeDeAutomoveis = 0;
    }
    //GETTER & SETTER
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getFabricante() 
    {
        return fabricante;
    }

    public void setFabricante(String fabricante) 
    {
        this.fabricante = fabricante;
    }

    public double getPotencia() 
    {
        return potencia;
    }

    public void setPotencia(double potencia) 
    {
        this.potencia = potencia;
    }

    public static int getQuantidadeDeAutomoveis() 
    {
        return quantidadeDeAutomoveis;
    }

    public static void setQuantidadeDeAutomoveis(int quantidadeDeAutomoveis) 
    {
        Automovel.quantidadeDeAutomoveis = quantidadeDeAutomoveis;
    }
    //toString
    @Override
    public String toString() 
    {
        return  ("nome = " + nome + ", fabricante = " + 
                fabricante + ", potencia = " + potencia);
    }
    
}
