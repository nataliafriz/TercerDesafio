package cl.desafiolatam.tercerdesafio.pojo;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class QuestionsList {

    @SerializedName("response_code")
    private int response_code;
    @SerializedName("results")
    private ArrayList<Questions> results;

    public int getResponse_code() {
        return response_code;
    }

    public void setResponse_code(int response_code) {
        this.response_code = response_code;
    }

    public ArrayList<Questions> getResults() {
        return results;
    }

    public void setResults(ArrayList<Questions> results) {
        this.results = results;
    }
}
