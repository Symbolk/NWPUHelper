package cn.edu.nwpu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter
{
	// 定义Context
	private Context		mContext;		
	// 定义整型数组 即图片源
	private Integer[]	mImageIds = 
	{ 						
			R.drawable.news1, 
			R.drawable.news2, 
			R.drawable.news3, 
			R.drawable.news4, 
			R.drawable.news5, 	
	};

	// 声明 ImageAdapter
	public ImageAdapter(Context c)
	{
		mContext = c;
	}

	// 获取图片的个数
	public int getCount()
	{
		return mImageIds.length;
	}

	// 获取图片在库中的位置
	public Object getItem(int position)
	{
		return position;
	}

	// 获取图片ID
	public long getItemId(int position)
	{
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{
		ImageView imageview = new ImageView(mContext);

		// 给ImageView设置资源
		imageview.setImageResource(mImageIds[position]);
		imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
		return imageview;
	}
}

