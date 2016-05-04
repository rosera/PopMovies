package com.technologynorth.rosera.popularmoviess1;

import android.os.Parcel;
import android.os.Parcelable;


import java.util.List;

/**
 * Created by rosera on 03/05/16.
 */
public class Movie
//        implements Parcelable
{

    String mTitle;
    String mYear;
    String mTrailerPrimaryUri;
    String mThumbnail;

//    private List<Movie> Movies;

    Movie(String strTitle, String strYear, String strTrailer, String strThumbnail) {
        this.mTitle             = strTitle;
        this.mYear              = strYear;
        this.mTrailerPrimaryUri = strTrailer;
        this.mThumbnail         = strThumbnail;
    }

//    private Movie(Parcel in) {
//        this.mTitle             = in.readString();
//        this.mYear              = in.readString();
//        this.mTrailerPrimaryUri = in.readString();
//        this.mThumbnail         = in.readString();
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeString(this.mTitle);
//        dest.writeString(this.mYear);
//        dest.writeString(this.mTrailerPrimaryUri);
//        dest.writeString(this.mThumbnail);
//    }
//
//    public final Parcelable.Creator<Movie> CREATOR = new Parcelable.Creator<Movie>() {
//        @Override
//        public Movie createFromParcel(Parcel parcel) {
//            return new Movie(parcel);
//        }
//
//        @Override
//        public Movie[] newArray(int i) {
//            return new Movie[i];
//        }
//    };
}
