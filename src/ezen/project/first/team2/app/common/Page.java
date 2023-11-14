////////////////////////////////////////////////////////////////////////////////
//
// [SGLEE:20231113MON_014200] Created
// [SGLEE:20231114TUE_101800] 화면 표시
//
////////////////////////////////////////////////////////////////////////////////

package ezen.project.first.team2.app.common;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Page extends JFrame {
	private StatusManager mStatusManager = null;
	
	private boolean mInited = false;
	private int mNumber = -1;
	
	private JPanel mView = new JPanel();
	
	// 생성자
	public Page(int num, String title, Dimension size) {
		//System.out.printf("[Page.ctor()] idx:%d, title:%s \n",
		//		idx, title);
		
		this.mNumber = num;
		this.setTitle(title);
		this.setSize(size);
	}
	
	// 상태 관리자 객체 얻기 -> 상속받은 클래스(ex, Main)로 캐스팅 후 사용
	public StatusManager getStatusManager() {
		return this.mStatusManager;
	}

	// 페이지 번호 얻기
	public int getNumber() {
		return this.mNumber;
	}
		
	// 페이지 초기화 -> 상태 관리자에 페이지를 추가할 때 호출됨
	public void init(StatusManager stsMngr) {
		if (this.mInited ) {
			System.out.println("[Page.init()] Already initialized!");
			return;
		}
		
		this.mStatusManager = stsMngr;
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.onSetViewLayout(this.mView);
		this.onAddCtrls(this.mView);
		this.onAddEventListeners();
		this.add(this.mView);
		
		// center of screen
		this.setLocationRelativeTo(null);

		// [SGLEE:20231113MON_002300] 컨트롤 추가 후 표시해야한다
		//this.setVisible(true);
		
		this.onInit();
	}
	
	// 초기화 작업
	protected void onInit() {
		//
	}
	
	// 뷰 레이아웃 설정
	protected void onSetViewLayout(JPanel view) {
	}
	
	// 컨트롤 추가
	protected void onAddCtrls(JPanel view) {
	}
	
	// 이벤트 리스너 추가
	protected void onAddEventListeners() {
	}
}