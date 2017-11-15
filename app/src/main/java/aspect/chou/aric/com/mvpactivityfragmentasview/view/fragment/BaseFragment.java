package aspect.chou.aric.com.mvpactivityfragmentasview.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * com.example.lwp.mvp.fragment
 * Created by Aric on 下午3:04.
 */

public abstract class BaseFragment extends Fragment {

    public static final String OUTDATA="outdata";


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        getFragmentComponent();
        return createFragmentLayoutView(inflater);
    }

    protected abstract void getFragmentComponent();

    protected abstract View createFragmentLayoutView(LayoutInflater inflater);
}
