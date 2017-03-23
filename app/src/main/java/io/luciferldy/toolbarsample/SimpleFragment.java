package io.luciferldy.toolbarsample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static io.luciferldy.toolbarsample.TabLayoutToolbarActivity.TITLE;

/**
 * Created by lian_ on 2017/3/23.
 */

public class SimpleFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.simple_text, container, false);

        TextView tv = (TextView) root.findViewById(R.id.tv) ;
//        Bundle args = getArguments();
        tv.setText(R.string.mockingbird_lyric);
        return root;
    }
}
