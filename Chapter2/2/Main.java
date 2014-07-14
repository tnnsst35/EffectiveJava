/**
 * 数多くのコンストラクタパラメータに直面した時にはビルダーを検討する
 * @author tnnsst35
 */
public class Main {

    public static void main(String[] args) {
        Card card1 = new Card.Builder().name("ブラックマジシャン").type(CardType.CHARACTER).atk(2500).def(2100).build();
        Card card2 = new Card.Builder().name("サンダーボルト").type(CardType.MAGIC).build();
        Card card3 = new Card.Builder().name("落とし穴").type(CardType.TRAP).build();

        System.out.println(card1.getName());
        System.out.println(card2.getName());
        System.out.println(card3.getName());
    }

}
