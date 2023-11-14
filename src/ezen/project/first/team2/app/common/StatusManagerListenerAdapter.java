////////////////////////////////////////////////////////////////////////////////
//
// [SGLEE:20231114TUE_111800] Created
//
////////////////////////////////////////////////////////////////////////////////


package ezen.project.first.team2.app.common;

import java.awt.event.ActionEvent;

public class StatusManagerListenerAdapter implements StatusManagerListener {
	@Override
	public void actionPerformed(ActionEvent e) { }

	@Override
	public void onAddPage(int num, Page page) { }

	@Override
	public void onAddView(int num, View view) { }

	@Override
	public void onAddPane(int num, Pane pane) {	}

	@Override
	public void onSelectPage(int num, int oldNum, Page page, Page oldPage) { }

	@Override
	public void onSelectView(int num, int oldNum, View view, View oldView) { }

	@Override
	public void onSelectPane(int num, int oldNum, Pane pane, Pane oldPane) { }
}
