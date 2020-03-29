
package concessionaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal 
{

    public static void main(String[] args) 
    {
        //Criando as Class.
        Onibus onibus;
        Carro carro;
        Caminhao caminhao;
        //Criando o ArrayList.
        ArrayList <Automovel>listaDeAutomoveis = new ArrayList();
        //Criando o comando de entrada.
        Scanner entrada = new Scanner(System.in);
        //Variaveis
        int opc1, opc2, localizacao, maiorQuantidadeDeLugares, cont;
        boolean opc3;
        //Iniciaizando
        maiorQuantidadeDeLugares = 0;
        localizacao = -1;
        cont = 0;
        opc1 = opc2 = -1;
        opc3 = true;
        //menu
        do
        {
            System.out.print("\n\n\n----------------------------MENU-----------------------------");
            System.out.print("\n 0 - Sair.......................................................:");
            System.out.print("\n 1 - Inserir objeto Qualquer....................................:");
            System.out.print("\n 2 - Inserir um objeto em um posição Especifico.................:");
            System.out.print("\n 3 - Mostrar todos..............................................:");
            System.out.print("\n 4 - Mostrar Onibus com mais lugares............................:");
            System.out.print("\n 5 - Mostrar caminhão com maior capacidade de tracionar.........:");
            System.out.print("\n 6 - Remover posição especifica.................................:");
            System.out.print("\n 7 - Limpar todos elementos do ArrayList........................:");
            System.out.print("\n 8 - Verificar se o ArrayList Está Vazio........................:");
            System.out.print("\n 9 - Turbine um automóvel especifico............................:");
            System.out.print("\n 10 - Turbine o Onibus com 24,7% ganho de Potência..............:");
            System.out.print("\n 11 - Mostrar quantos automoveis foram adquiridos pela empresa..:\n ->");
            opc1 = entrada.nextInt();
            //Validação
            while(opc1 < 0 || opc1 > 11)
            {
                System.out.print("\n\n Valor errado... Digite outro..:");
                opc1 = entrada.nextInt();
            }
            //Criando as Opções..
            switch(opc1)
            {
                case 0:
                    System.out.print("\n\n\n Fim do Programa...\n\n\n");
                break;
                //--------------------------------------------------------------
                case 1:
                    System.out.print("\n --Inserindo um objeto qualquer--");
                    while(opc3)
                    {
                        System.out.print("--Menu De Inserção--");
                        System.out.print("\n 0 - Sair.....:");
                        System.out.print("\n 1 - Onibus...:");
                        System.out.print("\n 2 - Carro....:");
                        System.out.print("\n 3 - Caminhao.:\n ->");
                        opc2 = entrada.nextInt();
                        //validação.
                        while(opc2 < 0 || opc2 > 3)
                        {
                            System.out.print("\n\n Valor errado... Digite outro..:");
                            opc2 = entrada.nextInt();
                        }
                        //Inserção...
                        if(opc2 == 0)
                            System.out.print("\n\n Voltando ao Menu Inicial \n\n");
                        //------------------------------------------------------
                        if(opc2 == 1)
                        {
                            //Inicializando o Objeto
                            onibus = new Onibus();
                            //Recebendo dados..
                            System.out.print("\n --Inserindo um Onibus");
                            System.out.print("\n\n Digite o nome......:");
                            onibus.setNome(entrada.next());
                            System.out.print("\n Digite o Fabricante..:");
                            onibus.setFabricante(entrada.next());
                            System.out.print("\n Digite a potência....:");
                            onibus.setPotencia(entrada.nextDouble());
                            System.out.print("\n Digite quantidade de lugares..:");
                            onibus.setQuantidadeDeLugares(entrada.nextInt());
                            System.out.println("\n Com ou sem Banheiro.........:");
                            onibus.setBanheiro(entrada.nextBoolean());
                            //Colocando no ArrayList.
                            listaDeAutomoveis.add(onibus);
                        }
                        //------------------------------------------------------
                        if(opc2 == 2)
                        {
                            //Inicializando o Objeto
                            carro = new Carro();
                            //Recebendo dados..
                            System.out.print("\n --Inserindo um Carro");
                            System.out.print("\n\n Digite o nome......:");
                            carro.setNome(entrada.next());
                            System.out.print("\n Digite o Fabricante..:");
                            carro.setFabricante(entrada.next());
                            System.out.print("\n Digite a potência....:");
                            carro.setPotencia(entrada.nextDouble());
                            System.out.print("\n Completo ou Básico..:");
                            carro.setCompletoOuBasico(entrada.nextBoolean());
                            //Colocando no ArrayList
                            listaDeAutomoveis.add(carro);
                        }
                        //------------------------------------------------------
                        if(opc2 == 3)
                        {
                            //Inicializando o Objeto
                            caminhao = new Caminhao();
                            //Recebendo Dados.
                            System.out.print("\n --Inserindo um Caminhao");
                            System.out.print("\n\n Digite o nome......:");
                            caminhao.setNome(entrada.next());
                            System.out.print("\n Digite o Fabricante..:");
                            caminhao.setFabricante(entrada.next());
                            System.out.print("\n Digite a potência....:");
                            caminhao.setPotencia(entrada.nextDouble());
                            System.out.print("\n Peso suportado pelo caminhao.:");
                            caminhao.setPesoSuportado(entrada.nextFloat());
                            //Colocando no ArrayList
                            listaDeAutomoveis.add(caminhao);
                        }
                    }
                break;
                //--------------------------------------------------------------
                case 2:
                    
                break;
                //--------------------------------------------------------------
                case 3:
                    System.out.print("\n\n\n---Mostrando Todos---");
                    for(int i = 0; i<listaDeAutomoveis.size(); i++)
                    {
                        System.out.print("\n\n ->" + listaDeAutomoveis.get(i).getClass().getSimpleName() 
                                + ":" + listaDeAutomoveis.get(i).toString());
                    }
                break;
                //--------------------------------------------------------------
                case 4:
                    System.out.print("\n\n\n ---Mostrando Onibus com mais Lugares---");
                    //Encontrando o Onibus desejado.
                    onibus = new Onibus();
                    for(int i = 0; i < listaDeAutomoveis.size(); i++)
                    {
                        if(listaDeAutomoveis.get(i) instanceof Onibus)
                        {
                            onibus = (Onibus)listaDeAutomoveis.get(i);
                            if(cont == 0)//Primeira vez entrando no laço, passando o primeiro onibus como parametro primeiro Onibus
                            {
                                maiorQuantidadeDeLugares = onibus.getQuantidadeDeLugares();
                                localizacao = i;
                                cont = 1;
                            }
                            if(maiorQuantidadeDeLugares < onibus.getQuantidadeDeLugares())
                            {//Verificando qual o onibus como mais lugares.
                                maiorQuantidadeDeLugares = onibus.getQuantidadeDeLugares();
                                localizacao = i;
                            }
                        }
                        if(localizacao != -1)//
                        {
                        }
                     }
                break;
                //--------------------------------------------------------------
                case 5:
                break;
                //--------------------------------------------------------------
                case 6:
                break;
                //--------------------------------------------------------------
                case 7:
                break;
                //--------------------------------------------------------------
                case 8:
                break;
                //--------------------------------------------------------------
                case 9:
                break;
                //--------------------------------------------------------------
                case 10:
                break;
                //--------------------------------------------------------------
                case 11:
                break;
                //--------------------------------------------------------------
            }
        }while(opc1 != 0);
    }
    
}
