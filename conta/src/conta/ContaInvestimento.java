/*1� Fa�a uma classe ContaInvestimento que seja semelhante a classe ContaCorrente, com a diferen�a de que se
adicione um atributo taxaJuros. 


Forne�a um m�todo adicioneJuros() que adicioneJuros a conta.
Em seguida, para testar a classe,
escreva um programa que construa uma contaInvestimento com saldo inicial de 1000 reais e uma taxa de juros de 10%. 
Depois aplique o m�todo adicioneJuros() cinco vezes e mostre o saldo
resultante. */


package conta;

import java.util.Scanner;

public class ContaInvestimento {

 
    private int codigo;
    public String numeroConta;
    protected String tipoConta;
    private String dono;
    private double saldo;
    private boolean status;
    public double taxaJuros;

    public ContaInvestimento(
        String numeroConta,
         String tipoConta,
         String dono,
         double saldo,
         boolean status, double taxaJuros){

        this.dono = dono;
        this.numeroConta = numeroConta;
        this.tipoConta = tipoConta;
        this.saldo = saldo;
        this.status = status;
        this.taxaJuros = taxaJuros;
        
    }

    //M�todos get para consulta de atributos
        public String getNumeroConta(){

            return numeroConta;
        }
    
        public String getTipoConta(){
    
            return tipoConta;
        }
        
        public String getDono(){
    
            return dono;
        }
    
        public double getSaldo(){
    
            return saldo;
        }
    
        public boolean getStatus(){
    
            return status;
    
        }

        public double getTaxaJuros(){
    
            return taxaJuros * 0.01;
    
        }


//M�todos correspondentes � classe
public void abrirConta(){

    status = true;
   
    System.out.println("Sua conta foi aberta com sucesso!!");


}

public void fecharConta(){


    if(saldo == 0){
        
        status = false;
        System.out.println("Sua conta foi fechada com ?xito!!\n");

    }else{

        System.out.println("Erro!!! Sua conta n?o p?de ser encerrada!!\n");

    }
    

}

void depositar(double deposito){

if (status == true) {
    
saldo += deposito;

System.out.printf("Seu saldo equivale a R$ %.2f", saldo);

}else{

    System.out.println("Erro!!! Para depositar, voc? precisa abrir uma conta!!");
}

}

void sacar(double saque){

    if (status == true && saque <= saldo) {
        
    saldo -= saque;
    
    System.out.printf("Seu saldo equivale a R$ %.2f\n", saldo);
    
    }else if(saque > saldo){
    
        System.out.println("Saque inv?lido, o valor excede seu limite banc?rio!");

    }else{
    
        System.out.println("Erro!!! Para sacar, voc? precisa abrir uma conta!!");
    }
    
    }

    public void adicioneJuros(){

saldo  *= (taxaJuros + 1);
    }
    
   

//M�todo principal
    public static void main(String[] args) {
    
        //Declara��o do objeto 'leitorScanner' da classe Scanner que l� os dados inseridos pelo usu�rio
        Scanner leitorScanner = new Scanner(System.in);


            System.out.println("Digite o n?mero da conta:");
            String numeroConta = leitorScanner.nextLine();
            System.out.println("Digite o tipo da conta:");
            String tipoConta = leitorScanner.nextLine();
            System.out.println("Digite o nome do dono da conta:");
            String dono = leitorScanner.nextLine(); 
            System.out.println("Digite a taxa de juros de " + dono + ":");
            double taxaJuros = leitorScanner.nextDouble(); 

           
       double saldo = 0;
        boolean status = false;

        //Evoca��o de objeto 'pessoa', c�pia da classe 'ContaBanco' na mem�ria para modifica��o
        ContaInvestimento pessoa = new ContaInvestimento(numeroConta, tipoConta, dono, saldo, status, taxaJuros);
        //Por conta do m�todo construtor, faz-se necess�rio as passagens de par�metro ap�s a evoca��o do objeto

        //Menu criado a partir de do while para modifica��o do estado atual do objeto
        do {
            System.out.printf("0 - Encerrar programa\n1 - Abrir conta\n2 - Fechar conta\n3 - Depositar\n4 - Sacar\n5 - Adicionar juros\n6 - Mostrar dados\nSelecione a op��o desejada:\n");
             pessoa.codigo = leitorScanner.nextInt();


        switch (pessoa.codigo) {
            case 0:
            System.out.println("Programa encerrado!!!");    

                break;

                case 1:
                pessoa.abrirConta();

                break;

                case 2:
                pessoa.fecharConta();

                break;

                case 3:

                System.out.println("Digite o valor que deseja depositar na conta:");
                 pessoa.depositar(leitorScanner.nextDouble());


                break;

                case 4:
                System.out.println("Digite o valor que deseja sacar da conta:");
                 pessoa.sacar(leitorScanner.nextDouble());


                break;
                
                case 5:
                pessoa.adicioneJuros();
                System.out.printf("Voc� adicionou %.2f de juros!!\n", pessoa.getTaxaJuros());

                break;

                case 6:
                System.out.println("N�mero da conta: " + pessoa.getNumeroConta());
                System.out.println("Tipo da conta: " + pessoa.getTipoConta());
                System.out.println("Dono da conta: " + pessoa.getDono());
                System.out.printf("Saldo da conta: R$ %.2f\n", pessoa.getSaldo());
                System.out.println("Status da conta: " + pessoa.getStatus());
                break;

                default:

                System.out.println("C�digo incorreto, reescreva!");
                break;
        }

        
        } while (pessoa.codigo != 0);

    }
}


