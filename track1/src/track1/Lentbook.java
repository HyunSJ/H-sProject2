package track1;


import java.io.Serializable;
import java.util.ArrayList;

public class Lentbook implements Serializable {// �ø���(����)<-->pararell(����)��ų �� �ִ� �������̽��� �ִٴ� �ǹ�.
    private String code;//���̵�
    private String id;//�̸�
    private String Aday;//�뿩��
    private String Bday;//�ݳ���
    
    public Lentbook(String code, String id ,String Aday ,String Bday){//������Ŭ������ ���� ���� �׳� ������
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
     
    public String toString(){// ������Ʈ�� �޼ҵ� toString�̹Ƿ� �������̵� ����
        return getCode() + "," + getId() + "," + getAday() + "," + getBday();
    }    
}
