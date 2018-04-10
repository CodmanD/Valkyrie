package codman.valkyrie;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by DI1 on 06.04.2018.
 */

public class CreateAccountActivity extends AppCompatActivity implements View.OnClickListener ,View.OnFocusChangeListener{

    @BindView(R.id.iv1)
    ImageView iv1;
    @BindView(R.id.iv2)
    ImageView iv2;
    @BindView(R.id.iv3)
    ImageView iv3;
    @BindView(R.id.iv4)
    ImageView iv4;
    @BindView(R.id.iv5)
    ImageView iv5;
    @BindView(R.id.ivClose)
    ImageView ivClose;
    @BindView(R.id.llFacebook)
    LinearLayout llFacebook;
    @BindView(R.id.llInstagram)
    LinearLayout llInstagram;
    @BindView(R.id.tvSignIn)
    TextView tvSignIn;

    @BindView(R.id.etEmail)
    EditText etEmail;
    @BindView(R.id.etUser)
    EditText etUser;
    @BindView(R.id.etPassword)
    EditText etPassword;
    @BindView(R.id.etPhone)
    EditText etPhone;
    @BindView(R.id.etAddress)
    EditText etAddress;
    @BindView(R.id.btnRegistration)
    Button btnRegistration;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account_activity);

        ButterKnife.bind(this);

       // etEmail.setOnClickListener(this);
       // etUser.setOnClickListener(this);
       ivClose.setOnClickListener(this);
       llInstagram.setOnClickListener(this);
        llFacebook.setOnClickListener(this);
        btnRegistration.setOnClickListener(this);
        tvSignIn.setOnClickListener(this);


        etEmail.setOnFocusChangeListener(this);
        etUser.setOnFocusChangeListener(this);
        etPassword.setOnFocusChangeListener(this);
        etPhone.setOnFocusChangeListener(this);
        etAddress.setOnFocusChangeListener(this);
        btnRegistration.setOnClickListener(this);
    }

    @Override
    public void onFocusChange(View v, boolean hasFocus) {
        switch(v.getId())
        {
            case R.id.etEmail:
               if(hasFocus)
                   iv1.setImageDrawable(getResources().getDrawable(R.drawable.circle_step_red));
                else
                   iv1.setImageDrawable(getResources().getDrawable(R.drawable.circle_step));
               // iv1.invalidate();
                break;
            case R.id.etUser:
                if(hasFocus)
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.circle_step_red));
                else
                    iv2.setImageDrawable(getResources().getDrawable(R.drawable.circle_step));

                break;
            case R.id.etPassword:
                if(hasFocus)
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.circle_step_red));
                else
                    iv3.setImageDrawable(getResources().getDrawable(R.drawable.circle_step));
                 break;
            case R.id.etPhone:
                if(hasFocus)
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.circle_step_red));
                else
                    iv4.setImageDrawable(getResources().getDrawable(R.drawable.circle_step));
                break;
            case R.id.etAddress:
                if(hasFocus)
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.circle_step_red));
                else
                    iv5.setImageDrawable(getResources().getDrawable(R.drawable.circle_step));
                break;

        }
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {

            case R.id.btnRegistration:
            {
                Toast.makeText(this,"Registration",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(CreateAccountActivity.this,ConfirmNumberActivity.class);
                startActivity(intent);
            }
                break;
            case R.id.tvSignIn:
            {
                Toast.makeText(this,"Sign In",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(CreateAccountActivity.this,LoginActivity.class);
                startActivity(intent);
            }
            break;

            case R.id.llFacebook:
            {
                Toast.makeText(this,"Facebook",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(CreateAccountActivity.this,MainActivity.class);
                startActivity(intent);
            }
            break;

            case R.id.llInstagram:
            {
                Toast.makeText(this,"Instagram",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(CreateAccountActivity.this,MainActivity.class);
                startActivity(intent);
            }
            break;

            case R.id.ivClose:
            {
                Toast.makeText(this,"Close REGISTRATION",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(CreateAccountActivity.this,LoginActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}
