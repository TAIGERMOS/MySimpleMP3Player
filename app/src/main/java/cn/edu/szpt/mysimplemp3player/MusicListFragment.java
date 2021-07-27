package cn.edu.szpt.mysimplemp3player;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

/**
 * Created by adminn on 2018/3/5.
 */

public class MusicListFragment extends Fragment {
    private ListView listView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_musiclist,container,false);
        listView= (ListView) view.findViewById(R.id.musiclist);

        return view;
    }

}
