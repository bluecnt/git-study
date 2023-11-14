////////////////////////////////////////////////////////////////////////////////
//
// [SGLEE:20231114TUE_110600] Created
//
////////////////////////////////////////////////////////////////////////////////

package ezen.project.first.team2.app.common;

import java.awt.event.ActionListener;

public interface StatusManagerListener extends ActionListener {
	public void onAddPage(int num, Page page);
	public void onAddView(int num, View view);
	public void onAddPane(int num, Pane pane);
	
	public void onSelectPage(int num, int oldNum, Page page, Page oldPage);
	public void onSelectView(int num, int oldNum, View view, View oldView);
	public void onSelectPane(int num, int oldNum, Pane pane, Pane oldPane);
}
