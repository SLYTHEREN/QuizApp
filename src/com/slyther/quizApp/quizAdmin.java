import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Question> questions;

    public Admin() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    // Other admin functionalities like saving to file, etc.
}
