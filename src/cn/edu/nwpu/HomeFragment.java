package cn.edu.nwpu;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class HomeFragment extends Fragment {
	private ImageView img;
	private ViewPager mViewPager;
	private static final String[] titles = {"One","Two","Three","Four","Five"};
	private static final String[] contents={
		"西工大新闻网7月7日电（记者 王丽 摄影记者 郭友军）7月3日上午，西北工业大学自动化学院人才特区揭牌仪式暨第一届特区论坛在长安校区举行，也是西工大首个学院级人才特区成立。来自国际著名高校、首批加盟人才特区团队的16位知名学者，学校领导汪劲松、王润孝、袁建平，校长助理陈建有，学校相关职能部处负责人，及自动化学院师生代表参加了揭牌仪式。自动化学院党委书记乔辉主持揭牌仪式。",
		"西工大新闻网7月2日电（记者 王丽 摄影记者 郭友军 付延）7月2日下午，中国共产党西北工业大学第十二次代表大会圆满完成了各项议程，在友谊校区国际会议中心胜利闭幕。下午2时30分，大会主席团秘书长郑永安主持大会选举。先后表决通过大会选举办法和总监票人、副总监票人、监票人名单。在总监票人刘更同志的主持下，在总监票人和监票人监督下，代表们以无记名差额选举的方式，选举中国共产党西北工业大学第十二届委员会和中国共产党西北工业大学纪律检查委员会。",
		"西工大新闻网7月1日电（记者 吴秀青 摄影记者 郭友军 付延）中国共产党西北工业大学第十二次代表大会7月1日上午在友谊校区国际会议中心隆重开幕。本次党代会是西北工业大学在加快建设学科特色鲜明的世界一流大学进程中召开的一次承前启后、继往开来的大会，必将对学校的改革发展和党的建设事业产生重要而深远的影响。    国际会议中心第五会议室，气氛庄严而热烈。主席台帷幕中央的金色党徽在十面鲜艳红旗的映衬下熠熠生辉。“为加快建设学科特色鲜明，在航空航天航海等领域有重大影响的世界一流大学而努力奋斗”的巨幅横标高悬在会场的后上方，显得格外醒目。来自全校各单位的267名代表共商学校改革发展和党的建设大计。",
		"大会认为，自2008年第十一次党代会召开以来，第十一届党委在工业和信息化部党组、中共陕西省委的正确领导下，认真贯彻落实党的十七大、十八大精神和习近平总书记系列重要讲话精神，以科学发展观为指导，坚持党的教育方针和社会主义办学方向，充分发挥党委在学校事业发展中的领导核心作用，团结带领全校共产党员和广大师生员工，紧紧围绕建设国际知名高水平研究型大学的目标，坚持走内涵式发展道路，解放思想、深化改革、抢抓机遇、锐意进取，全面完成“十一五”规划，顺利实施“十二五”规划，以优异成绩通过工业和信息化部“一提三优”工程评估，各方面工作都取得了新的进展，学校事业发展迈出新步伐，综合办学实力跃上新台阶。大会对第十一届党委的工作予以高度肯定。",
		"西北工业大学坐落于古都西安，是我国唯一一所以同时发展航空、航天、航海工程教育和科学研究为特色，以工理为主，管、文、经、法协调发展的研究型、多科性和开放式的科学技术大学，隶属工业和信息化部。学校秉承“公诚勇毅”的校训，发扬“基础扎实、工作踏实、作风朴实、开拓创新”（三实一新）的校风，为我国国防科技事业和国民经济建设做出了巨大贡献。经过70多年的建设，学校各项事业取得长足发展，社会地位日益提高。1960年被国务院确定为全国重点大学；“七五”、“八五”均被国务院列为重点建设的全国15所大学之一；“九五”首批进入国家“211工程”立项建设；“十五”进入国家“985工程”重点建设，是全国首批设立研究生院和国家大学科技园的高校之一。"
	};
/*	private Integer[]	mImageIds = 
		{ 						
				R.drawable.news1, 
				R.drawable.news2, 
				R.drawable.news3, 
				R.drawable.news4, 
				R.drawable.news5, 	
		};*/
	private List<ContentBean> list = new ArrayList<ContentBean>();
	private ContentFragmentPagerAdapter mAdapter;
	
	public HomeFragment(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
//        img =(ImageView)rootView.findViewById(R.id.img);
        initData();
        findView(rootView);
        
        return rootView;
    }

	private void initData() {
		
		for(int i=0;i<titles.length;i++){
			
			ContentBean cb = new ContentBean();
			cb.setTitle(titles[i]);
			cb.setContent(contents[i]);
//			cb.setImg(R.drawable.news1);			
			list.add(cb);
		}
	}

	private void findView(View rootView) {
		
		mViewPager = (ViewPager) rootView.findViewById(R.id.mViewPager);
		mAdapter = new ContentFragmentPagerAdapter(getActivity().getSupportFragmentManager(),list);
		mViewPager.setAdapter(mAdapter);
	}
	
	@Override
	public void onStart() {
		
		if(mAdapter!=null){
			mAdapter.notifyDataSetChanged();
		}
		
		super.onStart();
	}
}
