import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Print new shape or print 'q' to quit :");
        String input = sc.nextLine();
        while (!input.equals("q")){
            switch (input) {
                case "circle":
                    System.out.print("Print radius: ");
                    double radius=sc.nextDouble();
                    System.out.println("Area of the circle is "+Math.PI*Math.pow(radius, 2));
                    break;
                case "square":
                    System.out.print("Print side of the square: ");
                    double side=sc.nextDouble();
                     System.out.println("Area of the square is "+side*side);
                    break;
                case "rectangle":
                    System.out.print("Print first side: ");
                    int side1=sc.nextInt();
                    System.out.print("Print second side: ");
                    double side2=sc.nextDouble();
                    System.out.println("Area of the rectangle is "+side1*side2);
                    break;
            
                default:
                    break;
            }
            System.out.print("Print new shape or print 'q' to quit :");
            String a=sc.nextLine();
            input = sc.nextLine();
        }
        sc.close();
    }
}