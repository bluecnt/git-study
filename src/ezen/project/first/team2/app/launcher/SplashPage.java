////////////////////////////////////////////////////////////////////////////////
//
// [SGLEE:20231114TUE_101700] Created
//
////////////////////////////////////////////////////////////////////////////////

package ezen.project.first.team2.app.launcher;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import ezen.project.first.team2.app.common.Page;
import ezen.project.first.team2.utils.SystemUtils;

public class SplashPage extends Page {
	private static final String TITLE = "?";
	private static final Dimension SIZE = new Dimension(640, 360); 

	private JButton mBtn1 = new JButton();
	
	// 생성자
	public SplashPage() {
		// 페이지 정보 세팅
		super(Main.PAGE_NUM_SPLASH, TITLE, SIZE);
	}
	
	@Override
	protected void onInit() {
		// 3초 후 메인 페이지 선택
		SystemUtils.setTimeout(3 * 1000, e -> {
			Main main = (Main)SplashPage.this.getStatusManager();
			main.selectPageByNum(main.PAGE_NUM_MAIN);
		});
	}
	
	@Override
	protected void onSetViewLayout(JPanel view) {
		//view.setLayout(null);
	}
	
	protected void onAddViews() {
		//
	}
	
	@Override
	protected void onAddCtrls(JPanel view) {
		this.mBtn1.setText("버튼");
		
		view.add(this.mBtn1);
	}
	
	@Override
	protected void onAddEventListeners() {
		this.mBtn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//
			}
		});
	}
}
