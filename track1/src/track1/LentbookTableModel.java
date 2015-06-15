package track1;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class LentbookTableModel extends AbstractTableModel {
	private final static String[] COLUMNS = { "코드", "회원ID", "대여일",
			"반납일"};

	private List<Lentbook> Lentbooks;

	public LentbookTableModel(List<Lentbook> Lentbooks) {
		this.Lentbooks = Lentbooks;
	}

	@Override
	public int getRowCount() {
		return Lentbooks.size();
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
		Lentbook lentbook = Lentbooks.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return lentbook.getCode();
		case 1:
			return lentbook.getId();
		case 2:
			return lentbook.getAday();
		case 3:
			return lentbook.getBday();
		}
		return null;
	}

}
