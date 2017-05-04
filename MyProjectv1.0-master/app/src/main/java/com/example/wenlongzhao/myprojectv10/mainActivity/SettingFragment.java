package com.example.wenlongzhao.myprojectv10.mainActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import com.example.wenlongzhao.myprojectv10.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Useradmin on 2017/4/5.
 */
public class SettingFragment extends Fragment {

    public SettingFragment() {
    }

    private String [] content={"设置字体","账号与安全",
            "检查更新","退出登录"};
    private int [] imageIds = {R.mipmap.font,R.mipmap.account_security,R.mipmap.update,R.mipmap.exit};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting,container,false);
        List<Map<String,Object>> listItems = new ArrayList<Map<String,Object>>();
        for (int i= 0;i<content.length;i++)
        {
            Map<String,Object> listItem = new HashMap<String,Object>();
            listItem.put("header",imageIds[i]);
            listItem.put("content",content[i]);
            listItems.add(listItem);
        }
        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(),listItems,
                R.layout.listview_img_text,new String[]{"header","content"},new int[]{R.id.header,R.id.desc} );
        ListView lvSetting = (ListView) view.findViewById(R.id.listViewSetting);
        lvSetting.setAdapter(simpleAdapter);
        return view;
    }
}
