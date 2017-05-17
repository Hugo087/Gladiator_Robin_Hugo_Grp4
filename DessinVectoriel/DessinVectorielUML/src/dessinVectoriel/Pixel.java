package dessinVectoriel;

public class Pixel {
    /**
     * @attribute
     */
    private int x;

    /**
     * @attribute
     */
    private int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pixel(Pixel p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Integer getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static Integer distance(Pixel p1, Pixel p2) {
        int distanceX;
        int distanceY;
        distanceX = Math.abs(p1.x - p2.x);
        distanceY = Math.abs(p1.y - p2.y);
        return (int) Math.round(Math.sqrt(distanceY * distanceY + distanceX * distanceX));     
    }

    public void translater(int deltaX, int deltaY) {
        this.x = this.x + deltaX;
        this.y = this.y + deltaY;
    }
}
