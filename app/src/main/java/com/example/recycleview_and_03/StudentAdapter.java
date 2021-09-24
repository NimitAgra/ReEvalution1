package com.example.recycleview_and_03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder1> {
    private ArrayList<StudentList> studentList;
    private ItemOnClick itemOnClick;
    public StudentAdapter(ArrayList<StudentList> studentList, ItemOnClick itemOnClick){

        this.studentList = studentList;
        this.itemOnClick = itemOnClick;
    }

    @NonNull
    @Override
    public StudentViewHolder1 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       /**** this function will inflate item_layout for creating view****/
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent, false);
        return new StudentViewHolder1(view, itemOnClick);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder1 holder, int position) {
        StudentList menu = studentList.get(position);
        holder.setData(menu);

    }

    @Override
    public int getItemCount() {
        return studentList.size();

    }
}

