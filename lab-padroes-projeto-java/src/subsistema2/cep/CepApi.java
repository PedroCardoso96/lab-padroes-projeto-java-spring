package subsistema2.cep;

import one.digitalinovation.gof.sigleton.SingletonEager;

public class CepApi {

    private static CepApi instancia = instancia = new CepApi();
    private CepApi(){
        super();
    }

    public static CepApi getInstance(){
        return instancia;
    }
    public String recuperarCidade(String cep){
        return "Saquarema";
    }
    public String recuperarEstado(String cep){
        return "Rio de Janeiro";
    }

}
