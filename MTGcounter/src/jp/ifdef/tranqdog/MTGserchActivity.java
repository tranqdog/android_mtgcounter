package jp.ifdef.tranqdog;


import org.w3c.dom.Text;

import jp.ifdef.tranqdog.R.id;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class MTGserchActivity extends Activity implements View.OnClickListener {
	private WebView webview;
	private EditText et;
	private ImageButton btn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        setContentView(R.layout.search);
        webview = (WebView)findViewById(id.webView1);
        et = (EditText)findViewById(id.editText1);

        btn = (ImageButton)findViewById(id.imageButton1);
        btn.setOnClickListener(this);
        webview.setWebViewClient(new WebViewClient());
    }

	public void onClick(View arg0) {
		upd();
	}

	
	/*webViewを使う*/
	private void upd(){
		String serchtext = et.getText().toString();
		String url1 = "http://m.wisdom-guild.net/search/?q=";
		String url = url1 + serchtext;
		webview.loadUrl(url);
		webview.requestFocus();
	}

	
	/* webView内で戻るボタンを押した時にwebだけ戻る */
	@Override
	public boolean onKeyDown(int KeyCode,KeyEvent e){
		if(KeyCode == KeyEvent.KEYCODE_BACK){
			webview.goBack();
			return true;			
		}
		return super.onKeyDown(KeyCode, e);
	}
	
	
	
	/* メニュー */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 0, Menu.NONE, "戻る");
        menu.add(Menu.NONE, 1, Menu.NONE, "終了");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

    	switch(item.getItemId()){
    	case 0:
    		finish();
    		break;
    	case 1:

    	}
		return true;
    }

}
