import java.util.*;
import java.io.*;

// インスタンス
public class Vtuber {
    protected Scanner stdIn;
    private int No=0;
    private int id;
    private String name;
    private String Explanation;

    // コンストラクタ
    Vtuber(String n,String exn){
        this.id=++No;
        this.name=n;
        this.Explanation=exn;
    }

    // setterとgeteerを設定
    public String getName() {return name;}
    public String getExplanation() {return Explanation;}
    public int getId() {return id;}

    public void setName(String name) {this.name = name;}
    public void setExplanation(String explanation) {Explanation = explanation;}
    public void setId(int id) {this.id = id;}

    // 読み取ったテキストファイルをリストに入れた
    public ArrayList<Vtuber> createNewInstance(BufferedReader br){
        String line;
        // リストに入れたものを変数に入れる
        ArrayList<Vtuber> vList=new ArrayList<>();

        try{
            // テキストファイルの中身がなくなるまでループする
            while ((line = br.readLine()) != null) {
                // カンマで分割
                String[] parts = line.split(",");

                // 二つの情報を取得
                if (parts.length == 2) {
                    String n = parts[0].trim();
                    String exn = parts[1].trim();

                    // 名前と説明文をpersonにいれる
                    Vtuber person=new Vtuber(n,exn);
                    vList.add(person);
                } else {
                    // カンマ区切りの形式が正しくない場合の処理
                    System.err.println("Invalid format in line: " + line);
                }
            }
        // ファイルのエラーが起きたときエラーを表示する
        } catch(IOException e){
            System.out.println(e);
        }
        
        return vList;
    }

    // この機能を使用したときに表示する
    public void printExplanation(){
        System.out.println("名前："+this.name);
        System.out.println("説明:"+this.Explanation);
    }


}
