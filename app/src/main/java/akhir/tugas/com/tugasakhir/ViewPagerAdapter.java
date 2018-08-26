package akhir.tugas.com.tugasakhir;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new FirstFragment();
        }
        else if (position == 1){
            return new SecondFragment();
        }
        throw new IllegalStateException("Position Not Valid");
    }

    @Override
    public int getCount() {
        return 2;
    }
}
