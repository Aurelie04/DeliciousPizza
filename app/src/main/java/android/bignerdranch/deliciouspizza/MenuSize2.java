package android.bignerdranch.deliciouspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MenuSize2 extends AppCompatActivity {

    double sum2 = 0;
    double change2 = 0;
    boolean isValid2 = false;
    private TextView total2;
    private EditText number2;
    private TextView text3;
    private TextView msg2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_size);
        final RadioButton radioBtn10 = (RadioButton) findViewById(R.id.radioButton10);
        final RadioButton radioBtn11 = (RadioButton) findViewById(R.id.radioButton11);
        final RadioButton radioBtn12 = (RadioButton) findViewById(R.id.radioButton12);
        Button payment2 = (Button)findViewById(R.id.pay2);
        EditText amountEntry;
        number2 = (EditText) findViewById(R.id.editTextNumber2);
        double amount2 = Double.parseDouble(number2.getText().toString());
        total2 = findViewById(R.id.total2);
        msg2 = findViewById(R.id.msg2);





        Button okBtn2 = (Button) findViewById(R.id.ok2);

        okBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioBtn10.isChecked()){
                    sum2 = 0 + 35;
                    total2.setText("R" + String.valueOf(sum2));

                }else if (radioBtn11.isChecked()){
                    sum2 = 0+45;
                    total2.setText("R"+String.valueOf(sum2));
                }else if (radioBtn12.isChecked()){
                    sum2 = 55;
                    total2.setText("R"+String.valueOf(sum2));
                }else if (radioBtn10.isChecked() && radioBtn11.isChecked()){
                    sum2 = 35+45;
                    total2.setText("R"+String.valueOf(sum2));
                }else if (radioBtn10.isChecked() && radioBtn12.isChecked()){
                    sum2 = 35+55;
                    total2.setText("R"+String.valueOf(sum2));
                }else{
                    sum2 = 40+50;
                    total2.setText("R"+String.valueOf(sum2));
                }
            }
        });
        payment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                do{
                    if(amount2 >sum2){
                        isValid2 = true;
                        change2 = amount2 - sum2;
                        text3.setText("R" + String.valueOf(change2));
                        msg2.setText("Thank you do call again!");

                    }else{
                        isValid2 = false;
                        msg2.setText("Invalid amountEntry.Please enter the correct amountEntry!");
                    }

                }while (!isValid2);

            }
        });
    }

}