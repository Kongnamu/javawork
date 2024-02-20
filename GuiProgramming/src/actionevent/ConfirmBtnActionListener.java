package actionevent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmBtnActionListener implements ActionListener{

	// 필드
	JTextField text;
	JLabel label;
	
	// 생성자
	public ConfirmBtnActionListener(JTextField text, JLabel label) {
		this.text = text;
		this.label = label;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//버튼을 출력했을 때 상태 구현
		String name = text.getText();
		label.setText("Hello~ " + name);
		
	}

}
