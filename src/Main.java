public class Main {
    public static void main(String[] args) {
        System.out.println("дз 1");
        System.out.println("# 1");
        {
            for(int i=1;i<11;i++){
                System.out.println(i);
            }
        }
        System.out.println("# 2");
        {
            for(int i=10;i>0;i--){
                System.out.println(i);
            }
        }
        System.out.println("# 3");
        {
            for(int i=0;i<18;i++){
                System.out.println(i);
            }
        }
        System.out.println("# 4");
        {
            for(int i=10;i>-11;i--){
                System.out.println(i);
            }
        }
        System.out.println("дз 2");
        System.out.println("# 1");
        {
            for(int i=1904;i<=2096;i=i+4){
                System.out.println("Вис. год: "+i);
            }
        }
        System.out.println("# 2");
        {
            for(int i=7;i<=98;i=i+7){
                System.out.println(i);
            }
        }
        System.out.println("# 3");
        {
            for(int i=1;i<=512;i=i*2){
                System.out.println(i);
            }
        }
        System.out.println("Дз 3");
        System.out.println("# 1");
        {
            for(int i=1;i<=12;i++){
                System.out.println("Месяц"+ i +" , сумма накоплений равна "+ i*29000 +" рублей");
            }
        }
        System.out.println("# 2");
        {
            for(int i=1;i<=12;i++){
                System.out.println("Месяц"+ i +" , сумма накоплений равна "+ i*29000*1.01 +" рублей");
            }
        }
    }
}