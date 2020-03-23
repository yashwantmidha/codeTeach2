package com.yashwant.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;

import java.lang.reflect.Array;
import java.util.Map;

public class dash extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private static final String TAG = "GoogleActivity";
    FirebaseFirestore db = FirebaseFirestore.getInstance();
    String[] group_string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash);
//        LinearLayout layout = new LinearLayout(this);
//        layout.setOrientation(LinearLayout.VERTICAL);
////DocumentReference fire = FirebaseFirestore.getInstance().collection("users").document("topics");
////        DocumentSnapshot data = fire.get();
////        String[] group_string = data.getData().entrySet().toArray()[0].toString().split("=")[1].split(",");
//                for (int i=0; group_string[i+1]!=null ; i++)
//                {
//                    LinearLayout row = new LinearLayout(this);
//
//                    Button button = new Button(this);
//                    button.setText(group_string[i]);
//                    row.addView(button);
//
//                    layout.addView(layout);
//                }
//                setContentView(layout);
//                //Log.d("myTag", group_string);
//            }


    }
}

