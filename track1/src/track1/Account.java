package track1;


import java.io.Serializable;
import java.util.ArrayList;

public class Account implements Serializable {// �ø���(����)<-->pararell(����)��ų �� �ִ� �������̽��� �ִٴ� �ǹ�.
    private String id;//���̵�
    private String name;//�̸�
    private int contact;//����ó
    private int charge;//��ü��
    private int use;//���Ƚ��
      
    public Account(String id, String name ,int contact ,int charge ,int use){//������Ŭ������ ���� ���� �׳� ������
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
    
    public String toString(){// ������Ʈ�� �޼ҵ� toString�̹Ƿ� �������̵� ����
        return getId() + "," + getName() + "," + getContact() + "," + getCharge() + "," + getUse();
    }
    
}
