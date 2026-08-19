@FunctionalInterface
interface Abs {
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {
        Abs obj = (int a, int b) -> a + b;

        int result = obj.add(5, 10);
        System.out.println("Result: " + result);
    }
}
