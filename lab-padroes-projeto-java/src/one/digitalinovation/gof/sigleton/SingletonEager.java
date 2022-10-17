package one.digitalinovation.gof.sigleton;

/**
 *
 * Singleton "apressado",
 * @author  pedrocardoso96
 *
 */

public class SingletonEager {
    private static SingletonEager instancia = instancia = new SingletonEager();
    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstance(){

        return instancia;
    }
}
