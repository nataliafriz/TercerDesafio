package cl.desafiolatam.tercerdesafio.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Questions {

    @SerializedName("questions")
    private String questions;
    @SerializedName("category")
    private String category;
    @SerializedName("type")
    private String type;
    @SerializedName("difficulty")
    private String difficulty;
    @SerializedName("corerct")
    private String correct;
    @SerializedName("incorrect")
    private ArrayList<String> incorrect;

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getCorrect() {
        return correct;
    }

    public void setCorrect(String correct) {
        this.correct = correct;
    }

    public ArrayList<String> getIncorrect() {
        return incorrect;
    }

    public void setIncorrect(ArrayList<String> incorrect) {
        this.incorrect = incorrect;
    }
}
