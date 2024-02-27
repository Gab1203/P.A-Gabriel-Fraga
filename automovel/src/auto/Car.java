/*2º Crie uma classe Carro
com
os atributos combustivel = 0 e consumo
(km/litro)

Métodos: getCombustivel, setCombustivel, getConsumo, setConsumo andar(double distancia) - reduz a quantidade de combustivel de acordo com a distancia
percorrida, abastecer(double
quantidade) -
aumenta o combustivel do tanque na quantidade recebida */

package auto;

import java.util.Scanner;

public class Car {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);

do {

    System.out.print("0 - Encerrar programa\n1 - Abastecer\n2 - Andar\n3 - Mostrar tanque\n");
    System.out.println("Digite o código que deseja para iniciar:");
    carro.setCodigo(scanner.nextInt());

    switch (carro.getCodigo()) {
        case 0:
        System.out.println("O programa foi finalizado!!");    

            break;

            case 1:

            System.out.println("Digite a quantidade em litros de gasolina que queira abastecer:");
            carro.abastecer(scanner.nextDouble());

            break;

            case 2:

            System.out.println("Digite a quantidade de km que queira rodar:");
            carro.andar(scanner.nextDouble());

            break;

            case 3:
            System.out.printf("Quantidade de combustível no tanque: %.2f\n", carro.getCombustivel());

            break;
    
        default:

        System.out.println("Código inválido, digite novamente!\n");
            break;
    }

    
} while (carro.getCodigo() != 0);


    }

}
