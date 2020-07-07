import p.*;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Kushashu (Contact : Kushashu21@gmail.com)
 */
public class atm_design extends javax.swing.JFrame {

        functions f = new functions();
        Basic_function bf = new Basic_function();
        private String user = "";
        private String Pin = "";
        private String method_type = "";
        private String pin_method_type = "Old_Pin_change";
        private String first_name = "";
        private String last_name = "";
        private String gender = "";
        private String address = "";
        private String age = "";
        private String acc_ty = "";
        private String amount = "";
        private String mob_no = "";
        private String Benificiery_account = "";

        private void SetScreen(Component Screen_name) {
                Main_panel.removeAll();
                Main_panel.repaint();
                Main_panel.revalidate();
                Main_panel.add(Screen_name);
                Main_panel.repaint();
                Main_panel.revalidate();
        }

        private void clear_Account_record() {
                Account_detail_firstname_textfield.setText("");
                account_detail_Address_testfield.setText("");
                account_detail_balance_TextField.setText("");
                account_detail_lastname_testfield.setText("");
                account_detail_mobile_textfield.setText("");
                pin_Password.setText("");
                account_detail_balance_TextField.setText("");
        }

        private void clear_transfer_Account_details() {
                TransferPanelBenificiary_Account_textfield.setText("");
                TransferPanelConfirmBeneficiary_account_textfield.setText("");
                TransferPanelTransfer_money_amount_textfield.setText("");
        }

        private void BackToLogin() {
                user = "";
                Pin = "";
                userId.setText("");
                pin_Password.setText("");
                SetScreen(Login_Panel);
        }

        public atm_design() {
                initComponents();
        }

