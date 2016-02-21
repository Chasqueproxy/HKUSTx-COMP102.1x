public static void solveQuadraticEquation() {

        // Please write your code after this line
        double a=0.0;
        double b=0.0;
        double c=0.0;
        double ans_1=0.0;
        double ans_2=0.0;
        System.out.print("Enter a: ");a=IO.inputDouble();
        System.out.print("Enter b: ");b=IO.inputDouble();
        System.out.print("Enter c: ");c=IO.inputDouble();
        ans_1= (-b+Math.sqrt(Math.pow(b,2)-4.0*a*c))/(2.0*a);
        ans_2= (-b-Math.sqrt(Math.pow(b,2)-4.0*a*c))/(2.0*a);
        System.out.println("First solution for x = "+ans_1);
        System.out.println("Second solution for x = "+ans_2);   





}
