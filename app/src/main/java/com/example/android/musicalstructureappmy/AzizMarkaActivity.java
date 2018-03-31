package com.example.android.musicalstructureappmy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class AzizMarkaActivity extends AppCompatActivity {

      @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.song_list);

            // Create an ArrayList of AndroidFlavor objects
            ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
            bandsSongs.add(new BandSong("سمعتك", "2015", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("ما بقول اسف",  "2012", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("بدي أرجع علي عمان", "2011", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("بنت الناس",  "2011", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("هي",  "2014", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("شيخ البلد",  "2011", R.drawable.playclipart ));;
            bandsSongs.add(new BandSong("يا باي",  "2016", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("ابكي",  "2011", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("بحكي لحالى",  "2010", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("ما بقولك اسف",  "2014", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("تذكرتك", "2012", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("لا",  "2011", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("مين قالك", "2015", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("بنت قوبه",  "2017", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("واقف",  "2018", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("ست الكل ماما",  "2018", R.drawable.playclipart ));

            BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
            ListView listView = (ListView)findViewById(R.id.song);
            listView.setAdapter(songAdapter);
        }
    }