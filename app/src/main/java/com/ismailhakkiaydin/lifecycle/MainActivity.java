package com.ismailhakkiaydin.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e("csd", "onCreate çalıştı aktivite nesnesi oluşturuldu");

    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.e("csd", "onResume çalıştı aktivite stackte ön plana geldi " );
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.e("csd", "onDestroy çalıştı aktivite nesnesi yok edildi" );
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.e("csd", "onPause çalıştı ve aktivite stackte arka plana gitti ");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.e("csd", "onRestart çalıştı ve aktivite yeniden çalıştı");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.e("csd", "onStart çlaıştı ve aktivite çalıştı" );
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.e("csd", "onStop onStop çalıştı ve aktivite durdu" );
    }
}
