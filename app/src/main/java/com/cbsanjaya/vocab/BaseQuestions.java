package com.cbsanjaya.vocab;

import java.util.ArrayList;

abstract class BaseQuestions {
    ArrayList<Vocab> gallery = new ArrayList<>();

    static final int CHAPTER_1 = 0;
    static final int CHAPTER_2 = 1;
    static final int CHAPTER_3 = 2;
    static final int CHAPTER_4 = 3;
    static final int CHAPTER_REVIEW_1 = 4;
    static final int CHAPTER_6 = 6;
    static final int CHAPTER_7 = 7;
    static final int CHAPTER_5 = 5;
    static final int CHAPTER_8 = 8;
    static final int CHAPTER_REVIEW_2 = 9;
    static final int CHAPTER_9 = 10;
    static final int CHAPTER_10 = 11;
    static final int CHAPTER_11 = 12;
    static final int CHAPTER_12 = 13;
    static final int CHAPTER_REVIEW_3 = 14;
    static final int CHAPTER_13 = 15;
    static final int CHAPTER_14 = 16;
    static final int CHAPTER_15 = 17;
    static final int CHAPTER_16 = 18;
    static final int CHAPTER_ALL = 19;

    public void setGallery(ArrayList<Vocab> gallery) {
        this.gallery = gallery;
    }
}
