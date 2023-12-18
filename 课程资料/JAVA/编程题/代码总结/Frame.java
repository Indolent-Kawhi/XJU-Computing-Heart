public class Frame extends JFrame{

	private JTextField txt_id,tix_name;
	private JButton bt,

	public Frame(){
		setLayout(new FlowLayout());
		setBounds(400,400,800,800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel label1 = new JLabel("");
		JLabel label2 = new Jlabel("");

		txt_id = new JTextField(10);

		bt = new JButton("按下");
		add(label1);




		setVisible(true);

		bt.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e){
				String name = txt_id.getText();

				JOptionPane.showMessageDialog(Frame.this,"添加成功！");
				
			}
		
		});

	}
}


