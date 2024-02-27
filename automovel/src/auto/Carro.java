/*2º Crie uma classe Carro
com
os atributos combustivel = 0 e consumo
(km/litro)

Métodos: getCombustivel, setCombustivel, getConsumo, setConsumo andar(double distancia) - reduz a quantidade de combustivel de acordo com a distancia
percorrida, abastecer(double
quantidade) -
aumenta o combustivel do tanque na quantidade recebida */

package auto;



public class Carro {

public double combustivel = 0;
public double consumo = 10;
public int codigo;


public double getCombustivel(){

    return combustivel;
}


public double getConsumo(){

    return consumo;
}

public int getCodigo(){

    return codigo;
}


public void setCombustivel(double gas){

  combustivel = gas;
}

public void setConsumo(double consume){

   consumo = consume;
}

public void setCodigo(int code){

    codigo = code;
  }



public void andar(double distancia){

    double combustivelNecessario = distancia/getConsumo();
    if(getCombustivel() > 0 && getCombustivel() >= combustivelNecessario){

        setCombustivel(combustivel -= combustivelNecessario);
        combustivelNecessario = 0;
    }else{

        System.out.println("Tanque insuficiente para a viagem, abasteça seu carro!\n");
    }

    
    

} 

public void abastecer(double quantidade){

  setCombustivel(combustivel += quantidade);

} 

}
