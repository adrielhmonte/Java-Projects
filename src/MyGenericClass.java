public class MyGenericClass <T extends Number, T2 extends Number> {

    T x;
    T2 y;

    MyGenericClass(T x, T2 y) {
        this.x = x;
        this.y = y;
    }
    
    public T getValue() {
        return x;
    }

}
