package navigation.ui.lln;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;
import navigation.ui.lln.Five.FiveActivity;
import navigation.ui.lln.Four.FourActivity;
import navigation.ui.lln.One.OneActivity;
import navigation.ui.lln.Tree.TreeActivity;
import navigation.ui.lln.Two.TwoActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton first_button, second_button, third_button, fourth_button, fifth_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        first_button.setOnClickListener(this);
        second_button.setOnClickListener(this);
        third_button.setOnClickListener(this);
        fourth_button.setOnClickListener(this);
        fifth_button.setOnClickListener(this);
    }

    public void init() {
        first_button = (AppCompatButton) findViewById(R.id.first_btn);
        second_button = (AppCompatButton) findViewById(R.id.second_btn);
        third_button = (AppCompatButton) findViewById(R.id.third_btn);
        fourth_button = (AppCompatButton) findViewById(R.id.fourth_btn);
        fifth_button = (AppCompatButton) findViewById(R.id.fifth_btn);
    }


        @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.first_btn:
                Intent intent_one = new Intent(MainActivity.this, OneActivity.class);
                startActivity(intent_one);
                break;
            case R.id.second_btn:
                Intent intent_two = new Intent(MainActivity.this, TwoActivity.class);
                startActivity(intent_two);
                break;
            case R.id.third_btn:
                Intent intent_tree = new Intent(MainActivity.this, TreeActivity.class);
                startActivity(intent_tree);
                break;
            case R.id.fourth_btn:
                Intent intent_four = new Intent(MainActivity.this, FourActivity.class);
                startActivity(intent_four);
                break;
            case R.id.fifth_btn:
                Intent intent_five = new Intent(MainActivity.this, FiveActivity.class);
                startActivity(intent_five);
                break;
        }
    }
}
