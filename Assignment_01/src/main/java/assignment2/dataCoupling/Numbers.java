package assignment2.dataCoupling;

public class Numbers {
    int a;
    int b;
    void printAvg(){
        Math math = new Math();
        System.out.println(math.calculateAverageOfTwoNumbers(a, b));
    }
}

/*--------------------------------Explanation------------------------------------
In this example, the classes interact with each other by sending fields of Numbers class
to the calculateAverageOfTwoNumbers method of Math class as parameter. This coupling is known
as data coupling.
 */