import java.util.*;

class IntegerArray {
    private int [] data = new int [5];

    public void inputData() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt(); 
            if (contains(data, num)) {
                scanner.close();
                System.out.print("INVALID INPUT");
                System.exit(1);
            } else {
                data[i] = num;
            }
        }
        scanner.close();
    }

    public void bubbleSort(){
        for(int i=0; i<data.length; i++){
            for(int j=0; j<i - 1; j++){
                if(data[j] > data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    } 
    
    private boolean contains(int[] arr, int num) {
        for (int n : arr) {
            if (n == num) {
                return true;
            }
        }
        return false;
    }
}

public class Q3{ 
    public static void main (String args []){
        IntegerArray integerArray = new IntegerArray();
        integerArray.inputData();
        integerArray.bubbleSort();
    }
}

