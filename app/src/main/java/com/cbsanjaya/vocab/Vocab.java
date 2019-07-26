package com.cbsanjaya.vocab;

import android.os.Parcel;
import android.os.Parcelable;

public class Vocab implements Parcelable {
    private boolean verb;
    private String bahasa;
    private String english;

    public Vocab(boolean verb, String bahasa, String english) {
        this.verb = verb;
        this.bahasa = bahasa;
        this.english = english;
    }

    public boolean isVerb() {
        return this.verb;
    }

    public String getBahasa() {
        return this.bahasa;
    }

    public String getEnglish1() {
        String result="";

        if (verb) {
            result = this.english.split(";")[0];
        } else {
            result = this.english;
        }

        return result;

    }

    public String getEnglish2() {
        String result="";

        if (verb) {
            result = this.english.split(";")[1];
        }

        return result;
    }

    public String getEnglish3() {
        String result="";

        if (verb) {
            result = this.english.split(";")[2];
        }

        return result;
    }

    public String getEnglishIng() {
        String result="";

        if (verb) {
            result = this.english.split(";")[3];
        }

        return result;
    }

    protected Vocab(Parcel in) {
        verb = in.readByte() != 0;
        bahasa = in.readString();
        english = in.readString();
    }

    public static final Creator<Vocab> CREATOR = new Creator<Vocab>() {
        @Override
        public Vocab createFromParcel(Parcel in) {
            return new Vocab(in);
        }

        @Override
        public Vocab[] newArray(int size) {
            return new Vocab[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte((byte) (verb ? 1 : 0));
        parcel.writeString(bahasa);
        parcel.writeString(english);
    }
}
