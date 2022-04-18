package android.bignerdranch.deliciouspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MenuSize3 extends AppCompatActivity {

    double sum3 = 0;
    double change3= 0;
    boolean isValid3 = false;
    private TextView total3;
    private EditText number3;
    private TextView text4;
    private TextView msg3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_size);
        final RadioButton radioBtn13 = (RadioButton) findViewById(R.id.radioButton13);
        final RadioButton radioBtn14 = (RadioButton) findViewById(R.id.radioButton14);
        final RadioButton radioBtn15 = (RadioButton) findViewById(R.id.radioButton15);
        Button payment3 = (Button)findViewById(R.id.payBtn3);
        EditText number;
        number = (EditText) findViewById(R.id.number);
        double amount3 = Double.parseDouble(number.getText().toString());
        total3 = findViewById(R.id.total3);
        msg3 = findViewById(R.id.msg3);





        Button okBtn3 = (Button) findViewById(R.id.okBtn3);

        okBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioBtn13.isChecked()){
                    sum3= 0 + 38;
                    total3.setText("R" + String.valueOf(sum3));

                }else if (radioBtn14.isChecked()){
                    sum3 = 0+48;
                    total3.setText("R"+String.valueOf(sum3));
                }else if (radioBtn15.isChecked()){
                    sum3 = 58;
                    total3.setText("R"+String.valueOf(sum3));
                }else if (radioBtn13.isChecked() && radioBtn14.isChecked()){
                    sum3 = 38+48;
                    total3.setText("R"+String.valueOf(sum3));
                }else if (radioBtn13.isChecked() && radioBtn15.isChecked()){
                    sum3 = 38+58;
                    total3.setText("R"+String.valueOf(sum3));
                }else{
                    sum3= 48+58;
                    total3.setText("R"+String.valueOf(sum3));
                }
            }
        });
        payment3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                do{
                    if(amount3 >sum3){
                        isValid3 = true;
                        change3 = amount3 - sum3;
                        text4.setText("R" + String.valueOf(change3));
                        msg3.setText("Thank you do call again!");

                    }else{
                        isValid3 = false;
                        msg3.setText("Invalid amountEntry.Please enter the correct amountEntry!");
                    }

                }while (!isValid3);

            }
        });
    }


}