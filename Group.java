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
        Gemes game = new Gemes();
        Seeds seeds = new Seeds();
        Tree tree = new Tree();
        Crab crab = new Crab();
        LvEx lvex = new LvEx();
        Which which = new Which();
        SMC smc = new SMC();
        Posanke posanke = new Posanke();
        Tulip tulip = new Tulip();
        Star star = new Star();
        Red_Organization red_Organization = new Red_Organization();
        Night night = new Night();
        Mananatu mananatu = new Mananatu();
        Meifu meifu = new Meifu();
        Valutu valutu = new Valutu();
        School school = new School();
        Eden eden = new Eden();
        Ranunculus ranunculus = new Ranunculus();
        Voltaction voltaction = new Voltaction();
        Ideos ideos = new Ideos();
        Oriens oriens = new Oriens();
        Ddytica ddytica = new Ddytica();
        Mitarasidan mitarasidan = new Mitarasidan();
        Other other = new Other();
        try{
            // 入力してもらい
            int input = stdIn.nextInt();
            // 選択されたらそのクラスを読み取り実行させる
            switch (input) {
                case 0 : one.play(); break;
                case 1 : two.play(); break;
                case 2 : game.play(); break;
                case 3 : seeds.play(); break;
                case 4 : tree.play(); break;
                case 5 : crab.play(); break;
                case 6 : lvex.play(); break;
                case 7 : which.play(); break;
                case 8 : smc.play(); break;
                case 9 : posanke.play(); break;
                case 10 : tulip.play(); break;
                case 11 : star.play(); break;
                case 12 : red_Organization.play(); break;
                case 13 : night.play(); break;
                case 14 : mananatu.play(); break;
                case 15 : meifu.play(); break;
                case 16 : valutu.play(); break;
                case 17 : school.play(); break;
                case 18 : eden.play(); break;
                case 19 : ranunculus.play(); break;
                case 20 : voltaction.play(); break;
                case 21 : ideos.play(); break;
                case 22 : oriens.play(); break;
                case 23 : ddytica.play(); break;
                case 24 : mitarasidan.play(); break;
                case 25 : other.play(); break;
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
