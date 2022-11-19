package assignment2.contentCoupling;

import java.util.ArrayList;

public class BookManager {
    ArrayList<Book> books = new ArrayList<>();
    void sellBooks(String name){
        for(int i = 0; i < books.size(); i++){
            if(books.get(i).name == name){
                books.get(i).sold = true;
                break;
            }
        }
    }
}

/*--------------------------------Explanation------------------------------------
Here the BookManager class can directly access any field of the Book object, in fact
it can change the price. To avoid this, we should use getters and setters.
 */