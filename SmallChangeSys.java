package SmallChangeSys;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        boolean loop =true;
        Scanner scanner = new Scanner(System.in);
        String key;
        String details="------------钱包明细-----------";
        double money;
        double balence = 0;
        Date date;//表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd HH:mm");
        String reason;


        do {
            System.out.println("\n\n========你的钱包菜单========");

            System.out.println("\t\t1.你的钱包明细");
            System.out.println("\t\t2.收益");
            System.out.println("\t\t3.消费");
            System.out.println("\t\t4.退 出");
            System.out.println("请输入你想查询的：");
            key = scanner.next();
            switch(key){
                case "1":
                    if(details.equals("------------钱包明细-----------")){
                        System.out.println("\n暂无明细，请多多使用本功能吧！");
                    }else System.out.println(details);
                    break;
                case "2":
                    System.out.println("您的收益为：");
                    money = scanner.nextDouble();
                    if(money<0){
                        System.out.println("亏欠的买卖还是别做了");
                        break;
                    }
                    if(money==0){
                        System.out.println("白嫖的挺好的");
                    }
                    balence += money;
                    date = new Date();
                    if(money==0){
                    details += "\n白嫖\t"+money+"\t" + sdf.format(date) + "\t" +"余额\t"+balence;}
                    else details += "\n收益入账\t"+money+"\t" + sdf.format(date) + "\t" +"余额\t"+balence;
                    break;
                case "3":
                    System.out.println("你的消费：");
                    money = scanner.nextDouble();
                    System.out.println("消费项目：");
                    reason= scanner.next();
                    balence -= money;
                    date = new Date();
                    details += "\n"+reason+"\t"+money+"\t" + sdf.format(date) + "\t" +"余额\t"+balence;

                    break;
                case "4":
                    System.out.println("退出？");
                    loop = false;
                    break;
                default:
                    System.out.println("都说了让你输入1-4，听不懂吗？");
                    break;
            }
        }while (loop);
        System.out.println("=======已经退出了QAQ=======");
    }
}
