package layout_test;

import java.awt.*;

import javax.swing.*;


public class Layout_test extends JFrame{
	Layout_test(){
      //프레임
      setTitle("첫 번째 프레임");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(500, 500);//프레임 사이즈
      
      //panel
      Container cp = getContentPane();
      cp.setLayout(null);
      
      cp.add(new ToolPanel());
      cp.add(new DrawPanel());
      //프레임 크기를 contnatPane에 맞게 설정됨
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
         //3개의 객체를 만들어서 담기
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
      
      //오버라이드
      public void paintComponent(Graphics g){
         super.paintComponent(g);//부모의 paintComponent 불러오기: 기본모양
         
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