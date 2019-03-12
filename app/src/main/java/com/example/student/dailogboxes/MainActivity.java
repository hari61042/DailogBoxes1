package com.example.student.dailogboxes;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void customdailog(View view) {
        final Dialog d=new Dialog(this);
        d.setTitle("Message");
        d.setContentView(R.layout.customdialog);
        d.show();
        Button yes=(Button)d.findViewById(R.id.yes);
        Button no=(Button)d.findViewById(R.id.no);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d.dismiss();
                System.exit(0);
            }
        });
    }
    public void alerdailog(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Message");
        builder.setMessage("Are you sure to exit");
        builder.setIcon(R.mipmap.ic_launcher);
        DialogInterface.OnClickListener listener=new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if(i==di)

            }
        }
    }


    public void datepicker(View view) {

    }

    public void timepicker(View view) {
    }

    public void indeterminant(View view) {
    }

    public void determinant(View view) {
    }


}
