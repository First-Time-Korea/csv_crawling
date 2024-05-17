package com.example.crawling;

import java.util.HashMap;
import java.util.Map;

public class LocatcionCodes {
    private static final Map<Integer, Map<String, Integer>> sidoGugunMap = new HashMap<>();

    static {
        Map<String, Integer> seoulGuguns = new HashMap<>();
        seoulGuguns.put("강남구", 1);
        seoulGuguns.put("강동구", 2);
        seoulGuguns.put("강북구", 3);
        seoulGuguns.put("강서구", 4);
        seoulGuguns.put("관악구", 5);
        seoulGuguns.put("광진구", 6);
        seoulGuguns.put("구로구", 7);
        seoulGuguns.put("금천구", 8);
        seoulGuguns.put("노원구", 9);
        seoulGuguns.put("도봉구", 10);
        seoulGuguns.put("동대문구", 11);
        seoulGuguns.put("동작구", 12);
        seoulGuguns.put("마포구", 13);
        seoulGuguns.put("서대문구", 14);
        seoulGuguns.put("서초구", 15);
        seoulGuguns.put("성동구", 16);
        seoulGuguns.put("성북구", 17);
        seoulGuguns.put("송파구", 18);
        seoulGuguns.put("양천구", 19);
        seoulGuguns.put("영등포구", 20);
        seoulGuguns.put("용산구", 21);
        seoulGuguns.put("은평구", 22);
        seoulGuguns.put("종로구", 23);
        seoulGuguns.put("중구", 24);
        seoulGuguns.put("중랑구", 25);
        sidoGugunMap.put(1, seoulGuguns);

        Map<String, Integer> incheonGuguns = new HashMap<>();
        incheonGuguns.put("계양구", 2);
        incheonGuguns.put("강화군", 1);
        incheonGuguns.put("미추홀구", 3);
        incheonGuguns.put("남동구", 4);
        incheonGuguns.put("동구", 5);
        incheonGuguns.put("부평구", 6);
        incheonGuguns.put("서구", 7);
        incheonGuguns.put("연수구", 8);
        incheonGuguns.put("옹진군", 9);
        incheonGuguns.put("중구", 10);
        sidoGugunMap.put(2, incheonGuguns);

        Map<String, Integer> daejeonGuguns = new HashMap<>();
        daejeonGuguns.put("대덕구", 1);
        daejeonGuguns.put("동구", 2);
        daejeonGuguns.put("서구", 3);
        daejeonGuguns.put("유성구", 4);
        daejeonGuguns.put("중구", 5);
        sidoGugunMap.put(3, daejeonGuguns);

        Map<String, Integer> daeguGuguns = new HashMap<>();
        daeguGuguns.put("남구", 1);
        daeguGuguns.put("달서구", 2);
        daeguGuguns.put("달성군", 3);
        daeguGuguns.put("동구", 4);
        daeguGuguns.put("북구", 5);
        daeguGuguns.put("서구", 6);
        daeguGuguns.put("수성구", 7);
        daeguGuguns.put("중구", 8);
        sidoGugunMap.put(4, daeguGuguns);

        Map<String, Integer> gwangjuGuguns = new HashMap<>();
        gwangjuGuguns.put("광산구", 1);
        gwangjuGuguns.put("남구", 2);
        gwangjuGuguns.put("동구", 3);
        gwangjuGuguns.put("북구", 4);
        gwangjuGuguns.put("서구", 5);
        sidoGugunMap.put(5, gwangjuGuguns);

        Map<String, Integer> busanGuguns = new HashMap<>();
        busanGuguns.put("강서구", 1);
        busanGuguns.put("금정구", 2);
        busanGuguns.put("기장군", 3);
        busanGuguns.put("남구", 4);
        busanGuguns.put("동구", 5);
        busanGuguns.put("동래구", 6);
        busanGuguns.put("부산진구", 7);
        busanGuguns.put("북구", 8);
        busanGuguns.put("사상구", 9);
        busanGuguns.put("사하구", 10);
        busanGuguns.put("서구", 11);
        busanGuguns.put("수영구", 12);
        busanGuguns.put("연제구", 13);
        busanGuguns.put("영도구", 14);
        busanGuguns.put("중구", 15);
        busanGuguns.put("해운대구", 16);
        sidoGugunMap.put(6, busanGuguns);

        // 울산광역시 구군 코드
        Map<String, Integer> ulsanGuguns = new HashMap<>();
        ulsanGuguns.put("중구", 1);
        ulsanGuguns.put("남구", 2);
        ulsanGuguns.put("동구", 3);
        ulsanGuguns.put("북구", 4);
        ulsanGuguns.put("울주군", 5);
        sidoGugunMap.put(7, ulsanGuguns);

        // 세종특별자치시 구군 코드
        Map<String, Integer> sejongGuguns = new HashMap<>();
        sejongGuguns.put("세종특별자치시", 1);
        sidoGugunMap.put(8, sejongGuguns);

        // 경기도 구군 코드
        Map<String, Integer> gyeongidoGuguns = new HashMap<>();
        gyeongidoGuguns.put("가평군", 1);
        gyeongidoGuguns.put("고양시", 2);
        gyeongidoGuguns.put("과천시", 3);
        gyeongidoGuguns.put("광명시", 4);
        gyeongidoGuguns.put("광주시", 5);
        gyeongidoGuguns.put("구리시", 6);
        gyeongidoGuguns.put("군포시", 7);
        gyeongidoGuguns.put("김포시", 8);
        gyeongidoGuguns.put("남양주시", 9);
        gyeongidoGuguns.put("동두천시", 10);
        gyeongidoGuguns.put("부천시", 11);
        gyeongidoGuguns.put("성남시", 12);
        gyeongidoGuguns.put("수원시", 13);
        gyeongidoGuguns.put("시흥시", 14);
        gyeongidoGuguns.put("안산시", 15);
        gyeongidoGuguns.put("안성시", 16);
        gyeongidoGuguns.put("안양시", 17);
        gyeongidoGuguns.put("양주시", 18);
        gyeongidoGuguns.put("양평군", 19);
        gyeongidoGuguns.put("여주시", 20);
        gyeongidoGuguns.put("연천군", 21);
        gyeongidoGuguns.put("오산시", 22);
        gyeongidoGuguns.put("용인시", 23);
        gyeongidoGuguns.put("의왕시", 24);
        gyeongidoGuguns.put("의정부시", 25);
        gyeongidoGuguns.put("이천시", 26);
        gyeongidoGuguns.put("파주시", 27);
        gyeongidoGuguns.put("평택시", 28);
        gyeongidoGuguns.put("포천시", 29);
        gyeongidoGuguns.put("하남시", 30);
        gyeongidoGuguns.put("화성시", 31);
        sidoGugunMap.put(31, gyeongidoGuguns);


// 강원도 구군 코드
        Map<String, Integer> gangwondoGuguns = new HashMap<>();
        gangwondoGuguns.put("강릉시", 1);
        gangwondoGuguns.put("고성군", 2);
        gangwondoGuguns.put("동해시", 3);
        gangwondoGuguns.put("삼척시", 4);
        gangwondoGuguns.put("속초시", 5);
        gangwondoGuguns.put("양구군", 6);
        gangwondoGuguns.put("양양군", 7);
        gangwondoGuguns.put("영월군", 8);
        gangwondoGuguns.put("원주시", 9);
        gangwondoGuguns.put("인제군", 10);
        gangwondoGuguns.put("정선군", 11);
        gangwondoGuguns.put("철원군", 12);
        gangwondoGuguns.put("춘천시", 13);
        gangwondoGuguns.put("태백시", 14);
        gangwondoGuguns.put("평창군", 15);
        gangwondoGuguns.put("홍천군", 16);
        gangwondoGuguns.put("화천군", 17);
        gangwondoGuguns.put("횡성군", 18);
        sidoGugunMap.put(32, gangwondoGuguns);

// 충청북도 구군 코드
        Map<String, Integer> chungcheongbukdoGuguns = new HashMap<>();
        chungcheongbukdoGuguns.put("괴산군", 1);
        chungcheongbukdoGuguns.put("단양군", 2);
        chungcheongbukdoGuguns.put("보은군", 3);
        chungcheongbukdoGuguns.put("영동군", 4);
        chungcheongbukdoGuguns.put("옥천군", 5);
        chungcheongbukdoGuguns.put("음성군", 6);
        chungcheongbukdoGuguns.put("제천시", 7);
        chungcheongbukdoGuguns.put("진천군", 8);
        chungcheongbukdoGuguns.put("청원군", 9);
        chungcheongbukdoGuguns.put("청주시", 10);
        chungcheongbukdoGuguns.put("충주시", 11);
        chungcheongbukdoGuguns.put("증평군", 12);
        sidoGugunMap.put(33, chungcheongbukdoGuguns);

// 충청남도 구군 코드
        Map<String, Integer> chungcheongnamdoGuguns = new HashMap<>();
        chungcheongnamdoGuguns.put("계룡시", 1);
        chungcheongnamdoGuguns.put("공주시", 2);
        chungcheongnamdoGuguns.put("금산군", 3);
        chungcheongnamdoGuguns.put("논산시", 4);
        chungcheongnamdoGuguns.put("당진시", 5);
        chungcheongnamdoGuguns.put("보령시", 6);
        chungcheongnamdoGuguns.put("부여군", 7);
        chungcheongnamdoGuguns.put("서산시", 8);
        chungcheongnamdoGuguns.put("서천군", 9);
        chungcheongnamdoGuguns.put("아산시", 10);
        chungcheongnamdoGuguns.put("예산군", 11);
        chungcheongnamdoGuguns.put("천안시", 12);
        chungcheongnamdoGuguns.put("청양군", 13);
        chungcheongnamdoGuguns.put("태안군", 14);
        chungcheongnamdoGuguns.put("홍성군", 15);
        sidoGugunMap.put(34, chungcheongnamdoGuguns);

        // 경상북도 구군 코드
        Map<String, Integer> gyeongsangbukdoGuguns = new HashMap<>();
        gyeongsangbukdoGuguns.put("경산시", 1);
        gyeongsangbukdoGuguns.put("경주시", 2);
        gyeongsangbukdoGuguns.put("고령군", 3);
        gyeongsangbukdoGuguns.put("구미시", 4);
        gyeongsangbukdoGuguns.put("군위군", 5);
        gyeongsangbukdoGuguns.put("김천시", 6);
        gyeongsangbukdoGuguns.put("문경시", 7);
        gyeongsangbukdoGuguns.put("봉화군", 8);
        gyeongsangbukdoGuguns.put("상주시", 9);
        gyeongsangbukdoGuguns.put("성주군", 10);
        gyeongsangbukdoGuguns.put("안동시", 11);
        gyeongsangbukdoGuguns.put("영덕군", 12);
        gyeongsangbukdoGuguns.put("영양군", 13);
        gyeongsangbukdoGuguns.put("영주시", 14);
        gyeongsangbukdoGuguns.put("영천시", 15);
        gyeongsangbukdoGuguns.put("예천군", 16);
        gyeongsangbukdoGuguns.put("울릉군", 17);
        gyeongsangbukdoGuguns.put("울진군", 18);
        gyeongsangbukdoGuguns.put("의성군", 19);
        gyeongsangbukdoGuguns.put("청도군", 20);
        gyeongsangbukdoGuguns.put("청송군", 21);
        gyeongsangbukdoGuguns.put("칠곡군", 22);
        gyeongsangbukdoGuguns.put("포항시", 23);
        sidoGugunMap.put(35, gyeongsangbukdoGuguns);

// 경상남도 구군 코드
        Map<String, Integer> gyeongsangnamdoGuguns = new HashMap<>();
        gyeongsangnamdoGuguns.put("거제시", 1);
        gyeongsangnamdoGuguns.put("거창군", 2);
        gyeongsangnamdoGuguns.put("고성군", 3);
        gyeongsangnamdoGuguns.put("김해시", 4);
        gyeongsangnamdoGuguns.put("남해군", 5);
        gyeongsangnamdoGuguns.put("밀양시", 6);
        gyeongsangnamdoGuguns.put("사천시", 7);
        gyeongsangnamdoGuguns.put("산청군", 8);
        gyeongsangnamdoGuguns.put("양산시", 9);
        gyeongsangnamdoGuguns.put("의령군", 10);
        gyeongsangnamdoGuguns.put("진주시", 11);
        gyeongsangnamdoGuguns.put("창녕군", 12);
        gyeongsangnamdoGuguns.put("창원시", 13);
        gyeongsangnamdoGuguns.put("통영시", 14);
        gyeongsangnamdoGuguns.put("하동군", 15);
        gyeongsangnamdoGuguns.put("함안군", 16);
        gyeongsangnamdoGuguns.put("함양군", 17);
        gyeongsangnamdoGuguns.put("합천군", 18);
        sidoGugunMap.put(36, gyeongsangnamdoGuguns);

// 전라북도 구군 코드
        Map<String, Integer> jeollabukdoGuguns = new HashMap<>();
        jeollabukdoGuguns.put("고창군", 1);
        jeollabukdoGuguns.put("군산시", 2);
        jeollabukdoGuguns.put("김제시", 3);
        jeollabukdoGuguns.put("남원시", 4);
        jeollabukdoGuguns.put("무주군", 5);
        jeollabukdoGuguns.put("부안군", 6);
        jeollabukdoGuguns.put("순창군", 7);
        jeollabukdoGuguns.put("완주군", 8);
        jeollabukdoGuguns.put("익산시", 9);
        jeollabukdoGuguns.put("임실군", 10);
        jeollabukdoGuguns.put("장수군", 11);
        jeollabukdoGuguns.put("전주시", 12);
        jeollabukdoGuguns.put("정읍시", 13);
        jeollabukdoGuguns.put("진안군", 14);
        sidoGugunMap.put(37, jeollabukdoGuguns);

// 전라남도 구군 코드
        Map<String, Integer> jeollanamdoGuguns = new HashMap<>();
        jeollanamdoGuguns.put("강진군", 1);
        jeollanamdoGuguns.put("고흥군", 2);
        jeollanamdoGuguns.put("곡성군", 3);
        jeollanamdoGuguns.put("광양시", 4);
        jeollanamdoGuguns.put("구례군", 5);
        jeollanamdoGuguns.put("나주시", 6);
        jeollanamdoGuguns.put("담양군", 7);
        jeollanamdoGuguns.put("목포시", 8);
        jeollanamdoGuguns.put("무안군", 9);
        jeollanamdoGuguns.put("보성군", 10);
        jeollanamdoGuguns.put("순천시", 11);
        jeollanamdoGuguns.put("신안군", 12);
        jeollanamdoGuguns.put("여수시", 13);
        jeollanamdoGuguns.put("영광군", 14);
        jeollanamdoGuguns.put("영암군", 15);
        jeollanamdoGuguns.put("완도군", 16);
        jeollanamdoGuguns.put("장성군", 17);
        jeollanamdoGuguns.put("장흥군", 18);
        jeollanamdoGuguns.put("진도군", 19);
        jeollanamdoGuguns.put("함평군", 20);
        jeollanamdoGuguns.put("해남군", 21);
        jeollanamdoGuguns.put("화순군", 22);
        sidoGugunMap.put(38, jeollanamdoGuguns);

// 제주특별자치도 구군 코드
        Map<String, Integer> jejudoGuguns = new HashMap<>();
        jejudoGuguns.put("서귀포시", 1);
        jejudoGuguns.put("제주시", 2);
        sidoGugunMap.put(39, jejudoGuguns);
    }

    public static int findGugunCode(int sidoCode, String gugunName) {
        Map<String, Integer> guguns = sidoGugunMap.get(sidoCode);
        if (guguns != null) {
            return guguns.getOrDefault(gugunName, -1);
        }
        return -1; // 시도 코드에 해당하는 구군 정보가 없는 경우
    }
}
