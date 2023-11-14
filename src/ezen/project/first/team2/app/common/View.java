////////////////////////////////////////////////////////////////////////////////
//
// [SGLEE:20231114TUE_101700] Created
// [SGLEE:20231114TUE_101900] 재활용 가능한 뷰 영역
//
////////////////////////////////////////////////////////////////////////////////

package ezen.project.first.team2.app.common;

import javax.swing.JPanel;

public class View extends JPanel {
	private StatusManager mStatusManager = null;

	private int mNumber = -1;
	
	public View(int num) {
		this.mNumber = num;
	}

	public StatusManager getStatusManager() {
		return this.mStatusManager;
	}
	
	public int getNumber() {
		return this.mNumber;
	}
	
	//
	
	public void init(StatusManager stsMngr) {
		this.mStatusManager = stsMngr;
		
		//
		
		this.onInit();
	}
	
	//
	
	protected void onInit() {
		//
	}
}
