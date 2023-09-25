package generics.classes;

public class PrintDouble {
    private Double thingToBePrinted;

    //getter and setter


    public Double getThingToPrinted() {
        return thingToBePrinted;
    }

    public void setThingToPrinted(Double thingToBePrinted) {
        this.thingToBePrinted = thingToBePrinted;
    }

    public void print(){
        System.out.println(thingToBePrinted);
    }
}
