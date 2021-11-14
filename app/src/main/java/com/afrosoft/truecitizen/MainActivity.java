package com.afrosoft.truecitizen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.afrosoft.truecitizen.databinding.ActivityMainBinding;
import com.afrosoft.truecitizen.model.Question;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    private Question[] questionBank = new Question[] {
            //create/instantiate question objects
            new Question(R.string.question_amendments,false),
            new Question(R.string.question_constitution,true),
            new Question(R.string.question_declaration, true),
            new Question(R.string.question_independence_rights, true),
            new Question(R.string.question_religion, true),
            new Question(R.string.question_government,false),
            new Question(R.string.question_government_feds,false),
            new Question(R.string.question_government_senators,true)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        binding.questionTextView.setText(questionBank[0].getAnswerResId());
    }
}