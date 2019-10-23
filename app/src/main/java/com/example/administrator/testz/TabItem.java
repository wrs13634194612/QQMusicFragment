package com.example.administrator.testz;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;

/**
 * Created by qwang on 2016/8/12.
 */
public class TabItem extends View {

    private Drawable mIcon;
    private String mText;
    private int mIconGravity = Gravity.LEFT;
    private int mIconWidth;
    private int mIconHeight;

    public TabItem(Context context) {
        super(context);
        init(context, null);
    }

    public TabItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public TabItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public TabItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs == null) {
            return;
        }
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.TabItem);
        mIcon = typedArray.getDrawable(R.styleable.TabItem_icon);
        mText = typedArray.getString(R.styleable.TabItem_text);
        mIconGravity = typedArray.getInt(R.styleable.TabItem_icon_Gravity, mIconGravity);
        mIconWidth = (int) typedArray.getDimension(R.styleable.TabItem_iconWidth, 0);
        mIconHeight = (int) typedArray.getDimension(R.styleable.TabItem_iconHeight, 0);
        typedArray.recycle();
    }

    public Drawable getIcon() {
        return mIcon;
    }

    public void setIcon(Drawable mIcon) {
        this.mIcon = mIcon;
    }

    public String getText() {
        return mText;
    }

    public void setText(String mText) {
        this.mText = mText;
    }

    public int getIconGravity() {
        return mIconGravity;
    }

    public int getIconHeight() {
        return mIconHeight;
    }

    public void setIconHeight(int mIconHeight) {
        this.mIconHeight = mIconHeight;
    }

    public int getIconWidth() {
        return mIconWidth;
    }

    public void setIconWidth(int mIconWidth) {
        this.mIconWidth = mIconWidth;
    }

    public void setIconGravity(int mIconGravity) {
        this.mIconGravity = mIconGravity;
    }
}
