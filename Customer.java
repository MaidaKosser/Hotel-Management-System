import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private List<String> feedbacks;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
        this.feedbacks = new ArrayList<>();

    }

    public int getID() { // customers id and name
        return id;
    }

    public String getName() {
        return name;
    }

    public void addFeedBack(String feedback) {
        feedbacks.add(feedback); // customers get the feedback
    }

    public List<String> getFeedBack() {
        return feedbacks;
    }

    public void put(int id2, Customer guest) {
    }
}
