package com.example.customview.views;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;
public class CustomViews extends View {

    private static final int SQUARE_SIZE = 200;
    private Rect mRect;
    private Paint mPaint;

    public CustomViews(Context context) {
        super( context );
        init( null );
    }

    public CustomViews(Context context, @Nullable AttributeSet attrs) {
        super( context, attrs );
        init( attrs );

    }

    public CustomViews(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super( context, attrs, defStyleAttr );
        init( attrs );

    }

    public CustomViews(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super( context, attrs, defStyleAttr, defStyleRes );
        init( attrs );

    }

    private void init(@Nullable AttributeSet set) {
        mRect = new Rect();
        mPaint = new Paint( Paint.ANTI_ALIAS_FLAG );
        mPaint.setColor( Color.GREEN );

    }

    public void swapColor() {
        mPaint.setColor( mPaint.getColor() == Color.GREEN ? Color.RED : Color.GREEN );
        postInvalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        mRect.left = 50;
        mRect.top = 50;
        mRect.right = mRect.left + SQUARE_SIZE;
        mRect.bottom = mRect.top + SQUARE_SIZE;
        canvas.drawRect( mRect, mPaint );
    }
}
