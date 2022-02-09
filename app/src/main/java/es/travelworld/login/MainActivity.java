package es.travelworld.login;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.google.android.material.snackbar.Snackbar;
import es.travelworld.login.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding viewBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(viewBinding.getRoot());

        setListeners();
    }

    private void setListeners() {
        viewBinding.mainForgotPasswordButton.setOnClickListener(view -> showWIPMessage());
        viewBinding.mainAccountButton.setOnClickListener(view -> showWIPMessage());
    }

    private void showWIPMessage() {
        Snackbar.make(viewBinding.getRoot(), R.string.wip_feature, Snackbar.LENGTH_LONG).show();
    }

}