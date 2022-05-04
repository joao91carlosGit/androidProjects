package com.agendaJC.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.agendaJC.agenda.R;
import com.agendaJC.agenda.dao.StudentDao;
import com.agendaJC.agenda.model.Student;

public class studentFormActivity extends AppCompatActivity {

    public static final String TITLE_APPBAR = "New Student";
    private EditText nameField;
    private EditText phoneField;
    private EditText emailFiled;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);
        setTitle(TITLE_APPBAR);
        startAllAttributes();
        saveButtonConfig();
    }

    private void saveButtonConfig() {
        Button buttonSave = findViewById(R.id.activity_student_form_save_button);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Student studentToBeSave = getNewStudent();

                saveStudent(studentToBeSave);
            }
        });
    }

    private void startAllAttributes() {
        nameField = findViewById(R.id.activity_student_form_student_name);
        phoneField = findViewById(R.id.activity_student_form_student_phone_number);
        emailFiled = findViewById(R.id.activity_student_form_student_email);
    }

    private void saveStudent(Student studentToBeSave) {
        StudentDao.save(studentToBeSave);
        startActivity(new Intent(studentFormActivity.this, studentListActivity.class));
    }

    private Student getNewStudent() {
        String name = nameField.getText().toString();
        String number = phoneField.getText().toString();
        String email = emailFiled.getText().toString();

        return new Student(name, number, email);
    }
}