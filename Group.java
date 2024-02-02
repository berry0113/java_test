import java.util.*;

class Group implements Start{
    @Override
        public void play() {
        HandleException he=new HandleException();
        Scanner stdIn = new Scanner(System.in);
        System.out.println("どのグループを参照したいですか？(半角数字でお願いします)");
            // グループを表示
        System.out.println("0../にじさんじ1期生");
        System.out.println("1../にじさんじ2期生");
        System.out.println("2../ゲーマーズ");
        System.out.println("3../SEEDs");
        System.out.println("4../さんばか");
        System.out.println("5../紅ズワイガニ");
        System.out.println("6../LvEx");
        System.out.println("7../マジョリティー");
        System.out.println("8../SMC組");
        System.out.println("9../ぽさんけ");
        System.out.println("10../チューリップ組");
        System.out.println("11../織姫星");
        System.out.println("12../赤の組織");
        System.out.println("13../夜王国");
        System.out.println("14../まななつ");
        System.out.println("15../メイフ");
        System.out.println("16../バルツ");
        System.out.println("17../世怜音演劇同好会");
        System.out.println("18../エデン組");
        System.out.println("19../ラナンキュラス");
        System.out.println("20../ボルタクション");
        System.out.println("21../イディオス");
        System.out.println("22../オリエンス");
        System.out.println("23../ディティカ");
        System.out.println("24../みたらし団");
        System.out.println("25../その他");
        // 様々なクラスを変数に入れる
        One one = new One();
        Two two = new Two();
        try{
            // 入力してもらい
            int input = stdIn.nextInt();
            // 選択されたらそのクラスを読み取り実行させる
            switch (input) {
                case 0 : one.play(); break;
                case 1 : two.play(); break;
            }
        // 選択肢外のことをされたら終了させる
        } catch(InputMismatchException e){
            he.handleException(new MessageException("選択肢にないので終了します"));
        }
    }
    @Override
    public void stop(){
        System.exit(0);
    }

}
