package Day5;


final class FinalClass {
    // Final variable
    final int finalVariable = 10;

    // Final method accessible only within the same package
    final void finalMethod() {
        System.out.println("Final method can only be accessed within the same package");
    }
}

// Another class within the same package
public class Final {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Final variable value: " + obj.finalVariable);
        obj.finalMethod();
    }
}
