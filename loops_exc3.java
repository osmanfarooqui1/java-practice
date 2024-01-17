import java.util.Scanner;

public class loops_exc3 {
    public static void main(String[] args) {

        // Printing even numbers
        // for(int i=0;i<15;i=i+2){
        //     System.out.println(i);
        // }
        Scanner sc = new Scanner(System.in);
            int choice;

        do{
            System.out.println("0 to Enter students marks");
            System.out.println("1 to Exit");
            System.out.println("Enter your choice 0 & 1");
            choice = sc.nextInt();

        }while(choice != 0);
            
        System.out.println("Enter student marks");

        int marks = sc.nextInt();

        if(marks>90){
            System.out.println("This is good");
        }else if (marks >= 60 &&  marks <=89){
            System.out.println("This is also good");
        }else{
            System.out.println("This is good as well");
        }
    }
    
}
