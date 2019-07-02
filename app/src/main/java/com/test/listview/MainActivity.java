package com.test.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView lv;
ArrayList<Teacher> teachers=Teacher.get8RandomTeachers();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv=findViewById(R.id.listViewNames);
        TeacherAdapter teacherAdapter=new TeacherAdapter();
        lv.setAdapter(teacherAdapter);
    }

    class TeacherAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return teachers.size();
        }

        @Override
        public Teacher getItem(int position) {
            return teachers.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.list_item_teacher,parent,false);
            TextView tvName=view.findViewById(R.id.text_name);
            TextView tvCourse=view.findViewById(R.id.text_course);
            tvName.setText(getItem(position).getName());
            tvCourse.setText(getItem(position).getCourse());
            return view;

        }
    }
}
