package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class FirstActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);

        Intent intent=getIntent();
        String sex=intent.getStringExtra("sex");
        String a1=intent.getStringExtra("height");
        String b1=intent.getStringExtra("weight");
        String c1=intent.getStringExtra("age");
        float a=Integer.parseInt(a1);
        float b=Integer.parseInt(b1);
        int c=Integer.parseInt(c1);
        double m1,m2,m3,m4,m5;
        String bmi1,m10,m20,m30,m40,m50;
        float k=a/100;
        double bmi = b/(k*k);

        bmi1=new DecimalFormat("0.0").format(bmi);
        double x;
        String x1;
        final float df1,df2,df3,df4,df5,df6;
        float ddf1,ddf2,ddf3,ddf4,ddf5,ddf6;
        TextView gao=findViewById(R.id.gao);
        gao.setText(a+"");
        TextView BMI=findViewById(R.id.BMI);
        BMI.setText(bmi1+"");
        TextView tz=findViewById(R.id.tz);
        tz.setText(b+"");
        final TextView sj_1=findViewById(R.id.sj_1);
        TextView sj_2=findViewById(R.id.sj_2);
        TextView sj_3=findViewById(R.id.sj_3);
        TextView sj_4=findViewById(R.id.sj_4);
        TextView sj_5=findViewById(R.id.sj_5);
        TextView line1=findViewById(R.id.line1);
        TextView line2=findViewById(R.id.line2);
        TextView line3=findViewById(R.id.line3);
        TextView line4=findViewById(R.id.line4);
        TextView line5=findViewById(R.id.line5);
        TextView zb_1=findViewById(R.id.zb_1);
        TextView zb_2=findViewById(R.id.zb_2);
        TextView zb_3=findViewById(R.id.zb_3);
        final TextView feng=findViewById(R.id.feng);
        switch (sex)
        {

            //male

            case "male":
                if (a<160)zb_1.setText("偏低");
                else zb_1.setText("标准");

                if (b<=((a-80)*0.7*1.1)&&b>=((a-80)*0.7*0.9))zb_3.setText("正常");
                else if(b>((a-80)*0.7*1.2))zb_3.setText("肥胖");
                else if (b<((a-80)*0.7*0.8))zb_3.setText("营养不良");
                else if(b>((a-80)*0.7*1.1)&&b<=((a-80)*0.7*1.2))zb_3.setText("偏重");
                else zb_3.setText("偏轻");

                if (bmi>=10&&bmi<=18.5){ df1=75;zb_2.setText("过轻");}
                else if (bmi>18.5&&bmi<24){ df1=100;zb_2.setText("正常");}
                else if (bmi>24&&bmi<=28){ df1=80;zb_2.setText("超重");}
                else if (bmi>28&&bmi<=35){ df1=60;zb_2.setText("肥胖");}
                else {df1=0;zb_2.setText("不正常");}
                m1=1.2*bmi+0.23*c-5.4-10.8;
                m3=100*39/b;
                m2=m3*1.2;
                m4=(b-c)*0.2;
                m5=13.7*b+5.0*a-6.8*c+66;
                m10=new DecimalFormat(".0").format(m1);
                m20=new DecimalFormat(".0").format(m2);
                m30=new DecimalFormat("0.0").format(m3);
                m40=new DecimalFormat(".0").format(m4);
                m50=new DecimalFormat(".0").format(m5);
                sj_1.setText(m10+"%");
                sj_2.setText(m20+"%");
                sj_3.setText(m30+"%");
                sj_4.setText(m40+"");
                sj_5.setText(m50+"");

                if (m1>8&&m1<=15){df2=70;line1.setText("(过瘦)");}
                else if (m1>15&&m1<=25){df2=70;line1.setText("(正常)");}
                else if (m1>25&&m1<=35){df2=70;line1.setText("(超重)");}
                else {df2=0;line1.setText("不正常");}

                if (m2<70){df3=70;line2.setText("(偏低)");}
                else if (m2>=70&&m2<=80){df3=100;line2.setText("(正常)");}
                else if (m2>80){df3=70;line2.setText("(偏高)");}
                else {df3=0;line2.setText("不正常");}

                if (m3<=60){df4=60;line3.setText("(偏低)");}
                else if (m3>65){df4=100;line3.setText("(优秀)");}
                else {df4=80;line3.setText("(正常)");}

                if (m4<-4){df5=50;line4.setText("(风险高)");}
                else if (m4>-1){df5=100;line4.setText("(风险低)");}
                else {df5=70;line4.setText("(中度风险)");}

                if (m5<1300){df6=70;line5.setText("(偏低)");}
                else if (m5>1900){df6=70;line5.setText("(偏高)");}
                else {df6=100;line5.setText("(正常)");}
                x=df1*0.5+df2*0.1+df3*0.1+df4*0.1+df5*0.1+df6*0.1;
                x1=new DecimalFormat("0").format(x);
                feng.setText(x1+"");
                break;

            //female

            case "female":
                if (a<150)zb_1.setText("偏低");
                else zb_1.setText("标准");

                if (b<=((a-70)*0.6*1.1)&&b>=((a-70)*0.6*0.9))zb_3.setText("正常");
                else if(b>((a-70)*0.6*1.2))zb_3.setText("肥胖");
                else if (b<((a-70)*0.6*0.8))zb_3.setText("营养不良");
                else if(b>((a-70)*0.6*1.1)&&b<=((a-70)*0.6*1.2))zb_3.setText("偏重");
                else zb_3.setText("偏轻");

                if (bmi>=10&&bmi<=18.5){ df1=75;zb_2.setText("过轻");}
                else if (bmi>18.5&&bmi<24){ df1=100;zb_2.setText("正常");}
                else if (bmi>24&&bmi<=28){ df1=80;zb_2.setText("超重");}
                else if (bmi>28&&bmi<=35){ df1=60;zb_2.setText("肥胖");}
                else {df1=0;zb_2.setText("不正常");}
                m1=1.2*bmi+0.23*c-5.4;
                m3=100*28/b;
                m2=m3*1.3;
                m4=(b-c)*0.2;
                m5=9.6*b+1.8*a-4.7*c+655;
                m10=new DecimalFormat(".0").format(m1);
                m20=new DecimalFormat(".0").format(m2);
                m30=new DecimalFormat("0.0").format(m3);
                m40=new DecimalFormat(".0").format(m4);
                m50=new DecimalFormat(".0").format(m5);
                sj_1.setText(m10+"%");
                sj_2.setText(m20+"%");
                sj_3.setText(m30+"%");
                sj_4.setText(m40+"");
                sj_5.setText(m50+"");

                if (m1>10&&m1<=20){df2=70;line1.setText("(过瘦)");}
                else if (m1>20&&m1<=30){df2=70;line1.setText("(正常)");}
                else if (m1>30&&m1<=45){df2=70;line1.setText("(超重)");}
                else {df2=0;line1.setText("不正常");}

                if (m2<70){df3=70;line2.setText("(偏低)");}
                else if (m2>=70&&m2<=80){df3=100;line2.setText("(正常)");}
                else if (m2>80){df3=70;line2.setText("(偏高)");}
                else {df3=0;line2.setText("不正常");}

                if (m3<=55){df4=60;line3.setText("(偏低)");}
                else if (m3>60){df4=100;line3.setText("(优秀)");}
                else {df4=80;line3.setText("(正常)");}

                if (m4<-4){df5=50;line4.setText("(风险高)");}
                else if (m4>-1){df5=100;line4.setText("(风险低)");}
                else {df5=70;line4.setText("(中度风险)");}

                if (m5<1100){df6=70;line5.setText("(偏低)");}
                else if (m5>1500){df6=70;line5.setText("(偏高)");}
                else {df6=100;line5.setText("(正常)");}

                x=df1*0.5+df2*0.1+df3*0.1+df4*0.1+df5*0.1+df6*0.1;
                x1=new DecimalFormat("0").format(x);
                feng.setText(x1+"");

                break;


        }
        final TextView textView1 =findViewById(R.id.sj_1);
        final TextView textView2 =findViewById(R.id.sj_2);
        final TextView textView3 =findViewById(R.id.sj_3);
        final TextView textView4 =findViewById(R.id.sj_4);
        final TextView textView5 =findViewById(R.id.sj_5);
        final TextView textView =findViewById(R.id.feng);
        ImageButton bt_baogao = findViewById(R.id.bt_baogao);
        bt_baogao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                Bundle bundle= new Bundle();
                String ddf1 = textView1.getText().toString();
                String ddf2 = textView2.getText().toString();
                String ddf3 = textView3.getText().toString();
                String ddf4 = textView4.getText().toString();
                String ddf5 = textView5.getText().toString();
                String ddf6 = textView.getText().toString();
                intent.putExtra("ddf1",ddf1);
                intent.putExtra("ddf2",ddf2);
                intent.putExtra("ddf3",ddf3);
                intent.putExtra("ddf4",ddf4);
                intent.putExtra("ddf5",ddf5);
                intent.putExtra("ddf6",ddf6);
                startActivity(intent);
            }
        });

    }
}
