package com.example.myapplication222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     EditText txtNoiDung;
     EditText txtNoiDung2;
     Button   btOclick;
     TextView txtOutPut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // học về ham random
        // ánh xạ
         txtNoiDung= (EditText)  findViewById(R.id.text1);
         txtNoiDung2= (EditText) findViewById(R.id.text2);
         btOclick= (Button) findViewById(R.id.button1);
         txtOutPut=(TextView) findViewById(R.id.textView2);
         btOclick.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                   //Random random= new Random();
                  // int number=random.nextInt();
                   //txtNoiDung.setText(number+"");// numer +""
              //RANDOM GIA  TRI LON NHAT NHO NHAT
                 // lấy  giá trị của txtNoiDung gán cho  chuoi1
                 String chuoi1= txtNoiDung.getText().toString().trim();
                 String chuoi2= txtNoiDung2.getText().toString().trim();
                 //kiểm tra  không cho các chuổi rổng
                 if (chuoi1.length()==0||chuoi2.length()==0){
                     Toast.makeText(MainActivity.this, "vui long nhap dU SO!",Toast.LENGTH_SHORT).show();
                 } else {
                     //  chuyển  giá  trị chuổi thành số.
                      int min1=Integer.parseInt(chuoi1);
                      int max1=Integer.parseInt(chuoi2);
                       Random random= new Random();
                       int number= random.nextInt(max1-min1+1)+min1;
                       txtOutPut.setText(String.valueOf(number));
                 }
             }
         });
    }
}
