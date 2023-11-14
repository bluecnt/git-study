////////////////////////////////////////////////////////////////////////////////
//
// [SGLEE:20231113MON_010900] Created
//
////////////////////////////////////////////////////////////////////////////////

package ezen.project.first.team2.utils;

import javax.swing.JOptionPane;

public class UIUtils {
	public enum MsgBoxType {
		Info, Warn, Error
	}

	public enum MsgBoxBtn {
		Ok, YesNo, YesNoCancel
	}

	public enum MsgBoxBtnResult {
		Ok, Yes, No, Cancel
	}

	public static MsgBoxBtnResult showMsgBox(String msg, String title,
			MsgBoxType type, MsgBoxBtn btn) {
		int _type = 0;
		switch (type) {
		case Info:
			_type = JOptionPane.INFORMATION_MESSAGE;
			break;

		case Warn:
			_type = JOptionPane.WARNING_MESSAGE;
			break;

		case Error:
			_type = JOptionPane.ERROR_MESSAGE;
			break;
		}

		JOptionPane.showMessageDialog(null, msg, title, _type);

		return MsgBoxBtnResult.Ok;
	}

	public static void showMsgBox(String msg, String title) {
		showMsgBox(msg, title, MsgBoxType.Info, MsgBoxBtn.Ok);
	}

	public static void showMsgBox(String msg, String title, MsgBoxType type) {
		showMsgBox(msg, title, type, MsgBoxBtn.Ok);
	}

}
