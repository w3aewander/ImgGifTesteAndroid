package br.com.wander.imagemgifteste;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img = findViewById(R.id.imageView);
        ImageView img2 = findViewById(R.id.imageView2);

        Glide.with(this)
                .load(R.drawable.pinguim) // aqui é teu gif
                .asGif()
                .into(img);

        Glide.with(this)
                //.fromUri()
                //.load(Uri.parse("https://i.stack.imgur.com/8A1zI.gif")) // aqui é teu gif
                .load(R.drawable.homesymp) // aqui é teu gif
                .asGif()
                .into(img2);

    }
}
