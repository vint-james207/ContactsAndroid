package com.example.jamesyburr.contactsandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemLongClickListener {

    ArrayAdapter<Contact> items;

    ListView list;
    EditText text;
    EditText number;
    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listView);
        text = (EditText) findViewById(R.id.editText);
        number = (EditText) findViewById(R.id.editText2);
        addButton = (Button) findViewById(R.id.add);

        items = new ArrayAdapter<Contact>(this, android.R.layout.simple_list_item_1);
        list.setAdapter(items);

        addButton.setOnClickListener(this);
        list.setOnItemLongClickListener(this);

    }

    @Override
    public void onClick(View v) {
        String name = text.getText().toString();
        String phone =number.getText().toString();
        Contact contact = new Contact(name, phone);
        items.add(contact);
        text.setText("");
        number.setText("");

    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        Contact item = items.getItem(position);
        items.remove(item);
        return true;
    }
}
