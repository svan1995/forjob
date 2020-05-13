package clone;

import java.io.Serializable;

public class Grade implements Cloneable, Serializable {
    private String score;

    public Grade(String score) {
        this.score = score;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public Grade clone() throws CloneNotSupportedException{
        return (Grade) super.clone();
    }

    @Override
    public String toString() {
        return "Grade{" +
                "score='" + score + '\'' +
                '}';
    }
}
