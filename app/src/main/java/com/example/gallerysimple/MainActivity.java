package com.example.gallerysimple;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    ArrayList<Integer> mImageIds = new ArrayList<>(Arrays.asList(
            R.drawable.img1,R.drawable.img2, R.drawable.img3, R.drawable.img4,
            R.drawable.img5, R.drawable.img6, R.drawable.img7, R.drawable.img8,
            R.drawable.img9, R.drawable.img10, R.drawable.img11, R.drawable.img12,
            R.drawable.img13, R.drawable.img14, R.drawable.img15, R.drawable.img16,
            R.drawable.img17, R.drawable.img18, R.drawable.img19, R.drawable.img20
    ));



    public void ShowDialogBox(int item_pos){
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.custom_dialog);

        TextView Image_name = dialog.findViewById(R.id.txt_Image_name);
        ImageView Image = dialog.findViewById(R.id.img);
        //Button btn_Full = dialog.findViewById(R.id.btn_full);
        Button btn_Close = dialog.findViewById(R.id.btn_close);

        String title = getResources().getResourceName(item_pos);

        int index = title.indexOf("/");
        String name = title.substring(index+1, title.length());
        Image_name.setText(name);

        Image.setImageResource(item_pos);

        btn_Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        /*btn_Full.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this, FullView.class);
                i.putExtra("img_id", mImageIds);
                startActivity(i);
            }
        });*/

        dialog.show();

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = findViewById(R.id.myGrid);
        gridView.setAdapter(new ImageAdapter(mImageIds,this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int item_pos = mImageIds.get(i);

                ShowDialogBox(item_pos);
            }
        });
    }


}

