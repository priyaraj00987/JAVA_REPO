package WIELY;
enum weekday{
    monday,wed, thrus
}
public class enum_ex {
    public static void main(String[] args) {
        weekday day=weekday.monday;
for(weekday w:weekday.values()){
    System.out.println(w);
}
        System.out.println(day+"one at a time");
    }

}
