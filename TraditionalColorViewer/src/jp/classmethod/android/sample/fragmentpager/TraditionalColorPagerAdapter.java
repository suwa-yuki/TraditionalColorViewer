package jp.classmethod.android.sample.fragmentpager;

import java.util.ArrayList;
import jp.classmethod.android.sample.traditionalcolorviewer.R;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.util.SparseArrayCompat;

/**
 * 色情報の表示を管理する {@link FragmentPagerAdapter}.
 */
public class TraditionalColorPagerAdapter extends FragmentPagerAdapter {

    /** 色情報リスト. */
    private ArrayList<SparseArrayCompat<String>> mList;

    /**
     * コンストラクタ.
     * @param fm {@link FragmentManager}
     */
    public TraditionalColorPagerAdapter(FragmentManager fm) {
        super(fm);
        mList = new ArrayList<SparseArrayCompat<String>>();
    }

    @Override
    public Fragment getItem(int position) {

        // 対象ページの色情報を取得
        SparseArrayCompat<String> item = mList.get(position);

        // 色情報を Bundle にする
        Bundle bundle = new Bundle();
        bundle.putInt("page", position);
        bundle.putString("color", item.get(0));
        bundle.putString("name", item.get(1));
        bundle.putString("description", item.get(2));

        // Fragment をつくり Bundle をセットする
        TraditionalColorFragment frag = new TraditionalColorFragment();
        frag.setArguments(bundle);

        return frag;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    /**
     * 色情報を追加する.
     * @param item 色情報
     */
    public void add(SparseArrayCompat<String> item) {
        mList.add(item);
    }

    /**
     * 色情報をリストで追加する.
     * @param list 色情報リスト
     */
    public void addAll(ArrayList<SparseArrayCompat<String>> list) {
        mList.addAll(list);
    }

}
