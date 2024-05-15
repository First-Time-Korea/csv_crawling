package com.example.crawling;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CSVToDatabase {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/firsttimeinkorea?serverTimezone=UTC";
    private static final String USER = "ssafy";
    private static final String PASSWORD = "ssafy";
    private static int START_NUM = 5000000;
    private static String THEMA_CODE = "E";

    public static void main(String[] args) {
        String csvFile = "KC_MEDIA_VIDO_AREA_DATA_2023.csv";
//        String csvFile = "test.csv";

        try (CSVReader reader = new CSVReader(new FileReader(csvFile));
             Connection conn = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD)) {
            String[] nextLine;
            reader.readNext(); //첫번째 줄은 헤더라 건너뛰기

            while ((nextLine = reader.readNext()) != null) {
                int contentId = START_NUM + Integer.parseInt(nextLine[0]);
                String categoryCode = THEMA_CODE + Category.of(nextLine[1]).getCode();
                String title = nextLine[3];
                String overview = "<" + nextLine[2] + "> " + nextLine[5];
                String addr1 = nextLine[9];
                double latitude = Double.parseDouble(nextLine[10]);
                double longitude = Double.parseDouble(nextLine[11]);
                String tel = nextLine[12];
                String modifiedTime = nextLine[13];

                String[] codes = addr1.split(" "); //경기도
                int sidoCode = Sido.of(codes[0]).getCode(); //고양시
                int gugunCode = LocatcionCodes.findGugunCode(sidoCode, codes[1]); //sido_code, gugun_name


                String sqlInfo = "INSERT INTO attraction_info (content_id, sido_code, gugun_code, title, addr1, tel, latitude, longitude) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sqlInfo)) {
                    pstmt.setInt(1, contentId);
                    pstmt.setInt(2, sidoCode);
                    pstmt.setInt(3, gugunCode);
                    pstmt.setString(4, title);
                    pstmt.setString(5, addr1);
                    pstmt.setString(6, tel);
                    pstmt.setDouble(7, latitude);
                    pstmt.setDouble(8, longitude);
//                    System.out.println(pstmt);
                    pstmt.executeUpdate();
                }

                // Insert into attraction_detail
                String sqlDetail = "INSERT INTO attraction_detail (content_id, thema_code, category_code, modified_time) VALUES (?, ?, ?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sqlDetail)) {
                    pstmt.setInt(1, contentId);
                    pstmt.setString(2, THEMA_CODE);
                    pstmt.setString(3, categoryCode);
                    pstmt.setString(4, modifiedTime);
//                    System.out.println(pstmt);
                    pstmt.executeUpdate();
                }

                // Insert into attraction_description
                String sqlDescription = "INSERT INTO attraction_description (content_id, overview) VALUES (?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(sqlDescription)) {
                    pstmt.setInt(1, contentId);
                    pstmt.setString(2, overview);
//                    System.out.println(pstmt);
                    pstmt.executeUpdate();
                }
            }
        } catch (IOException | CsvValidationException | SQLException e) {
            e.printStackTrace();
        }
    }

}