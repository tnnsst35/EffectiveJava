/**
 * カード
 * @author tnnsst35
 */
public class Card {

    private String name;

    /**
     * 新しいCardインスタンスを返す
     * @return Cardインスタンス
     */
    public static Card newInstance() {
        return new Card();
    }

    /**
     * コンストラクタ
     */
    public Card() {
        this.name = "";
    }

    /**
     * nameを返す
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * nameに代入する
     * @param name カード名
     */
    public void setName(String name) {
        this.name = name;
    }

}
