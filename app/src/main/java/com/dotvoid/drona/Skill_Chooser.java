package com.dotvoid.drona;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class Skill_Chooser extends AppCompatActivity {

    FrameLayout f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12;
    String firstname,lastname;
    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill__chooser);

        Intent i=getIntent();
        firstname=i.getStringExtra("fname");
        lastname=i.getStringExtra("lname");


        t=(TextView)findViewById(R.id.textView);

        t.setText(firstname+" "+lastname+", "+t.getText().toString());

        f1=(FrameLayout)findViewById(R.id.f1);
        f2=(FrameLayout)findViewById(R.id.f2);
        f3=(FrameLayout)findViewById(R.id.f3);
        f4=(FrameLayout)findViewById(R.id.f4);
        f5=(FrameLayout)findViewById(R.id.f5);
        f6=(FrameLayout)findViewById(R.id.f6);
        f7=(FrameLayout)findViewById(R.id.f7);
        f8=(FrameLayout)findViewById(R.id.f8);
        f9=(FrameLayout)findViewById(R.id.f9);
        f10=(FrameLayout)findViewById(R.id.f10);
        f11=(FrameLayout)findViewById(R.id.f11);
        f12=(FrameLayout)findViewById(R.id.f12);


        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Java");
                startActivity(tp);
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Android");
                startActivity(tp);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Guitar");
                startActivity(tp);
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Football");
                startActivity(tp);
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Algebra");
                startActivity(tp);
            }
        });

        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Geometry");
                startActivity(tp);
            }
        });


        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","C++");
                startActivity(tp);
            }
        });

        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Photoshop");
                startActivity(tp);
            }
        });

        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Medicine");
                startActivity(tp);
            }
        });

        f10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Calligraphy");
                startActivity(tp);
            }
        });

        f11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Yoga");
                startActivity(tp);
            }
        });

        f12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tp=new Intent(getApplicationContext(),Teacher.class);
                tp.putExtra("sub","Cricket");
                startActivity(tp);
            }
        });


    }

    public void go_to_profile(View view)
    {
        Intent gtp=new Intent(this,Profile.class);
        startActivity(gtp);
    }
}
