package ezen.project.first.team2.app.launcher;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import ezen.project.first.team2.app.common.Page;
import ezen.project.first.team2.utils.UIUtils;

public class MainPage extends Page {
	private static final String TITLE = "셀프 결제 시스템 런처";
	private static final Dimension SIZE = new Dimension(640, 140); 
	private static final int PADDING = 10;

	private static final String MGMT_BTN_TEXT = "관리 앱 실행";
	private static final String NEW_USER_BTN_TEXT = "사용자 추가 앱 실행";
	private static final String PAYMENT_BTN_TEXT = "결제 앱 실행";
	
	private static final Font BTN_FONT = new Font("맑은 고딕", Font.PLAIN, 14);
	
	private JButton mRunMgmtAppBtn = new JButton();
	private JButton mRunNewUserAppBtn = new JButton();
	private JButton mRunPaymentAppBtn = new JButton();
	
	public MainPage() {
		super(Main.PAGE_NUM_MAIN, TITLE, SIZE);
	}
	
	@Override
	protected void onSetViewLayout(JPanel view) {
		view.setBorder(BorderFactory.createEmptyBorder(
				PADDING, PADDING, PADDING, PADDING));
		view.setLayout(new GridLayout(1, 3, 10, 10));
	}
	
	@Override
	protected void onAddCtrls(JPanel view) {
		this.mRunMgmtAppBtn.setText(MGMT_BTN_TEXT);
		this.mRunNewUserAppBtn.setText(NEW_USER_BTN_TEXT);
		this.mRunPaymentAppBtn.setText(PAYMENT_BTN_TEXT);
		
		this.mRunMgmtAppBtn.setFont(BTN_FONT);
		this.mRunNewUserAppBtn.setFont(BTN_FONT);
		this.mRunPaymentAppBtn.setFont(BTN_FONT);

		view.add(mRunMgmtAppBtn);
		view.add(mRunNewUserAppBtn);
		view.add(mRunPaymentAppBtn);
	}
	
	@Override
	protected void onAddEventListeners() {
		ActionListener listener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton sender = (JButton)e.getSource();
				
				// [관리 앱 실행] 버튼
				if (sender == MainPage.this.mRunMgmtAppBtn) {
					UIUtils.showMsgBox("관리 앱 실행", MainPage.TITLE);	
				}
				// [사용자 추가 앱 실행] 버튼
				else if (sender == MainPage.this.mRunNewUserAppBtn) {
					UIUtils.showMsgBox("사용자 추가 앱 실행", MainPage.TITLE);	
				}
				// [결제 앱 실행] 버튼
				else if (sender == MainPage.this.mRunPaymentAppBtn) {
					UIUtils.showMsgBox("결제 앱 실행", MainPage.TITLE);	
				}
			}
		};
		
		this.mRunMgmtAppBtn.addActionListener(listener);		
		this.mRunNewUserAppBtn.addActionListener(listener);		
		this.mRunPaymentAppBtn.addActionListener(listener);		
	}
}









