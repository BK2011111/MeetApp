package com.example.wenlongzhao.myprojectv10.mainActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.wenlongzhao.myprojectv10.R;

import java.util.List;

/**
 * Created by Useradmin on 2017/4/5.
 */
public class SettingFragment extends Fragment {

    public SettingFragment() {
    }

    private String [] content={"设置字体","账号与安全",
            "检查更新","退出登录"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting,container,false);
        ListView lvSetting = (ListView) view.findViewById(R.id.lvSetting);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,content);

        lvSetting.setAdapter(adapter);
        return view;
    }
}
