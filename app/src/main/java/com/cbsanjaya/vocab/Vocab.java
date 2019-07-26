package com.cbsanjaya.vocab;

public class Vocab {
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
}
