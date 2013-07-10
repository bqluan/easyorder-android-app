package com.easyorder;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HelloAndroidActivity extends Activity {

    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView menu = (ListView) findViewById(R.id.listView);

        List<Map<String, String>> data = new ArrayList<Map<String, String>>();
        Map<String, String> line = new TreeMap<String, String>();
        line.put("name", "宫保鸡丁");
        line.put("price", "13元");
        data.add(line);
        line = new TreeMap<String, String>();
        line.put("name", "回锅肉");
        line.put("price", "15元");
        data.add(line);
        line = new TreeMap<String, String>();
        line.put("name", "溜肝尖");
        line.put("price", "15元");
        data.add(line);

        SimpleAdapter simpleAdapter = new SimpleAdapter(
                this,
                data,
                R.layout.list_item,
                new String[]{"name", "price"},
                new int[]{R.id.Name, R.id.Price}
        );
        menu.setAdapter(simpleAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

}

