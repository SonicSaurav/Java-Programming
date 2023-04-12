public class ExceptionHandling {
    public static void main(String[] args)throws SonicError{
        try {
            throw new SonicError("Hemlo Kids");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Ended");
        }
    } 
    static int divide(int a, int b) throws MathematicalError{
        if (b==0)
            throw new MathematicalError("Cannot divide by zero xd");
        return a / b;
    }
}
class MathematicalError extends Exception{
    public MathematicalError(String message){
        super(message);
    }
}
class SonicError extends Exception{
    public SonicError(String message){
        super(message);
    }
}
