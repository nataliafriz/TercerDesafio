package cl.desafiolatam.tercerdesafio;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import cl.desafiolatam.tercerdesafio.api.Api;
import cl.desafiolatam.tercerdesafio.api.RetrofitClient;
import cl.desafiolatam.tercerdesafio.pojo.QuestionsList;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "LifeCyclLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"Create activity");
        Api service = RetrofitClient.getRetrofitInstance().create(Api.class);
        Call<QuestionsList> call = service.getAllQuestions();
        call.enqueue(new Callback<QuestionsList>() {

            @Override
            public void onResponse
                    (Call<QuestionsList> call, Response<QuestionsList> response) {

            }

            @Override
            public void onFailure(Call<QuestionsList> call, Throwable t) {

            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"Start activity");

    }
    @Override
    protected  void onResume() {
        super.onResume();
        Log.i(TAG,"Resume activity");
        Toast.makeText(getApplicationContext(),"onResume: return activity", Toast.LENGTH_SHORT).show();
    }
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"Resume activity");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"Stop activity");
        Toast.makeText(getApplicationContext(),"onStop: Stop activity",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"Destroy activity");
    }
}
