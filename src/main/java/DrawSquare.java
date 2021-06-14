import com.google.inject.Inject;

public class DrawSquare implements DrawShape{
    String color;
    Integer edge;

    @Inject
    public DrawSquare(@ColorValue String color,@EdgeValue Integer edge) {
        super();
        this.color = color;
        this.edge = edge;
    }

    @Override
    public void draw() {
        System.out.println("Drawing shape of color "+color+" and edge "+edge);
    }
}
