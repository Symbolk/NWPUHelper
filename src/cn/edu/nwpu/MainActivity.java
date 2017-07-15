package cn.edu.nwpu;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import cn.edu.nwpu.MenuFragment.SLMenuListOnItemClickListener;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;

public class MainActivity extends SlidingFragmentActivity implements
		SLMenuListOnItemClickListener {

	private SlidingMenu mSlidingMenu;

	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setTitle("主页");
		// setTitle(R.string.sliding_title);
		setContentView(R.layout.frame_content);
		// set the Behind View
		setBehindContentView(R.layout.frame_menu);

		// customize the SlidingMenu
		mSlidingMenu = getSlidingMenu();
		/*
		 * mSlidingMenu.setMode(SlidingMenu.LEFT_RIGHT);
		 * mSlidingMenu.setSecondaryMenu(R.layout.frame_menu);
		 * mSlidingMenu.setSecondaryShadowDrawable(R.drawable.drawer_shadow);
		 */

		mSlidingMenu.setShadowDrawable(R.drawable.drawer_shadow);// 璁剧疆闃村奖鍥剧墖
		mSlidingMenu.setShadowWidthRes(R.dimen.shadow_width); // 璁剧疆闃村奖鍥剧墖鐨勫搴�
																// mSlidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
																// //SlidingMenu鍒掑嚭鏃朵富椤甸潰鏄剧ず鐨勫墿浣欏搴�
																// mSlidingMenu.setFadeDegree(0.35f);
		mSlidingMenu.setBehindOffset(300);
		mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_MARGIN);

		FragmentTransaction fragmentTransaction = getSupportFragmentManager()
				.beginTransaction();
		MenuFragment menuFragment = new MenuFragment();
		fragmentTransaction.replace(R.id.menu, menuFragment);
		fragmentTransaction.replace(R.id.content, new HomeFragment());
		// fragmentTransaction.replace(R.id.content, new RightMenuFragment());
		fragmentTransaction.commit();

		// 浣跨敤宸︿笂鏂筰con鍙偣锛岃繖鏍峰湪onOptionsItemSelected閲岄潰鎵嶅彲浠ョ洃鍚埌R.id.home
		getActionBar().setDisplayHomeAsUpEnabled(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		menu.add(0,0,0,R.string.exit);
		return true;
	}

	// DisaplyToast msg
	public void DisplayToast(String str) {
		Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:

			toggle();
			return true;
		case R.id.action_refresh:
			DisplayToast("刷新完成！");
			return true;
		case R.id.action_search:
			if (mSlidingMenu.isSecondaryMenuShowing()) {
				mSlidingMenu.showContent();
			} else {
				mSlidingMenu.showSecondaryMenu();
			}
			return true;
		case 0:
			AlertDialog.Builder builder= new AlertDialog.Builder(this)
	  			.setTitle("提示")
	  			.setIcon(R.drawable.alert_dialog_icon)
	  			.setMessage("确定要离开吗？")
	  			.setPositiveButton("确定",
	  			new DialogInterface.OnClickListener() 
	  			{
	  				public void onClick(DialogInterface dialog, int whichButton)
	  				{
	  					finish();
	  				}
	  			})
	  			.setNegativeButton("返回", new DialogInterface.OnClickListener() 
				{
					public void onClick(DialogInterface dialog, int whichButton)
					{
						
					}
				});//创建按钮
			
 
	  	builder.show();
		}
		return super.onOptionsItemSelected(item);
	}

	@SuppressLint("NewApi")
	@Override
	public void selectItem(int position, String title) {
		// update the main content by replacing fragments
		Fragment fragment = null;
		switch (position) {
		case 0:
			fragment = new HomeFragment();
			break;
		case 1:
			fragment = new NewsFragment();	
			break;
		case 2:
			fragment = new HintFragment();
			break;
		case 3:
			// fragment = new CarFragment();
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, Car.class);
			startActivity(intent);			
			break;
		case 4:
			AlertDialog.Builder builder= new AlertDialog.Builder(this)
  			.setTitle("请问：")
  			.setIcon(R.drawable.alert_dialog_icon)
  			.setMessage("您在哪个校区？")
  			.setPositiveButton("友谊校区",
  			new DialogInterface.OnClickListener() 
  			{
  				public void onClick(DialogInterface dialog, int whichButton)
  				{
  					Intent intent2= new Intent();
  					intent2.setClass(MainActivity.this, Map2.class);
  					startActivity(intent2);
  				}
  			})
  			.setNegativeButton("长安校区", new DialogInterface.OnClickListener() 
			{
				public void onClick(DialogInterface dialog, int whichButton)
				{
					Intent intent3= new Intent();
  					intent3.setClass(MainActivity.this, Map2.class);
  					startActivity(intent3);
				}
			});//创建按钮		
  	builder.show();
  	mSlidingMenu.showContent();
			break;
		case 5:
			fragment = new AboutFragment();
			break;
		default:
			break;
		}

		if (fragment != null) {
			FragmentManager fragmentManager = getSupportFragmentManager();
			fragmentManager.beginTransaction().replace(R.id.content, fragment)
					.commit();
			// update selected item and title, then close the drawer
			setTitle(title);
			mSlidingMenu.showContent();
		} else {
			// error in creating fragment
			Log.e("MainActivity", "Error in creating fragment");
		}
	}
}
