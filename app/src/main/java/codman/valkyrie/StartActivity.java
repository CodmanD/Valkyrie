package codman.valkyrie;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by DI1 on 05.04.2018.
 */

public class StartActivity extends AppCompatActivity  implements View.OnClickListener {


    @BindView(R.id.btnCreateAccount)
    Button btnCreateAccount;
    @BindView(R.id.btnSignIn)
    Button btnSignIn;
    @BindView(R.id.ivFacebook)
    ImageView ivFacebook;
    @BindView(R.id.ivInstagram)
    ImageView ivInstagram;


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnCreateAccount:
            {
                Intent intent= new Intent(StartActivity.this,CreateAccountActivity.class);
                startActivity(intent);
            }


                break;
            case R.id.btnSignIn:
            {
                Intent intent= new Intent(StartActivity.this,LoginActivity.class);
                startActivity(intent);
            }
                break;
            case R.id.ivFacebook:
            {
                Intent intent= new Intent(StartActivity.this,MainActivity.class);
                startActivity(intent);
            }
                break;
            case R.id.ivInstagram:
            {
                Intent intent= new Intent(StartActivity.this,MainActivity.class);
                startActivity(intent);
            }
                break;
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);
        ButterKnife.bind(this);
        btnCreateAccount.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);
        ivFacebook.setOnClickListener(this);
        ivInstagram.setOnClickListener(this);
    }
}
