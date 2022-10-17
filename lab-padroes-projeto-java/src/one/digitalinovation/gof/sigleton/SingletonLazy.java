package one.digitalinovation.gof.sigleton;

/**
 *
 * Singleton "preguiçoso",
 * @author  pedrocardoso96
 *
 */

public class SingletonLazy {
    private static SingletonLazy instancia;
    private  SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstance(){
        if(instancia == null){
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
