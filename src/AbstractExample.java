abstract class Addition {
    abstract void add();
    public void sub() {
        System.out.println("Subtraction");
    }
}

abstract class ImplementedMethod extends Addition {
    abstract void division();
    public void multiply() {
        System.out.println("Multiplication");
    }
}

public class AbstractExample extends ImplementedMethod {
    @Override
    void add() {
        System.out.println("Addition");
    }

    @Override
    void division() {
        System.out.println("Division");
    }

    public static void main(String[] args) {
        AbstractExample example = new AbstractExample();
        example.add();
        example.sub();
        example.multiply();
        example.division();
    }
}

