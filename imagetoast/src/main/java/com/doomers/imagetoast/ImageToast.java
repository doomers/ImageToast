package com.doomers.imagetoast;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageToast {
    private static ImageToast ourInstance = new ImageToast();

    public static ImageToast getInstance() {
        return ourInstance;
    }

    private ImageToast() {

    }

    public Toast makeText(Context context, Bitmap bitmap) {

        Toast toast = new Toast(context);
        ImageView view = new ImageView(context);
        view.setImageBitmap(bitmap);
        toast.setView(view);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.HORIZONTAL_GRAVITY_MASK,0,0);
        toast.show();
        return toast;
    }
}