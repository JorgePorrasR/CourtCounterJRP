package mx.com.systemjorge.Courtcounter;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayA(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_a_score);
        scoreTextView.setText("" + number);
    }
    private void displayB(int number) {
        TextView scoreTextView = (TextView) findViewById(R.id.team_b_score);
        scoreTextView.setText("" + number);
    }

    int scoreA = 0;
    int scoreB = 0;

    public void threePointA(View view) {
        scoreA = scoreA + 3;
        displayA(scoreA);
    }
    public void twoPointA(View view) {
        scoreA = scoreA + 2;
        displayA(scoreA);
    }
    public void freeThrowA(View view) {
        scoreA = scoreA + 1;
        displayA(scoreA);
    }
    public void threePointB(View view) {
        scoreB = scoreB + 3;
        displayB(scoreB);
    }
    public void twoPointB(View view) {
        scoreB = scoreB + 2;
        displayB(scoreB);
    }
    public void freeThrowB(View view) {
        scoreB = scoreB + 1;
        displayB(scoreB);
    }
    public void reset(View view) {
        scoreA = 0;
        scoreB = 0;
        displayA(scoreA);
        displayB(scoreB);
    }

}