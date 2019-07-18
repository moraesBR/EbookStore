package senac.ebookstore.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import senac.ebookstore.fragments.TabBusiness;
import senac.ebookstore.fragments.TabHome;
import senac.ebookstore.fragments.TabNewBook;
import senac.ebookstore.fragments.TabNovels;
import senac.ebookstore.fragments.TabTechnician;

public class TabAdapter extends FragmentStatePagerAdapter {

    public TabAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 1: {
                TabHome tabHome = new TabHome();
                return tabHome;
            }
            case 2: {
                TabNovels tabNovels = new TabNovels();
                return tabNovels;
            }
            case 3: {
                TabBusiness tabBusiness = new TabBusiness();
                return tabBusiness;
            }
            case 4: {
                TabTechnician tabTechnician = new TabTechnician();
                return tabTechnician;
            }
            case 5: {
                TabNewBook tabNewBook = new TabNewBook();
                return tabNewBook;
            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
