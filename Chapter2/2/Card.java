/**
 * カード
 * @author tnnsst35
 */
public class Card {

    private String   name;
    private CardType type;
    private int      atk;
    private int      def;

    /**
     * コンストラクタ
     */
    private Card(Builder builder) {
        this.name = builder.name;
    }

    /**
     * nameを返す
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static class Builder {

        private String   name;
        private CardType type;
        private int      atk;
        private int      def;

        public Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder type(CardType type) {
            this.type = type;
            return this;
        }

        public Builder atk(int atk) {
            this.atk = atk;
            return this;
        }

        public Builder def(int def) {
            this.def = def;
            return this;
        }

        public Card build() {
            return new Card(this);
        }

    }

}
