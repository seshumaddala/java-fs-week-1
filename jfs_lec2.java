import java.util.*;

public class Lecture1_1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Basic Pay:");
        float Basic_pay=sc.nextInt();
        float hra=0,da=0,GrossPay;
        if(Basic_pay>=5000){
            hra=10*(Basic_pay)/100;
            da=20*(Basic_pay)/100;
            GrossPay=Basic_pay+hra+da;
            System.out.println(GrossPay);
        }else{
            hra=20*(Basic_pay)/100;
            da=30*(Basic_pay)/100;
            GrossPay=Basic_pay+hra+da;
            System.out.println(GrossPay);
        }
    }
}