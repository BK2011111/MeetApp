package com.example.wenlongzhao.myprojectv10.notification;

import android.app.Fragment;
import android.os.Bundle;
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
 * Created by oopp4 on 2017/5/4.
 */

public class CommentFragment extends Fragment {

    private int [] comment_icon={R.mipmap.icon1,R.mipmap.icon2,R.mipmap.icon3};
    private String [] comment_userName={"深港澳第一皮","Jake","Nick"};
    private String [] comment_replyComment={"哈哈哈哈哈","你为什么这么熟练","明明是我先来的"};
    private String [] comment_yourComment={"这个真有趣","又到了白色相簿的季节","又到了白色相簿的季节"};
    private String [] comment_date={"4月22日","5月1日","5月3日"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comment,container,false);
        List<Map<String,Object>> commentListItems = new ArrayList<Map<String,Object>>();


        for(int i=0;i<comment_icon.length;i++){
            Map<String,Object> commentMaps = new HashMap<String,Object>();
            commentMaps.put("comment_icon",comment_icon[i]);
            commentMaps.put("comment_userName",comment_userName[i]);
            commentMaps.put("comment_reply",comment_replyComment[i]);
            commentMaps.put("comment_yourComment","你的评论："+comment_yourComment[i]);
            commentMaps.put("comment_date",comment_date[i]);
            commentListItems.add(commentMaps);

        }

        ListView lvComment = (ListView) view.findViewById(R.id.lvComment);
        SimpleAdapter simpleAdapter = new SimpleAdapter(getActivity(),commentListItems,
                R.layout.listview_comment,new String[]{"comment_icon","comment_userName","comment_reply",
                "comment_yourComment","comment_date"},new int[]{R.id.comment_icon,R.id.comment_userName,
                R.id.comment_reply,R.id.comment_yourComment,R.id.comment_date} );

        lvComment.setAdapter(simpleAdapter);
        return view;
    }
    }
