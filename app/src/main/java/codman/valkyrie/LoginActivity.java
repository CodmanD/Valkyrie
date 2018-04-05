package codman.valkyrie;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by DI1 on 04.04.2018.
 */

public class LoginActivity extends AppCompatActivity  implements View.OnClickListener{
    @BindView(R.id.etUser)
    EditText etUser;
    @BindView(R.id.etPassword)
    EditText etPassword;


    @BindView(R.id.btnSignIn)
    Button btnSignIn;

    @BindView(R.id.tvLostPass)
    TextView tvLostPass;
    @BindView(R.id.tvRegister)
    TextView tvRegister;

    @BindView(R.id.ivFacebook)
    ImageView ivFacebook;
    @BindView(R.id.ivInstagram)
    ImageView ivInstagram;


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {



            case R.id.btnSignIn:
            {
                Intent intent= new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.ivFacebook:
            {
                Intent intent= new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.ivInstagram:
            {
                Intent intent= new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.tvLostPass:
            {
                Intent intent= new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.tvRegister:
            {
                Intent intent= new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
            break;
        }
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        btnSignIn.setOnClickListener(this);
        ivFacebook.setOnClickListener(this);
        ivInstagram.setOnClickListener(this);
        tvLostPass.setOnClickListener(this);
        tvRegister.setOnClickListener(this);
    }
}
