/**
 * ミニー
 * ファクトリーメソッドによるシングルトン
 * @author tnnsst35
 */
public class Minnie {

    private static final Minnie INSTANCE = new Minnie();

    public static Minnie getInstance() {
        return Minnie.INSTANCE;
    }

    private Minnie() {}

}
