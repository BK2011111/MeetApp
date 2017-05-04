package com.example.wenlongzhao.myprojectv10.mainActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.wenlongzhao.myprojectv10.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Useradmin on 2017/4/5.
 */
public class PersonalFragment extends Fragment {

    public PersonalFragment() {
    }

    private String [] content={"足迹","收藏"};
    private int[] imageIds= new int[]{R.mipmap.footprint,R.mipmap.collection};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_personal,container,false);
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

        ListView lvPersonal = (ListView) view.findViewById(R.id.listviewPersonal);
        lvPersonal.setAdapter(simpleAdapter);
        return view;
    }
}
