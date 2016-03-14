package com.example.wannengadapter;

import java.util.ArrayList;
import java.util.List;

import com.example.wannengadapter.CommonAdapter.OnGetViewHolderListener;

import android.app.Activity;
import android.os.Bundle;
import android.provider.Settings.SettingNotFoundException;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private ListView lv;
	private List<Bean> list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lv = (ListView) findViewById(R.id.lv);
		list = new ArrayList<Bean>();
		list.add(new Bean("吉姆", R.drawable.ic_launcher));
		list.add(new Bean("王磊", R.drawable.ic_launcher));
		list.add(new Bean("克里斯", R.drawable.ic_launcher));
		list.add(new Bean("拓本", R.drawable.ic_launcher));
		
		lv.setAdapter(new CommonAdapter(this, list, R.layout.cell, new OnGetViewHolderListener() {

			@Override
			public void setConvertView(ViewHolder holder, int position) {
				// TODO Auto-generated method stub
				holder.setText(R.id.tv, list.get(position).getName());
				holder.setImageResource(R.id.iv, list.get(position).getPic());
			}			
		}));
	}
}
