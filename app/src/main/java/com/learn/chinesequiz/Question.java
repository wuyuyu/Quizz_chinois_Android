package com.learn.chinesequiz;

import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.DrawableRes;
import androidx.annotation.RawRes;

public class QuestionClass implements Parcelable {

    /**
     * this is a variable for create question objects
     */
    private String question;
    private String goodResult;
    private String badResult;
    private String badResult1;
    private int statusLevel;
    private int picture;
    private int song;

    public QuestionClass(String question, String goodResult, String badResult, String badResult1, int statusLevel, int picture, int song) {
        this.question = question;
        this.goodResult = goodResult;
        this.badResult = badResult;
        this.badResult1 = badResult1;
        this.statusLevel = statusLevel;
        this.picture = picture;
        this.song = song;
    }

    protected QuestionClass(Parcel in) {
        question = in.readString();
        goodResult = in.readString();
        badResult = in.readString();
        badResult1 = in.readString();
        statusLevel = in.readInt();
        picture = in.readInt();
        song = in.readInt();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(question);
        dest.writeString(goodResult);
        dest.writeString(badResult);
        dest.writeString(badResult1);
        dest.writeInt(statusLevel);
        dest.writeInt(picture);
        dest.writeInt(song);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<QuestionClass> CREATOR = new Creator<QuestionClass>() {
        @Override
        public QuestionClass createFromParcel(Parcel in) {
            return new QuestionClass(in);
        }

        @Override
        public QuestionClass[] newArray(int size) {
            return new QuestionClass[size];
        }
    };

    public String getQuestion() {
        return question;
    }
}
