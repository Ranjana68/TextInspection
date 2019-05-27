package com.example.lenovo.textinspection;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText et,e1,e2,e3,e4;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.editText);
        btn = findViewById(R.id.button);
        e1=findViewById(R.id.et1);
        e2=findViewById(R.id.et2);
        e3=findViewById(R.id.et3);
        e4=findViewById(R.id.et4);

        btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                String str= String.valueOf(et.getText());
                char[] ch = str.toCharArray();
                int u=0,l=0,n=0,s=0;
                for(int i=0;i<str.length();i++)
                {
                    if(ch[i]>='A' & ch[i]<='Z')
                        u=u+1;
                    else if(ch[i]>='a' & ch[i]<='z')
                        l=l+1;
                    else if(ch[i]>='0' & ch[i]<='9')
                        n=n+1;
                    else
                        s=s+1;

                }
               Toast.makeText(MainActivity.this, "U:"+u+" L:"+l+" N:"+n+" S:"+s, Toast.LENGTH_SHORT).show();
                e1.setText("  "+u);
                e2.setText("  "+l);
                e3.setText("  "+n);
                e4.setText("  "+s);



            }
        });


    }
}
