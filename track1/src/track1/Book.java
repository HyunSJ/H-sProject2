package track1;

import java.io.Serializable;

public class Book implements Serializable {// �ø���(����)<-->pararell(����)��ų �� �ִ� �������̽��� �ִٴ� �ǹ�.
    private String code;//���� ������ ��򰡿� ���۽�ų �� �ʿ��ϴ�. ������ �׳� �Ϸķ� �� ���� �� �ִٴ� �ǹ�.
    private String title;//����
    private String author;//�۰�
    private String genre;//�帣
    private String state;//����
    private String publisher;//���� ȸ��
    
    public Book(String code, String genre, String title ,String author ,String publisher ,String state ){//������Ŭ������ ���� ���� �׳� ������
        this.code = code;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.state = state;
        this.publisher = publisher;
    }
     
    public String getAuthor() {
        return author;
    }
     
    public String getCode() {
        return code;
    }
    
    public String getGenre() {
        return genre;
    }
    
    public String getState() {
        return state;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public String getTitle() {
        return title;
    }
     
    public void setAuthor(String author) {
        this.author = author;
    }
     
    public void setCode(String code) {
        this.code = code;
    }
    
    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public void setState(String state) {
        this.state = state;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String toString(){// ������Ʈ�� �޼ҵ� toString�̹Ƿ� �������̵� ����
        return getCode() + "," + getGenre() + "," + getTitle() + "," + getAuthor() + "," + getPublisher() + "," + getState();
    }
    
}
