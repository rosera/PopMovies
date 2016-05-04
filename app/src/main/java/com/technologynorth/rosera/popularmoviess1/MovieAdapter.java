package com.technologynorth.rosera.popularmoviess1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

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
        ImageView mImageViewMovie;
        TextView mTextViewMovie;
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
        ViewHolder  viewHolder;
        View        gridView;

        // TODO: Implement the ViewHolder pattern - see GridView bookmark StackOverflow
        if (view == null) {
            // Find the layout for gridview_image
            gridView = LayoutInflater.from(mActivity).inflate(R.layout.gridview_image, null);
            gridView.setLayoutParams(new GridView.LayoutParams(350,475));


            viewHolder = new ViewHolder();

            // Find the ImageView and populate
            viewHolder.mImageViewMovie   = (ImageView) gridView.findViewById(R.id.imageViewMovie);
            viewHolder.mImageViewMovie.setImageResource(R.drawable.antman);

            // Find the TextView and populate
            viewHolder.mTextViewMovie = (TextView) gridView.findViewById(R.id.textViewMovie);
            viewHolder.mTextViewMovie.setText("Antman");

            gridView.setTag(viewHolder);
        } else {
            gridView = (View) view;
            gridView.getTag();

        }

        return gridView;
    }
}
