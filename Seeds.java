import java.io.*;
import java.util.*;

// Seedsを読み取られたときのクラス
class Seeds extends One{
    @Override
    public void play() {
        // エラーを表示してくれるクラスを定義
        HandleException he=new HandleException();
        Scanner stdIn = new Scanner(System.in, "UTF-8");
        System.out.println("-------------------------------------");
        System.out.println("Seedsのだれを調べたいですか？");
        System.out.println("0../ドーラ");
        System.out.println("1../轟京子");
        System.out.println("2../シスター・クレア");
        System.out.println("3../花畑チャイカ");
        System.out.println("4../社築");
        System.out.println("5../鈴木勝");
        System.out.println("6../緑仙");
        System.out.println("7../卯月コウ");
        System.out.println("8../神田笑一");
        System.out.println("9../飛鳥ひな");
        System.out.println("10../春崎エアル");
        System.out.println("11../雨森小夜");
        System.out.println("12../鷹宮リオン");
        System.out.println("13../舞元啓介");
        System.out.println("14../竜胆尊");
        System.out.println("15../でびでびでびる");
        System.out.println("16../桜凛月");
        System.out.println("17../町田ちま");
        System.out.println("18../ジョー・力一");
        System.out.println("19../成瀬鳴");
        System.out.println("20../ベルモンド・バンデラス");
        System.out.println("21../矢車りね");
        System.out.println("22../夢追翔");
        System.out.println("23../黒井しば");
        System.out.println("-------------------------------------");
        // 説明文のあるテキストファイルを変数に入れる
        String filePath = "seeds.txt";
        try{
            int num = stdIn.nextInt();
            // 指定したテキストファイルを読み取る
            FileReader fr = new FileReader(filePath);
            // 指定されたテキストファイルを一行ずつ読み取る
            BufferedReader br = new BufferedReader(fr);

            // Vtuberクラスを定義する
            Vtuber vtb=new Vtuber(null, null);
            // リストも定義して
            ArrayList<Vtuber> vList=new ArrayList<>();

            vList=vtb.createNewInstance(br);

            
            // 読み取ったテキストファイルをそれぞれ閉じる
            br.close();
            fr.close();
            
            boolean flg=true;
            Vtuber result=null;

            // switchで入力されたものに合わせて表示する
            switch (num) {
                case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23 ->
                    result=vList.get(num);
                default->
                    flg=false;
            }

            // 用意した選択肢を選んだらその数字に合わせて表示し
            if(flg){
                result.printExplanation();
            // 選択肢外を選んだら終了し表示する
            }else{
                System.out.println("無効な数値のため終了します");
            }

        // もし違うものを選択された場合は表示して終了させる
        } catch(Exception e){
            he.handleException(new MessageException("選択肢にないので終了します"));
        }
    }
    // ファイルを閉じる
    @Override
    public void stop(){
        System.exit(0);
    }
}