package layout_test;

import java.awt.*;

import javax.swing.*;


public class Layout_test extends JFrame{
	Layout_test(){
      //������
      setTitle("ù ��° ������");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 500);//������ ������
      
      //panel
      Container cp = getContentPane();
      cp.setLayout(null);
      
      cp.add(new ToolPanel());
      cp.add(new DrawPanel());
      //������ ũ�⸦ contnatPane�� �°� ������
      cp.setPreferredSize(new Dimension(600, 500));
      pack();
      
      setResizable(false);
      setVisible(true);
   }
   
   class ToolPanel extends JPanel{
      ToolPanel(){
         setBackground(Color.BLUE);
         setBounds(0,0,100,500);
         
         setLayout(new GridLayout(3, 1));
         //3���� ��ü�� ���� ���
         add(new JButton("O"));
         add(new JLabel(new ImageIcon("images.png")));
         add(new TextField(10));
      }
   } 
   
   class DrawPanel extends JPanel{
      DrawPanel(){
         setBackground(Color.YELLOW);
         setBounds(100,0,500,500);
      }
      
      //�������̵�
      public void paintComponent(Graphics g){
         super.paintComponent(g);//�θ��� paintComponent �ҷ�����: �⺻���
         
         g.setColor(Color.darkGray);
         g.setFont(new Font("Arials", Font.BOLD, 40));
         g.drawRect(50, 50, 200, 100);
         g.drawOval(100, 100, 200, 100);
         g.drawString("Hello JAVA", 100, 300);
      }
   } 

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      new Layout_test();
   }

}