package generics.classes;

//If we use more than one Data in generic class

public class GenericTypeWithToParameter <U,S>{

    private U u;
    private S s;

    //constructor

    public GenericTypeWithToParameter(U u, S s) {
        this.u = u;
        this.s = s;
    }

    //getter and setter


    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public static void main(String[] args) {

        GenericTypeWithToParameter<String, String> obj1 = new GenericTypeWithToParameter<>("Ali", "John");
        GenericTypeWithToParameter<String, Integer> obj2 = new GenericTypeWithToParameter<>("Ali", 1);
        GenericTypeWithToParameter<Integer, String> obj3 = new GenericTypeWithToParameter<>(2, "John");

        System.out.println(obj1.getS());
        System.out.println(obj2.getS());
        System.out.println(obj3.getS());

        System.out.println(obj1.getU());
        System.out.println(obj2.getU());
        System.out.println(obj3.getU());
    }
}
