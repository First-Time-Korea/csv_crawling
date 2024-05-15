package com.example.crawling;


public enum Sido {
    SEOUL(1, "서울"),
    INCHEON(2, "인천"),
    DAEJEON(3, "대전"),
    DAEGU(4, "대구"),
    GWANGJU(5, "광주"),
    BUSAN(6, "부산"),
    ULSAN(7, "울산"),
    SEJONG(8, "세종특별자치시"),
    GYEONGGIDO(31, "경기도"),
    GANGWONDO(32, "강원도"),
    CHUNGCHEONGBUKDO(33, "충청북도"),
    CHUNGCHEONGNAMDO(34, "충청남도"),
    GYEONGSANGBUKDO(35, "경상북도"),
    GYEONGSANGNAMDO(36, "경상남도"),
    JEOLLABUKDO(37, "전라북도"),
    JEOLLANAMDO(38, "전라남도"),
    JEJUDO(39, "제주도"),
    NONE(0, "");

    private final int code;
    private final String koreanName;

    Sido(int code, String koreanName) {
        this.code = code;
        this.koreanName = koreanName;
    }

    public int getCode() {
        return code;
    }

    public static Sido of(String input) {
        for (Sido sido : Sido.values()) {
            if (input.contains(sido.koreanName)) {
                return sido;
            }
        }
        return NONE;
    }
}