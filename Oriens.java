import java.io.*;
import java.util.*;

// ゲーマーズを読み取られたときのクラス
class Oriens extends One{
    @Override
    public void play() {
        // エラーを表示してくれるクラスを定義
        HandleException he=new HandleException();
        Scanner stdIn = new Scanner(System.in, "UTF-8");
        System.out.println("-------------------------------------");
        System.out.println("オリエンスのだれを調べたいですか？");
        System.out.println("0../佐伯イッテツ");
        System.out.println("1../赤城ウェア");
        System.out.println("2../宇佐美リト");
        System.out.println("3../緋八マナ");
        System.out.println("-------------------------------------");
        // 説明文のあるテキストファイルを変数に入れる
        String filePath = "oriens.txt";
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
                case 0,1,2,3 ->
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