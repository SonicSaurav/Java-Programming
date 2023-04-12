public class Interfaces {
    public static void main(String[] args) {
        Tesla ModelS = new Tesla();
        ModelS.brake();
    }
}
interface engine{
    void start();
    void stop();
}
interface brake{
    void brake();
}
class Tesla implements engine, brake{
    @Override
    public void start() {
        System.out.println("I start like a normal car");
    }
    @Override
    public void stop() {
        System.out.println("I stop like a normal car");
    }
    @Override
    public void brake(){
        System.out.println("I brake like a normal car");
    }
}