package session_manager;
	import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
/* MembershipManagerFrame.java */
	import javax.swing.JFrame;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;
	/**
	 * MembershipManagerFrame class
	 */
	public class MembershipManagerFrame extends JFrame implements ActionListener
	{
	    private static final int WIDTH = 800;
	    private static final int HEIGHT = 800;
	    /**
	     * Constructor method for MembershipManagerFrame
	     */
	    public MembershipManagerFrame()
	    {
	        this.setSize(this.WIDTH, this.HEIGHT);
	    }
	    /**
	     * Create the UI
	     *
	     * @return    void
	     */
	    //will create and add components
	    private void createComponents()
	    {
	    	JButton button1 = new JButton("Add a new Session"); 
	    	JButton button2 = new JButton("Add a new Instructor"); 
	    	JButton button3 = new JButton("Add a new Member");
	    	add(button1);
	    	add(button2);
	    	add(button3);
	    }
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if (arg0.getActionCommand().equals("button1")){
				System.out.println("Button1 has been clicked");
			}
		}
		
	    public static void main(String[] args) {
			MembershipManagerFrame frame =  new MembershipManagerFrame();
			frame.createComponents(); 
			frame.setVisible(true);
			frame.setLayout(new GridLayout(3,1));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}
