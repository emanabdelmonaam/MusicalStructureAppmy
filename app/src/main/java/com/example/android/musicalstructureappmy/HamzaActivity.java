package com.example.android.musicalstructureappmy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class HamzaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
        bandsSongs.add(new BandSong("داري يا قلبي", " 2018", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("يا مظلوم",  " 2014", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("احلم معايا", " 2009", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("إنسان",  " 2011", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("يا هنا",  " 2011", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("بص بص",  " 2018", R.drawable.playclipart ));;
        bandsSongs.add(new BandSong("مدد",  " 2018", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("شويه حبايب",  " 2018", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("غربة مسحراتي",  " 2011", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("دوري",  " 2012", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("تذكرتك", " 2012", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("اسمعني",  " 2011", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("الواد العبيط", " 2015", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("ولا صحبه احلي",  " 2018", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("مولانا",  " 2017", R.drawable.playclipart ));
        bandsSongs.add(new BandSong("وأقولك ايه",  " 2014", R.drawable.playclipart ));

        BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
        ListView listView = (ListView)findViewById(R.id.song);
        listView.setAdapter(songAdapter);
    }
}