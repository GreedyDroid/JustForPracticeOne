package com.example.nurud.justforpracticeone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonAdapter extends ArrayAdapter<ContactPerson> {

    private Context context1;
    private ArrayList<ContactPerson> persons;
    public PersonAdapter(@NonNull Context context, ArrayList<ContactPerson>persons) {
        super(context, R.layout.row_layout, persons);

        this.context1 = context;
        this.persons = persons;
    }


    class ViewHolder{
        TextView nameTV;
        TextView phoneTV;
        ImageView myImage;

    }

    @NonNull
    @Override
    public View getView(int position,  @Nullable View convertView,  ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        ViewHolder viewHolder;

        if (convertView == null){

            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.row_layout, parent, false);

            
            viewHolder.nameTV = convertView.findViewById(R.id.myName);
            viewHolder.phoneTV = convertView.findViewById(R.id.myPhone);
            viewHolder.myImage = convertView.findViewById(R.id.myImage);

            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.nameTV.setText(persons.get(position).getPersonName());
        viewHolder.phoneTV.setText(persons.get(position).getPhoneNumber());

        return convertView;
    }
}
