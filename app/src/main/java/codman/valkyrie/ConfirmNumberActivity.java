package codman.valkyrie;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by DI1 on 10.04.2018.
 */

public class ConfirmNumberActivity extends AppCompatActivity  {

    @BindView(R.id.etNumber)
    EditText etNumber;

    @BindView(R.id.btnConfirm)
    Button btnConfirm;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number);
        ButterKnife.bind(this);
        btnConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ConfirmNumberActivity.this,etNumber.getText(),Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(ConfirmNumberActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
