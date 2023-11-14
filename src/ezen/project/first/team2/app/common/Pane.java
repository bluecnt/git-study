////////////////////////////////////////////////////////////////////////////////
//
// [SGLEE:20231114TUE_101700] Created
// [SGLEE:20231114TUE_101900] 재활용 가능한 컨트롤 컨테이너
//
////////////////////////////////////////////////////////////////////////////////

package ezen.project.first.team2.app.common;

import javax.swing.JPanel;

public class Pane extends JPanel {
	private StatusManager mStatusManager = null;

	private int mNumber = -1;
	
	public Pane(int num) {
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
