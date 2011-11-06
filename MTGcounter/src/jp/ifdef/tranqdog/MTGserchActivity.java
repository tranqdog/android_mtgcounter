package jp.ifdef.tranqdog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MTGserchActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SerchView serch_view = new SerchView(this);
        setContentView(serch_view);
    }
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
