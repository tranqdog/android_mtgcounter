package jp.ifdef.tranqdog;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.view.View;

public class CounterView extends View {

	public CounterView(Context context) {
		super(context);
		setFocusable(true);
	}
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 通常はグラフィックを描画するコードをここに記述する。
        canvas.drawColor(Color.BLUE);
    }
}
