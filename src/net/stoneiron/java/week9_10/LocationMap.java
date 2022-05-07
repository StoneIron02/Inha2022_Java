package net.stoneiron.java.week9_10;

import java.util.HashMap;
import java.util.Scanner;

class Location {
    private double longitude; // 위도
    private double latitude; // 경도

    public Location(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setLocation(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }
}

public class LocationMap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Location> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            System.out.print("도시 위도 경도 입력 (띄어쓰기로 구분) >> ");
            String city = scanner.next();
            int longitude = scanner.nextInt();
            int latitude = scanner.nextInt();
            map.put(city, new Location(longitude, latitude));
        }

        System.out.println();
        System.out.println("도시 위도 경도");
        for (String key : map.keySet())
            System.out.println(key + " " + map.get(key).getLongitude() + " " + map.get(key).getLatitude());
    }
}
