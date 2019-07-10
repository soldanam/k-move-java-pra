package chap06.passbyvalue;

public class PassTest {
    public static void changeInt(int value) {//static이므로 class method임.
        value = 55;
    }

    public static void changeObjectRef(BirthDate date) {
        date = new BirthDate(2000, 1, 1);
    }

    public static void changeObjectAttr(BirthDate date) {
        date.setDay(20);
    }

    public static void main(String[] args) {
        int value = 11;
        changeInt(value);
        System.out.println("int value is: " + value);

        BirthDate date = new BirthDate(1993, 5, 16);
        changeObjectRef(date);
        date.print();

        changeObjectAttr(date);
        date.print();
    }
}
