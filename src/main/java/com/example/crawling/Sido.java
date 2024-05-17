package com.example.crawling;


public enum Sido {
    SEOUL(1, "서울특별시"),
    SEOUL2(1, "서울"),
    INCHEON(2, "인천광역시"),
    DAEJEON(3, "대전광역시"),
    DAEGU(4, "대구광역시"),
    GWANGJU(5, "광주광역시"),
    BUSAN(6, "부산광역시"),
    ULSAN(7, "울산광역시"),
    SEJONG(8, "세종특별자치시"),
    GYEONGGIDO(31, "경기도"),
    GANGWONDO(32, "강원도"),
    CHUNGCHEONGBUKDO(33, "충청북도"),
    CHUNGCHEONGNAMDO(34, "충청남도"),
    GYEONGSANGBUKDO(35, "경상북도"),
    GYEONGSANGNAMDO(36, "경상남도"),
    JEOLLABUKDO(37, "전라북도"),
    JEOLLANAMDO(38, "전라남도"),
    JEJUDO(39, "제주특별자치도"),
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
    	System.out.println("input:"+input);
        for (Sido sido : Sido.values()) {
            if (input.equals(sido.koreanName)) {
                return sido;
            }
        }
		return NONE;
	}
}