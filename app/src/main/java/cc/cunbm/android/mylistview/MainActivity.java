package cc.cunbm.android.mylistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView simpleList;
    String countryList[] = {"Maramureș", "Sălaj", "Cluj", "Suceava", "Bistrița-Năsăud"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleList = (ListView) findViewById(R.id.simpleListView);

        ArrayAdapter<String> arrayAdapter =
                new ArrayAdapter<String>(this, R.layout.listview_item, R.id.textView, countryList);

        simpleList.setAdapter(arrayAdapter);

    }

}
