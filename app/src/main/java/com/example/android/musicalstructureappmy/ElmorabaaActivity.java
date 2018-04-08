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


public class ElmorabaaActivity extends AppCompatActivity {

    MediaPlayer mlisten;
    int currentPosition;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        // Create an ArrayList of bandSong objects
        final ArrayList<BandSong> bandsSongs = new ArrayList<BandSong>();
        bandsSongs.add(new BandSong("أغنيك", "2013", R.drawable.playclipart, R.raw.elmaganek));
        bandsSongs.add(new BandSong("تحت الأرض",  "2016", R.drawable.playclipart, R.raw.elmtahtelard));
        bandsSongs.add(new BandSong("حد تاني", "2011", R.drawable.playclipart, R.raw.elmhadtany));
        bandsSongs.add(new BandSong("ليكون",  "2013", R.drawable.playclipart, R.raw.elmlaikon2));
        bandsSongs.add(new BandSong("يا زين",  "2013", R.drawable.playclipart, R.raw.elmyazain));
        bandsSongs.add(new BandSong("ما عندك خبر",  "2013", R.drawable.playclipart, R.raw.elmmaandekkabar));;
        bandsSongs.add(new BandSong("المختلفين",  "2018", R.drawable.playclipart, R.raw.elmelmoktalfen));
        bandsSongs.add(new BandSong("ترويج",  "2013", R.drawable.playclipart, R.raw.elmlaikon));

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
                mlisten = MediaPlayer.create(ElmorabaaActivity.this, play.getmListenSong());
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