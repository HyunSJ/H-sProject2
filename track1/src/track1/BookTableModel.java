package track1;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class BookTableModel extends AbstractTableModel {
	private final static String[] COLUMNS = { "코드", "장르", "제목",
			"저자", "출판사", "상태"};

	private List<Book> Books;

	public BookTableModel(List<Book> Books) {
		this.Books = Books;
	}

	@Override
	public int getRowCount() {
		return Books.size();
	}

	@Override
	public int getColumnCount() {
		return COLUMNS.length;
	}

	@Override
	public String getColumnName(int column) {
		return COLUMNS[column];
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		Book book = Books.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return book.getCode();
		case 1:
			return book.getGenre();
		case 2:
			return book.getTitle();
		case 3:
			return book.getAuthor();
		case 4:
			return book.getPublisher();
		case 5:
			return book.getState();
		}
		return null;
	}

}
