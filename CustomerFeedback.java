import java.util.Scanner;

public class CustomerFeedback {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== Customer Feedback Analysis System =====");

        
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

       
        System.out.print("Enter Rating (1 to 5): ");
        int rating = sc.nextInt();
        sc.nextLine(); // clear buffer

        
        System.out.print("Enter Feedback: ");
        String feedback = sc.nextLine();

        System.out.println("\n===== Analysis Result =====");

        if(rating >=5){
            System.out.println("Excellent");
        }
       else  if (rating >= 4) {
            System.out.println("Customer Satisfaction: Positive");
        } 
        else if (rating == 3) {
            System.out.println("Customer Satisfaction: Neutral");
        } 
        else {
            System.out.println("Customer Satisfaction: Negative");
        }

       
        feedback = feedback.toLowerCase();

        if (feedback.contains("good") || 
            feedback.contains("excellent") || 
            feedback.contains("best")) {

            System.out.println("Feedback Sentiment: Positive");
        }
        else if (feedback.contains("bad") || 
                 feedback.contains("poor") || 
                 feedback.contains("worst")) {

            System.out.println("Feedback Sentiment: Negative");
        }
        else {
            System.out.println("Feedback Sentiment: Neutral");
        }

       
        System.out.println("\nCustomer Name: " + name);
        System.out.println("Rating: " + rating);

        sc.close();
    }
}
