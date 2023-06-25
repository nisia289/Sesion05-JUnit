package ual.hmis.session5.exercise2;

public class Exercise2 {

        public boolean login (String username, String password){

            if (username.isEmpty() || password.isEmpty()) {
                return false;
            }
            if (username.length() < 30 && password.length() < 30 && username.length() > 0 && password.length() > 0) {
                return checkLoginInDB(username, password);
            } else
                return false;
        }

        public boolean checkLoginInDB (String username, String password){
            if (username.equals("user") && password.equals("pass"))
                return true;
            else
                return false;
        }

}




