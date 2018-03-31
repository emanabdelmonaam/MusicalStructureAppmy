package com.example.android.musicalstructureappmy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import java.util.ArrayList;

public class CairokyBandActivity extends AppCompatActivity {

        @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.song_list);

            // Create an ArrayList of AndroidFlavor objects
            ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
            bandsSongs.add(new BandSong("اثبت مكانك", "2011", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("أخر أغنيه",  "2017", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("ليلي", "2017", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("مربوط بأستك",  "2015", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("أفرد جناحك",  "2011", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("صوت الحرية",  "2011", R.drawable.playclipart ));;
            bandsSongs.add(new BandSong("الكيف",  "2017", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("نقطة بيضا",  "2017", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("السكه شمال في شمال",  "2017", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("اضحك",  "2017", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("ناس وناس", "2015", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("علي الهامش",  "2015", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("مكملين", "2013", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("طلع الصباح",  "2014", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("غريب في بلاد غريبه",  "2014", R.drawable.playclipart ));
            bandsSongs.add(new BandSong("اجمل ما عندي",  "2014", R.drawable.playclipart ));

            BandSongAdapter songAdapter = new BandSongAdapter(this,bandsSongs);
            ListView listView = (ListView)findViewById(R.id.song);
            listView.setAdapter(songAdapter);
        }
}