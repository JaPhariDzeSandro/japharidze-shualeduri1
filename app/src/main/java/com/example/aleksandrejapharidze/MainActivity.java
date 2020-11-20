package com.example.aleksandrejapharidze;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import javax.microedition.khronos.egl.EGLDisplay;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
      public void button1 (View view){


        EditText editText = (EditText)findViewById(R.id.ჯიში);
        EditText editText1 = (EditText)findViewById(R.id.სახელი);
        EditText editText2 = (EditText)findViewById(R.id.ასაკი);


        String message;

      if (editText.getText().toString().isEmpty()) {
         message = "შეიყვანეთ ჯიში";
      }
      if (editText1.getText().toString().isEmpty()){
          message = "შეიყვანეთ სახელი";
     if (editText2.getText().toString().isEmpty()) {
         message = "შეიყვანეთ ასაკი";

         else{
       int ასაკი = Integer.parseInt(editText2.getText().toString());
        if (ასაკი > 10) {
         message = "მაგდენ ხანს მარტო კუ ცხოვრობს";
     } else if (ასაკი < 1) {
        message = "ჯერ პატარაა";
          } else {
        message = "everything done";
     }
  }

         Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
     }



