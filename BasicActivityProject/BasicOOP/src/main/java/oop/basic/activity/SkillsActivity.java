package oop.basic.activity;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import oop.basic.R;

public class SkillsActivity extends Activity {
    private ListView mSkillsList;
    private Button mSaveBtn;
    private Button mResetSkillsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);
        mSkillsList = (ListView) findViewById(R.id.skills_list);

        /* TODO: assign & add event for buttons */

        String[] skillsList = {"A", "B", "C", "D", "E", "F", "G", "H", "I"};
        /* TODO: get skills list by classID extra from the intent */

        mSkillsList.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, skillsList));

        /* TODO: add event to list views */

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.skills, menu);
        return true;
    }
    
}
