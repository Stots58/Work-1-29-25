import java.util.Scanner; 
// A function that counts down from a user entered integer on separate lines. You must use a loop and you must validate input.

class Main {
    public static void main(String[] args){
        // calling funtion inside the class
        System.out.println("Calling function.");
        validationAndCountDown();
    }
    
    // function
    public static void validationAndCountDown(){
        // user validationa
        try {
            // user input for there number
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number.: ");
            
            int userimp = scanner.nextInt();
            // gets the number from the unput and counts it down to 1.
            for (int i = userimp - 1; i > 0; i--){
                System.out.println(i);
            }
        }
        catch (Exception e){
            System.out.println("Thats not a number.");
        }
    }
}
