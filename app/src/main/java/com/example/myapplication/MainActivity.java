package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_shuru);
        final EditText et_sex=  findViewById(R.id.et_sex);
        final EditText et_height =  findViewById(R.id.et_height);
        final EditText et_age =  findViewById(R.id.et_age);
        final EditText et_weight = findViewById(R.id.et_weight);
        Button start = findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,FirstActivity.class);

                Bundle bundle= new Bundle();
                String height = et_height.getText().toString();
                String age = et_age.getText().toString();
                String weight = et_weight.getText().toString();
                String sex = et_sex.getText().toString();
                String sex1="male",sex2="female";
                int i,m=0,k1=0,k2=0,k3=0;

                String n;
                String n1="1",n2="2",n3="3",n4="4",n5="5",n6="6",n7="7",n8="8",n9="9",n0="0";
                char [] ch=age.toCharArray();
                char [] ch1=weight.toCharArray();
                char [] ch2=height.toCharArray();

                for (i=0;i<ch.length;i++)
                {
                    if (Character.isDigit(ch[i]))
                        k1=0;
                    else {k1=1;break;}
                }
                for (i=0;i<ch1.length;i++)
                {
                    if (Character.isDigit(ch1[i]))
                        k1=0;
                    else {k1=1;break;}
                }
                for (i=0;i<ch2.length;i++)
                {
                    if (Character.isDigit(ch2[i]))
                        k1=0;
                    else {k1=1;break;}
                }
                if (!sex.equals(sex1)&&!sex.equals(sex2))
                {
                    Toast.makeText(getApplicationContext(),"请输入male或female",Toast.LENGTH_SHORT).show();return;}
                if (height.length()==0||age.length()==0||weight.length()==0||sex.length()==0)
                {Toast.makeText(getApplicationContext(),"请输入数据！",Toast.LENGTH_SHORT).show();return;}
                if (age.substring(0,1).equals(n0)||height.substring(0,1).equals(n0)||weight.substring(0,1).equals(n0))
                {Toast.makeText(getApplicationContext(),"第一位请勿输入0！",Toast.LENGTH_SHORT).show();return;}
                if (Integer.parseInt(age)>150||Integer.parseInt(age)<1||Integer.parseInt(weight)>400||Integer.parseInt(weight)<2||Integer.parseInt(height)>300||Integer.parseInt(height)<40)
                {Toast.makeText(getApplicationContext(),"输入数据不在范围内",Toast.LENGTH_SHORT).show();return;}
                if (k1==1||k2==1||k3==1)
                {Toast.makeText(getApplicationContext(),"请按提示正确输入",Toast.LENGTH_SHORT).show();return;}

                intent.putExtra("sex", sex);
                intent.putExtra("age", age);
                intent.putExtra("height", height);
                intent.putExtra("weight", weight);

                startActivity(intent);

            }
        });
    }
}
