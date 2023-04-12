public class Controlflow {
    public static void main(String[] args) {
        int a =5;
        if(a>6){
        System.out.println(7);
        }else if(a==5){
        System.out.println(9);
        }else{
        System.out.println(8);
        }
    switch(a){
        case 1:
        System.out.println(1);
        break;
        case 2:
        System.out.println(2);
        break;
        default:
        System.out.println(5);
    }
    for (int i=0;i<5;i++){
        for(int j=0;j<5;j++){
        System.out.println(i + "" + j );
    }}
    int d[] = {1,2,3};
    for (int i:d){
        System.out.println(i);
    }
    while(a<10){
        System.out.println(a);
        a++;
    }
    do{
        System.out.println(a);
        a--;
    }while(a>10);
    for(int i=0;i<5;i++){
        if(i==3){
            continue;
        }
        else if(i==2){
            break;
        }
        System.out.println(i);
    }
    int[] f=new int[100]; 
    f[0]=4;
    System.out.println(f.length);
    System.out.println(f[0]);

    }
}
