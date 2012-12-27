package jp.classmethod.android.sample.fragmentpager;

import java.util.ArrayList;
import jp.classmethod.android.sample.traditionalcolorviewer.R;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.util.SparseArrayCompat;
import android.support.v4.view.ViewPager;

/**
 * 伝統色の情報を表示する {@link FragmentActivity}.
 */
public class TraditionalColorActivity extends FragmentActivity {
    
    /** 色情報を表示する {@link ViewPager}. */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // レイアウトをつくる
        setContentView(R.layout.activity_traditional_color);
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        
        // PagerAdapter をつくる
        FragmentManager fm = getSupportFragmentManager();
        TraditionalColorPagerAdapter adapter = new TraditionalColorPagerAdapter(fm);
        adapter.addAll(getColorList());
        
        // ViewPager にセットする
        mViewPager.setAdapter(adapter);
    }
    
    /**
     * 色情報リストを返す.
     * @return 色情報リスト
     */
    private ArrayList<SparseArrayCompat<String>> getColorList() {
        ArrayList<SparseArrayCompat<String>> list = new ArrayList<SparseArrayCompat<String>>();
        
        SparseArrayCompat<String> color1 = new SparseArrayCompat<String>();
        color1.append(0, "#727171");
        color1.append(1, "鈍色 (にびいろ)");
        color1.append(2, "かすかに緑や茶の色味を持つグレイに近い色。");
        SparseArrayCompat<String> color2 = new SparseArrayCompat<String>();
        color2.append(0, "#2792c3");
        color2.append(1, "縹 (はなだ)");
        color2.append(2, "藍の単一染めの純正な青色。｢花田｣とも書く。");
        SparseArrayCompat<String> color3 = new SparseArrayCompat<String>();
        color3.append(0, "#917347");
        color3.append(1, "朽葉色 (くちばいろ)");
        color3.append(2, "朽ちた落ち葉の色に似た褐色の、黄橙色(「黄唐茶」)。｢朽葉四十八色｣と言う言葉がある。");
        SparseArrayCompat<String> color4 = new SparseArrayCompat<String>();
        color4.append(0, "#3a5b52");
        color4.append(1, "虫襖 (むしあお)");
        color4.append(2, "玉虫の羽根の色に見るような、暗い青みの緑。｢虫青｣とも書く。");
        SparseArrayCompat<String> color5 = new SparseArrayCompat<String>();
        color5.append(0, "#f8b500");
        color5.append(1, "山吹色 (やまぶきいろ)");
        color5.append(2, "山吹の花の色のような、冴えた赤味の黄色。｢黄金色｣とも言う。");
        SparseArrayCompat<String> color6 = new SparseArrayCompat<String>();
        color6.append(0, "#e5abbe");
        color6.append(1, "石竹色 (せきちくいろ)");
        color6.append(2, "ナデシコ科の植物セキチクの花のような淡い赤色。");
        SparseArrayCompat<String> color7 = new SparseArrayCompat<String>();
        color7.append(0, "#e60026");
        color7.append(1, "紅蓮 (ぐれん)");
        color7.append(2, "盛んに燃え上がる炎の色。「紅蓮地獄（寒さのために皮膚が裂け血が流れ、紅の蓮の花のようになる）」を「紅の炎の燃え立つ所」と誤認したのが由来。");
        SparseArrayCompat<String> color8 = new SparseArrayCompat<String>();
        color8.append(0, "#007b43");
        color8.append(1, "常磐色 (ときわいろ)");
        color8.append(2, "スギなどの常緑樹の葉のようなくすんだ緑色。");
        
        list.add(color1);
        list.add(color2);
        list.add(color3);
        list.add(color4);
        list.add(color5);
        list.add(color6);
        list.add(color7);
        list.add(color8);
        
        return list;
    }

}
