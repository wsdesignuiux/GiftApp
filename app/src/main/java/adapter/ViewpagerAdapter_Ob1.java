package adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import fragment.ViewPagerFragment_Ob1;

/**
 * Created by wolfsoft4 on 11/8/18.
 */

public class ViewpagerAdapter_Ob1 extends FragmentStatePagerAdapter{
    public ViewpagerAdapter_Ob1(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ViewPagerFragment_Ob1 tab1 = new ViewPagerFragment_Ob1();
                return tab1;
            case 1:
                ViewPagerFragment_Ob1 tab2 = new ViewPagerFragment_Ob1();
                return tab2;
            case 2:
                ViewPagerFragment_Ob1 tab3 = new ViewPagerFragment_Ob1();
                return tab3;

        default:
            return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
