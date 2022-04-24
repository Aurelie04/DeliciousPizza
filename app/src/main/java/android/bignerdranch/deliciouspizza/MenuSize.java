package android.bignerdranch.deliciouspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MenuSize extends AppCompatActivity {
    double sum = 0;
    double change = 0;
    boolean isValid = false;
    private TextView total;
    private EditText number;
    private TextView text2;
    private TextView msg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_size);
        final RadioButton radioBtn7 = (RadioButton) findViewById(R.id.radioButton7);
        final RadioButton radioBtn8 = (RadioButton) findViewById(R.id.radioButton8);
        final RadioButton radioBtn9 = (RadioButton) findViewById(R.id.radioButton9);
        Button payment = (Button)findViewById(R.id.payBtn);
   //     EditText amountEntry;
//        number = (EditText) findViewById(R.id.amountEntry);
//        double amount = Double.parseDouble(number.getText().toString());
        total = findViewById(R.id.total);
        msg = findViewById(R.id.message);





        Button okButton = (Button) findViewById(R.id.ok);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(radioBtn7.isChecked()){
                    sum = 0 + 30;
                    total.setText("R" + String.valueOf(sum));

                }else if (radioBtn8.isChecked()){
                    sum = 0+40;
                    total.setText("R"+String.valueOf(sum));
                }else if (radioBtn9.isChecked()){
                    sum = 50;
                    total.setText("R"+String.valueOf(sum));
                }else if (radioBtn7.isChecked() && radioBtn8.isChecked()){
                    sum = 30+40;
                    total.setText("R"+String.valueOf(sum));
                }else if (radioBtn7.isChecked() && radioBtn9.isChecked()){
                    sum = 30+50;
                    total.setText("R"+String.valueOf(sum));
                }else{
                    sum = 40+50;
                    total.setText("R"+String.valueOf(sum));
                }
            }
        });
        payment.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
//                   do{
//                       if(amount >sum){
//                           isValid = true;
//                           change = amount - sum;
//                           text2.setText("R" + String.valueOf(change));
//                           msg.setText("Thank you do call again!");
//
//                       }else{
//                           isValid = false;
//                           msg.setText("Invalid amountEntry.Please enter the correct amountEntry!");
//                       }
//
//                   }while (!isValid);

               }
           });
    }

}