import java.util.Scanner;

public class UseOperator {
    public static void main(String[] args){
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Width: ");
        width = scanner.nextFloat();

        System.out.println("Enter Height: ");
        height = scanner.nextFloat();

        float area = height * width;

        System.out.println("Width is: " + width);
        System.out.println("Height is: " + height);
        System.out.println("Area is: " + area);
    }
}
