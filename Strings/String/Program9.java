package Basicsjava.Strings.String;

// Creation of our own immutable class
final class Test {
    // 1. Make the field 'final' so it can't be changed after initialization
    private final int i;

    // 2. Add the parameter 'int i' to the constructor
    Test(int i) {
        this.i = i;
    }

    // Optional: Getter to read the value
    public int getI() {
        return i;
    }

    public Test modify(int i) {
        if (this.i == i) {
            return this;
        } else {
            // 3. This now works because the constructor Test(int i) exists
            return new Test(i);
        }
    }
}

public class Program9 {
    public static void main(String[] args) {
        Test t1 = new Test(10);

        // Try modifying with the same value
        Test t2 = t1.modify(10);

        // Try modifying with a new value
        Test t3 = t1.modify(100);

        // Testing the references
        System.out.println("t1 == t2 : " + (t1 == t2)); // Output: true (Same object)
        System.out.println("t1 == t3 : " + (t1 == t3)); // Output: false (New object created)
    }
}