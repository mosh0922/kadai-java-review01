
public class Review01 {

    public static void main(String[] args) {

            //税抜価格を代入
            int price=1500;
            //税率を代入
            double tax_r=0.10;

            int addtax = tax(price,tax_r);
            int totalprice=price+addtax;


            //各金額を実行
            System.out.println(price+"円"+"の商品の税込価格は"+totalprice+"円"+"(消費税は"+addtax+"円)です。");
        }
           //消費税を計算するメソット
           public static int tax(int price,double tax_r){
           return(int)(price*tax_r);
        }

             }
