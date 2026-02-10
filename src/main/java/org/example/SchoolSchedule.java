package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SchoolSchedule {

    private final Map<String, List<String>>  schedule = new HashMap<>();

// constructor
    public SchoolSchedule() {

        schedule.put("Monday", List.of("მათემატიკა", "ინგლისური", "ქართული ენა", "ხელოვნება", "სამოქალაქო განათლება"));
        schedule.put("Tuesday", List.of("ქართული ლიტერატურა", "ინგლისური", "მათემატიკა", "ხელოვნება", "იტალიური"));
        schedule.put("Wednesday", List.of("მათემატიკა", "ინგლისური", "ქართული ენა", "მუსიკა", "ისტორია"));
        schedule.put("Thursday", List.of("მათემატიკა", "ინგლისური", "ქართული ლიტერატურა", "ხელოვნება", "იტალიური"));
        schedule.put("Friday", List.of("ქართული ლიტერატურა", "ინგლისური", "მუსიკა", "ისტორია", "მათემატიკა"));
        schedule.put("Saturday", List.of("დღეს არ არის გაკვეთილები"));
        schedule.put("Sunday", List.of("დღეს არ არის გაკვეთილები"));


    }

    public void printScheduleForDay(String day) {
        List<String> lesson = schedule.get(day);

        if (day.isEmpty()) {
            System.out.println("The day doesn't exist");
        } else {
            System.out.println("Lessons for " + day + ":" + lesson);
        }


    }
}



