package com.example.optionsmenu;

import androidx.annotation.NonNull;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

/*
    CheckBox enableSettings;
    TextView txtEnableSettings;
    private final int MENU_SETTINGS = 1, MENU_PHONE_SETTINGS = 2, MENU_BLUETOOTH_SETTINGS = 3,
            MENU_DISPLAY_SETTINGS = 4, MENU_HELP = 5, MENU_ABOUT = 6;

    int grpId;
    boolean hasMenuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        Toast.makeText(this, "OnCreateOptionMenu", Toast.LENGTH_SHORT).show();
        SubMenu subMenu = menu.addSubMenu(1, 1, 1, "Settings");
        subMenu.addSubMenu(1, 2, 2, "Phone Settings");
        subMenu.addSubMenu(1, 3, 3, "Bluetooth S");
        subMenu.addSubMenu(1, 4, 4, "Display Settings");

        MenuItem menuItemHelp = menu.add(2, 5, 5, "Help");
        MenuItem menuItemSearch = menu.add(3, 6, 6, "Search");
        MenuItem menuItemAbout = menu.add(4, 7, 7, "About");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case MENU_SETTINGS:
                makeToast("Settings");
                break;
            case MENU_PHONE_SETTINGS:
                makeToast("Phone Settings");
                break;
            case MENU_BLUETOOTH_SETTINGS:
                makeToast("Bluetooth Settings");
                break;
            case MENU_DISPLAY_SETTINGS:
                makeToast("Display Settings");
                break;
            case MENU_HELP:
                makeToast("Help");
                break;
            case MENU_ABOUT:
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
                break;
        }
        return true;
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        menu.findItem(6).setVisible(true);
        menu.setGroupEnabled(1, enableSettings.isChecked());
        return true;
    }

    private void makeToast(String text) {
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
 */
}
