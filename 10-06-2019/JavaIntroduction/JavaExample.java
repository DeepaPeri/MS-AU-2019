/*
* Print Hello and name in different lines
* Perform operations add, sub, mul, div and print remainder
*/
class JavaExample{
    public int add(int a, int b){
        return a + b;
    }
    public int sub(int a , int b){
        return(a > b ? a -b : b - a); 
    }
    public int mul(int a, int b){
        return a * b;
    }
    public int div(int a, int b){
        return a / b;
    }
    public int rem(int a, int b){
        return a % b;
    }
    public static void main(String[] args){
            System.out.println("Hello");
            System.out.println("Deepa");

            JavaExample j = new JavaExample();
            System.out.println("Result of addition: " + j.add(5, 10));
            System.out.println("Result of subtraction: " + j.sub(5, 10));
            System.out.println("Result of multiplication : "+ j.mul(5, 10));
            System.out.println("Result of division: " + j.div(5, 10));
            System.out.println("Remainder after division: " + j.rem(5, 10));
    }
}