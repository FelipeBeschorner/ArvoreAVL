
public class AvlNode {
    protected int height;       // Altura
    protected int key;
    protected AvlNode left, right;

    public AvlNode ( int number, AvlNode lt, AvlNode rt ) {
        key = number;
        left = lt;
        right = rt;
        height   = 0;
    }
}