        // starting
        private void initComponents() {

                buttonGroup1 = new javax.swing.ButtonGroup();
                buttonGroup2 = new javax.swing.ButtonGroup();
                Main_panel = new javax.swing.JPanel();
                Login_Panel = new javax.swing.JPanel();
                jPanel1 = new javax.swing.JPanel();
                enter_button_Login = new javax.swing.JButton();
                jLabel9 = new javax.swing.JLabel();
                userId = new javax.swing.JTextField();
                jLabel10 = new javax.swing.JLabel();
                pin_Password = new javax.swing.JPasswordField();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                create_account_Button = new javax.swing.JButton();
                Option_panel = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jPanel6 = new javax.swing.JPanel();
                Quit_option = new javax.swing.JButton();
                Pin_change_option = new javax.swing.JButton();
                balance_enquiry_option = new javax.swing.JButton();
                Transfer_Option = new javax.swing.JButton();
                Cash_withdrowl_option = new javax.swing.JButton();
                Deposit_option = new javax.swing.JButton();
                Account_Type_Panel = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();
                Confirm_button = new javax.swing.JButton();
                Cancel_button = new javax.swing.JButton();
                Currunt_acc_RadioButton2 = new javax.swing.JRadioButton();
                saving_acc_RadioButton = new javax.swing.JRadioButton();
                jLabel8 = new javax.swing.JLabel();
                Deposit_panel = new javax.swing.JPanel();
                deposit_page_heading = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                cancel_button = new javax.swing.JButton();
                DepositPanelconfirm_button = new javax.swing.JButton();
                jLabel3 = new javax.swing.JLabel();
                DepositPanelamount_TextField = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                Balance_enquiry = new javax.swing.JPanel();
                jPanel7 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                BalanceEquiryBalance = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                BalanceEquiryAccountNumber = new javax.swing.JLabel();
                Balance_enquiryOk_button = new javax.swing.JButton();
                jLabel35 = new javax.swing.JLabel();
                jLabel36 = new javax.swing.JLabel();
                account_creation = new javax.swing.JPanel();
                jLabel13 = new javax.swing.JLabel();
                jPanel5 = new javax.swing.JPanel();
                jLabel14 = new javax.swing.JLabel();
                account_detail_lastname_testfield = new javax.swing.JTextField();
                Account_detail_firstname_textfield = new javax.swing.JTextField();
                jLabel15 = new javax.swing.JLabel();
                account_detail_Address_testfield = new javax.swing.JTextField();
                jLabel16 = new javax.swing.JLabel();
                account_detail_balance_TextField = new javax.swing.JTextField();
                jLabel17 = new javax.swing.JLabel();
                account_detail_mobile_textfield = new javax.swing.JTextField();
                jLabel19 = new javax.swing.JLabel();
                jLabel20 = new javax.swing.JLabel();
                account_detail_male_radio = new javax.swing.JRadioButton();
                account_detail_female_radio = new javax.swing.JRadioButton();
                jLabel21 = new javax.swing.JLabel();
                account_detail_age_ComboBox = new javax.swing.JComboBox<>();
                jLabel22 = new javax.swing.JLabel();
                account_detail_acctype_ComboBox = new javax.swing.JComboBox<>();
                account_detail_Exit_button = new javax.swing.JButton();
                account_detail_confirm_button = new javax.swing.JButton();
                jLabel18 = new javax.swing.JLabel();
                pin_generation = new javax.swing.JPanel();
                jPanel4 = new javax.swing.JPanel();
                jLabel23 = new javax.swing.JLabel();
                jLabel24 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();
                PinGenerationPanelConfirm_button = new javax.swing.JButton();
                cancel_button_pin_generation = new javax.swing.JButton();
                PinGeneration_Confirm_pin = new javax.swing.JPasswordField();
                PinGeneration_New_pin = new javax.swing.JPasswordField();
                jLabel34 = new javax.swing.JLabel();
                Transfer_Panel = new javax.swing.JPanel();
                jPanel8 = new javax.swing.JPanel();
                jLabel28 = new javax.swing.JLabel();
                jLabel29 = new javax.swing.JLabel();
                jLabel30 = new javax.swing.JLabel();
                jLabel31 = new javax.swing.JLabel();
                TransferPanelSenderAccountNo_Label = new javax.swing.JLabel();
                TransferPanelConfirmBeneficiary_account_textfield = new javax.swing.JTextField();
                TransferPanelTransfer_money_amount_textfield = new javax.swing.JTextField();
                TransferPanelBenificiary_Account_textfield = new javax.swing.JTextField();
                TransferPanelExit_Button = new javax.swing.JButton();
                TransferPanelConfirm_Button = new javax.swing.JButton();
                jLabel32 = new javax.swing.JLabel();
                jLabel27 = new javax.swing.JLabel();
                jLabel33 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Project Bank ATM");
                setResizable(false);

                Main_panel.setLayout(new java.awt.CardLayout());

                Login_Panel.setBackground(new java.awt.Color(102, 0, 51));

                jPanel1.setBackground(new java.awt.Color(204, 0, 102));
                jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED,
                                new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0),
                                new java.awt.Color(204, 51, 0), new java.awt.Color(204, 51, 0)));

                enter_button_Login.setBackground(new java.awt.Color(204, 0, 102));
                enter_button_Login.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                enter_button_Login.setForeground(new java.awt.Color(255, 255, 255));
                enter_button_Login.setText("ENTER");
                enter_button_Login.setBorder(null);
                enter_button_Login.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                enter_button_LoginActionPerformed(evt);
                        }
                });

                jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(255, 255, 255));
                jLabel9.setText("Enter Pin :");

                userId.setBackground(new java.awt.Color(204, 0, 102));
                userId.setColumns(7);
                userId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                userId.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 102), 2, true));
                userId.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                userIdActionPerformed(evt);
                        }
                });

                jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                jLabel10.setForeground(new java.awt.Color(255, 255, 255));
                jLabel10.setText("UserId :");

                pin_Password.setBackground(new java.awt.Color(204, 0, 102));
                pin_Password.setColumns(6);
                pin_Password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                pin_Password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 102), 2, true));

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(249, 249, 249)
                                                                .addComponent(enter_button_Login,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                233,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(113, 113, 113)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel9,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                184,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel10,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                184,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(27, 27, 27)
                                                                                                .addGroup(jPanel1Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(pin_Password)
                                                                                                                .addComponent(userId,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                319,
                                                                                                                                Short.MAX_VALUE))))))
                                                .addContainerGap(113, Short.MAX_VALUE)));
                jPanel1Layout.setVerticalGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup().addGap(59, 59, 59)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(userId,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                60,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel10,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                57,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(52, 52, 52)
                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel9,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                38,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(pin_Password,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                63,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(74, 74, 74)
                                                .addComponent(enter_button_Login,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(88, Short.MAX_VALUE)));

                jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel11.setForeground(new java.awt.Color(255, 255, 255));
                jLabel11.setText("*******  We Are Ready To serve You  *******");

                jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(255, 255, 255));
                jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel12.setText("**** WELCOME IN PROJECT BANK ****");

                create_account_Button.setBackground(new java.awt.Color(204, 0, 102));
                create_account_Button.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
                create_account_Button.setForeground(new java.awt.Color(255, 255, 255));
                create_account_Button.setText("Create New Account ");
                create_account_Button
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 102), 1, true));
                create_account_Button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                create_account_ButtonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout Login_PanelLayout = new javax.swing.GroupLayout(Login_Panel);
                Login_Panel.setLayout(Login_PanelLayout);
                Login_PanelLayout.setHorizontalGroup(Login_PanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout
                                                .createSequentialGroup().addContainerGap(280, Short.MAX_VALUE)
                                                .addGroup(Login_PanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel12,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                760,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(Login_PanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                Login_PanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(create_account_Button,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                235,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(45, 45, 45))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                Login_PanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jPanel1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(275, 275,
                                                                                                                                275))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                Login_PanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel11,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                570,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(369, 369,
                                                                                                                                369))))));
                Login_PanelLayout.setVerticalGroup(Login_PanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Login_PanelLayout
                                                .createSequentialGroup().addContainerGap(85, Short.MAX_VALUE)
                                                .addComponent(jLabel12).addGap(38, 38, 38)
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48)
                                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(62, 62, 62)
                                                .addComponent(create_account_Button,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 51,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)));

                Main_panel.add(Login_Panel, "card11");

                Option_panel.setBackground(new java.awt.Color(102, 0, 51));

                jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 60)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Project Bank Of India");

                jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(255, 255, 255));
                jLabel2.setText("Select Transaction");

                jPanel6.setBackground(new java.awt.Color(204, 0, 102));

                Quit_option.setBackground(new java.awt.Color(102, 102, 102));
                Quit_option.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                Quit_option.setForeground(new java.awt.Color(255, 255, 255));
                Quit_option.setText("QUIT");
                Quit_option.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Quit_optionActionPerformed(evt);
                        }
                });

                Pin_change_option.setBackground(new java.awt.Color(102, 102, 102));
                Pin_change_option.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                Pin_change_option.setForeground(new java.awt.Color(255, 255, 255));
                Pin_change_option.setText("PIN CHANGE");
                Pin_change_option.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Pin_change_optionActionPerformed(evt);
                        }
                });

                balance_enquiry_option.setBackground(new java.awt.Color(102, 102, 102));
                balance_enquiry_option.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                balance_enquiry_option.setForeground(new java.awt.Color(255, 255, 255));
                balance_enquiry_option.setText("BALANCE ENQUIRY");
                balance_enquiry_option.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                balance_enquiry_optionActionPerformed(evt);
                        }
                });

                Transfer_Option.setBackground(new java.awt.Color(102, 102, 102));
                Transfer_Option.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                Transfer_Option.setForeground(new java.awt.Color(255, 255, 255));
                Transfer_Option.setText("TRANSFER MONEY");
                Transfer_Option.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Transfer_OptionActionPerformed(evt);
                        }
                });

                Cash_withdrowl_option.setBackground(new java.awt.Color(102, 102, 102));
                Cash_withdrowl_option.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                Cash_withdrowl_option.setForeground(new java.awt.Color(255, 255, 255));
                Cash_withdrowl_option.setText("CASH WITHDROWAL");
                Cash_withdrowl_option.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Cash_withdrowl_optionActionPerformed(evt);
                        }
                });

                Deposit_option.setBackground(new java.awt.Color(102, 102, 102));
                Deposit_option.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                Deposit_option.setForeground(new java.awt.Color(255, 255, 255));
                Deposit_option.setText("DEPOSIT MONEY");
                Deposit_option.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Deposit_optionActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(jPanel6Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel6Layout.createSequentialGroup().addGap(107, 107, 107)
                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(Transfer_Option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                314,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Deposit_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                314,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Pin_change_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                314,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                271, Short.MAX_VALUE)
                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(Quit_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                314,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Cash_withdrowl_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                314,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(balance_enquiry_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                314,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(104, 104, 104)));
                jPanel6Layout.setVerticalGroup(jPanel6Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout
                                                .createSequentialGroup().addGap(57, 57, 57)
                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(Transfer_Option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                72,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(balance_enquiry_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                72,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76,
                                                                Short.MAX_VALUE)
                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(Deposit_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                72,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Cash_withdrowl_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                72,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(85, 85, 85)
                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(Pin_change_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                72,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Quit_option,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                72,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(62, 62, 62)));

                javax.swing.GroupLayout Option_panelLayout = new javax.swing.GroupLayout(Option_panel);
                Option_panel.setLayout(Option_panelLayout);
                Option_panelLayout.setHorizontalGroup(Option_panelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Option_panelLayout.createSequentialGroup().addGap(532, 532, 532)
                                                .addComponent(jLabel2).addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Option_panelLayout
                                                .createSequentialGroup().addContainerGap(106, Short.MAX_VALUE)
                                                .addGroup(Option_panelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                Option_panelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(99, 99, 99))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                Option_panelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                596,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(352, 352,
                                                                                                                352)))));
                Option_panelLayout.setVerticalGroup(Option_panelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Option_panelLayout.createSequentialGroup().addGap(36, 36, 36)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(41, 41, 41)
                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(115, Short.MAX_VALUE)));

                Main_panel.add(Option_panel, "card2");

                Account_Type_Panel.setBackground(new java.awt.Color(102, 0, 51));

                jPanel3.setBackground(new java.awt.Color(204, 0, 102));

                Confirm_button.setBackground(new java.awt.Color(204, 0, 102));
                Confirm_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                Confirm_button.setForeground(new java.awt.Color(255, 255, 255));
                Confirm_button.setText("Confirm");
                Confirm_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Confirm_buttonActionPerformed(evt);
                        }
                });

                Cancel_button.setBackground(new java.awt.Color(204, 0, 102));
                Cancel_button.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                Cancel_button.setForeground(new java.awt.Color(255, 255, 255));
                Cancel_button.setText("Cancel");
                Cancel_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Cancel_buttonActionPerformed(evt);
                        }
                });

                Currunt_acc_RadioButton2.setBackground(new java.awt.Color(204, 0, 102));
                buttonGroup1.add(Currunt_acc_RadioButton2);
                Currunt_acc_RadioButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                Currunt_acc_RadioButton2.setForeground(new java.awt.Color(255, 255, 255));
                Currunt_acc_RadioButton2.setText("Current Account");

                saving_acc_RadioButton.setBackground(new java.awt.Color(204, 0, 102));
                buttonGroup1.add(saving_acc_RadioButton);
                saving_acc_RadioButton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                saving_acc_RadioButton.setForeground(new java.awt.Color(255, 255, 255));
                saving_acc_RadioButton.setText("Saving Account");
                saving_acc_RadioButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

                jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                jLabel8.setText("Select Your Account Type :");

                javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup().addGap(39, 39, 39)
                                                                .addComponent(jLabel8,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                610,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup().addGap(161, 161, 161)
                                                                .addComponent(Confirm_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                184,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(108, 108, 108).addComponent(Cancel_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                184,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel3Layout.createSequentialGroup().addGap(235, 235, 235)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(saving_acc_RadioButton,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                290,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(Currunt_acc_RadioButton2,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                290,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(123, Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(jPanel3Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup().addGap(23, 23, 23)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Currunt_acc_RadioButton2,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 55,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(saving_acc_RadioButton,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 64,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(58, 58, 58)
                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(Confirm_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                65,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(Cancel_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                65,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(86, Short.MAX_VALUE)));

                javax.swing.GroupLayout Account_Type_PanelLayout = new javax.swing.GroupLayout(Account_Type_Panel);
                Account_Type_Panel.setLayout(Account_Type_PanelLayout);
                Account_Type_PanelLayout.setHorizontalGroup(Account_Type_PanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Account_Type_PanelLayout
                                                .createSequentialGroup().addContainerGap(280, Short.MAX_VALUE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(263, 263, 263)));
                Account_Type_PanelLayout.setVerticalGroup(Account_Type_PanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Account_Type_PanelLayout.createSequentialGroup().addGap(172, 172, 172)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(242, Short.MAX_VALUE)));

                Main_panel.add(Account_Type_Panel, "card10");

                Deposit_panel.setBackground(new java.awt.Color(102, 0, 51));

                deposit_page_heading.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
                deposit_page_heading.setForeground(new java.awt.Color(255, 255, 255));
                deposit_page_heading.setText("Deposit Money :");

                jPanel2.setBackground(new java.awt.Color(204, 0, 102));

                cancel_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                cancel_button.setText("Cancel");
                cancel_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cancel_buttonActionPerformed(evt);
                        }
                });

                DepositPanelconfirm_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                DepositPanelconfirm_button.setText("Confirm");
                DepositPanelconfirm_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                DepositPanelconfirm_buttonActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(255, 255, 255));
                jLabel3.setText("*Enter Amount");

                DepositPanelamount_TextField.setBackground(new java.awt.Color(102, 0, 0));
                DepositPanelamount_TextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                DepositPanelamount_TextField.setForeground(new java.awt.Color(255, 255, 255));
                DepositPanelamount_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                DepositPanelamount_TextFieldActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(207, 207, 207)
                                                                .addComponent(DepositPanelconfirm_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                183,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(126, 126, 126).addComponent(cancel_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                182,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(251, 251, 251)
                                                                .addComponent(DepositPanelamount_TextField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                389,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel2Layout.createSequentialGroup().addGap(330, 330, 330)
                                                                .addComponent(jLabel3)))
                                                .addContainerGap(228, Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(jPanel2Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout
                                                .createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(43, 43, 43)
                                                .addComponent(DepositPanelamount_TextField,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 70,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addGroup(jPanel2Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(DepositPanelconfirm_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                59,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(cancel_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                59,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(225, 225, 225)));

                jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("*Enter Amount only in multiple of 100");

                javax.swing.GroupLayout Deposit_panelLayout = new javax.swing.GroupLayout(Deposit_panel);
                Deposit_panel.setLayout(Deposit_panelLayout);
                Deposit_panelLayout.setHorizontalGroup(Deposit_panelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Deposit_panelLayout.createSequentialGroup().addGap(90, 90, 90)
                                                .addComponent(deposit_page_heading,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 490,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(735, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Deposit_panelLayout
                                                .createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(Deposit_panelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                469,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jPanel2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(174, 174, 174)));
                Deposit_panelLayout.setVerticalGroup(Deposit_panelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Deposit_panelLayout
                                                .createSequentialGroup().addGap(83, 83, 83)
                                                .addComponent(deposit_page_heading,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 417,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(179, Short.MAX_VALUE)));

                Main_panel.add(Deposit_panel, "card3");

                Balance_enquiry.setBackground(new java.awt.Color(102, 0, 51));

                jPanel7.setBackground(new java.awt.Color(204, 0, 102));

                jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(255, 255, 255));
                jLabel5.setText("Balance :");

                BalanceEquiryBalance.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                BalanceEquiryBalance.setForeground(new java.awt.Color(51, 0, 51));
                BalanceEquiryBalance
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 2, true));

                jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                jLabel7.setText("Account Number :");

                BalanceEquiryAccountNumber.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                BalanceEquiryAccountNumber.setForeground(new java.awt.Color(51, 0, 51));
                BalanceEquiryAccountNumber
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 102), 2, true));

                Balance_enquiryOk_button.setBackground(new java.awt.Color(204, 0, 102));
                Balance_enquiryOk_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                Balance_enquiryOk_button.setForeground(new java.awt.Color(255, 255, 255));
                Balance_enquiryOk_button.setText("OK");
                Balance_enquiryOk_button
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 102), 2, true));
                Balance_enquiryOk_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                Balance_enquiryOk_buttonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(jPanel7Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup().addGap(91, 91, 91)
                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                241,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                195,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(BalanceEquiryAccountNumber,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                389, Short.MAX_VALUE)
                                                                .addComponent(BalanceEquiryBalance,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout
                                                .createSequentialGroup().addContainerGap(314, Short.MAX_VALUE)
                                                .addComponent(Balance_enquiryOk_button,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 241,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(300, 300, 300)));
                jPanel7Layout.setVerticalGroup(jPanel7Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel7Layout.createSequentialGroup().addGap(71, 71, 71)
                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(BalanceEquiryAccountNumber,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                69,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel7,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                69,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                69,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(BalanceEquiryBalance,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                69,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(71, 71, 71)
                                                .addComponent(Balance_enquiryOk_button,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(101, Short.MAX_VALUE)));

                jLabel35.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                jLabel35.setForeground(new java.awt.Color(255, 255, 255));
                jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel35.setText("Balance Enquiry");

                jLabel36.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel36.setForeground(new java.awt.Color(255, 255, 255));
                jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel36.setText("Don't Forget to Click Ok Button");

                javax.swing.GroupLayout Balance_enquiryLayout = new javax.swing.GroupLayout(Balance_enquiry);
                Balance_enquiry.setLayout(Balance_enquiryLayout);
                Balance_enquiryLayout.setHorizontalGroup(Balance_enquiryLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Balance_enquiryLayout
                                                .createSequentialGroup().addContainerGap(241, Short.MAX_VALUE)
                                                .addGroup(Balance_enquiryLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                Balance_enquiryLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jLabel35,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                664,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(314, 314, 314))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                Balance_enquiryLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(Balance_enquiryLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jLabel36,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                855,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jPanel7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(219, 219,
                                                                                                                219)))));
                Balance_enquiryLayout.setVerticalGroup(Balance_enquiryLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Balance_enquiryLayout
                                                .createSequentialGroup().addContainerGap(95, Short.MAX_VALUE)
                                                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(34, 34, 34)
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(48, 48, 48).addComponent(jLabel36).addGap(164, 164, 164)));

                Main_panel.add(Balance_enquiry, "card7");

                account_creation.setBackground(new java.awt.Color(102, 0, 51));

                jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(255, 255, 255));
                jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel13.setText("Account Details");

                jPanel5.setBackground(new java.awt.Color(204, 0, 102));

                jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(255, 255, 255));
                jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel14.setText("Address :");

                account_detail_lastname_testfield.setBackground(new java.awt.Color(204, 0, 102));
                account_detail_lastname_testfield.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                account_detail_lastname_testfield.setToolTipText("");
                account_detail_lastname_testfield
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));

                Account_detail_firstname_textfield.setBackground(new java.awt.Color(204, 0, 102));
                Account_detail_firstname_textfield.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                Account_detail_firstname_textfield.setToolTipText("");
                Account_detail_firstname_textfield
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));

                jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(255, 255, 255));
                jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel15.setText(" Name :");

                account_detail_Address_testfield.setBackground(new java.awt.Color(204, 0, 102));
                account_detail_Address_testfield.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                account_detail_Address_testfield.setToolTipText("");
                account_detail_Address_testfield
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));

                jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel16.setForeground(new java.awt.Color(255, 255, 255));
                jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel16.setText("Age :");

                account_detail_balance_TextField.setBackground(new java.awt.Color(204, 0, 102));
                account_detail_balance_TextField.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                account_detail_balance_TextField.setToolTipText("");
                account_detail_balance_TextField
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));
                account_detail_balance_TextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                account_detail_balance_TextFieldActionPerformed(evt);
                        }
                });

                jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel17.setForeground(new java.awt.Color(255, 255, 255));
                jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel17.setText("*First Deposit :");

                account_detail_mobile_textfield.setBackground(new java.awt.Color(204, 0, 102));
                account_detail_mobile_textfield.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                account_detail_mobile_textfield.setToolTipText("");
                account_detail_mobile_textfield
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));

                jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel19.setForeground(new java.awt.Color(255, 255, 255));
                jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
                jLabel19.setText("Rs.");

                jLabel20.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel20.setForeground(new java.awt.Color(255, 255, 255));
                jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel20.setText("Gender :");

                account_detail_male_radio.setBackground(new java.awt.Color(204, 0, 102));
                buttonGroup2.add(account_detail_male_radio);
                account_detail_male_radio.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                account_detail_male_radio.setForeground(new java.awt.Color(255, 255, 255));
                account_detail_male_radio.setSelected(true);
                account_detail_male_radio.setText("Male");
                account_detail_male_radio.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                account_detail_male_radioActionPerformed(evt);
                        }
                });

                account_detail_female_radio.setBackground(new java.awt.Color(204, 0, 102));
                buttonGroup2.add(account_detail_female_radio);
                account_detail_female_radio.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                account_detail_female_radio.setForeground(new java.awt.Color(255, 255, 255));
                account_detail_female_radio.setText("Female");
                account_detail_female_radio.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                account_detail_female_radioActionPerformed(evt);
                        }
                });

                jLabel21.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel21.setForeground(new java.awt.Color(255, 255, 255));
                jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel21.setText("Mobile Number :");

                account_detail_age_ComboBox.setBackground(new java.awt.Color(204, 0, 102));
                account_detail_age_ComboBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                account_detail_age_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "18-28 years", "28-38 years", "38-48 years", "48-58 years",
                                                "58-68 years", "68-78 years", "78-88 years", "88-98 years" }));

                jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
                jLabel22.setForeground(new java.awt.Color(255, 255, 255));
                jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel22.setText("Account Type :");

                account_detail_acctype_ComboBox.setBackground(new java.awt.Color(204, 0, 102));
                account_detail_acctype_ComboBox.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                account_detail_acctype_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Saving Account ", "Current Account " }));

                account_detail_Exit_button.setBackground(new java.awt.Color(204, 0, 102));
                account_detail_Exit_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                account_detail_Exit_button.setForeground(new java.awt.Color(255, 255, 255));
                account_detail_Exit_button.setText("Exit ");
                account_detail_Exit_button
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
                account_detail_Exit_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                account_detail_Exit_buttonActionPerformed(evt);
                        }
                });

                account_detail_confirm_button.setBackground(new java.awt.Color(204, 0, 102));
                account_detail_confirm_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                account_detail_confirm_button.setForeground(new java.awt.Color(255, 255, 255));
                account_detail_confirm_button.setText("Create Account ");
                account_detail_confirm_button
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 51), 2, true));
                account_detail_confirm_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                account_detail_confirm_buttonActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(jPanel5Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                jPanel5Layout.createSequentialGroup()
                                                                                                .addGap(83, 83, 83)
                                                                                                .addComponent(jLabel14,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                134,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(account_detail_Address_testfield)
                                                                                                .addGap(107, 107, 107))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                jPanel5Layout.createSequentialGroup()
                                                                                                .addGap(95, 95, 95)
                                                                                                .addComponent(jLabel15)
                                                                                                .addGap(51, 51, 51)
                                                                                                .addComponent(Account_detail_firstname_textfield)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(account_detail_lastname_testfield,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                327,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                jPanel5Layout.createSequentialGroup()
                                                                                                .addGap(67, 67, 67)
                                                                                                .addGroup(jPanel5Layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                jPanel5Layout.createSequentialGroup()
                                                                                                                                                .addGap(8, 8, 8)
                                                                                                                                                .addComponent(jLabel20,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                137,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addComponent(account_detail_female_radio,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                139,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(account_detail_male_radio,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                100,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                164,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel16,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                108,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(account_detail_age_ComboBox,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                162,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(126, 126,
                                                                                                                                                                126))
                                                                                                                .addGroup(jPanel5Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGroup(jPanel5Layout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addGroup(jPanel5Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel21,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                221,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(account_detail_mobile_textfield,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                430,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(jPanel5Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel22,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                229,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                .addComponent(account_detail_acctype_ComboBox,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                188,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                                                .addGroup(jPanel5Layout
                                                                                                                                                                .createSequentialGroup()
                                                                                                                                                                .addComponent(jLabel17,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                221,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addGap(26, 26, 26)
                                                                                                                                                                .addComponent(jLabel19,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                43,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                .addPreferredGap(
                                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                .addComponent(account_detail_balance_TextField,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                390,
                                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                                .addGap(0, 282, Short.MAX_VALUE))
                                                                                                                .addGroup(jPanel5Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(145, 145,
                                                                                                                                                145)
                                                                                                                                .addComponent(account_detail_confirm_button,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                222,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(account_detail_Exit_button,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                222,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addGap(138, 138,
                                                                                                                                                138)))))
                                                .addGap(84, 84, 84)));
                jPanel5Layout.setVerticalGroup(jPanel5Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup().addGap(40, 40, 40)
                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(account_detail_lastname_testfield,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                55, Short.MAX_VALUE)
                                                                .addComponent(Account_detail_firstname_textfield,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                55, Short.MAX_VALUE)
                                                                .addComponent(jLabel15,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(36, 36, 36)
                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel14,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(account_detail_Address_testfield,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                55, Short.MAX_VALUE))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(account_detail_mobile_textfield,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                59,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel21,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                49,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel20,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                49,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(account_detail_male_radio)
                                                                .addComponent(account_detail_female_radio)
                                                                .addComponent(jLabel16,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                49,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(account_detail_age_ComboBox,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                35,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26,
                                                                Short.MAX_VALUE)
                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel22,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                49,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(account_detail_acctype_ComboBox,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                32,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(account_detail_balance_TextField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel19,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                57,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel17,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                49,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(account_detail_confirm_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(account_detail_Exit_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                46,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(78, 78, 78)));

                jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(255, 255, 255));
                jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel18.setText(
                                "* First Deposit should greater than 500Rs. and only Multiple of 100s are acceptable.");

                javax.swing.GroupLayout account_creationLayout = new javax.swing.GroupLayout(account_creation);
                account_creation.setLayout(account_creationLayout);
                account_creationLayout.setHorizontalGroup(account_creationLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(account_creationLayout.createSequentialGroup().addGroup(account_creationLayout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(account_creationLayout.createSequentialGroup()
                                                                .addGap(290, 290, 290).addComponent(jLabel13,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                636,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(account_creationLayout.createSequentialGroup()
                                                                .addGap(98, 98, 98).addComponent(jPanel5,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(99, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, account_creationLayout
                                                .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 873,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(192, 192, 192)));
                account_creationLayout.setVerticalGroup(account_creationLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(account_creationLayout.createSequentialGroup().addGap(47, 47, 47)
                                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE)));

                Main_panel.add(account_creation, "card12");

                pin_generation.setBackground(new java.awt.Color(102, 0, 51));

                jPanel4.setBackground(new java.awt.Color(204, 0, 102));

                jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(204, 204, 204));
                jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel23.setText(" Pin Generation :");

                jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel24.setForeground(new java.awt.Color(255, 255, 255));
                jLabel24.setText("Confirm Pin:");

                jLabel25.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel25.setForeground(new java.awt.Color(255, 255, 255));
                jLabel25.setText("*New Pin :");

                PinGenerationPanelConfirm_button.setBackground(new java.awt.Color(204, 0, 102));
                PinGenerationPanelConfirm_button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                PinGenerationPanelConfirm_button.setText("Confirm ");
                PinGenerationPanelConfirm_button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                PinGenerationPanelConfirm_buttonActionPerformed(evt);
                        }
                });

                cancel_button_pin_generation.setBackground(new java.awt.Color(204, 0, 102));
                cancel_button_pin_generation.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                cancel_button_pin_generation.setText("Cancel");
                cancel_button_pin_generation.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cancel_button_pin_generationActionPerformed(evt);
                        }
                });

                PinGeneration_Confirm_pin.setBackground(new java.awt.Color(204, 0, 102));
                PinGeneration_Confirm_pin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                PinGeneration_Confirm_pin
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 102), 2, true));

                PinGeneration_New_pin.setBackground(new java.awt.Color(204, 0, 102));
                PinGeneration_New_pin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                PinGeneration_New_pin
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 0, 102), 2, true));

                javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup().addGap(115, 115, 115)
                                                                .addComponent(jLabel23,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                719,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel4Layout.createSequentialGroup().addGap(283, 283, 283)
                                                                .addComponent(PinGenerationPanelConfirm_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                171,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(92, 92, 92)
                                                                .addComponent(cancel_button_pin_generation,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                166,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel4Layout.createSequentialGroup().addGap(230, 230, 230)
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                153,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                140,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(63, 63, 63)
                                                                .addComponent(PinGeneration_Confirm_pin,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                323,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(131, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout
                                                                .createSequentialGroup()
                                                                .addContainerGap(446, Short.MAX_VALUE)
                                                                .addComponent(PinGeneration_New_pin,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                323,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(196, 196, 196))));
                jPanel4Layout.setVerticalGroup(jPanel4Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup().addGroup(jPanel4Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup().addGap(83, 83, 83)
                                                                .addComponent(jLabel23).addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                138, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout
                                                                .createSequentialGroup().addContainerGap()
                                                                .addComponent(jLabel25,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(39, 39, 39)))
                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel24,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(PinGeneration_Confirm_pin,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(72, 72, 72)
                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(PinGenerationPanelConfirm_button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(cancel_button_pin_generation,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                55,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(102, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup().addGap(180, 180, 180)
                                                                .addComponent(PinGeneration_New_pin,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                54,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(299, Short.MAX_VALUE))));

                jLabel34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel34.setForeground(new java.awt.Color(255, 255, 255));
                jLabel34.setText("*Length  should equal to 5 ");

                javax.swing.GroupLayout pin_generationLayout = new javax.swing.GroupLayout(pin_generation);
                pin_generation.setLayout(pin_generationLayout);
                pin_generationLayout.setHorizontalGroup(pin_generationLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pin_generationLayout.createSequentialGroup().addGap(156, 156, 156)
                                                .addGroup(pin_generationLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel34,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                322,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jPanel4,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(194, Short.MAX_VALUE)));
                pin_generationLayout.setVerticalGroup(pin_generationLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pin_generationLayout.createSequentialGroup().addGap(123, 123, 123)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel34).addContainerGap(192, Short.MAX_VALUE)));

                Main_panel.add(pin_generation, "card13");

                Transfer_Panel.setBackground(new java.awt.Color(102, 0, 51));

                jPanel8.setBackground(new java.awt.Color(204, 0, 102));

                jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel28.setForeground(new java.awt.Color(255, 255, 255));
                jLabel28.setText("Confirm Beneficiary Account : ");

                jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel29.setForeground(new java.awt.Color(255, 255, 255));
                jLabel29.setText("Beneficiary Account : ");

                jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel30.setForeground(new java.awt.Color(255, 255, 255));
                jLabel30.setText("Sender Account : ");

                jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel31.setForeground(new java.awt.Color(255, 255, 255));
                jLabel31.setText("*Transfer Amount :");

                TransferPanelSenderAccountNo_Label.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                TransferPanelSenderAccountNo_Label.setForeground(new java.awt.Color(51, 0, 51));
                TransferPanelSenderAccountNo_Label
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));

                TransferPanelConfirmBeneficiary_account_textfield.setBackground(new java.awt.Color(204, 0, 102));
                TransferPanelConfirmBeneficiary_account_textfield.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                TransferPanelConfirmBeneficiary_account_textfield
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));

                TransferPanelTransfer_money_amount_textfield.setBackground(new java.awt.Color(204, 0, 102));
                TransferPanelTransfer_money_amount_textfield.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                TransferPanelTransfer_money_amount_textfield
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));

                TransferPanelBenificiary_Account_textfield.setBackground(new java.awt.Color(204, 0, 102));
                TransferPanelBenificiary_Account_textfield.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                TransferPanelBenificiary_Account_textfield
                                .setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 0, 51), 2, true));

                TransferPanelExit_Button.setBackground(new java.awt.Color(204, 0, 102));
                TransferPanelExit_Button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                TransferPanelExit_Button.setForeground(new java.awt.Color(255, 255, 255));
                TransferPanelExit_Button.setText("Exit");
                TransferPanelExit_Button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                TransferPanelExit_ButtonActionPerformed(evt);
                        }
                });

                TransferPanelConfirm_Button.setBackground(new java.awt.Color(204, 0, 102));
                TransferPanelConfirm_Button.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                TransferPanelConfirm_Button.setForeground(new java.awt.Color(255, 255, 255));
                TransferPanelConfirm_Button.setText("Confirm");
                TransferPanelConfirm_Button.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                TransferPanelConfirm_ButtonActionPerformed(evt);
                        }
                });

                jLabel32.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
                jLabel32.setText("Rs.");

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(jPanel8Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup().addGap(55, 55, 55)
                                                .addGroup(jPanel8Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                                                .addComponent(jLabel29,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                230,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(TransferPanelBenificiary_Account_textfield,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                380,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                                                .addComponent(jLabel30,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                230,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(TransferPanelSenderAccountNo_Label,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                331,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                                                .addGroup(jPanel8Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(jLabel28)
                                                                                                .addGroup(jPanel8Layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(jLabel31,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                220,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jLabel32,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                78,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addPreferredGap(
                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(jPanel8Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(TransferPanelTransfer_money_amount_textfield,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                339,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(TransferPanelConfirmBeneficiary_account_textfield,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                380,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout
                                                .createSequentialGroup().addContainerGap(214, Short.MAX_VALUE)
                                                .addComponent(TransferPanelConfirm_Button,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 229,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(183, 183, 183)
                                                .addComponent(TransferPanelExit_Button,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 229,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(198, 198, 198)));
                jPanel8Layout.setVerticalGroup(jPanel8Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout
                                                .createSequentialGroup().addContainerGap(80, Short.MAX_VALUE)
                                                .addGroup(jPanel8Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                63,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(TransferPanelSenderAccountNo_Label,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                63,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40)
                                                .addGroup(jPanel8Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel29,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                63,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(TransferPanelBenificiary_Account_textfield,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                63,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(41, 41, 41)
                                                .addGroup(jPanel8Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel28,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                63,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(TransferPanelConfirmBeneficiary_account_textfield,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                63,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel8Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(jPanel8Layout.createSequentialGroup()
                                                                                .addGap(38, 38, 38)
                                                                                .addGroup(jPanel8Layout
                                                                                                .createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(jLabel31,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                63,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(TransferPanelTransfer_money_amount_textfield,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                63,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                jPanel8Layout.createSequentialGroup()
                                                                                                .addGap(45, 45, 45)
                                                                                                .addComponent(jLabel32,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                56,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(65, 65, 65)
                                                .addGroup(jPanel8Layout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(TransferPanelExit_Button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                64,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(TransferPanelConfirm_Button,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                64,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(34, 34, 34)));

                jLabel27.setBackground(new java.awt.Color(255, 255, 255));
                jLabel27.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
                jLabel27.setForeground(new java.awt.Color(255, 255, 255));
                jLabel27.setText("Transfer Money In a Single Click");

                jLabel33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
                jLabel33.setForeground(new java.awt.Color(255, 255, 255));
                jLabel33.setText("*Amount Should  in Multiple of 100 .");

                javax.swing.GroupLayout Transfer_PanelLayout = new javax.swing.GroupLayout(Transfer_Panel);
                Transfer_Panel.setLayout(Transfer_PanelLayout);
                Transfer_PanelLayout.setHorizontalGroup(Transfer_PanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Transfer_PanelLayout.createSequentialGroup().addGap(120, 120, 120)
                                                .addGroup(Transfer_PanelLayout.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jPanel8,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel27,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                769,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addContainerGap(142, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Transfer_PanelLayout
                                                .createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 294,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(493, 493, 493)));
                Transfer_PanelLayout.setVerticalGroup(Transfer_PanelLayout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Transfer_PanelLayout
                                                .createSequentialGroup().addContainerGap(97, Short.MAX_VALUE)
                                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)
                                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(28, 28, 28)
                                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 41,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap()));

                Main_panel.add(Transfer_Panel, "card9");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Main_panel, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                                javax.swing.GroupLayout.Alignment.TRAILING,
                                layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(Main_panel,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 890,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)));

                pack();
        }// </editor-fold>
         // end_starting

        private void Cash_withdrowl_optionActionPerformed(java.awt.event.ActionEvent evt) {
                deposit_page_heading.setText("WithDraw Money");
                SetScreen(Account_Type_Panel);
                method_type = "withdrowl";
        }

        private void Deposit_optionActionPerformed(java.awt.event.ActionEvent evt) {
                SetScreen(Account_Type_Panel);
                method_type = "deposit";
        }

        private void enter_button_LoginActionPerformed(java.awt.event.ActionEvent evt) {
                user = userId.getText().trim();
                Pin = String.valueOf(pin_Password.getPassword());
                if (f.Check_user(user, Pin)) {
                        SetScreen(Option_panel);

                } else {
                        JOptionPane.showMessageDialog(this, "Invalid User");
                        userId.setText("");
                        pin_Password.setText("");
                }
        }

        private void DepositPanelamount_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void Confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        if (Currunt_acc_RadioButton2.isSelected()) {
                                acc_ty = "Current Account";
                                if (acc_ty.equals(f.check_Account_type(Integer.parseInt(user)))) {
                                        SetScreen(Deposit_panel);
                                } else {
                                        JOptionPane.showMessageDialog(this, " Invalid Account type", " ? ", 1);
                                        BackToLogin();
                                }

                        } else if (saving_acc_RadioButton.isSelected()) {
                                acc_ty = "Saving Account";
                                if (acc_ty.equals(f.check_Account_type(Integer.parseInt(user)))) {
                                        SetScreen(Deposit_panel);
                                } else {
                                        JOptionPane.showMessageDialog(this, " Invalid Account Type", " ? ", 1);
                                        BackToLogin();
                                }
                        } else {
                                JOptionPane.showMessageDialog(this, " Select Your Account Type ",
                                                " No Account Selected  ", 1);
                        }

                } catch (Exception e) {

                }

        }

        private void account_detail_male_radioActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void account_detail_female_radioActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void PinGenerationPanelConfirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {
                String new_pin1 = PinGeneration_New_pin.getText().trim();
                String confirm_pin = PinGeneration_Confirm_pin.getText().trim();
                if (bf.isValidNewPin(new_pin1, confirm_pin)) {
                        if (pin_method_type.equals("New_account_creation")) {
                                String temp = f.Create_user_account(new_pin1, first_name, last_name, gender, address,
                                                mob_no, age, acc_ty, amount);
                                JOptionPane.showMessageDialog(this, temp);
                                PinGeneration_New_pin.setText("");
                                PinGeneration_Confirm_pin.setText("");
                                clear_Account_record();
                                BackToLogin();
                        } else {
                                if (f.update_new_password(Integer.parseInt(user), new_pin1)) {
                                        JOptionPane.showMessageDialog(this, "Pin Change SuccessFull",
                                                        "Request SuccessFul", 2);
                                        PinGeneration_New_pin.setText("");
                                        PinGeneration_Confirm_pin.setText("");
                                        BackToLogin();

                                }

                        }
                } else {
                        JOptionPane.showMessageDialog(this, " New Pin and Confirm are not Same ");

                }
        }

        private void cancel_button_pin_generationActionPerformed(java.awt.event.ActionEvent evt) {
                PinGeneration_New_pin.setText("");
                PinGeneration_Confirm_pin.setText("");
                clear_Account_record();
                BackToLogin();
        }

        private void Pin_change_optionActionPerformed(java.awt.event.ActionEvent evt) {
                pin_method_type = "Old_Pin_change";
                SetScreen(pin_generation);

        }

        private void create_account_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
                SetScreen(account_creation);
        }

        private void Cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {
                BackToLogin();
        }

        private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {
                DepositPanelamount_TextField.setText("");
                BackToLogin();
        }

        private void account_detail_Exit_buttonActionPerformed(java.awt.event.ActionEvent evt) {
                clear_Account_record();
                BackToLogin();
        }

        private void userIdActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        private void Quit_optionActionPerformed(java.awt.event.ActionEvent evt) {
                BackToLogin();
        }

        private void balance_enquiry_optionActionPerformed(java.awt.event.ActionEvent evt) {
                SetScreen(Balance_enquiry);
                BalanceEquiryAccountNumber.setText(user);
                BalanceEquiryBalance.setText(f.check_Balance(Integer.parseInt(user)));
        }

        private void Transfer_OptionActionPerformed(java.awt.event.ActionEvent evt) {
                TransferPanelSenderAccountNo_Label.setText(user);
                SetScreen(Transfer_Panel);
        }

        private void DepositPanelconfirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {
                String a = DepositPanelamount_TextField.getText().trim();
                String message = "";
                if (bf.isValidamount(a)) {
                        try {
                                message = f.Updated_Balance(Integer.parseInt(user), Pin, method_type, a);
                        } catch (Exception e) {
                                message = " Some Error Occured";
                        }
                        JOptionPane.showMessageDialog(this, message);
                        DepositPanelamount_TextField.setText("");
                        cancel_buttonActionPerformed(evt);
                } else {
                        JOptionPane.showMessageDialog(this, "Request Can't be Processed");
                }
        }

        private void Balance_enquiryOk_buttonActionPerformed(java.awt.event.ActionEvent evt) {
                BackToLogin();
                BalanceEquiryAccountNumber.setText("");
                BalanceEquiryBalance.setText("");
        }

        private void account_detail_confirm_buttonActionPerformed(java.awt.event.ActionEvent evt) {
                try {
                        pin_method_type = "New_account_creation";
                        first_name = Account_detail_firstname_textfield.getText().trim();
                        last_name = account_detail_lastname_testfield.getText().trim();
                        address = account_detail_Address_testfield.getText().trim();
                        mob_no = account_detail_mobile_textfield.getText().trim();
                        age = account_detail_age_ComboBox.getSelectedItem().toString();
                        amount = account_detail_balance_TextField.getText();
                        boolean temp = true;
                        if (Integer.parseInt(amount) <= 500) {
                                temp = false;
                                JOptionPane.showMessageDialog(this, "First Deposit Should Greater than 500");
                        }
                        if (account_detail_female_radio.isSelected())
                                gender = "F";
                        else
                                gender = "M";
                        acc_ty = account_detail_acctype_ComboBox.getSelectedItem().toString();

                        if (temp) {
                                if (bf.isValidAccountDetails(mob_no, address, first_name, last_name, amount)
                                                .equals("")) {
                                        SetScreen(pin_generation);
                                        clear_Account_record();
                                } else {
                                        JOptionPane.showMessageDialog(this, bf.isValidAccountDetails(mob_no, address,
                                                        first_name, last_name, amount), "Error", 3);
                                        clear_Account_record();
                                }

                        } else
                                JOptionPane.showMessageDialog(this, " Given Data is not Appropriate ",
                                                "Invalid Input provided", 3);

                } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "Please Enter Valid Data");
                }

        }

        private void TransferPanelConfirm_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
                Benificiery_account = TransferPanelBenificiary_Account_textfield.getText();
                String temp = TransferPanelConfirmBeneficiary_account_textfield.getText();
                if (Benificiery_account.equals(temp)) {
                        if (f.isbenificeiry_Exist(Integer.parseInt(Benificiery_account))) {
                                String amount_temp = TransferPanelTransfer_money_amount_textfield.getText();
                                if (bf.isValidamount(amount_temp)) {
                                        if (Long.parseLong(f.check_Balance(Integer.parseInt(user))) > Long
                                                        .parseLong(amount_temp)) {
                                                try {
                                                        f.Updated_Balance(Integer.parseInt(user), Pin, "withdrowl",
                                                                        amount_temp);
                                                        String result = f.Updated_Balance(
                                                                        Integer.parseInt(Benificiery_account), "-1",
                                                                        "Transfer_deposit", amount_temp);
                                                        JOptionPane.showMessageDialog(this, result);
                                                        clear_transfer_Account_details();
                                                        BackToLogin();
                                                } catch (Exception e) {

                                                }

                                        } else {
                                                JOptionPane.showMessageDialog(this,
                                                                "Insufficient Balance To Process Request");
                                                clear_transfer_Account_details();
                                                BackToLogin();
                                        }
                                } else {
                                        JOptionPane.showMessageDialog(this, "Amount is not Multiple of 100");
                                }

                        } else {
                                JOptionPane.showMessageDialog(this, "Beneficiary Account Does Not Exist");
                                clear_transfer_Account_details();
                                BackToLogin();
                        }

                } else
                        JOptionPane.showMessageDialog(this,
                                        "Confirm Beneficiary Account and Beneficiary Account are Not Same");

        }

        private void TransferPanelExit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
                clear_transfer_Account_details();
                BackToLogin();
        }

        private void account_detail_balance_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {
                // TODO add your handling code here:
        }

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel. For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(atm_design.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(atm_design.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(atm_design.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(atm_design.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new atm_design().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify
        private javax.swing.JPanel Account_Type_Panel;
        private javax.swing.JTextField Account_detail_firstname_textfield;
        private javax.swing.JLabel BalanceEquiryAccountNumber;
        private javax.swing.JLabel BalanceEquiryBalance;
        private javax.swing.JPanel Balance_enquiry;
        private javax.swing.JButton Balance_enquiryOk_button;
        private javax.swing.JButton Cancel_button;
        private javax.swing.JButton Cash_withdrowl_option;
        private javax.swing.JButton Confirm_button;
        private javax.swing.JRadioButton Currunt_acc_RadioButton2;
        private javax.swing.JTextField DepositPanelamount_TextField;
        private javax.swing.JButton DepositPanelconfirm_button;
        private javax.swing.JButton Deposit_option;
        private javax.swing.JPanel Deposit_panel;
        private javax.swing.JPanel Login_Panel;
        private javax.swing.JPanel Main_panel;
        private javax.swing.JPanel Option_panel;
        private javax.swing.JButton PinGenerationPanelConfirm_button;
        private javax.swing.JPasswordField PinGeneration_Confirm_pin;
        private javax.swing.JPasswordField PinGeneration_New_pin;
        private javax.swing.JButton Pin_change_option;
        private javax.swing.JButton Quit_option;
        private javax.swing.JTextField TransferPanelBenificiary_Account_textfield;
        private javax.swing.JTextField TransferPanelConfirmBeneficiary_account_textfield;
        private javax.swing.JButton TransferPanelConfirm_Button;
        private javax.swing.JButton TransferPanelExit_Button;
        private javax.swing.JLabel TransferPanelSenderAccountNo_Label;
        private javax.swing.JTextField TransferPanelTransfer_money_amount_textfield;
        private javax.swing.JButton Transfer_Option;
        private javax.swing.JPanel Transfer_Panel;
        private javax.swing.JPanel account_creation;
        private javax.swing.JTextField account_detail_Address_testfield;
        private javax.swing.JButton account_detail_Exit_button;
        private javax.swing.JComboBox<String> account_detail_acctype_ComboBox;
        private javax.swing.JComboBox<String> account_detail_age_ComboBox;
        private javax.swing.JTextField account_detail_balance_TextField;
        private javax.swing.JButton account_detail_confirm_button;
        private javax.swing.JRadioButton account_detail_female_radio;
        private javax.swing.JTextField account_detail_lastname_testfield;
        private javax.swing.JRadioButton account_detail_male_radio;
        private javax.swing.JTextField account_detail_mobile_textfield;
        private javax.swing.JButton balance_enquiry_option;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.ButtonGroup buttonGroup2;
        private javax.swing.JButton cancel_button;
        private javax.swing.JButton cancel_button_pin_generation;
        private javax.swing.JButton create_account_Button;
        private javax.swing.JLabel deposit_page_heading;
        private javax.swing.JButton enter_button_Login;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel31;
        private javax.swing.JLabel jLabel32;
        private javax.swing.JLabel jLabel33;
        private javax.swing.JLabel jLabel34;
        private javax.swing.JLabel jLabel35;
        private javax.swing.JLabel jLabel36;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPasswordField pin_Password;
        private javax.swing.JPanel pin_generation;
        private javax.swing.JRadioButton saving_acc_RadioButton;
        private javax.swing.JTextField userId;
        // End of variables declaration
}
