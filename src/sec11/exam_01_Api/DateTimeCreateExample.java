package sec11.exam_01_Api;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {
    public static void main(String[] args) throws InterruptedException {
        // 날짜 얻기
        LocalDate currentDate = LocalDate.now();
        System.out.println("현재 날짜 : " + currentDate);

        LocalDate targetDate = LocalDate.of(2014, 5, 10);
        System.out.println("타겟날짜 : " + targetDate);

        // 시간얻기
        LocalTime currentTime = LocalTime.now();
        System.out.println("현재시각 : " + currentTime);

        LocalTime targetTime = LocalTime.of(6, 30, 15, 0);
        System.out.println("타겟시각 : " + targetTime);

        //날짜와 시간얻기
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("현재 시간 날짜 : " + localDateTime);

        LocalDateTime targetDateTime = LocalDateTime.of(2024, 5, 10, 6, 30, 0, 0);
        System.out.println("타겟 시간 날짜 : " + targetDateTime);

        // 협정 세계시와 시간존(timezone)
        ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println("협정 세계시 : " + utcDateTime);

        ZonedDateTime newyorkTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("뉴욕 시간존 : " + newyorkTime);

        // 특정 시점의 타임스탬프 얻기
        Instant instant = Instant.now();
        Thread.sleep(10);

        Instant instant1 = Instant.now();
        if (instant.isBefore(instant1)){
            System.out.println("instant가 빠릅니다.");
        } else if (instant.isAfter(instant1)){
            System.out.println("instant가 늦습니다");
        } else {
            System.out.println("동일한 시간입니다.");
        }
        System.out.println("차이(nanos) : " + instant.until(instant1, ChronoUnit.NANOS));
    }
}
