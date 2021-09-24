package com.example.recycleview_and_03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  ItemOnClick {
    private RecyclerView recyclerView;
    private ArrayList<StudentList> studentList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        buildStudentList();
        setRecycleView();
    }
    private void initViews(){

        recyclerView = findViewById(R.id.recycleView);
    }
    private void buildStudentList(){
        StudentList student1 = new StudentList("Ankush", 21, "EMT1223");
        studentList.add(student1);
        StudentList student2 = new StudentList("Kunal",  21, "EMT1222");
        studentList.add(student2);
        for(int i = 0;   i < 13;    i++){
            StudentList student = new StudentList("XYZ"+i, 23, "EMSNA123");
            studentList.add(student);
        }
    }
    private void setRecycleView(){
        StudentAdapter studentAdapter = new StudentAdapter(studentList, this);
        /**** grid layout manager****/
        /**** staggeredLayoutManager will not use show space it is more than beautiful to grid layout manager*******/
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2,LinearLayoutManager.VERTICAL, true );

       // LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(studentAdapter);
    }


    @Override
    public void deleteItem() {

    }
}
