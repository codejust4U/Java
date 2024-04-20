public class wrapper_cls {
    private int value;

    public wrapper_cls(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int setValue(int value){
        this.value = value;
        return value;
    }

    public static void main(String[] args) {
        wrapper_cls myInt = new wrapper_cls(5);
        System.out.println("value original : " + myInt.getValue());

        myInt.setValue(20);
        System.out.println("new value : " + myInt.getValue());

    }
}
