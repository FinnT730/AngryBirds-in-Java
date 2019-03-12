import java.awt.*;

public class Box extends Component {

    private static int x;
    private static int y;
    private static int w;
    private static int h;


    Box() {

    }

    Box(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.create(x,y,w,h);
        g.setColor(Color.WHITE);
        g.fillRect(x,y,w,h);


    }

    @Override
    public int hashCode() {

        int salt = 826183;
        int str = Integer.valueOf("code",978937).hashCode();

        int res = this.x + this.y + this.w + this.h + str;
        res *= salt;

        return super.hashCode() + res;
    }
}
