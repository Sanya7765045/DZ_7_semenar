public class Calculator {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, 5);

        ComplexNumber sum = num1.add(num2);
        System.out.println("Сумма: " + sum);

        ComplexNumber product = num1.multiply(num2);
        System.out.println("Произведение: " + product);

        ComplexNumber quotient = num1.divide(num2);
        System.out.println("Частное: " + quotient);
    }
}