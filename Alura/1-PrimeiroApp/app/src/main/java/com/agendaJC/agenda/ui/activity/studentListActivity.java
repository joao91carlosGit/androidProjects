package com.agendaJC.agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.agendaJC.agenda.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class studentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        setTitle("Student List");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);
        List<String> alunos = new ArrayList<>(
                Arrays.asList("carss", "er", "ta"));
        ListView listaDeAlunos = findViewById(R.id.activity_student_list_listview);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, alunos
                )
        );
    }
}
