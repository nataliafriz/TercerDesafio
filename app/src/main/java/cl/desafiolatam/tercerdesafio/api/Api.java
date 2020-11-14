package cl.desafiolatam.tercerdesafio.api;

import cl.desafiolatam.tercerdesafio.pojo.QuestionsList;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    @GET("api.php?amount=10&category=15&difficulty=easy")
    Call<QuestionsList> getAllQuestions();
}
