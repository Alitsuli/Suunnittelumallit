import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.border.Border;

public class Main extends JFrame {
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		StringTest();

		Main test = new Main();
		test.setBounds(20, 20, 250, 150);
		test.setVisible(true);
	}

	public static void StringTest() {
		// Luodaan "fly" ja "weight" instanssit
		// Javassa uusien Stringien luominen varaa niille muistipaikan ajonaikaisesta
		// muistista (string constant pool)
		String fly = "fly", weight = "weight";

		// Koska fly2 ja weight2 Stringien arvot ovat jo olemassa,
		// viittaavat ne edell‰ luotuihin instansseihin
		String fly2 = "fly", weight2 = "weight";
		System.out.println(fly == fly2);
		System.out.println(weight == weight2);

		// String poolissa on olemassa erilliset merkkijonot "fly" ja "weight"
		String distinctString = fly + weight;

		// fly + weight ja "flyweight" viittaavat eri instansseihin
		// instanssi1 + instanssi2 != instanssi3
		System.out.println(distinctString == "flyweight");

		// Javan String -luokka hallinnoi String constant poolia
		// String.intern() palauttaa joko muistissa olevan merkkijonon
		// tai luo sinne uuden merkkijonon
		String flyweight = (fly + weight).intern();

		System.out.println(flyweight == "flyweight");

		// Javan merkkijonot k‰ytt‰v‰t Flyweight suunittelumallia muistin s‰‰st‰miseksi
	}

	public Main() {
		super("Border flyweights");
		JPanel panel = new JPanel(), panel2 = new JPanel();

		// BorderFactory tarjoaa flyweight bordereita.
		// border ja border2 ovat indenttisi‰,
		// joten viitteet osoittavat samaan instanssiin
		Border border = BorderFactory.createRaisedBevelBorder();
		// koska border on jo olemassa BorderFactory ei oikeasti tee toista indenttist‰
		Border border2 = BorderFactory.createRaisedBevelBorder();
		panel.setBorder(border);
		panel.setPreferredSize(new Dimension(100, 100));
		panel2.setBorder(border2);
		panel2.setPreferredSize(new Dimension(100, 100));
		Container contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		contentPane.add(panel);
		contentPane.add(panel2);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			public void windowClosed(WindowEvent e) {
				System.exit(0);
			}
		});
		System.out.println((border == border2) ? "bevel borders are shared" : "bevel borders are NOT shared");
	}

}