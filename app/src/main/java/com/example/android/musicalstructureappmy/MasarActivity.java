package com.example.android.musicalstructureappmy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MasarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);


        // Create an ArrayList of AndroidFlavor objects
        ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
        bandsSongs.add(new BandSong("صباحك ضحكه", "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("كانت هاتفرق",  "2012", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("زيك أنا", "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("قلبك ده عنواني",  "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("تقع وتقوم",  "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("وانا عطشان",  "2011", R.drawable.playclipart ));;
        bandsSongs.add(new BandSong("أوقات",  "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("لسه الدنيا",  "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("بتقولي",  "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("يا عم",  "2014", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("متخفش من بكره", "2012", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("الليل",  "2013", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("بقيت غاوي", "2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("اجباري المسار",  "2013", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("انا موجود",  "2013", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("شتا",  "2013", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("شيروفوبيا",  "2016", R.drawable.playclipart ));


        BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
        ListView listView = (ListView)findViewById(R.id.song);
        listView.setAdapter(songAdapter);
    }
}