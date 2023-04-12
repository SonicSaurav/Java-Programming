public class AccessModifiers{
    public static void main(String[] args) {
    Myemployee sonic = new Myemployee();
    sonic.setid(45);
    sonic.setname("Sonic");
    System.out.println(sonic.getid());
    System.out.println(sonic.getname());
    manager m1 = new manager();
    m1.setid(30);
    System.out.println(m1.getid());
    }
}
class Myemployee{
    private int id;
    private String name;
    void setid(int id){
        this.id = id;
    }
    int getid(){
        return id;
    }
    void setname(String name){
        this.name = name;
    }
    String getname(){
        return name;
    }
}
class manager extends Myemployee{
}