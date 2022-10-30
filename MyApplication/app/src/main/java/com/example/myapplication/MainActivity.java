package com.example.myapplication;

import android.os.AsyncTask;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //?????
        btn = findViewById(R.id.button_first);

        //백그라운드 스레드
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Thread th = new Thread((Runnable) MainActivity.this);
                th.start();
            }
        });

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    class CustomTask extends AsyncTask<String, Void, String> {
        String sendMsg, receiveMsg;
        @Override
        protected String doInBackground(String... strings) {
            try{
                String str;
                URL url = new URL("http://localhost:8080/address");
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestProperty("Content-Type", "application/x-www-form-unlencoded");
                //보내는방식 GET으로함
                conn.setRequestMethod("POST");
                conn.setDoOutput(true);
                //서버에 보낼값포함해 요청함
                OutputStreamWriter osw = new OutputStreamWriter(conn.getOutputStream());
                sendMsg = "name="+strings[0]+"&email="+strings[1];
                osw.write(sendMsg);
                osw.flush();

                //통신도 잘되고 서버에서 보낸값 받음
                if(conn.getResponseCode() == conn.HTTP_OK){
                    InputStreamReader tmp = new InputStreamReader(conn.getInputStream(), "UTF-8");
                    BufferedReader reader = new BufferedReader(tmp);
                    StringBuffer buffer = new StringBuffer();
                    while((str = reader.readLine()) != null){
                        buffer.append(str);
                    }
                    receiveMsg = buffer.toString();
                }else{
                    Log.i("통신결과 : ", conn.getResponseCode()+"에러");
                }
            }catch (MalformedURLException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            }
            return receiveMsg;
        }
    }

    public void run(){
        try {
            StringBuffer sb = new StringBuffer();
            URL url = new URL("http://localhost:8080/json.do");
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

            if(conn != null){
                conn.setConnectTimeout(5000);
                conn.setUseCaches(false);

                if(conn.getResponseCode() == HttpURLConnection.HTTP_OK){
                    BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
                    while(true){
                        String line = br.readLine();
                        if(line == null)
                            break;
                        sb.append(line + "\n");
                    }
                    Log.d("myLog", sb.toString());
                    br.close();
                }
                conn.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}