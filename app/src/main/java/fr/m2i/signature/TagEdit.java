package fr.m2i.signature;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Administrateur on 15/01/2018.
 */

public class TagEdit extends android.support.v7.widget.AppCompatImageView {




    private int tagColor;
    private int tagWidth;

    Paint paint;
    Path path;

    public TagEdit(Context context, AttributeSet attrs) {
        super(context, attrs);

        //definir un objet Paint avec les paramètres
        paint = new Paint();

        paint.setDither(true);
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(Paint.DITHER_FLAG);

        path = new Path();


    }

    public int getTagWidth() {
        return tagWidth;
    }

    public void setTagWidth(int tagWidth) {
        this.tagWidth = tagWidth;
        paint.setStrokeWidth(tagWidth);
    }
    public int getTagColor() {
        return tagColor;
    }

    public void setTagColor(int tagColor) {
        this.tagColor = tagColor;
        paint.setColor(tagColor);

    }





    //méthode de déclenchement du dessin sur écran avec le doigt
    public boolean onTouchEvent(MotionEvent ev) {
        float eventX = ev.getX();
        float eventY = ev.getY();
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN: // position en fonction du doig
                path.moveTo(eventX, eventY);
                return true;
            //deplacement du
                case MotionEvent.ACTION_MOVE:
                path.lineTo(eventX, eventY);
                break;
            default:
                return false;
        }
        invalidate(); // Force le redessin
        return true;
    }

    // va chercher le chemin construit
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(path, paint);
    }

    public void clear() {

        path.reset();

    }


}
