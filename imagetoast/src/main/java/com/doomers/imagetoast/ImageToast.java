package com.doomers.imagetoast;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageToast {
    public static int LENGTH_SHORT = Toast.LENGTH_SHORT;
    public static int LENGTH_LONG = Toast.LENGTH_LONG;
    private static ImageToast ourInstance = new ImageToast();

    public static ImageToast getInstance() {
        return ourInstance;
    }

    private ImageToast() {

    }

    public Toast makeText(Context context, Bitmap bitmap, int duration) {

        Toast toast = new Toast(context);
        ImageView view = new ImageView(context);
        view.setImageBitmap(bitmap);

        toast.setView(view);
        toast.setDuration(duration);
        toast.setGravity(Gravity.HORIZONTAL_GRAVITY_MASK,0,0);
        toast.show();
        return toast;
    }

    public Toast makeText(Context context, Bitmap bitmap, int duration, int percent) {

        Toast toast = new Toast(context);
        ImageView view = new ImageView(context);
        Bitmap bitmap1 = Bitmap.createScaledBitmap(bitmap, (bitmap.getWidth()*percent/100), (bitmap.getHeight()*percent/100) ,false);
        view.setImageBitmap(bitmap1);
        toast.setView(view);
        toast.setDuration(duration);
        toast.setGravity(Gravity.HORIZONTAL_GRAVITY_MASK,0,0);
        toast.show();
        return toast;
    }


}