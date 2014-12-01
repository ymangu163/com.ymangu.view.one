package cn.com.unfind.ges;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
/**
 * ���ã���ʾ�����������ý������
 * ���ߣ�unfind
 * ʱ�䣺2013��10��29�� 16:34:59
 * */
public class SetPwdResActivity extends Activity {
	
	private TextView showInfo;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.res);
		
		showInfo = (TextView)findViewById(R.id.res_info);
		
		SharedPreferences shareDate = getSharedPreferences("GUE_PWD", 0);
		
		String pwd = shareDate.getString("GUE_PWD", "NO HAVE PWD !");
		
		showInfo.setText("���óɳɹ��������õ����������ǣ�"+pwd);
	}
}
