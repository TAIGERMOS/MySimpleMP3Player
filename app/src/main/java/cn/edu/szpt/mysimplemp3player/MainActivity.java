package cn.edu.szpt.mysimplemp3player;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.ArrayList;

import cn.edu.szpt.mysimplemp3player.adapters.MyViewPagerAdapter;


public class MainActivity extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter mAdapter;
    private ArrayList<Fragment> fragments;

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        if(requestCode!=1000){
            Toast.makeText(this,"请授予读取外部存储的权限", Toast.LENGTH_SHORT).show();
        }

        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},1000);
        }

        //初始化控件，获取ViewPager对象
        pager = (ViewPager) findViewById(R.id.pager);
        //初始化数据
        fragments = new ArrayList<Fragment>();
        MusicPlayFragment f1 = new MusicPlayFragment();
        MusicListFragment f2 = new MusicListFragment();
        fragments.add(f1);
        fragments.add(f2);
        initViewPager();

    }


    private void initViewPager() {
        mAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), fragments);
        pager.setAdapter(mAdapter);
        // 设置当前显示的是位置在第一个的view
        pager.setCurrentItem(0);

    }


}
