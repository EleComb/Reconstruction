package _6;

public class Inline_Method {

    int numberOfLateDeliveries = 0;

    int getRating() {
        return (moreThanFiveLateDeliveries()) ? 2 : 1;
    }

    boolean moreThanFiveLateDeliveries() {
        return numberOfLateDeliveries > 5;
    }
}
