package one.digitalinovation.gof.sigleton;

/**
 *
 * Singleton "Lazy Holder",
 *
 * @author  pedrocardoso96
 *
 */

public class SingletonLazyHolder {

    private  static class InstanceHolder{
        public static SingletonLazyHolder instancia = instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder(){
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
