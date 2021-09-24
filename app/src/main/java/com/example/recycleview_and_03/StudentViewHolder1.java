package com.example.recycleview_and_03;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class StudentViewHolder1 extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvRollNo;
    private ItemOnClick itemOnClick;
    private RecyclerView recyclerView;

    public StudentViewHolder1(@NonNull View itemView, ItemOnClick itemOnClick) {
        super(itemView);
        this.itemOnClick = itemOnClick;
        iniViews(itemView, itemOnClick);
    }
    private void iniViews(View itemView, ItemOnClick itemOnClick){
        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge =  itemView.findViewById(R.id.tvAge);
        mTvRollNo = itemView.findViewById(R.id.tvId);
        recyclerView = itemView.findViewById(R.id.recycleView);

        /**** this is second video part on click on item in android *****/
     /****   mTvName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mTvName.getContext(), "Name is click", Toast.LENGTH_LONG).show();
            }
        });
      *********/

    }
    /**** this will give a error in runtime  so please care about this*****/
    /**** this will set data for on create method in adapter class *****/
    /**** you want to after click on any view which are present in recycleview that open new page so u can not perform this action here u can to create item on
     click Listener in mainActivity*******/
    /****** in the second recycleview lecture alertDiglog is new concept please read it from google********/

    public void setData(StudentList student){
        mTvName.setText(student.getName());
        mTvAge.setText(student.getAge()+"");
        mTvRollNo.setText(student.getRoll_No());
        recyclerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                itemOnClick.
            }
        });
    }


}
