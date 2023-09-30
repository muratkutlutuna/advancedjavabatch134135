package enumType.enumOverConst;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("*************************");
        constantMethod(1);
        constantMethod(3);
        constantMethod(100);
        constantMethod(200);// there is no CTE or RTE
        System.out.println("*************************");
        enumMethod(TransactionTypeEnum.WITHDRAW);
        enumMethod(TransactionTypeEnum.DEPOSIT);
        enumMethod(TransactionTypeEnum.OTHER);
        enumMethod(TransactionTypeEnum.OTHER2);
        enumMethod(TransactionTypeEnum.TRANSFER);
        enumMethod2(TransactionTypeEnum.WITHDRAW);
        enumMethod2(TransactionTypeEnum.DEPOSIT);
        //when we use enum constants, we will just see given options
    }
    //method for constant class
    private static void constantMethod(int i){
        if (i == TransactionTypeConstants.DEPOSIT) {
            System.out.println("Money is deposited");
        } else if (i == TransactionTypeConstants.WITHDRAW) {
            System.out.println("Money is withdrawn");
        }else if (i == TransactionTypeConstants.PAYMENT) {
            System.out.println("Money is paid");
        }else if (i == TransactionTypeConstants.TRANSFER) {
            System.out.println("Money is transferred");
        }else if (i == TransactionTypeConstants.OTHER) {
            System.out.println("Other transaction");
        }
    }

    //method for enum
    public static void enumMethod (TransactionTypeEnum tt){
        switch (tt) {
            case DEPOSIT:
                System.out.println("Money is deposited");
                break;
            case WITHDRAW:
                System.out.println("Money is withdrawn");
                break;
            case PAYMENT:
                System.out.println("Money is paid");
                break;
            case TRANSFER:
                System.out.println("Money is transferred");
                break;
            default:
                System.out.println("Other transaction");
        }
        System.out.println("Enum Name: "+tt.name());//prints name on screen
        System.out.println("Enum Ordinal: "+tt.ordinal());//prints index or ordinal od the enum on the screen
        System.out.println("Enum Code: "+tt.getCode());//prints code

        //using ordinal() is risky because the order may change...
    }
    public static void enumMethod2 (TransactionTypeEnum tt){
        switch (tt) {
            case DEPOSIT -> System.out.println("Money is deposited");
            case WITHDRAW -> System.out.println("Money is withdrawn");
            case PAYMENT -> System.out.println("Money is paid");
            case TRANSFER -> System.out.println("Money is transferred");
            default -> System.out.println("Other transaction");


        }
    }
}
