public class Lecture_5 {
    public static void main(String[] args) {
        Amazon customer=new Amazon();
        float item_amount=customer.Transaction(2000);
        System.out.println("Total payable amt="+item_amount);
    }
}
class Amazon{
    float Transaction(float amt){
        Gpay gpay=new Gpay();
        float totalamt=amt+(amt*gpay.taxcharge);
        return totalamt;
    }

    
}
class Gpay{
    float taxcharge=0.05f;
}