import java.util.Scanner;

public class table_loop_exc2 {
    public static void main(String[] args) {
        // Printing the table of a number
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<=10; i++){
            System.out.println(n*i);
        }
        
    }
    
}
