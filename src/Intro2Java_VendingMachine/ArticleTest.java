package Intro2Java_VendingMachine;

public class ArticleTest {
    public static void main(String[] args) {
        // Test constructor
        Article myArticle = new Article("ice cream",2.7,3);

        // Test getter methods
        System.out.println("articleName = " + myArticle.getArticleName());
        System.out.println("articlePrice = " + myArticle.getArticlePrice());
        System.out.println("itemsLeft = " + myArticle.getItemsLeft());

        // Test the toString-method
        System.out.println(myArticle);

        // Test business logic methods
        System.out.println("result of sellItem() = " + myArticle.sellItem());
        System.out.println("itemsLeft = " + myArticle.getItemsLeft());

        myArticle.cashArticle();
    }
}
