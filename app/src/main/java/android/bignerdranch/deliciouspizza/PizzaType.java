package android.bignerdranch.deliciouspizza;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class PizzaType extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_type);
        final RadioButton radioBtn1 = (RadioButton) findViewById(R.id.radioButton1);
        final RadioButton radioBtn2 = (RadioButton) findViewById(R.id.radioButton2);
        final RadioButton radioBtn3 = (RadioButton) findViewById(R.id.radioButton3);
        Button nextButton = (Button) findViewById(R.id.next);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                   if(radioBtn1.isChecked()){
                       startActivity(new Intent(PizzaType.this,MenuSize.class));
                   }else if(radioBtn2.isChecked()){
                       startActivity((new Intent(PizzaType.this,MenuSize2.class)));
                   }else if(radioBtn3.isChecked()){
                       startActivity(new Intent(PizzaType.this,MenuSize3.class));
                   }
            }
        });
    }
}