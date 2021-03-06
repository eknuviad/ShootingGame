package hk.ust.cse.comp107x.shootinggame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/**
 * Created by eknuviad on 09/08/18.
 */
public class Score {

    private Paint paint;
    private int score;

    // Constructor
    public Score(int color) {
        paint = new Paint();
        // Set the font face and size of drawing text
        paint.setTypeface(Typeface.MONOSPACE);
        paint.setTextSize(24);
        paint.setColor(color);

        // TODO initialize score
        score = 0;
    }

    public void incrementScore() {
        // TODO Increment score
        score += 1;
    }

    public void decrementScore() {
        // TODO Decrement score
        score -= 1;
    }

    public int getScore() { return score; }

    public void draw(Canvas canvas) {

        // TODO use drawText(String, x co-ordinate, y-coordinate, paint) to
        // draw text on the canvas. Position the text at (10,30).
        canvas.drawText("Score: " + Integer.toString(score),10, 30, paint );
    }
}