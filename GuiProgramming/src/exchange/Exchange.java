package exchange;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Exchange extends JFrame implements ActionListener{
	//필드
	String[] currency = {"달러", "위안", "유로", "엔"};
	static final float USD = 1352.00F; // 미국달러 환율 상수 선언 
	static final float CNY = 184.42F; // 미국달러 환율 상수 선언 
	static final float EUR = 1426.09F; // 미국달러 환율 상수 선언 
	static final float JPY = 904.26F; // 미국달러 환율 상수 선언 
	
	JPanel pane1;
	JPanel pane2;
	JLabel label1;
	JTextField text1;
	JComboBox<String> comboBox;
	JButton button;
	JLabel label2; //변환 결과 출력할 레이블
	
	//생성자
	public Exchange() {
		//frame(this) 객체 생성
		this.setTitle("환율 변환기");
		this.setSize(350, 150);
		this.setLocation(200, 100);
		
		//1. panel 2개 생성: 위쪽, 가운데 배치
		pane1 = new JPanel();
		pane2 = new JPanel();
		
		this.add(pane1, BorderLayout.NORTH);
		this.add(pane2, BorderLayout.CENTER);
		
		//2. panel1, 2에 올릴 객체 생성 및 추가
		label1 = new JLabel("원화");
		text1 = new JTextField(7);
		comboBox = new JComboBox<>(currency);
		button = new JButton("변환");
		label2 = new JLabel("변환 결과입니다.");
		
		//글꼴 변경
		label1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		text1.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		label2.setFont(new Font("맑은 고딕", Font.PLAIN, 25));
		
		pane1.add(label1);
		pane1.add(text1);
		pane1.add(comboBox);
		pane1.add(button);
		
		pane2.add(label2);
		
		//변환 버튼 이벤트 생성
		button.addActionListener(this);
		
		//디스플레이
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			float won = Float.parseFloat(text1.getText());
			String currency = (String)comboBox.getSelectedItem();
			
			//if문 혹은 switch문
			if(currency.equals("달러")) {
				won = won / USD;
				label2.setText(String.format("%.2f$", won)); //소수 둘째자리
			}else if(currency.equals("위안")) {
				won = won / CNY;
				label2.setText(String.format("%.2f￥", won)); //소수 둘째자리
			}else if(currency.equals("유로")) {
				won = won / EUR;
				label2.setText(String.format("%.2f€", won)); //소수 둘째자리
			}else if(currency.equals("엔")) {
				won = won / JPY;
				label2.setText(String.format("%.2f￥", won)); //소수 둘째자리
			}
			
			
			/* switch(currency) {
			case "달러":
				float usd = won / USD;
				label2.setText(String.format("%.2f$", usd)); break;
			case "위안":
				float cny = won / CNY;
				label2.setText(String.format("%.2f￥", cny)); break;
			case "유로":
				float eur = won / EUR;
				label2.setText(String.format("%.2f€", eur)); break;
			case "엔":
				float jpy = won / JPY; //손실이 없게 실수로 출력하기 위해 double이 필요
				label2.setText(String.format("%.2f￥", jpy)); break;
			} */
			
		}
		
	}
	
}
