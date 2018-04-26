import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
            while(cin.hasNext()){
                String date =new String();
                date = cin.next();
                
                int []mon= {31,28,31,30,31,30,31,31,30,31,30,31};
                int first = date.indexOf('/');
                int second=date.indexOf("/", first+1);
                int y=Integer.parseInt(date.substring(0, first));
                int m=Integer.parseInt(date.substring(first+1,second));
                int d=Integer.parseInt(date.substring(second+1));
                
                if(m==1) {
                    System.out.println(d);
                    continue;
                }
                if((y%4==0&&y%100!=0)||(y%400==0)) {//闰年
                    mon[1]=29;
                    for(int i=0;i<m-1;i++)
                        d=d+mon[i];
                }
                else {
                    for(int i=0;i<m-1;i++)
                        d=d+mon[i];
                }
            System.out.println(d);
            } 
            cin.close();
    }
}
