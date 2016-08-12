package com.example.mattsternberg.criminalintent;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

/**
 * Created by Matt Sternberg on 8/3/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime() {
        //Generate Unique Identifier
        mTitle = "";
        mId = UUID.randomUUID();
        mDate = new Date();

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

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public String friendlyDateFormat() {
        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        return dateFormatter.format(mDate);
    }

    public String friendlyTimeFormat() {
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.US);
        return timeFormatter.format(mDate);
    }
}
