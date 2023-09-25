package generics.genericinterface;

//If we implement generic interface the implementing class also should implement be generic

public class GenericsInterfaceImpl01<T> implements GenericInterface<T>{
    @Override
    public void setValue(T t) {

    }

    @Override
    public T getValue() {
        return null;
    }
}
