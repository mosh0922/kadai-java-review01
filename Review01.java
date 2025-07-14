package sample;

public class Review01 {

    public static void main(String[] args) {
        //税抜価格を代入
        int price=1500;
        //税率を代入
        double tax_r=0.10;

        int tax = addtax(price,tax_r);
        int totalprice=price+tax;
        int[]resuld=taxprice(price,tax_r);
        //各金額を実行
        System.out.println(price+"円"+"の商品の税込価格は"+resuld[1]+"円"+"(消費税は"+resuld[0]+"円)です。");


    }
     //消費税を計算するメソット
    public static int addtax(int price,double tax_r){
    return(int)(price*tax_r);
    }
    //消費税と税込金額を呼び出すメソット
        public static int [] taxprice(int price,double tax_r) {
            int tax = addtax(price,tax_r);
            int totalprice =price+tax;
            return new int[] {tax,totalprice};







         }
    }






