/**
 * privateのコンストラクタからenum型でシングルトン特性を強制する
 * @author tnnsst35
 */
public class Main {

    public static void main(String[] args) {
        Mickey mickey = Mickey.INSTANCE;
        Minnie minnie = Minnie.getInstance();
        Duffy  duffy  = Duffy.INSTANCE;
    }

}
