package jp.ifdef.tranqdog;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MTGcounterActivity extends Activity {    

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CounterView counter_view = new CounterView(this);
        
        setContentView(counter_view);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(Menu.NONE, 0, Menu.NONE, "検索");
        menu.add(Menu.NONE, 1, Menu.NONE, "設定");
        menu.add(Menu.NONE, 2, Menu.NONE, "ヘルプ");
        menu.add(Menu.NONE, 3, Menu.NONE, "終了");

        return super.onCreateOptionsMenu(menu);
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

    	switch(item.getItemId()){
    	case 0:
        	Intent intent = new Intent(MTGcounterActivity.this, MTGserchActivity.class);
    		startActivity(intent);
    		break;
    		
    	case 1:
    		
    	}
		return true;	
    }
    
}