package com.example.mattsternberg.criminalintent;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by Matt Sternberg on 8/14/2016.
 */
public class ImageFragment extends android.support.v4.app.DialogFragment {

    private static final String ARGS_PIC = "image";

    private ImageView mSuspectPic;

    public static ImageFragment newInstance(String path) {
        Bundle args = new Bundle();
        args.putString(ARGS_PIC, path);

        ImageFragment imageFragment = new ImageFragment();
        imageFragment.setArguments(args);
        return imageFragment;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        super.onCreateDialog(savedInstanceState);

        String path = getArguments().getString(ARGS_PIC);
        Bitmap image = PictureUtils.getScaledBitmap(path, getActivity());

        View v = LayoutInflater.from(getActivity()).inflate(R.layout.dialog_pic, null);
        mSuspectPic = (ImageView) v.findViewById(R.id.image_zoom);
        mSuspectPic.setImageBitmap(image);

        return new AlertDialog.Builder(getActivity()).setView(mSuspectPic).create();

    }
}
