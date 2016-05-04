package com.technologynorth.rosera.popularmoviess1;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by rosera on 03/05/16.
 */
public class MovieAdapter extends ArrayAdapter<Movie> {

    Activity            mActivity;
    ArrayList<Movie>    mMovies;

    public MovieAdapter(Activity context, ArrayList<Movie> movies) {
        super(context, 0, movies);

        this.mActivity = context;
        this.mMovies = movies;
    }

    // ViewHolder pattern
    private static class ViewHolder {
        ImageView mImageViewFilm;
    }


    @Override
    public int getCount() {
        return mMovies.size();
    }

    @Override
    public Movie getItem(int position) {
        return mMovies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override
    public View getView(int position, View view, ViewGroup parent) {

        ImageView imageView = new ImageView(mActivity);

        // TODO: Implement the ViewHolder pattern - see GridView bookmark StackOverflow

        // Set the information
        imageView.setImageResource(R.drawable.antman);

        return imageView;
    }
}
