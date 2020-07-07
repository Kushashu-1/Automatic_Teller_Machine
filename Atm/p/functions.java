
package p;

import java.sql.*;

public class functions {

    protected static String r_string = "Request Unsuccessful";
    protected static Statement st;
    protected static int s_no = 0;
    protected static int new_userId = 1000;
    protected static int userId;
    protected static String Pin = "";
    protected static String qry = "";
    protected static ResultSet rs;
    protected Long amount = 0L;

    public functions() {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm_management_system", "root",
                    "Kushashu123");
            st = con.createStatement();
            System.out.println("\n\n\t\t--Connection estalished--");
            qry = "select S_no , UserId from user_details order by S_no desc limit 1 ;";
            rs = st.executeQuery(qry);
            while (rs.next()) {
                s_no = Integer.parseInt(rs.getString(1));
                new_userId = Integer.parseInt(rs.getString(2));
                // System.out.println(s_no);
                // System.out.println(new_userId);
            }

        } catch (SQLException e) {
            r_string = "There is Some Server Issue ";

        } catch (Exception e) {
            r_string = "Transection UnSuccessFul";

        }
    }

    public boolean Check_user(String a, String b) {
        boolean value = false;
        try {
            int name = Integer.parseInt(a);
            qry = "select  Pin  from user_details where userId = " + name + ";";
            // System.out.println(name);
            // System.out.println(qry);
            rs = st.executeQuery(qry);
            String s1 = "";
            while (rs.next()) {
                s1 = rs.getString(1);
            }
            if (s1.equals(b)) {
                value = true;
            }

        } catch (Exception e) {
            System.out.print("\n\n--Connection Not Establised--");
            System.out.println(e);
        }
        return value;
    }

    public String Updated_Balance(int user, String pin, String method_type, String amt) throws Exception {
        try {

            userId = user;
            Pin = pin;
            amount = Long.parseLong(amt);
            qry = "select Balance from  user_details where userid = " + userId + ";";
            ResultSet rs = st.executeQuery(qry);
            Long balance = 0L;
            Long new_balance;
            while (rs.next()) {
                String s1 = rs.getString(1);
                balance = Long.parseLong(s1);
                System.out.print("---->" + balance);
            }
            String return_String = "";
            if (method_type.equals("withdrowl")) {
                new_balance = balance - amount;
                if (new_balance > 1000) {
                    try {
                        qry = "update user_details set  Balance = '" + new_balance + "' where userid = " + user + ";";
                        // System.out.print(qry);
                        st.execute(qry);
                        return_String = "Transection SuccessFul";
                    } catch (Exception e) {

                    }
                } else {
                    return_String = "We Can't Process Your Request due to Insufficient Balance";
                }

            } else if (method_type.equals("deposit") || method_type.equals("Transfer_deposit")) {
                new_balance = balance + amount;
                qry = "update user_details set  Balance = " + new_balance + " where userid = " + userId + ";";
                st.execute(qry);
                return_String = "Transection SuccessFul";
            }
            return return_String;
        } catch (Exception e) {
            String return_String = "Exception Found ";
            return return_String + e;
        }
    }

    // new account_creation
    public String Create_user_account(String Pin, String first_name, String last_name, String gender, String address,
            String mob, String age, String acc_ty, String amount) {
        s_no = s_no + 1;
        new_userId = new_userId + 1;
        qry = "insert into user_details values( " + s_no + "," + new_userId + ",'" + Pin + "', " + " '" + first_name
                + "' , '" + last_name + "', '" + gender + "', '" + address + " ', '" + mob + "'  , ' " + age + " ' , ' "
                + acc_ty + " ' , '" + amount + "' );";
        // System.out.println(qry);

        try {
            st.execute(qry);
            r_string = "Account Creation SuccessFull \n Your User ID is : " + new_userId
                    + "\n Don't forget to note UserID ";

        } catch (Exception e) {
            return r_string;
        }

        return r_string;
    }

    public String check_Balance(int Requested_user) {
        try {
            int name = Requested_user;
            qry = "select  Balance from user_details where userId = " + name + ";";
            rs = st.executeQuery(qry);
            String s1 = "";
            while (rs.next()) {
                s1 = rs.getString(1);
            }
            return s1;
        } catch (Exception e) {
            return "Not Available";
        }
    }

    public String check_Account_type(int Requested_user) {
        try {
            int name = Requested_user;
            qry = "select Account_type from user_details where userId = " + name + ";";
            rs = st.executeQuery(qry);
            String s1 = "";
            while (rs.next()) {
                s1 = rs.getString(1);
            }
            return s1.trim();
        } catch (Exception e) {
            return "Not Available";
        }
    }

    public boolean isbenificeiry_Exist(int Requested_user) {
        try {
            int name = Requested_user;
            qry = "select Account_type from user_details where userId = " + name + ";";
            rs = st.executeQuery(qry);
            String s1 = "";
            while (rs.next()) {
                s1 = rs.getString(1);
            }
            if (s1 != "") {
                return true;
            } else
                return false;

        } catch (Exception e) {
            return false;
        }

    }

    public boolean update_new_password(int user, String new_pin) {
        try {
            qry = "update user_details set  Pin = '" + new_pin + "' where userid = " + user + ";";
            System.out.println(qry);
            st.execute(qry);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}