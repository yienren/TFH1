package TFH;

/**
 * Created by Administrator on 15-11-27.
 */
public class tfhbean {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public PP getScale() {
        return Scale;
    }

    public void setScale(PP scale) {
        Scale = scale;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int a;
   public int b;
   public PP Scale;
    public int c;
   public int d;

    public tfhbean(int a, int b, PP scale, int c, int d) {
        this.a = a;
        this.b = b;
        Scale = scale;
        this.c = c;
        this.d = d;
    }
}
