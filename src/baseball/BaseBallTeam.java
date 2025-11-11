package baseball;

     public class BaseBallTeam {
          //フィールド
         protected String name;      //チーム名
         protected int win;          //勝ち数
         protected int lose;         //負け数
         protected int draw;         //引き分け数


     public BaseBallTeam(String name,int win,int lose,int draw ){
         //コンストラクタ
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
     }

     public double getRate() {
         //勝率の計算式とその値の格納
        double syouritu = ((double)win / ((double)win + (double)lose));
        return syouritu;
     }

     public void report() {
         //画面にチームの成績を表示
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" +  draw + "分、勝率は" + getRate() + "です。");
     }
}