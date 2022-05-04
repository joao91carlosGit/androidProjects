package com.agendaJC.agenda.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.agendaJC.agenda.R;
import com.agendaJC.agenda.dao.StudentDao;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class studentListActivity extends AppCompatActivity {

    private final StudentDao dao = new StudentDao();
    public static final String TITLE_APPBAR = "Student List";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        setTitle(TITLE_APPBAR);
        newStudentButton();
    }

    private void newStudentButton() {
        FloatingActionButton NewStudentButton = findViewById(R.id.activity_student_list_fab_new_student);
        NewStudentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToStudentFormActivity();
            }
        });
    }

    private void goToStudentFormActivity() {
        startActivity(new Intent(studentListActivity.this, studentFormActivity.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        listConfig();
    }

    private void listConfig() {
        ListView ListOfStudents = findViewById(R.id.activity_student_list_listview);
        ListOfStudents.setAdapter(new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                dao.AllStudents()));
    }
}
