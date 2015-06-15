package track1;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class AccountTableModel extends AbstractTableModel {
	private final static String[] COLUMNS = { "회원ID", "이름", "연락처",
			"연체료", "이용횟수"};

	private List<Account> Accounts;

	public AccountTableModel(List<Account> Accounts) {
		this.Accounts = Accounts;
	}

	@Override
	public int getRowCount() {
		return Accounts.size();
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
		Account account = Accounts.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return account.getId();
		case 1:
			return account.getName();
		case 2:
			return account.getContact();
		case 3:
			return account.getCharge();
		case 4:
			return account.getUse();
		}
		return null;
	}

}
