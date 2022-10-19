package blog;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main extends JFrame{
	
	static JButton btn1 = new JButton("예");
	static JButton btn2 = new JButton("아니오");
	private ImageIcon btn1Image = new ImageIcon(Main.class.getResource("../blog/button1.jpg"));//나가기버튼 눌렀을 때 이미지
	private ImageIcon btn2Image = new ImageIcon(Main.class.getResource("../blog/button2.jpg"));
	static JPanel page1 = new JPanel() {
		Image background = new ImageIcon(Main.class.getResource("../blog/001.jpg")).getImage();
		public void paint(Graphics g) {//그리는 함수
			g.drawImage(background, 0, 0, null);//background를 그려줌		
		}
	};
	static JPanel page2 = new JPanel() {
		Image background=new ImageIcon(Main.class.getResource("../blog/002.jpg")).getImage();
		public void paint(Graphics g) {//그리는 함수
				g.drawImage(background, 0, 0, null);//background를 그려줌		
		}
	};
	
	public Main() {
		homeframe();
		setpanel();
		cg();
		btn();
	}

	public void homeframe() {
		setTitle("HOME PT");
		setSize(900, 500);
		setResizable(false);//창의 크기를 변경하지 못하게
		setLocationRelativeTo(null);//창이 가운데 나오게
		setLayout(null);
		setVisible(true);//창이 보이게	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//JFrame이 정상적으로 종료되게
	}
	public void btn() {
		btn1.setLayout(null);
		btn1.setBounds(340,309,100,40);
		btn2.setLayout(null);
		btn2.setBounds(460,309,100,40);
		btn1.setIcon(btn1Image);//버튼의 아이콘 설정
		btn2.setIcon(btn2Image);
		add(btn1);
		add(btn2);
	}
	public void setpanel() {
		page1.setBounds(0, 0, 900, 500);//패널1의 위치 설정
		page2.setBounds(0, 0, 900, 500);//패널2의 위치 설정
		page1.setLayout(null);//레이아웃 설정
		page2.setLayout(null);//레이아웃 설정
		page2.setVisible(false);//창이 보이지 않게
		add(page1);//프레임에 패널을 추가
		add(page2);//프레임에 패널을 추가
		page1.add(btn1);//패널1에 버튼을 추가
		page1.add(btn2);
	}
	public void cg(){
		btn1.addMouseListener(new MouseAdapter() { // 마우스 이벤트 
			@Override public void mouseEntered(MouseEvent e) { // 마우스 들어왔을때 
			} 
			@Override public void mouseExited(MouseEvent e) { // 마우스 나왔을때 	
			}
			@Override public void mousePressed(MouseEvent e) { // 클릭했을때 
				btn1.setVisible(false);//버튼 안보이게
				btn2.setVisible(false);
			} 
		});
	}
	
	public static void main(String[] args) {
		new Main();
	}

}
