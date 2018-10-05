package com.tingcream.rsaTool.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.tingcream.rsaTool.model.RSAHelper;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
/**
 * rsaTool 主窗体
 * @author jelly
 *
 */
public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private  RSAHelper rsaHelper=new  RSAHelper();
 
	
	private JTextField panel_1_textField_1;
	private JLabel   panel_1_label_1,panel_1_label_2,panel_1_label_3;
	private JButton  panel_1_button_1,panel_1_button_2;
	private JScrollPane panel_1_scrollPane_1;
	private JTextArea panel_1_textArea_1;
	private JScrollPane panel_1_scrollPane_2;
	private JTextArea panel_1_textArea_2;
	private JLabel panel_2_label_1;
	private JTextField panel_2_textField_1;
	private JLabel panel_2_label_2;
	private JScrollPane panel_2_scrollPane_1;
	private JTextArea panel_2_textArea_1;
	private JButton panel_2_button_1;
	private JButton panel_2_button_2;
	private JLabel panel_2_label_3;
	private JScrollPane panel_2_scrollPane_2;
	private JTextArea panel_2_textArea_2;
	private JLabel panel_3_label_1;
	private JLabel panel_3_label_2;
	private JLabel panel_3_label_3;
	private JTextField panel_3_textField_1;
	private JScrollPane panel_3_scrollPane_1;
	private JTextArea panel_3_textArea_1;
	private JScrollPane panel_3_scrollPane_2;
	private JTextArea panel_3_textArea_2;
	private JButton panel_3_button_1;
	private JButton panel_3_button_2;
	private JLabel panel_4_label_1;
	private JTextField panel_4_textField_1;
	private JLabel panel_4_label_2;
	private JScrollPane panel_4_scrollPane_1;
	private JTextArea panel_4_textArea_1;
	private JLabel panel_4_label_3;
	private JScrollPane panel_4_scrollPane_2;
	private JTextArea panel_4_textArea_2;
	private JButton panel_4_button_1;
	private JButton panel_4_button_2;
	private JLabel panel_4_label_4;
	private JLabel panel_4_label_5;
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
					
					frame.setLocationRelativeTo(null);//主窗体居中
					 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainFrame.class.getResource("/com/tingcream/rsaTool/img/tools_24px.png")));
		setFont(new Font("微软雅黑", Font.PLAIN, 18));
		setBackground(Color.LIGHT_GRAY);
		setTitle("rsaTool加解密工具");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 514);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("rsa加密", new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/encrypt_3_24px.png")), panel_1, null);
		tabbedPane.setForegroundAt(0, Color.BLACK);
		tabbedPane.setBackgroundAt(0, Color.WHITE);
		
		 panel_1_label_1 = new JLabel("RSA公钥:");
		panel_1_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_1_textField_1 = new JTextField();
		panel_1_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_1_textField_1.setColumns(10);
		
		 panel_1_label_2 = new JLabel("明      文:");
		panel_1_label_2.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		 panel_1_button_1 = new JButton("加  密");
		 panel_1_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/encrypt_3_24px.png")));
		 panel_1_button_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		panel_1_button_1_click(e);
		 	}
		 });
	 
		panel_1_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		 panel_1_label_3 = new JLabel("密      文:");
		panel_1_label_3.setHorizontalAlignment(SwingConstants.TRAILING);
		panel_1_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		 panel_1_button_2 = new JButton("清除明/密文");
		 panel_1_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/editclear_24px.png")));
		 panel_1_button_2.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		panel_1_textArea_1.setText("");
		 		panel_1_textArea_2.setText("");
		 	}
		 });
	 
		panel_1_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_1_scrollPane_1 = new JScrollPane();
		panel_1_scrollPane_2 = new JScrollPane();
		
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_1_label_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_1_textField_1))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(panel_1_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(panel_1_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(20)
							.addComponent(panel_1_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(panel_1_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(105)
							.addComponent(panel_1_button_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1_button_2)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_1_label_1)
						.addComponent(panel_1_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_1_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(102))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(panel_1_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(16)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_1_button_1)
						.addComponent(panel_1_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(22)
							.addComponent(panel_1_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(24)
							.addComponent(panel_1_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		panel_1_textArea_2 = new JTextArea();
		panel_1_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_1_scrollPane_2.setViewportView(panel_1_textArea_2);
		
		panel_1_textArea_1 = new JTextArea();
		panel_1_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_1_scrollPane_1.setViewportView(panel_1_textArea_1);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setForeground(Color.WHITE);
		tabbedPane.addTab("rsa解密", new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/decrypted_24px.png")), panel_2, null);
		
		panel_2_label_1 = new JLabel("RSA私钥:");
		panel_2_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_textField_1 = new JTextField();
		panel_2_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_2_textField_1.setColumns(10);
		
		panel_2_label_2 = new JLabel(" 密      文:");
		panel_2_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_scrollPane_1 = new JScrollPane();
		
		panel_2_button_1 = new JButton("解  密");
		panel_2_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/decrypted_24px.png")));
		panel_2_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2_button_1_click(e);
			}
		});
		panel_2_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_button_2 = new JButton("清除明/密文");
		panel_2_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/editclear_24px.png")));
		panel_2_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2_textArea_1.setText("");
				panel_2_textArea_2.setText("");
			}
		});
		panel_2_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_label_3 = new JLabel(" 明      文:");
		panel_2_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_2_scrollPane_2 = new JScrollPane();
 
		
		
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(panel_2_label_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_2_textField_1))
								.addGroup(gl_panel_2.createSequentialGroup()
									.addComponent(panel_2_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(panel_2_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(20)
							.addComponent(panel_2_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(panel_2_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(105)
							.addComponent(panel_2_button_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_2_button_2)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_2_label_1)
						.addComponent(panel_2_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel_2.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(panel_2_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(102))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addComponent(panel_2_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(16)))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_2_button_1)
						.addComponent(panel_2_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_2.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(22)
							.addComponent(panel_2_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_2.createSequentialGroup()
							.addGap(24)
							.addComponent(panel_2_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		
		
		panel_2_textArea_2 = new JTextArea();
		panel_2_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_2_scrollPane_2.setViewportView(panel_2_textArea_2);
		
		panel_2_textArea_1 = new JTextArea();
		panel_2_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_2_scrollPane_1.setViewportView(panel_2_textArea_1);
		panel_2.setLayout(gl_panel_2);
		tabbedPane.setForegroundAt(1, Color.BLACK);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("rsa签名", new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/ok_signature_24px.png")), panel_3, null);
		
		panel_3_label_1 = new JLabel("RSA私钥:");
		panel_3_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_3_label_2 = new JLabel(" 明      文:");
		panel_3_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_3_label_3 = new JLabel(" 签 名 值:");
		panel_3_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_3_textField_1 = new JTextField();
		panel_3_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_3_textField_1.setColumns(10);
		
		panel_3_scrollPane_1 = new JScrollPane();
		
		panel_3_scrollPane_2 = new JScrollPane();
		
		panel_3_button_1 = new JButton("签  名");
		panel_3_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/ok_signature_24px.png")));
		panel_3_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel_3_button_1_click(e);
			}
		});
		panel_3_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_3_button_2 = new JButton("清除明文/签名值");
		panel_3_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/editclear_24px.png")));
		panel_3_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3_textArea_1.setText("");
				panel_3_textArea_2.setText("");
			}
		});
		panel_3_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(panel_3_label_1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(panel_3_textField_1))
								.addGroup(gl_panel_3.createSequentialGroup()
									.addComponent(panel_3_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addGap(16)
									.addComponent(panel_3_scrollPane_1, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(20)
							.addComponent(panel_3_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(panel_3_scrollPane_2, GroupLayout.PREFERRED_SIZE, 449, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(105)
							.addComponent(panel_3_button_1)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_3_button_2)))
					.addContainerGap(51, Short.MAX_VALUE))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(24)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_3_label_1)
						.addComponent(panel_3_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(gl_panel_3.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(panel_3_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
							.addGap(102))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addComponent(panel_3_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
							.addGap(16)))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_3_button_1)
						.addComponent(panel_3_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_panel_3.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(22)
							.addComponent(panel_3_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_3.createSequentialGroup()
							.addGap(24)
							.addComponent(panel_3_scrollPane_2, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(28, Short.MAX_VALUE))
		);
		
		
		
		panel_3_textArea_2 = new JTextArea();
		panel_3_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_3_scrollPane_2.setViewportView(panel_3_textArea_2);
		
		panel_3_textArea_1 = new JTextArea();
		panel_3_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_3_scrollPane_1.setViewportView(panel_3_textArea_1);
		panel_3.setLayout(gl_panel_3);
		tabbedPane.setForegroundAt(2, Color.BLACK);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("rsa验签", new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/verified_user_24px.png")), panel_4, null);
		
		panel_4_label_1 = new JLabel("RSA公钥:");
		panel_4_label_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_textField_1 = new JTextField();
		panel_4_textField_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_4_textField_1.setColumns(10);
		
		panel_4_label_2 = new JLabel(" 明      文:");
		panel_4_label_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_scrollPane_1 = new JScrollPane();
		
		panel_4_label_3 = new JLabel(" 签 名 值:");
		panel_4_label_3.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_scrollPane_2 = new JScrollPane();
		
		panel_4_button_1 = new JButton("验  签");
		panel_4_button_1.setIcon(new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/verified_user_24px.png")));
		panel_4_button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4_button_1_click(e);
			}
		});
		panel_4_button_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_button_2 = new JButton("清除明文/签名值");
		panel_4_button_2.setIcon(new ImageIcon(MainFrame.class.getResource("/com/tingcream/rsaTool/img/editclear_24px.png")));
		panel_4_button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_4_textArea_1.setText("");
				panel_4_textArea_2.setText("");
			}
		});
		panel_4_button_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_label_4 = new JLabel(" 验签结果:");
		panel_4_label_4.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		
		panel_4_label_5 = new JLabel("");
		panel_4_label_5.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		GroupLayout gl_panel_4 = new GroupLayout(panel_4);
		gl_panel_4.setHorizontalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_4_label_1)
							.addGap(18)
							.addComponent(panel_4_textField_1, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_4_label_2, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(panel_4_scrollPane_1, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_4_label_3, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_4.createSequentialGroup()
									.addComponent(panel_4_button_1)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_4_button_2, GroupLayout.PREFERRED_SIZE, 210, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel_4_scrollPane_2, GroupLayout.PREFERRED_SIZE, 446, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_4_label_4, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_4_label_5)))
					.addContainerGap(70, Short.MAX_VALUE))
		);
		gl_panel_4.setVerticalGroup(
			gl_panel_4.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_4.createSequentialGroup()
					.addGap(27)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
						.addComponent(panel_4_label_1)
						.addComponent(panel_4_textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4_label_2, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4_scrollPane_1, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4_scrollPane_2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel_4_label_3, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_4.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_4.createSequentialGroup()
							.addComponent(panel_4_button_1)
							.addGap(25)
							.addGroup(gl_panel_4.createParallelGroup(Alignment.BASELINE)
								.addComponent(panel_4_label_4, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_4_label_5)))
						.addComponent(panel_4_button_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		
		panel_4_textArea_2 = new JTextArea();
		panel_4_textArea_2.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_4_scrollPane_2.setViewportView(panel_4_textArea_2);
		
		panel_4_textArea_1 = new JTextArea();
		panel_4_textArea_1.setFont(new Font("微软雅黑", Font.PLAIN, 18));
		panel_4_scrollPane_1.setViewportView(panel_4_textArea_1);
		panel_4.setLayout(gl_panel_4);
	}
	//rsa 加密
	private void panel_1_button_1_click(ActionEvent e) {
		try {
			String publicKeyStr =this.panel_1_textField_1.getText();
			String content =   this.panel_1_textArea_1.getText();
			if(publicKeyStr==null ||publicKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "RSA公钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
			    return ;
			}
			if(content==null ||content.trim().equals("")) {
				//JOptionPane.showMessageDialog(null, "明文内容不能为空！", "信息", JOptionPane.INFORMATION_MESSAGE);
				  JOptionPane.showMessageDialog(null, "明文内容不能为空！");//默认的  提示框 title为“信息” type为  INFORMATION_MESSAGE
				return ;
			}
			
			String  cipherContent  = rsaHelper.rsaEncrypt(content, publicKeyStr);
			this.panel_1_textArea_2.setText(cipherContent);
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	//rsa 解密
	private void panel_2_button_1_click(ActionEvent e) {
		try {
			String privateKeyStr =this.panel_2_textField_1.getText();
			String cipherContent =   this.panel_2_textArea_1.getText();
			if(privateKeyStr==null ||privateKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "RSA私钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				return ;
			}
			if(cipherContent==null ||cipherContent.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "密文内容不能为空！");//默认的  提示框 title为“信息” type为  INFORMATION_MESSAGE
				return ;
			}
			
			String content  = rsaHelper.rsaDecrypt(cipherContent, privateKeyStr);
			this.panel_2_textArea_2.setText(content);
			
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}
	}
	//rsa 签名
	private void panel_3_button_1_click(ActionEvent e) {
		try {
			String privateKeyStr =this.panel_3_textField_1.getText();
			String content =   this.panel_3_textArea_1.getText();
			if(privateKeyStr==null ||privateKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "RSA私钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
				return ;
			}
			if(content==null ||content.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "明文内容不能为空！");//默认的  提示框 title为“信息” type为  INFORMATION_MESSAGE
				return ;
			}
	 
			String sign  =rsaHelper.rsaSign(content, privateKeyStr);
			this.panel_3_textArea_2.setText(sign);
			
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}
	}
	 
	//rsa 验证签名
	private void panel_4_button_1_click(ActionEvent e) {
		try {
			String publicKeyStr = this.panel_4_textField_1.getText();
			String content = this.panel_4_textArea_1.getText();
			String sign = this.panel_4_textArea_2.getText();
			if(publicKeyStr==null ||publicKeyStr.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "RSA公钥不能为空！", "错误", JOptionPane.ERROR_MESSAGE);
			    return ;
			}
			if(content==null ||content.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "明文内容不能为空！");
			    return ;
			}
			if(sign==null ||sign.trim().equals("")) {
				JOptionPane.showMessageDialog(null, "签名值内容不能为空！");
				return ;
			}
			
			boolean  f=rsaHelper.rsaSignVerify(content, sign, publicKeyStr);
			if(f) {
				 this.panel_4_label_5.setForeground( new Color(0, 255, 0));
				 this.panel_4_label_5.setText("验签成功");
			}else {
				 this.panel_4_label_5.setForeground( new Color(255, 0, 0));
				 this.panel_4_label_5.setText("验签失败");
				
			}
			
		} catch (Exception e1) {
			e1.printStackTrace();
			JOptionPane.showMessageDialog(null, e1.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
		}
	}
	
}
