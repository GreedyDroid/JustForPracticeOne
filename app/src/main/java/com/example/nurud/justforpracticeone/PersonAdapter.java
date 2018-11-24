package com.example.nurud.justforpracticeone;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
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

    @NonNull
    @Override
    public View getView(int position,  @Nullable View convertView,  ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context1.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(R.layout.row_layout, parent, false);

        TextView nameTV = convertView.findViewById(R.id.myName);
        TextView phoneTV = convertView.findViewById(R.id.myPhone);
        TextView myImge = convertView.findViewById(R.id.myImage);

        nameTV.setText(persons.get(position).getPersonName());
        phoneTV.setText(persons.get(position).getPhoneNumber());

        return convertView;
    }
}
