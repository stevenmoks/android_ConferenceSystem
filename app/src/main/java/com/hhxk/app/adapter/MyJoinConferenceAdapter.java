package com.hhxk.app.adapter;

import com.em.baseframe.adapter.recyclerview.BaseQuickAdapter;
import com.em.baseframe.adapter.recyclerview.BaseViewHolder;
import com.em.baseframe.util.DateTool;
import com.hhxk.app.R;
import com.hhxk.app.pojo.MyJoinConferencePojo;

import java.util.List;

/**
 * @title  我的会议-我参加的会议适配器
 * @date   2019/02/21
 * @author enmaoFu
 */
public class MyJoinConferenceAdapter extends BaseQuickAdapter<MyJoinConferencePojo,BaseViewHolder> {

    private String hostStr = "暂无";

    public MyJoinConferenceAdapter(int layoutResId, List<MyJoinConferencePojo> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, MyJoinConferencePojo item) {
        if(null != item.getUserList() || item.getUserList().size() != 0){
            List<String> strings = item.getUserList();
            for(String strs:strings){
                hostStr = strs + ",";
            }
        }
        helper.setText(R.id.title,item.getMeeting_name());
        helper.setText(R.id.start_time,"开始时间：" + DateTool.timeStamp2Date(item.getMeeting_start(),"yyyy年MM月dd日 HH:mm"));
        helper.setText(R.id.host,"主持人：" + hostStr);
        helper.setText(R.id.context,item.getMeeting_info());
        helper.setText(R.id.text_y,"应到：" + String.valueOf(item.getNum()));
        helper.setText(R.id.text_q,"签到：" + String.valueOf(item.getSig()));
        helper.setText(R.id.text_j,"缺席：" + String.valueOf(item.getNotArrive()));
    }
}
