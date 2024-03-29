import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class TP02 extends Frame {

  public static void main(String[] args) {

    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    Frame f = new Frame();
    f.setLayout(new GridLayout(3,2));
    Label l1 = new Label("Nome:");
    Label l2 = new Label("Idade:");
    Label l3 = new Label("Endereco:");

    Button b1 = new Button("OK");
    Button b2 = new Button("Limpar");
    Button b3 = new Button("Mostrar");
    Button b4 = new Button("Sair");

    TextField t1 = new TextField();
    TextField t2 = new TextField();
    TextField t3 = new TextField();

    l1.setBounds(20, 50, 80, 30);
    l2.setBounds(20, 80, 80, 30);
    l3.setBounds(20, 110, 80, 30);

    t1.setBounds(220, 50, 167, 20);
    t2.setBounds(220, 80, 167, 20);
    t3.setBounds(220, 110, 167, 20);

    b1.setBounds(15, 140, 87, 30);
    b2.setBounds(110, 140, 87, 30);
    b3.setBounds(205, 140, 87, 30);
    b4.setBounds(300, 140, 87, 30);

    b1.addActionListener(e -> {
      String nome = t1.getText();
      int idade = Integer.parseInt(t2.getText());
      String endereco = t3.getText();

      Aluno aluno = new Aluno(nome,endereco,idade);
      alunos.add(aluno);

    });

    b2.addActionListener(e -> {
      t1.setText("");
      t2.setText("");
      t3.setText("");
    });

    b3.addActionListener(e -> {
      String aaaaa = "";
      for (int i = 0; i < alunos.size(); i++) {
        aaaaa += alunos.get(i).toString() + "\n";
      }
      JOptionPane.showMessageDialog(b3, aaaaa);
    });

    b4.addActionListener(e -> {
      f.dispose();
    });


    f.add(t1);
    f.add(t2);
    f.add(t3);
    f.add(b1);
    f.add(b2);
    f.add(b3);
    f.add(b4);
    f.add(l1);
    f.add(l2);
    f.add(l3);
    

    f.setSize(400, 180);

    f.setTitle("TP02 - LP2I4");

    f.addWindowListener(new FechaJanela());
 
    f.setLayout(null);

    f.setVisible(true);

    f.show();
  }
}
