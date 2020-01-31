package dslab1.sech.main.myinterface;

public class MyArrayImplementation {
    public static void main(String[] args) {
        int size = 10;
        MyArrayADT object = new MyArrayADT(size);
        object.traverse();
        object.insert(1023);
        object.traverse();
        object.insert(123);
        object.traverse();
        object.insert(234);
        object.insert(54);
        object.insert(34);


    }
}
