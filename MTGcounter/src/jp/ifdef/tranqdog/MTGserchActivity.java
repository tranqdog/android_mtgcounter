package jp.ifdef.tranqdog;

import android.app.Activity;
import android.os.Bundle;

public class MTGserchActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SerchView serch_view = new SerchView(this);
        setContentView(serch_view);
    }
}
