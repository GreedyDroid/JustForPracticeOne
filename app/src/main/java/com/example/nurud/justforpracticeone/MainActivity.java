package com.example.nurud.justforpracticeone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    ArrayList<ContactPerson>persons;
    private ContactPerson contactPerson;
    private PersonAdapter personAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = findViewById(R.id.myLisView);
        contactPerson = new ContactPerson();
        persons = contactPerson.getAllPerson();

        personAdapter = new PersonAdapter(this, persons);
        mListView.setAdapter(personAdapter);
    }
}
