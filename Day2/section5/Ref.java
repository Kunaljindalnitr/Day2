import java.util.Arrays;

public class Ref {
    public static void main(String[] args) {
        String[] arr= {"Tomm","And","Jerry"};
        String[] arr2 = arr;
        arr2[0] = "Me";
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));
    }
    
}
