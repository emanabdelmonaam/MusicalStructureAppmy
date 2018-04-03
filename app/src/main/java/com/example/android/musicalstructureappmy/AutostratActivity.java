package com.example.android.musicalstructureappmy;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;
import android.widget.AdapterView.OnItemClickListener;

public class AutostratActivity extends AppCompatActivity {

    MediaPlayer mlisten;
    int currentPosition;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of bandSong objects
        final ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
        bandsSongs.add(new BandSong("الليله سمرا", "2015", R.drawable.images1, R.raw.outoelaial));
        bandsSongs.add(new BandSong("قلبي", "2015", R.drawable.image2, R.raw.outoyakalby));
        bandsSongs.add(new BandSong("مرسال", "2009", R.drawable.image3, R.raw.outomersal));
        bandsSongs.add(new BandSong("ما في اشي تسوي", "2009", R.drawable.image4, R.raw.outomafeshetasawe));
        bandsSongs.add(new BandSong("انا بكره معطل", "2015", R.drawable.image5, R.raw.outoanabokrah));
        bandsSongs.add(new BandSong("استني شوي", "2015", R.drawable.image6, R.raw.outoastanashawai));
        bandsSongs.add(new BandSong("كنباي", "2009", R.drawable.image7, R.raw.outokanabay));
        bandsSongs.add(new BandSong("راحت يا خال", "2015", R.drawable.image8, R.raw.outorahtyakal));
        bandsSongs.add(new BandSong("حبيتك بالتركي", "2015", R.drawable.image9, R.raw.outohabatekbelturky));
        bandsSongs.add(new BandSong("شوي شوي", "2015", R.drawable.image10, R.raw.outoshawyshawy));
        bandsSongs.add(new BandSong("الف تحية", "2009", R.drawable.image11, R.raw.outoalftahia));
        bandsSongs.add(new BandSong("حاسس حالي", "2009", R.drawable.images1, R.raw.outohaseshaly));
        bandsSongs.add(new BandSong("كل يوم", "2015", R.drawable.image2, R.raw.outokolyom));

        //set the BandSongAdapter with listView ID and the arrayList.
        BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
        ListView listView = (ListView)findViewById(R.id.song);
        listView.setAdapter(songAdapter);
        listView.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                BandSong play = bandsSongs.get(position);

                // play song from arrayList

                if (currentPosition != position) {
                    if (mlisten != null) {
                        mlisten.stop();
                    }
                }

                // this would help avoiding lopping song when i click a song is already playing.so it start gian.
                if (mlisten != null) {
                    currentPosition = position;
                    mlisten.stop();
                }

                // start media player when i chose a song.
                mlisten = MediaPlayer.create(AutostratActivity.this, play.getmListenSong());
                mlisten.start();

            }
        });
    }

    // stop song when  activity is close.
    @Override
    protected void onStop() {
        super.onStop();
        if (mlisten != null) {
            mlisten.stop();
        }
    }
}