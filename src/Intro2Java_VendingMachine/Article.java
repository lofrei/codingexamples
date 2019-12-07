package Intro2Java_VendingMachine;

import java.util.Scanner;

class Article {

    // Define the attributes
    private String articleName;
    private double articlePrice;
    private int itemsLeft;

    // Define the constructor method
    Article(String articleName, double articlePrice, int itemsLeft){
        this.articleName = articleName;
        this.articlePrice = articlePrice;
        this.itemsLeft = itemsLeft;
    }

    // Define getter-methods for the attributes
    public String getArticleName(){
        return this.articleName;
    }

    public double getArticlePrice() {
        return this.articlePrice;
    }

    public int getItemsLeft(){
        return this.itemsLeft;
    }

    // Define business logic methods
    // Sell an article
    public boolean sellItem(){
        if (this.itemsLeft > 0){
            this.itemsLeft--;
            return true;
        }
        else{
            return false;
        }
    }

    // Pay for an article
    public void cashArticle() {
        double cashIn = 0;
        Scanner scanner = new Scanner(System.in);
        String message  = "Your " + this.articleName + " costs " +
                this.articlePrice + " €.\n" +
                "Please, enter your money." ;
        System.out.println(message);
        double totalCash = 0;

        cashIn = scanner.nextDouble();
        totalCash += cashIn;

        while (totalCash<this.articlePrice){
            message  = "You paid" + totalCash + " €. It costs " +
                    this.articlePrice + "€"         ;
            cashIn = scanner.nextDouble();
            totalCash += cashIn;
        }

        System.out.println("Here is your change: "+ (totalCash-this.articlePrice) + " €");
    }

    // Define the toString-method
    public String toString(){
        return String.format("%s costs %4.2f Euros. There are %2d items available.",
                this.articleName, this.articlePrice, this.itemsLeft);
    }
}