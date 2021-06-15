import java.util.Arrays;

public class SelectionControlAssignment7 {
    public static void main(String[] args) {
        int day = 3;
        int month = 5;
        int year = 2020;
        boolean leapyear=((!(year%100==0)&& (year%4==0))|| year%400==0)?true:false;
    

        String month30 ="3 5 7 8 10 12";
        String month31 ="1 6 9 11";

        if(month==2){
            if ((leapyear && day==29)||(!(leapyear) && day >=28)){
                day=1;
                month=3;
            }}
            else if (contain(month30,""+month) && day>=30){
                day=1;
                month+=1;
            }else if(contain(month31,""+month)&& day>=31){
                day=1;
                month+=1;
            }else if (month==12 && day>=31){
                day=1;
                month=1;
                year+=1;
            }else{
                day+=1;
            }
        System.out.println(day+" "+month+" "+ year);

        }

    static boolean contain(String month, String target){
        String[] montharray = month.split(" ");
        return Arrays.asList(montharray).contains(target);
    }
}
