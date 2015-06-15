package track1;


import java.io.Serializable;
import java.util.ArrayList;

public class Account implements Serializable {// 시리얼(직렬)<-->pararell(병렬)시킬 수 있는 인터페이스가 있다는 의미.
    private String id;//아이디
    private String name;//이름
    private int contact;//연락처
    private int charge;//연체료
    private int use;//사용횟수
      
    public Account(String id, String name ,int contact ,int charge ,int use){//데이터클래스라 메인 없이 그냥 생성자
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.charge = charge;
        this.use = use;
    }
       
    public int getContact() {
        return contact;
    }
     
    public String getId() {
        return id;
    }
    
    public int getCharge() {
        return charge;
    }
    
    public int getUse() {
        return use;
    }
    
    public String getName() {
        return name;
    }
     
    public void setContact(int contact) {
        this.contact = contact;
    }
     
    public void setId(String id) {
        this.id = id;
    }
    
    public void setCharge(int charge) {
        this.charge = charge;
    }
    
    public void setUse(int use) {
        this.use = use;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){// 오브젝트의 메소드 toString이므로 오버라이드 가능
        return getId() + "," + getName() + "," + getContact() + "," + getCharge() + "," + getUse();
    }
    
}
