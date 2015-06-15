package track1;

import java.io.Serializable;

public class Book implements Serializable {// 시리얼(직렬)<-->pararell(병렬)시킬 수 있는 인터페이스가 있다는 의미.
    private String code;//직렬 병렬은 어딘가에 전송시킬 때 필요하다. 직렬은 그냥 일렬로 줄 세울 수 있다는 의미.
    private String title;//제목
    private String author;//작가
    private String genre;//장르
    private String state;//상태
    private String publisher;//출판 회사
    
    public Book(String code, String genre, String title ,String author ,String publisher ,String state ){//데이터클래스라 메인 없이 그냥 생성자
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
    
    public String toString(){// 오브젝트의 메소드 toString이므로 오버라이드 가능
        return getCode() + "," + getGenre() + "," + getTitle() + "," + getAuthor() + "," + getPublisher() + "," + getState();
    }
    
}
