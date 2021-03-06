package com.hhxk.app.pojo;

import java.util.List;

public class HomeNewPojo {


    /**
     * info : [{"meeting_info":"黄裳： 我没提防住，看见了这个问题。 才意识到人类的自大已经达到了这种程度了。 太阳在那里亮着。浪不浪费。与你何干？ 试想以下的场景： 澳大利亚的牧场上，有两\u2026","sig":0,"meeting_start":1551151078000,"userList":["六子"],"meeting_id":1,"num":0,"notArrive":0,"meeting_end":1551324657000,"meeting_name":"第一次会议"}]
     * title : 正在进行的会议
     */

    private String title;
    private List<InfoBean> info;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean {
        /**
         * meeting_info : 黄裳： 我没提防住，看见了这个问题。 才意识到人类的自大已经达到了这种程度了。 太阳在那里亮着。浪不浪费。与你何干？ 试想以下的场景： 澳大利亚的牧场上，有两…
         * sig : 0
         * meeting_start : 1551151078000
         * userList : ["六子"]
         * meeting_id : 1
         * num : 0
         * notArrive : 0
         * meeting_end : 1551324657000
         * meeting_name : 第一次会议
         */

        private String meeting_info;
        private int sig;
        private long meeting_start;
        private int meeting_id;
        private int num;
        private int notArrive;
        private long meeting_end;
        private String meeting_name;
        private List<String> userList;

        public String getMeeting_info() {
            return meeting_info;
        }

        public void setMeeting_info(String meeting_info) {
            this.meeting_info = meeting_info;
        }

        public int getSig() {
            return sig;
        }

        public void setSig(int sig) {
            this.sig = sig;
        }

        public long getMeeting_start() {
            return meeting_start;
        }

        public void setMeeting_start(long meeting_start) {
            this.meeting_start = meeting_start;
        }

        public int getMeeting_id() {
            return meeting_id;
        }

        public void setMeeting_id(int meeting_id) {
            this.meeting_id = meeting_id;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public int getNotArrive() {
            return notArrive;
        }

        public void setNotArrive(int notArrive) {
            this.notArrive = notArrive;
        }

        public long getMeeting_end() {
            return meeting_end;
        }

        public void setMeeting_end(long meeting_end) {
            this.meeting_end = meeting_end;
        }

        public String getMeeting_name() {
            return meeting_name;
        }

        public void setMeeting_name(String meeting_name) {
            this.meeting_name = meeting_name;
        }

        public List<String> getUserList() {
            return userList;
        }

        public void setUserList(List<String> userList) {
            this.userList = userList;
        }
    }
}
