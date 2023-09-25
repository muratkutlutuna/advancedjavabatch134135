package generics.classes;
/*
    T --> Type
    E --> Element
    K --> Key
    V --> Value
    N --> Number
    S,U, ...
 */


public class Print <T>{
    private T thingToBePrinted;

    //getter and setter


    public T getThingToPrinted() {
        return thingToBePrinted;
    }

    public void setThingToPrinted(T thingToBePrinted) {
        this.thingToBePrinted = thingToBePrinted;
    }

    public void print(){
        System.out.println(thingToBePrinted);
    }

}
