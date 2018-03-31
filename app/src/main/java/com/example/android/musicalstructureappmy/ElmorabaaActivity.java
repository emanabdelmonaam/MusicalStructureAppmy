package com.example.android.musicalstructureappmy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class ElmorabaaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
        bandsSongs.add(new BandSong("ما عندك خبر", "2013", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("ابعد شوية",  "2016", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("مستقل", "2011", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("تحت الارض",  "2013", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("يا زين",  "2013", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("فوضي",  "2013", R.drawable.playclipart ));;
        bandsSongs.add(new BandSong("حدا تاني",  "2012", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("مستقل",  "2018", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("ترويج",  "2013", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("ليكون",  "2013", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("أغنيك", "2013", R.drawable.playclipart ));

        BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
        ListView listView = (ListView)findViewById(R.id.song);
        listView.setAdapter(songAdapter);
    }
}