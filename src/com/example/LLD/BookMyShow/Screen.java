package com.example.LLD.BookMyShow;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    int screenId;
    String screenName;
    List<Show> showList;


    public Screen(int screenId, String screenName) {
        this.screenId = screenId;
        this.screenName = screenName;
        this.showList = new ArrayList<>();
    }

    public int getScreenId() {
        return screenId;
    }

    public void setScreenId(int screenId) {
        this.screenId = screenId;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public List<Show> getShowList() {
        return showList;
    }

    public void setShowList(List<Show> showList) {
        this.showList = showList;
    }
}
