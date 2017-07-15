package cn.edu.nwpu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter
{
	// ����Context
	private Context		mContext;		
	// ������������ ��ͼƬԴ
	private Integer[]	mImageIds = 
	{ 						
			R.drawable.news1, 
			R.drawable.news2, 
			R.drawable.news3, 
			R.drawable.news4, 
			R.drawable.news5, 	
	};

	// ���� ImageAdapter
	public ImageAdapter(Context c)
	{
		mContext = c;
	}

	// ��ȡͼƬ�ĸ���
	public int getCount()
	{
		return mImageIds.length;
	}

	// ��ȡͼƬ�ڿ��е�λ��
	public Object getItem(int position)
	{
		return position;
	}

	// ��ȡͼƬID
	public long getItemId(int position)
	{
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent)
	{
		ImageView imageview = new ImageView(mContext);

		// ��ImageView������Դ
		imageview.setImageResource(mImageIds[position]);
		imageview.setScaleType(ImageView.ScaleType.FIT_CENTER);
		return imageview;
	}
}

