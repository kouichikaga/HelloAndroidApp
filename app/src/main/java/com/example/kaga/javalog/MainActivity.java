package com.example.kaga.javalog;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.util.Log;    // ここを追加


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dog dog = new Dog("ぽち", 7);   // 名前をぽち、年齢7歳で、Dogのインスタンスを作る

        dog.move();

        Human human = new Human("加賀公一", 60, "スマホ");
        human.say();
        human.think();

    }

}
