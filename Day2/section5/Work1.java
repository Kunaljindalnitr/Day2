import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        String[] arr = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nDo you sell coffee?");
        Scanner scan = new Scanner(System.in);
        String a= scan.next();
        scan.close();
        for(int i = 0;i<arr.length;i++){
            if(arr[i].equals(a)){
                System.out.println("\nWe have that in aisle: "+ i);
            }
        }
    }
    
}
