import java.util.*;

class TellphoneCall {
    
    String phNo;
    String custName;
    int callSlots;

    public void readCustomer(){
        Scanner input = new Scanner(System.in);
        phNo = input.nextLine();
        custName = input.nextLine();
        callSlots = input.nextInt();
        
        input.close();
    }

    public void computeBill() {
        int res;
        if(callSlots <= 100){
            res = 500;
        }
        else if(callSlots >100 && callSlots <= 200){
            res = callSlots*8;
        }
        else if(callSlots > 200 && callSlots <= 300){
            res = callSlots*10;
        }
        else{
            res = callSlots*15;
        }

        System.out.print(res + 300);
    }
}


public class Q4 {
    public static void main (String args []){
        TellphoneCall totalBill = new TellphoneCall();
        totalBill.readCustomer();
        totalBill.computeBill();
    }
}
