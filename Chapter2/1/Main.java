/**
 * コンストラクタの代わりにstaticファクトリーメソッドを検討する
 * @author tnnsst35
 */
public class Main {

    public static void main(String[] args) {
        // コンストラクタを呼び出してインスタンスを取得する
        Card card1 = new Card();
        card1.setName("ブルーアイズホワイトドラゴン");
        System.out.println(card1.getName());

        // ファクトリーメソッドを呼び出してインスタンスを取得する
        // 名前が明確
        Card card2 = Card.newInstance();
        card2.setName("レッドアイズブラックドラゴン");
        System.out.println(card2.getName());
    }

}
