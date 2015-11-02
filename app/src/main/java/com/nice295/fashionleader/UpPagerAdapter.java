package com.nice295.fashionleader;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by kyuholee on 15. 11. 3..
 */
public class UpPagerAdapter extends PagerAdapter {
    Context context;
    private LayoutInflater mInflater;
    Integer[] url;

    public UpPagerAdapter(Context context, Integer[] url) {
        this.context = context;
        this.url = url;
        mInflater = LayoutInflater.from(context);
    }

    @Override
         public int getCount() {
        return url.length;
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((FrameLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView ivImage;

        View itemView = mInflater.inflate(R.layout.up_viewpager_item, container, false);

        // Locate the TextViews in viewpager_item.xml
        ivImage = (ImageView) itemView.findViewById(R.id.ivImage);

        ivImage.setImageResource(url[position]);

        // Add viewpager_item.xml to ViewPager
        ((ViewPager) container).addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // Remove viewpager_item.xml from ViewPager
        ((ViewPager) container).removeView((FrameLayout) object);

    }
}
