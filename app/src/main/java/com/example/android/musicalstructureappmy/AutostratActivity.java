package com.example.android.musicalstructureappmy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class AutostratActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
        bandsSongs.add(new BandSong("الليله سمرا", "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("سيبك من اساليبك",  "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("قلبي", "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("مرسال",  "2009", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("ما في اشي تسوي",  "2009", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("انا بكره معطل",  "2015", R.drawable.playclipart ));;
        bandsSongs.add(new BandSong("استني شوي",  "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("كنباي",  "2009", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("راحت يا خال",  "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("حبيتك بالتركي",  "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("خلاص", "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("الف تحية",  "2009", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("يا سلام", "2009", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("كل يوم",  "2015", R.drawable.playclipart ));

        BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
        ListView listView = (ListView)findViewById(R.id.song);
        listView.setAdapter(songAdapter);
    }
}