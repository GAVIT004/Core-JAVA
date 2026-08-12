package Basicsjava.AccessModifiers.ClassLevelModifiers;

// public top-level class
public class Program2 {

    public static void main(String[] args) {

        Program2 obj = new Program2();

        // Private Inner Class
        PrivateClass p = obj.new PrivateClass();
        p.show();

        // Protected Inner Class
        ProtectedClass pr = obj.new ProtectedClass();
        pr.show();

        // Default Inner Class
        DefaultClass d = obj.new DefaultClass();
        d.show();

        // Final Inner Class
        FinalClass f = obj.new FinalClass();
        f.show();

        // Abstract Inner Class
        AbstractClass a = obj.new ChildClass();
        a.show();

        // Static Nested Class
        StaticClass s = new StaticClass();
        s.show();

        // Strictfp Class
        StrictfpClass st = new StrictfpClass();
        st.show();
    }

    // ===========================
    // private Inner Class
    // ===========================
    private class PrivateClass {
        void show() {
            System.out.println("Private Inner Class");
        }
    }

    // ===========================
    // protected Inner Class
    // ===========================
    protected class ProtectedClass {
        void show() {
            System.out.println("Protected Inner Class");
        }
    }

    // ===========================
    // Default Inner Class
    // ===========================
    class DefaultClass {
        void show() {
            System.out.println("Default Inner Class");
        }
    }

    // ===========================
    // final Inner Class
    // ===========================
    final class FinalClass {
        void show() {
            System.out.println("Final Inner Class");
        }
    }

    // ===========================
    // abstract Inner Class
    // ===========================
    abstract class AbstractClass {
        abstract void show();
    }

    class ChildClass extends AbstractClass {
        @Override
        void show() {
            System.out.println("Abstract Inner Class");
        }
    }

    // ===========================
    // static Nested Class
    // ===========================
    static class StaticClass {
        void show() {
            System.out.println("Static Nested Class");
        }
    }

    // ===========================
    // strictfp Inner Class
    // ===========================
    static strictfp class StrictfpClass {

        void show() {
            double ans = 10.0 / 3;
            System.out.println("Strictfp Class : " + ans);
        }
    }
}
