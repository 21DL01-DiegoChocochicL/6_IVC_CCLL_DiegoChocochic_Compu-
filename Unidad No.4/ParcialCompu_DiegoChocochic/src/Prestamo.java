public class Prestamo extends javax.swing.JFrame {

    public Prestamo() {
        initComponents();
        initTable(tiposIntrs, añosMeses);
        this.setSize(491, 385);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfCredito = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jtfPeriodoMax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfPeriodoMin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jtfInteresMax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfInteresMin = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcbIncremento = new javax.swing.JComboBox<>();
        jScrollPanel1 = new javax.swing.JScrollPane();
        jbtCalculoPagos = new javax.swing.JButton();
        jbtCalculoAmort = new javax.swing.JButton();
        jmbarBarraDeMenus = new javax.swing.JMenuBar();
        jmnuOpciones = new javax.swing.JMenu();
        jmItemInstruc = new javax.swing.JMenuItem();
        jSeparador1 = new javax.swing.JPopupMenu.Separator();
        jmItemSalir = new javax.swing.JMenuItem();
        jmnuPrestamoEn = new javax.swing.JMenu();
        jmItemAños = new javax.swing.JMenuItem();
        jmItemMeses = new javax.swing.JMenuItem();
        jmnuAyuda = new javax.swing.JMenu();
        jmItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prestamo bancario");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setText("Credito:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(15, 10, 50, 16);

        jtfCredito.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfCredito.setText("6000");
        getContentPane().add(jtfCredito);
        jtfCredito.setBounds(65, 10, 105, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Duracion del prestamo"));
        jPanel1.setLayout(null);

        jLabel2.setText("Maximo:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 20, 55, 16);

        jtfPeriodoMax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfPeriodoMax.setText("18");
        jPanel1.add(jtfPeriodoMax);
        jtfPeriodoMax.setBounds(75, 20, 80, 20);

        jLabel3.setText("Minimo:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 55, 55, 16);

        jtfPeriodoMin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfPeriodoMin.setText("1");
        jPanel1.add(jtfPeriodoMin);
        jtfPeriodoMin.setBounds(75, 55, 80, 20);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 45, 165, 90);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de interes"));
        jPanel2.setLayout(null);

        jLabel4.setText("% maximo:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 20, 55, 16);

        jtfInteresMax.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfInteresMax.setText("10.00");
        jPanel2.add(jtfInteresMax);
        jtfInteresMax.setBounds(75, 20, 80, 20);

        jLabel5.setText("% minimo:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 55, 55, 16);

        jtfInteresMin.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtfInteresMin.setText("0.00");
        jPanel2.add(jtfInteresMin);
        jtfInteresMin.setBounds(75, 55, 80, 20);

        jLabel6.setText("Incremento:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(10, 80, 75, 20);

        jcbIncremento.setEditable(true);
        jcbIncremento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0.10", "0.25", "0.50", "1.00" }));
        jcbIncremento.setSelectedIndex(2);
        jPanel2.add(jcbIncremento);
        jcbIncremento.setBounds(90, 80, 65, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(5, 140, 165, 115);
        getContentPane().add(jScrollPanel1);
        jScrollPanel1.setBounds(180, 10, 290, 310);

        jbtCalculoPagos.setText("Pagos");
        jbtCalculoPagos.addActionListener(evt -> jbtCalculoPagosActionPerformed(evt));
        getContentPane().add(jbtCalculoPagos);
        jbtCalculoPagos.setBounds(10, 260, 155, 26);

        jbtCalculoAmort.setEnabled(false);
        jbtCalculoAmort.setText("Amortizacion");
        jbtCalculoAmort.addActionListener(evt -> jbtCalculoAmortActionPerformed(evt));
        getContentPane().add(jbtCalculoAmort);
        jbtCalculoAmort.setBounds(10, 296, 155, 26);

        jmnuOpciones.setText("Opciones");

        jmItemInstruc.setText("Instrucciones...");
        jmItemInstruc.addActionListener(evt -> jmItemInstrucActionPerformed(evt));
        jmnuOpciones.add(jmItemInstruc);
        jmnuOpciones.add(jSeparador1);

        jmItemSalir.setText("Salir");
        jmItemSalir.addActionListener(evt -> jmItemSalirActionPerformed(evt));
        jmnuOpciones.add(jmItemSalir);

        jmbarBarraDeMenus.add(jmnuOpciones);

        jmnuPrestamoEn.setText("Prestamo en...");

        jmItemAños.setEnabled(false);
        jmItemAños.setText("Años");
        jmItemAños.addActionListener(evt -> jmItemAñosMesesActionPerformed(evt));
        jmnuPrestamoEn.add(jmItemAños);

        jmItemMeses.setText("Meses");
        jmItemMeses.addActionListener(evt -> jmItemAñosMesesActionPerformed(evt));
        jmnuPrestamoEn.add(jmItemMeses);

        jmbarBarraDeMenus.add(jmnuPrestamoEn);

        jmnuAyuda.setText("Ayuda");

        jmItemAcercaDe.setText("Acerca de Prestamo...");
        jmItemAcercaDe.addActionListener(evt -> jmItemAcercaDeActionPerformed(evt));
        jmnuAyuda.add(jmItemAcercaDe);

        jmbarBarraDeMenus.add(jmnuAyuda);

        setJMenuBar(jmbarBarraDeMenus);

        setSize(new java.awt.Dimension(491, 385));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void exitForm(java.awt.event.WindowEvent evt) {
        System.exit(0);
    }

    private void jmItemSalirActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jmItemInstrucActionPerformed(java.awt.event.ActionEvent evt) {
        String mensaje = "Introduzca el credito, la duracion del prestamo y el tipo\n"
                + "de interes. Pulse el boton [Pagos] para visualizar\n"
                + "los pagos mensuales en la rejilla.\n\n"
                + "Elija un pago mensual y pulse el boton [Amortizacion]\n"
                + "para visualizar el plan de amortizacion para el interes\n"
                + "y periodos correspondientes a la celda elegida.";
        javax.swing.JOptionPane.showMessageDialog(null, mensaje, "Instrucciones", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void jmItemAñosMesesActionPerformed(java.awt.event.ActionEvent evt) {
        Object item = evt.getSource();
        String tituloMarco;
        if (item == jmItemAños) {
            jmItemAños.setEnabled(false);
            jmItemMeses.setEnabled(true);
            tituloMarco = "Años del prestamo";
        } else {
            jmItemAños.setEnabled(true);
            jmItemMeses.setEnabled(false);
            tituloMarco = "Meses del prestamo";
        }
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(tituloMarco));
        jPanel1.repaint();
    }

    private void jmItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {
        String mensaje = "Aplicacion Prestamo. Version 1.0\nCopyright (c) Diego Chocochic, 2026";
        javax.swing.JOptionPane.showMessageDialog(null, mensaje, "Acerca de Prestamo", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }

    private void initTable(final int filasTabla, final int colsTabla) {
        javax.swing.table.DefaultTableModel modeloDatos = new javax.swing.table.DefaultTableModel(filasTabla, colsTabla) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        javax.swing.table.DefaultTableModel modeloFilas = new javax.swing.table.DefaultTableModel(filasTabla, 1) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        jtablaPrestamo = new javax.swing.JTable(modeloDatos);
        jtablaPrestamo.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtablaPrestamo.setFont(new java.awt.Font("Courier New", 0, 12));
        jtablaPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtablaPrestamoMouseClicked(evt);
            }
        });

        jtablaCabsFilas = new javax.swing.JTable(modeloFilas);
        jtablaCabsFilas.setBackground(java.awt.Color.lightGray);
        jtablaCabsFilas.setSelectionBackground(java.awt.Color.lightGray);
        jtablaCabsFilas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtablaCabsFilas.setFont(new java.awt.Font("Courier New", 0, 12));
        jtablaCabsFilas.getColumnModel().getColumn(0).setPreferredWidth(55);

        jtablaPrestamo.setSelectionModel(jtablaCabsFilas.getSelectionModel());

        jScrollPanel1.setViewportView(jtablaPrestamo);
        jScrollPanel1.setRowHeaderView(jtablaCabsFilas);
    }

    private void jbtCalculoPagosActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            credito = Double.parseDouble(jtfCredito.getText());
            periodoMin = Integer.parseInt(jtfPeriodoMin.getText());
            periodoMax = Integer.parseInt(jtfPeriodoMax.getText());
            interesMin = Double.parseDouble(jtfInteresMin.getText());
            interesMax = Double.parseDouble(jtfInteresMax.getText());
            incremento = Double.parseDouble((String) jcbIncremento.getSelectedItem());
            if (credito <= 0 || periodoMin <= 0 || periodoMax <= 0 || periodoMax < periodoMin
                    || interesMin < 0 || interesMax < 0 || interesMax < interesMin || incremento <= 0)
                throw new NumberFormatException();
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Datos no validos", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        tiposIntrs = (int) ((interesMax - interesMin) / incremento) + 1;
        añosMeses = (periodoMax - periodoMin) + 1;

        int filas = tiposIntrs, cols = añosMeses;
        if (tiposIntrs < 18) filas = 18;
        if (añosMeses < 4) cols = 4;

        initTable(filas, cols);

        for (int fila = 0; fila < tiposIntrs; ++fila)
            jtablaCabsFilas.setValueAt(AlinDer("##0.00", interesMin + incremento * fila) + "%", fila, 0);

        javax.swing.table.TableColumn colum;
        String per = (!jmItemAños.isEnabled()) ? " años" : " meses";
        for (int columna = 0; columna < añosMeses; ++columna) {
            colum = jtablaPrestamo.getColumnModel().getColumn(columna);
            colum.setHeaderValue((periodoMin + columna) + per);
        }

        int P = (!jmItemAños.isEnabled()) ? 12 : 1;

        double interes = 0.0, pago = 0.0;
        int meses;
        for (int fila = 0; fila < tiposIntrs; ++fila) {
            String sinteres = jtablaCabsFilas.getValueAt(fila, 0).toString();
            sinteres = sinteres.substring(0, sinteres.indexOf('%'));
            sinteres = sinteres.replace(',', '.').trim();
            interes = Double.parseDouble(sinteres);
            interes = interes / 100 / 12;

            for (int columna = 0; columna < añosMeses; ++columna) {
                colum = jtablaPrestamo.getColumnModel().getColumn(columna);
                String smeses = (String) colum.getHeaderValue();
                smeses = smeses.substring(0, smeses.indexOf(' '));
                meses = Integer.parseInt(smeses) * P;

                if (interes == 0.0)
                    pago = credito / meses;
                else
                    pago = credito * (interes / (1 - (1 / Math.pow(1.0 + interes, (double) meses))));

                jtablaPrestamo.setValueAt(AlinDer("###,###.00", pago), fila, columna);
            }
        }

        tablaPagos = true;
        jbtCalculoAmort.setEnabled(false);
    }

    private void jtablaPrestamoMouseClicked(java.awt.event.MouseEvent evt) {
        if (jtablaPrestamo.getSelectedRow() < 0 || jtablaPrestamo.getSelectedColumn() < 0) return;

        Object datoCelda = jtablaPrestamo.getValueAt(jtablaPrestamo.getSelectedRow(), jtablaPrestamo.getSelectedColumn());

        if (datoCelda != null && tablaPagos) {
            StringBuffer s = new StringBuffer(datoCelda.toString().trim());
            for (int i = 0; i < s.length(); ++i) {
                if (s.charAt(i) == ',') { s.delete(i, i + 1); --i; }
                else if (s.charAt(i) == '.') s.setCharAt(i, '.');
            }
            try {
                pagoMensual = Double.parseDouble(s.toString());
                jbtCalculoAmort.setEnabled(true);
            } catch (NumberFormatException e) {
                jbtCalculoAmort.setEnabled(false);
            }
        }
    }

    private void jbtCalculoAmortActionPerformed(java.awt.event.ActionEvent evt) {
        int fila = jtablaPrestamo.getSelectedRow();
        int columna = jtablaPrestamo.getSelectedColumn();

        String sinteres = (String) jtablaCabsFilas.getValueAt(fila, 0);
        sinteres = sinteres.substring(0, sinteres.indexOf('%'));
        sinteres = sinteres.replace(',', '.').trim();
        double interes = Double.parseDouble(sinteres) / 100 / 12;

        int P = (!jmItemAños.isEnabled()) ? 12 : 1;

        javax.swing.table.TableColumn colum = jtablaPrestamo.getColumnModel().getColumn(columna);
        String smeses = (String) colum.getHeaderValue();
        smeses = smeses.substring(0, smeses.indexOf(' '));
        int meses = Integer.parseInt(smeses) * P;

        int filas = meses, cols = 4;
        if (filas < 18) filas = 18;

        initTable(filas, cols);

        for (int mes = 0; mes < meses; ++mes)
            jtablaCabsFilas.setValueAt(AlinDer("####", mes + 1).toString(), mes, 0);

        String cab[] = { "Capital", "Intereses", "Capital pendiente", "Total intereses" };
        for (int c = 0; c < 4; ++c) {
            colum = jtablaPrestamo.getColumnModel().getColumn(c);
            colum.setHeaderValue(cab[c]);
        }

        double interesesMensuales, creditoPendiente = credito, totalIntereses = 0.0;
        double capitalMensualAmort;
        String formato = "###,###.00";

        for (int mes = 0; mes < meses; ++mes) {
            interesesMensuales = creditoPendiente * interes;
            capitalMensualAmort = pagoMensual - interesesMensuales;
            creditoPendiente -= capitalMensualAmort;
            totalIntereses += interesesMensuales;

            jtablaPrestamo.setValueAt(AlinDer(formato, capitalMensualAmort), mes, 0);
            jtablaPrestamo.setValueAt(AlinDer(formato, interesesMensuales), mes, 1);
            jtablaPrestamo.setValueAt(AlinDer(formato, creditoPendiente), mes, 2);
            jtablaPrestamo.setValueAt(AlinDer(formato, totalIntereses), mes, 3);
        }

        jbtCalculoAmort.setEnabled(false);
        tablaPagos = false;
    }

    private StringBuffer AlinDer(String patron, double dato) {
        java.text.FieldPosition fp = new java.text.FieldPosition(java.text.NumberFormat.FRACTION_FIELD);
        java.text.DecimalFormat formato = new java.text.DecimalFormat(patron);
        StringBuffer salida = new StringBuffer();
        formato.format(dato, salida, fp);
        for (int i = 0; i < (patron.length() - salida.length()); i++)
            salida.insert(0, ' ');
        return salida;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Prestamo().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPanel1;
    private javax.swing.JPopupMenu.Separator jSeparador1;
    private javax.swing.JButton jbtCalculoAmort;
    private javax.swing.JButton jbtCalculoPagos;
    private javax.swing.JComboBox<String> jcbIncremento;
    private javax.swing.JMenuItem jmItemAcercaDe;
    private javax.swing.JMenuItem jmItemAños;
    private javax.swing.JMenuItem jmItemInstruc;
    private javax.swing.JMenuItem jmItemMeses;
    private javax.swing.JMenuItem jmItemSalir;
    private javax.swing.JMenuBar jmbarBarraDeMenus;
    private javax.swing.JMenu jmnuAyuda;
    private javax.swing.JMenu jmnuOpciones;
    private javax.swing.JMenu jmnuPrestamoEn;
    private javax.swing.JTextField jtfCredito;
    private javax.swing.JTextField jtfInteresMax;
    private javax.swing.JTextField jtfInteresMin;
    private javax.swing.JTextField jtfPeriodoMax;
    private javax.swing.JTextField jtfPeriodoMin;
    // End of variables declaration                   

    private javax.swing.JTable jtablaPrestamo;
    private javax.swing.JTable jtablaCabsFilas;

    private int tiposIntrs = 18;
    private int añosMeses = 4;
    private double credito;
    private int periodoMax, periodoMin;
    private double interesMax, interesMin;
    private double incremento;
    private double pagoMensual = 0.0;
    private boolean tablaPagos = false;
}