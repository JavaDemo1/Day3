import java.time.LocalDate;

public class test {
    public static void main(String[] args) {
        LocalDate export=LocalDate.of(2022,12,1);
        LocalDate now=LocalDate.now();
        if (export.minusDays(30).compareTo(now)>0){
            if (export.plusDays(60).isAfter(now)){
                System.out.println("证件即将到期");
            }
            System.out.println("证件失效");
        }else {
            System.out.println("正常");
        }
//        String sp = "2022-10-28";
//        LocalDateTime lt = LocalDateTime.of(2022, 10, 9, 9, 20);
//        System.out.println(lt.toString().substring(0, 10));
//        LocalDate time2 = LocalDate.now();
//        System.out.println(time2.toString());
    }

}
