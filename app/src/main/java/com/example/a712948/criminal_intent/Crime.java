package com.example.a712948.criminal_intent;

import java.util.Date;
import java.util.UUID;

/**
 * @author Hannah Paulson
 * @since 12/29/15.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDateFormat = new Date();
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Date getDate() {
        mDate = new Date();
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;

    }


}
