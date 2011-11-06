package jp.ifdef.tranqdog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class SerchView extends View {
	public SerchView(Context context) {
		super(context);
		setFocusable(true);
	}
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 通常はグラフィックを描画するコードをここに記述する。
        Paint paint = new Paint();
        canvas.drawColor(Color.GRAY);//背景色
        paint.setColor(Color.BLACK);
        paint.setTextSize(24);
        paint.setAntiAlias(true);
        canvas.drawText("検索するカード名を入力して下さい", 50, 50, paint);
    }
}
