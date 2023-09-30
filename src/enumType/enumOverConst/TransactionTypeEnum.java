package enumType.enumOverConst;
//predefined set of values which will never ve updated
//users can not add more options, user only sees the given options
public enum TransactionTypeEnum {
    DEPOSIT(5),
    WITHDRAW(10),
    OTHER2(34),
    TRANSFER(15),
    PAYMENT(20),
    OTHER(100);


    private final int code;
    //constructor to set values for constants
    private TransactionTypeEnum(int code) {
        this.code = code;
    }
    //getter
    public int getCode() {
        return code;
    }
}
