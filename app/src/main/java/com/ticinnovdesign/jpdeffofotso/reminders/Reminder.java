package com.ticinnovdesign.jpdeffofotso.reminders;

/**
 * Created by jp.deffofotso on 28/01/2016.
 */
public class Reminder {
    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getContent() {
        return mContent;
    }

    public void setContent(String content) {
        mContent = content;
    }

    public int getImportant() {
        return mImportant;
    }

    public void setImportant(int important) {
        mImportant = important;
    }

    private int mId;
    private String mContent;
    private int mImportant;
    public Reminder(int id, String content, int important) {
        mId = id;
        mImportant = important;
        mContent = content;
    }

}
