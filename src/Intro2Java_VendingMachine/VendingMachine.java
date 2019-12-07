package Intro2Java_VendingMachine;

import java.util.Scanner;

// The VendingMachine was created as final project in Intro2Java Spring 2019

// This VendingMachine
//  - offers articles which are stored in an array
//  - lets the user select an article by entering the article number
//  - checks the availability of that article
//  - asks the user to pay for the selected article
//  - gives the article to the user

public class VendingMachine {

    public static void main(String... args) {

        // Create articleArray and fill it with Articles
        Article[] articleArray = new Article[4];
        Article article;
        article = new Article("chocolate",1.5,2);
        articleArray[0] = article;
        article = new Article("chewing gum",0.5,3);
        articleArray[1] = article;
        article = new Article("ice cream",1.9,0);
        articleArray[2] = article;
        article = new Article("cookie",1.2,5);
        articleArray[3] = article;

        // Print welcome message to user
        String welcomeMessage = "Hello, I am your vending machine. " +
                "I offer the following articles:\n";
        for (int i=0; i < articleArray.length; i++) {
            welcomeMessage = welcomeMessage + i + " = " + articleArray[i].getArticleName() + "\n";
        }
        System.out.println(welcomeMessage);

        // Prepare for reading input from user
        Scanner scanner = new Scanner(System.in);
        int articleNum = 0;
        String selectText = "Please select article number or -1 to stop.";

        while (articleNum >= 0) {
            // Read articleNum from User
            System.out.println(selectText);
            articleNum = scanner.nextInt();

            // Check end condition
            if (articleNum < 0) {
                System.out.println("Bye bye!");
            }
            // Check if correct articleNum has been entered
            else if (articleNum > articleArray.length-1) {
                System.out.println("Selected article number " +articleNum+ " not found :-( \n");
            }

            else {
                // Check if selected article is available
                Article selArticle = articleArray[articleNum];
                if (selArticle.getItemsLeft() < 1){
                    System.out.println("Sorry, we ran out of " + selArticle.getArticleName() + " :-( \n");
                }
                else {
                    // Ask for money and return change
                    selArticle.cashArticle();

                    // Sell article
                    selArticle.sellItem();
                    System.out.println("Here is your " + selArticle.getArticleName() + ". Thanks for shopping :-) \n");
                }
            }
        }
    }
}
