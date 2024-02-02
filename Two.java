import java.io.*;
import java.util.*;

// 一期生を読み取られたときのクラス
class Two extends One{
    @Override
    public void play() {
        // エラーを表示してくれるクラスを定義
        HandleException he=new HandleException();
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");
        System.out.println("-------------------------------------");
        System.out.println("2期生のだれを調べたいですか？");
        System.out.println("0../家長むぎ");
        System.out.println("1../字志海いちご");
        System.out.println("2../ギルザレン三世");
        System.out.println("3../剣持刀也");
        System.out.println("4../鈴鹿詩子");
        System.out.println("5../伏見ガク");
        System.out.println("6../文野環");
        System.out.println("7../物述有栖");
        System.out.println("8../森中花咲");
        System.out.println("9../夕陽リリ");
        // 説明文のあるテキストファイルを変数に入れる
        String filePath = "two_period.txt";
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
                case 0,1,2,3,4,5,6,7,8,9 ->
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
