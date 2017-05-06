package com.example.wenlongzhao.myprojectv10.mainActivity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.SimpleAdapter;

import com.example.wenlongzhao.myprojectv10.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Useradmin on 2017/4/5.
 */
public class NotificationFragment extends Fragment implements View.OnClickListener{

    private int [] comment_icon={R.mipmap.icon1,R.mipmap.icon2,R.mipmap.icon3};
    private String [] comment_userName={"深港澳第一皮","Jake","Nick"};
    private String [] comment_replyComment={"哈哈哈哈哈","你为什么这么熟练","明明是我先来的"};
    private String [] comment_yourComment={"这个真有趣","又到了白色相簿的季节","又到了白色相簿的季节"};
    private String [] comment_date={"4月22日","5月1日","5月3日"};

    private int [] fabulous_icon={R.mipmap.icon1,R.mipmap.icon2,R.mipmap.icon3};
    private String [] fabulous_userName={"mr white","Jake","Nick"};
    private String [] fabulous_yourComment={"这个真有趣","又到了白色相簿的季节","又到了白色相簿的季节"};
    private String [] fabulous_date={"4月25日","5月5日","5月5日"};



    ListView lvComment;
    SimpleAdapter commentAdapter;
    SimpleAdapter fabulousAdapter;

    public NotificationFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notification,container,false);

        initAdapter();


        lvComment = (ListView) view.findViewById(R.id.lvComment);
        lvComment.setAdapter(commentAdapter);

        RadioButton rBtnComment = (RadioButton) view.findViewById(R.id.radioBtnComment);
        rBtnComment.setOnClickListener(this);
        RadioButton rBtnFabulous = (RadioButton) view.findViewById(R.id.radioBtnFabulous);
        rBtnFabulous.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view){
        if(view.getId()==R.id.radioBtnComment)
            lvComment.setAdapter(commentAdapter);
        if(view.getId()==R.id.radioBtnFabulous) {
            System.out.println("111");
            lvComment.setAdapter(fabulousAdapter);
        }
    }

    public void initAdapter(){
        //初始化评论listView的Adapter
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
        commentAdapter = new SimpleAdapter(getActivity(),commentListItems,
                R.layout.listview_comment,new String[]{"comment_icon","comment_userName","comment_reply",
                "comment_yourComment","comment_date"},new int[]{R.id.comment_icon,R.id.comment_userName,
                R.id.comment_reply,R.id.comment_yourComment,R.id.comment_date} );

        //初始化点赞通知的Adapter
        List<Map<String,Object>> fabulousListItems = new ArrayList<Map<String,Object>>();
        for(int i=0;i<fabulous_icon.length;i++){
            Map<String,Object> fabulousMaps = new HashMap<String,Object>();
            fabulousMaps.put("fabulous_icon",fabulous_icon[i]);
            fabulousMaps.put("fabulous_userName",fabulous_userName[i]);

            fabulousMaps.put("fabulous_yourComment",fabulous_yourComment[i]);
            fabulousMaps.put("fabulous_date",fabulous_date[i]);
            fabulousListItems.add(fabulousMaps);
        }
        fabulousAdapter = new SimpleAdapter(getActivity(),fabulousListItems,
                R.layout.listview_fabulous,new String[]{"fabulous_icon","fabulous_userName",
                "fabulous_yourComment","fabulous_date"},new int[]{R.id.fabulous_icon,R.id.fabulous_userName,
               R.id.fabulous_yourComment,R.id.fabulous_date} );

    }

}
