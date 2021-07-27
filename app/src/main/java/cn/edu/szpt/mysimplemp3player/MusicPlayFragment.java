package cn.edu.szpt.mysimplemp3player;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * Created by adminn on 2018/3/5.
 */

public class MusicPlayFragment extends Fragment {
    //播放按钮
    private ImageView btnPlay;
    //上一首按钮
    private ImageView btnPrev;
    //下一首按钮
    private ImageView btnNext;
    //显示歌曲名称
    private TextView tvMusicName;
    //显示歌曲时长
    private TextView tvDuration;
    //显示歌词
    private TextView tvLrc;
    //显示歌曲播放当前时间
    private TextView tvPlayTime;
    //显示进度条
    private SeekBar sbMusic;
    //显示专辑封面
    private ImageView imgShowPic;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_music,container,false);

        tvMusicName = (TextView) view.findViewById(R.id.tvMusicName);
        tvPlayTime = (TextView) view.findViewById(R.id.tvPlayTime);
        tvDuration = (TextView) view.findViewById(R.id.tvDuration);
        tvLrc = (TextView) view.findViewById(R.id.tvLrc);
        sbMusic= (SeekBar) view.findViewById(R.id.sbMusic);
        imgShowPic= (ImageView) view.findViewById(R.id.imgShowPic);
        btnNext= (ImageView) view.findViewById(R.id.btnNext);
        btnPrev= (ImageView) view.findViewById(R.id.btnPrev);
        btnPlay= (ImageView) view.findViewById(R.id.btnPlay);


        return view;
    }



}
