package com.example.android.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**

 This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @override
    public void SubmitOrder(View view) {display(1);
        SubmitOrder();
    }

    @override
    public void SubmitOrder() {

    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     This method is called when the order button is clicked.
     */


    /**
     This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
}
