package com.skuhleesi.mynihongo;

/**
 * Created by Mugen on 4/3/2017.
 */

public class Word {

    private String japaneseTranslation;

    private String englishTranslation;

    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mAudioResourceId;



    public Word(String japanese, String english, int audioResourceId){
        japaneseTranslation = japanese;
        englishTranslation = english;
        mAudioResourceId = audioResourceId;
    }


    public Word(String japanese, String english, int imageResourceId, int audioResourceId){
        japaneseTranslation = japanese;
        englishTranslation = english;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    public String getJapaneseTranslation(){
        return japaneseTranslation;
    }

    public String getEnglishTranslation(){
        return englishTranslation;
    }

    public int getImageResourceId(){return mImageResourceId;}

    public int getAudioResourceId(){
        return mAudioResourceId;
    }


    /**
     * Returns if activity has an image or not
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Word{" +
                "japaneseTranslation='" + japaneseTranslation + '\'' +
                ", englishTranslation='" + englishTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}