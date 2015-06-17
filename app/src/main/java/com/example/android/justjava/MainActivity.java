package com.example.android.justjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;


public class MainActivity extends ActionBarActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment(View view){
        if(quantity == 0){
            quantity = 0;
        }else{
            quantity++;
            display(quantity);
        }
    }
    public void decrement(View view){
        if(quantity == 0){
            quantity = 0;
        }else{
            quantity--;
            display(quantity);
        }
    }
    public void submitOrder(View view){
        display(quantity);
        displayPrice(quantity * 5);
    }
    private void display(int number){
        TextView quantity_view = (TextView) findViewById(R.id.quantity_text_view);
        quantity_view.setText("" + number);
    }
    private void displayPrice(int number){
        TextView price_view = (TextView) findViewById(R.id.price_text_view);
        price_view.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}
