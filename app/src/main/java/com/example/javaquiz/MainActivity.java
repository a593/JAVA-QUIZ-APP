package com.example.javaquiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    TextView textView2;
    TextView textView3;
    Button button;
    Button button2;
   private String [] questions={"Java is a programming language.","Constructor overloading is not possible in Java","Java programming is not statically-typed, means all variables should not first be declared before they can be used","In Java SE 7 and later, underscore characters \"_\" can appear anywhere between digits in a numerical literal","James Gosling is father of Java?","Java technology is both a programming language and a platform."};


    private boolean[] answers={ true,false,false,true,true,true };
    private int score=0;

    private int index=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        textView2=findViewById(R.id.textView2);
        textView2.setText(questions[index]);
        textView3=findViewById(R.id.textView3);
      //  textView3.setText("your");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(index<= questions.length-1) {

                    if (answers[index] == true) {
                        score++;
                        textView3.setText("Your score is " + score);


                    }
                    textView3.setText("Your score is" + score);

                    index++;
                    if (index <= questions.length - 1) {
textView2.setText(questions[index]);
                        // textView3.setText("your score is"+score);


                    } else {
                        textView3.setText("Your score is" + score);
                        //Toast.makeText(MainActivity.this, "hellllo", Toast.LENGTH_SHORT).show();


                    }
                }
                else {
                   // textView3.setText("YOUR FINAL SCORE IS "+ score +"/6");

                    textView3.setText("Restart App To Try Quiz Again");
                  //  Toast.makeText(MainActivity.this, "hellllo", Toast.LENGTH_SHORT).show();
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<= questions.length-1)
                {

                    if(answers[index]==false)
                    {
                        score++;
                        textView3.setText("Your score is" + score);


                    }
                    textView3.setText("Your score is" + score);

                    index++;
                    if(index<= questions.length-1)
                    {
                       // textView3.setText("your score is"+score);

                        textView2.setText(questions[index]);


                    }
                    else {
                      //  textView3.setText("your score is"+score);
                     //   Toast.makeText(MainActivity.this, "hellllo", Toast.LENGTH_SHORT).show();

                    }

                }
                else {
                  //  textView3.setText("YOUR FINAL SCORE IS "+ score +"/6");
                   textView3.setText("Restart App To Try Quiz Again");
                   // Toast.makeText(MainActivity.this, "hellllo", Toast.LENGTH_SHORT).show();
                }

            }
        });
       

    }
}