package track1;


import java.io.Serializable;
import java.util.ArrayList;

public class Lentbook implements Serializable {// 시리얼(직렬)<-->pararell(병렬)시킬 수 있는 인터페이스가 있다는 의미.
    private String code;//아이디
    private String id;//이름
    private String Aday;//대여일
    private String Bday;//반납일
    
    public Lentbook(String code, String id ,String Aday ,String Bday){//데이터클래스라 메인 없이 그냥 생성자
        this.code = code;
        this.id = id;
        this.Aday = Aday;
        this.Bday = Bday;
    }
    
    public String getCode() {
        return code;
    }
     
    public String getId() {
        return id;
    }
    
    public String getAday() {
        return Aday;
    }
    
    public String getBday() {
        return Bday;
    }
     
    public void setCode(String code) {
        this.code = code;
    }
     
    public void setId(String id) {
        this.id = id;
    }
    
    public void setAday(String Aday) {
        this.Aday = Aday;
    }
    
    public void setBday(String Bday) {
        this.Bday = Bday;
    }
     
    public String toString(){// 오브젝트의 메소드 toString이므로 오버라이드 가능
        return getCode() + "," + getId() + "," + getAday() + "," + getBday();
    }    
}
