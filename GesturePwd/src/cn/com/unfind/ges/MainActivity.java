package cn.com.unfind.ges;

import cn.com.unfind.ges.view.NinePointLineView;
import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
/**
 * ���ã����ԾŹ�����������
 * ���ߣ�unfind
 * ʱ�䣺2013��10��29�� 09:37:54
 * */
public class MainActivity extends Activity {
	
	private LinearLayout nine_con;//�Ź�������
	
	NinePointLineView nv;//�Ź���View
	
	TextView showInfo;
	
	boolean isSetFirst = false;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);//���ñ��ⲻ��ʾ
		
		setContentView(R.layout.main);
		
		nv = new NinePointLineView(MainActivity.this);
		
		nine_con = (LinearLayout)findViewById(R.id.nine_con);
		
		nine_con.addView(nv);
		
		showInfo = (TextView)findViewById(R.id.show_set_info);
		
		getSetPwd();
	
	}

	
	/**
	 * ���ã���ȡ������������ò���
	 * ���ߣ�unfind
	 * ʱ�䣺2013��10��29�� 14:20:36
	 * */
	public void getSetPwd(){
		
		SharedPreferences shareDate = getSharedPreferences("GUE_PWD", 0);
		
		isSetFirst = shareDate.getBoolean("IS_SET_FIRST", false);
		
		if(!isSetFirst){
			
			showInfo.setText("��������������");
			
			shareDate.edit().clear().commit();
			
		}else{
			
			showInfo.setText("���ٴ�ȷ����������");
			
		}
		
		boolean is_second_error = shareDate.getBoolean("SECOND_ERROR", false);
		
		if(is_second_error){
			
			showInfo.setText("�͵�һ�������������벻һ�£���������");
			
		}
		
	}

}
