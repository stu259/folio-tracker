package gui;

import javax.swing.JTable;

public interface ITable {

	void addRow(String symbol, int nShares);
	JTable getTable();
	Object[] getRow(int index);
}
